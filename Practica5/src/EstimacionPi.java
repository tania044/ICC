public class EstimacionPi {
    public static void main(String[] args) {

        //Declaracion de variables que se van a utilizar
        
        int totalDardos= 100000000;
        int contadorDardos =0;
        int dardosDentro= 0;
    

        //Ciclo para lanzar los dardos y viendo los que caen dentro del cuadro
        while(contadorDardos < totalDardos){
               
               double x = Math.random();
               double y = Math.random();
                
                //Calculamos la coordenada del dardo y vemos si esta dentro del circulo

               if(x*x + y*y <= 1){
                   dardosDentro++; 
                }

                 contadorDardos++;
         }
           
         //Con la formula dada aqui calculamos la estimacion e imprimimos unicamente con los 6 decimales que se piden 
            double piEstimado = 4.0 * dardosDentro/totalDardos ; 
            System.out.printf("Estimacion de Pi: %.6f \n", piEstimado);
            System.out.println("Dardos dentro del circulo: \n" + dardosDentro);
            System.out.println("Dardos lanzados: \n" + totalDardos);

       
         
    }
}