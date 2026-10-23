public class PresicionPi {
    public static void main(String args[]){

        //Aqui declaramos las varibles que se van a utilizar para el calculo de pi y la tolerancia que se va a utilizar 
        // para ver si el valor de pi es aceptable o no
        double tolerancia = 0.001;
        int totalDardos=10;
        int contadorDardos =0;
        int dardosDentro=0;
        double piEstimado = 0.0;

        //Aqui se hace el ciclo para los dardos y se calcula el valor de pi 

        while(Math.abs(piEstimado - Math.PI) > tolerancia){
            double x = Math.random();
            double y = Math.random();

            //Se van aumentando los dardos que caemn dentro del circulo con la condicion 
            if(x*x + y*y <= 1){
                dardosDentro++;
             }
            contadorDardos++;
            piEstimado = 4.0 * dardosDentro/contadorDardos;
        }


        //Imprimimos los resultados que obtuvimos
        System.out.printf("Estimacion de Pi: %.6f \n", piEstimado);
        System.out.println("Dardos dentro del circulo: \n" + dardosDentro);
        System.out.println("Dardos lanzados: \n" + contadorDardos);
        System.out.println("Tolerancia: \n" + tolerancia);


    }
}