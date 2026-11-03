import java.util.Scanner;

public class PiInteractivo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaramos la variable de intentos antes del ciclo
        int intentos = 0;
        boolean entradaValida = false; // La declaramos como falsa para que entre al ciclo y se vayan contando los intentos
        int totalDardos = 0;

        // Empezamos con un ciclo para ver si lo que nos da el usuario es válido y si no le damos 5 intentos 
        while (!entradaValida && intentos < 5) {
            System.out.println("Dame el número de dardos que quieres lanzar para estimar el valor de Pi: ");

            // Validamos si lo que ingresó el usuario es un número entero para que no truene con letras o decimales
            if (teclado.hasNextInt()) {
                totalDardos = teclado.nextInt();

                // Validamos si el número es mayor a 0
                if (totalDardos > 0) {
                    entradaValida = true; // Ya nos da un numero valido por lo que cambiamos el valor a true y salimos del ciclo
                } else {
                    System.out.println("Error: El número de dardos debe ser mayor a 0 ");
                    intentos++; // Sumamos un intento fallido
                }
            } else {
                // Si escribieron letras, símbolos o decimales entra aqui, avisamos y limpiamos la entrada incorrecta
                System.out.println("Error: Lo que escribiste no es un numero entero");
                teclado.next(); // Limpiamos la entrada incorrecta 
                intentos++; // Sumamos un intento fallido
            }
        }

        // Si se acabaron los intentos sin un número válido
        if (!entradaValida) {
            System.out.println("Has agotado tus 5 intentos. El programa ha finalizado.");

        } else {
            // Entramos al ciclo y se hace el calculo de pi con los dardos que nos dio el usuario
            int contadorDardos = 0;
            int dardosDentro = 0;

            // Ciclo para lanzar los dardos y ver los que caen dentro del cuadro
            while (contadorDardos < totalDardos) {
                double x = Math.random();
                double y = Math.random();
                
                // Calculamos la coordenada del dardo y vemos si esta dentro del circulo
                if (x * x + y * y <= 1) {
                    dardosDentro++; 
                }

                contadorDardos++;
            }

            // Con la formula dada aqui calculamos la estimacion e imprimimos unicamente con los 6 decimales que se piden 
            double piEstimado = 4.0 * ((double) dardosDentro / totalDardos); 
            System.out.printf("Estimacion de Pi: %.6f \n", piEstimado);
            System.out.println("Dardos dentro del circulo: \n" + dardosDentro);
            System.out.println("Dardos lanzados: \n" + totalDardos);
        } 
    }
}