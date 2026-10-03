public class ProgramaNuevo{	
	public static void main(String[] args) {
	
	/*
	*Este programa nos ayuda a calcular calcular el precio de la laptop para la carrera aplicando un descuento,
	*su plazo de pago en años y el pago mensual que se debe de hacer para dicha compra
	*/


	//Especificaciones de la compra 
	String producto = "Laptop para la carrera";
	int precio = 15000;
	int descuento = 3000;
	
	//A cuantos meses se pagará
	double meses = 18.0;


	//La instrucción prinf nos permite concatenar varias lineas de texto en una misma sola instrucción 

	System.out.printf(
	 "=== Ficha de compra ===%n" + 
	 "- Producto : %s%n"+ 
	 "- Precio con descuento : %d %n" +
	 "- Plazo de pago en anios : %.2f %n" + 
	 "- Pago mensual : %.2f%n" +
	 "=== Fin de la ficha ===%n",
	producto, (precio - descuento), (meses / 12.0), ((precio - descuento) / meses));


	}
}