/*
  Cotizador del senor Pines : Calcula el interes simple y compuesto de un prestamo.
 */
public class CotizadorPines {
    public static void main(String[] args) {

        // Datos del cliente
        String nombreCliente = "Robbie Valentino";
        
        // Clasificaciones: 'P' de Preferente; 'E' de Estandar; 'R' de Riesgoso.
        char clasificacionCliente = 'P'; 

        // Datos del prestamo 
        double capital = 12899.0;
        double tasaAnual = 15.0;
        int plazoMeses = 21;

        // Posibles errores
        if (capital <= 0) {
            System.out.println("Error: El capital prestado debe ser mayor a cero.");
            return; 
        }
        if (plazoMeses <= 0) {
            System.out.println("Error: El plazo en meses debe ser mayor que cero.");
            return; 
        }
        if (tasaAnual < 0) {
            System.out.println("Error: La tasa de interes no puede ser negativa.");
            return;
        }

        // Se cambia la tasa segun la clasificacion
        if (clasificacionCliente == 'P') {
            tasaAnual = tasaAnual - 2;
        } else if (clasificacionCliente == 'R') {
            tasaAnual = tasaAnual + 3;
        } else if (clasificacionCliente != 'E') {
            System.out.println("Error: Clasificacion de cliente no valida.");
            return; 
        }

        // Se declara plazoAnios 
        double plazoAnios = plazoMeses / 12.0;

        // Calculos de Interes Simple con 'double'
        double interesSimple = capital * (tasaAnual / 100.0) * plazoAnios;
        double totalSimple = capital + interesSimple;

        // Tabla de Interes Compuesto con ciclo for
        double tasaMensual = (tasaAnual / 100.0) / 12.0;
        double deuda = capital;

        for (int mes = 1; mes <= plazoMeses; mes++) {
            deuda = deuda * (1.0 + tasaMensual);
            System.out.printf("En el mes %d se tiene un saldo de %.2f%n", mes, deuda);
        }

        // Interes Compuesto acumulado
        double totalCompuesto = deuda;
        double interesCompuesto = totalCompuesto - capital;

        // Reporte del cliente
        System.out.println("\n+++++ Cotizador de La Cabana del Misterio +++++\n");
        System.out.println("--- Datos del cliente ---");
        System.out.printf("Cliente: %s%n", nombreCliente);
        System.out.printf("Clasificacion: %c%n", clasificacionCliente);
        System.out.println();
        System.out.println("--- Datos del prestamo ---");
        System.out.printf("Capital: $%.2f%n", capital);
        System.out.printf("Tasa anual: %.2f%%%n", tasaAnual);
        System.out.printf("Plazo: %d meses (%.2f anios)%n", plazoMeses, plazoAnios);
        System.out.println();
        System.out.println("--- Resultado ---");
        System.out.printf("Interes simple = $%.2f%n", interesSimple);
        System.out.printf("Total con interes simple = $%.2f%n", totalSimple);
        System.out.printf("Interes compuesto = $%.2f%n", interesCompuesto);
        System.out.printf("Total con interes compuesto = $%.2f%n", totalCompuesto);
        System.out.println();
    }
    }
