public class Cotizador {
    public static void main (String args[]) {

        
        String cliente1 = "Robie Valentino";
        char clasificacionCliente1 = 'E';
        int precioCliente1=12899;

    //Se define la taza de interes
        double interes = 0.15;

    //Definimos el plazo de Robie que será de 21 meses y sacamso el plazo por año para calcular los ineteses
        int plazoMeses =21;
        
        double plazoCliente1 = plazoMeses / 12.0;

    //Se define la tasa de interes anual de este cliente y con esta se calcula el interes que Robie tendrá que pagar 
        double tasaAnual = 0.15;

        double interesR = precioCliente1 * tasaAnual * plazoCliente1;
    

    //Calculamos el pago total y de cuanto será la mensualidad que Robie tendrá que pagar
      
    double total = precioCliente1 + interesR;
    double mensualidad = total / plazoMeses;

        // Imprimir los resultados
        System.out.println("Cliente: " + cliente1);
        System.out.println("Clasificacion: " + clasificacionCliente1);
        System.out.println("Precio de la laptop: $" + precioCliente1);
        System.out.println("Plazo: " + plazoMeses + " meses");
        System.out.printf("Interes: $ %.2f%n", interesR);
        System.out.printf("Total a pagar: $ %.2f%n", total);
        System.out.printf("Mensualidad: $ %.2f%n", mensualidad);



    }
}