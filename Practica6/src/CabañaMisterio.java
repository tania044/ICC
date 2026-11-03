import java.util.Scanner;

public class CabañaMisterio {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        boolean exit = false;

            do{

            //Validación de nombre completo y tipo de cliente
            System.out.println("Ingresa el nombre completo del cliente: ");
            String nombreCliente = scanner.nextLine();

            System.out.println("Ingresa el tipo de cliente: P,E o R : ");
            char clasificación = scanner.next().charAt(0);

            //Pedimos que se nos de una clasificación valida
            while(clasificación!='P'&& clasificación!='E'&& clasificación!='R'){
                System.out.println("Error:Ingresa una opción correcta ");
                System.out.println("Ingresa el tipo de cliente: P,E o R : ");
                clasificación = scanner.next().charAt(0);

            }
            
            double capital = -1; // Usamos double para aceptar decimales

            while (capital <= 0) {
                System.out.print("Ingresa la cantidad de capital: ");

                // Validamos si es un número con decimales o no
                if (!scanner.hasNextDouble()) {
                    System.out.println("Error: Ingresa un número válido.");
                    scanner.next(); // Limpia la entrada incorrecta
                } else {
                    capital = scanner.nextDouble(); // Leemos el número con decimales

                    if (capital <= 0) {
                        System.out.println("Error: El capital tiene que ser mayor a cero.");
                    }
                }
            }

            // Inicializamos la tasa de interés con un valor por defecto y los casos en los que cambia
             double tasa_interes=0.15;
                          
             if(clasificación=='P'){
                tasa_interes=0.13;
            }else if(clasificación=='R'){
                tasa_interes=0.18;
            }
               
                  
                

        int meses = -1;
            while (meses <= 0) {
            System.out.println("Ingresa la cantidad de meses: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Error: Ingresa un número entero.");
                    scanner.next(); // Limpia la entrada incorrecta
                } else {
                    meses = scanner.nextInt();
                    
                    // <= 0 para que detecte tanto negativos como el cero
                    if (meses <= 0) {
                        System.out.println("Error: Los meses tienen que ser un número mayor a cero.");
                    }
                }
            }
              //Menu a elegir por el usuario, se imprime en cada ciclo
              String menu = """
                ##### Sistema de prestamos de la Cabaña del misterio #####
                > Las operaciones disponibles son
                1) Cotizar con interes simple.
                2) Cotizar con interes compuesto.
                3) Comparar interes simple y compuesto.
                4) Cambiar el capital del prestamo.
                0) Salir.
                """;

              

            // Hacemos las cuentas principales (corregido usando tasa_interes directamente)
                double interesSimple = capital * tasa_interes * (meses / 12.0);
                double pagoSimple = capital + interesSimple;
                double tasaMensual = tasa_interes / 12.0;
                double saldoCompuesto = capital * Math.pow(1 + tasaMensual, meses);
                double interesCompuesto = saldoCompuesto - capital;
                double dif = interesCompuesto - interesSimple;

                // Hacemos el resumen de las cuentas para imprimirlo al final del programa
                String resumen = """
                    \n===== RESUMEN =====
                    Interés simple = %.2f
                    Total simple = %.2f
                    Interés compuesto = %.2f
                    Total compuesto = %.2f
                    Diferencia = %.2f
                    """.formatted(interesSimple, pagoSimple, interesCompuesto, saldoCompuesto, dif);

                int opcion = -1;
                int errores = 0;
                int operaciones = 0;

                // El menú principal
                do {
                    System.out.println(menu);
                    System.out.print("Elige una opción: ");

                    if (scanner.hasNextInt()) {
                        opcion = scanner.nextInt();

                        if (opcion >= 0 && opcion <= 4) {
                            switch (opcion) {
                                case 1: // Cotizar simple
                                    System.out.println("Cliente: " + nombreCliente + " | Capital: " + capital + " | Interés: " + interesSimple + " | Total: " + pagoSimple + "\n");
                                    operaciones++;
                                    break;

                                case 2: // Cotizar compuesto mes a mes
                                    double deuda = capital;
                                    for (int i = 1; i <= meses; i++) {
                                        deuda *= (1 + tasaMensual);
                                        System.out.printf("Mes %d: %.2f\n", i, deuda);
                                    }
                                    System.out.println("Interés compuesto: " + interesCompuesto + " | Total: " + saldoCompuesto + "\n");
                                    operaciones++;
                                    break;

                                case 3: // Comparar
                                    System.out.println(interesSimple > interesCompuesto ? "El simple es mayor." : "El compuesto es mayor.");
                                    System.out.println("Diferencia: $" + dif + "\n");
                                    operaciones++;
                                    break;

                                case 4: // Cambiar capital
                                    capital = -1;
                                    while (capital <= 0) {
                                        System.out.print("Ingresa el nuevo capital: ");
                                        if (scanner.hasNextDouble()) {
                                            capital = scanner.nextDouble();
                                            if (capital <= 0) System.out.println("Error: Debe ser mayor a 0.");
                                        } else {
                                            System.out.println("Error: Pon un número válido.");
                                            scanner.next();
                                        }
                                    }
                                    System.out.println("¡Capital actualizado!\n");
                                    operaciones++;
                                    break;

                                case 0: // Salir
                                    System.out.println("Saliendo del sistema");
                                    break;
                            }
                        } else {
                            errores++;
                            System.out.println("Error: Opción fuera de rango (" + errores + "/3).");
                        }
                    } else {
                        errores++;
                        System.out.println("Error: Ingresa un número válido (" + errores + "/3).");
                        scanner.next();
                    }

                    // Checamos si ya nos pasamos de errores o operaciones
                    if (errores >= 3) {
                        System.out.println("\n¡Demasiados errores! Bye:(");
                        opcion = 0;
                    } else if (operaciones >= 5) {
                        System.out.println("\nLímite de 5 operaciones alcanzado");
                        opcion = 0;
                    }

                } while (opcion != 0);

                // Imprimimos el resumen chido al final
                System.out.println(resumen);
            } while(exit); 
    }