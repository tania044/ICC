import java.util.Scanner;

public class BinarioInteractivo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Inicializamos la variable en 's' para que entre al ciclo la primera vez
        char continuar = 's';

        // Ciclo principal para repetir todo el programa si el usuario lo desea
        while (continuar == 's' || continuar == 'S') {
            int numero = 0;
            boolean entradaValida = false;

            // Ciclo para seguir pidiendo el valor mientras no sea un entero o sea negativo
            while (!entradaValida) {
                System.out.println("Dame un número entero positivo para convertirlo a binario: ");

                // Validamos si lo que escribió el usuario es un número entero
                if (teclado.hasNextInt()) {
                    numero = teclado.nextInt();

                    // Validamos que el número no sea negativo 
                    if (numero >= 0) {
                        entradaValida = true; // es positivo entonces la entrada si es valida
                    } else {
                        System.out.println("Error: El número no puede ser negativo");
                    }
                } else {
                    System.out.println("Error: Lo que escribiste no es un número entero válido");
                    teclado.next(); // Limpiamos la entrada incorrecta 
                }
            }

            // Guardamos una copia del número original para mostrarlo al final, antes de modificarlo
            int numOriginal = numero;
            String binario = "";

            // Si el número es 0, su binario debe ser directamente el cero
            if (numOriginal == 0) {
                binario = "0";
            } else {
                // Conversión a binario usando un ciclo while como se vio en clase
                while (numero > 0) {
                    int cociente = numero % 2;
                    binario = cociente + binario;
                    numero = numero / 2;
                }
            }

            // Imprimimos el resultado 
            System.out.println("El número " + numOriginal + " en binario es: " + binario);

            // Preguntamos si desea convertir otro número
            System.out.println("¿Deseas convertir otro número? (s/n): ");
            continuar = teclado.next().charAt(0); // Leemos el caracter para decidir si se repite el while principal
        }

        // Mensaje de despedida 
        System.out.println("¡Hasta luego! El programa ha finalizado :)");
    }
}

