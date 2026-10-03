public class Programa{	
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



	System.out.println("=== Ficha de compra ===");
	System.out.println("- Producto : " + producto);	//Aqui se imprime el producto
	System.out.println("- Precio con descuento : " + (precio - descuento));//Se calcula e imprime el precio con descuento
	System.out.println("- Plazo de pago en anios : " + (meses / 12.0));//Se calcula e imprime el plazo de pago en años
	System.out.println("- Pago mensual : " + ((precio - descuento) / meses));//Se calcula e imprime el pago mensual
	System.out.println("=== Fin de la ficha ===");

	}
}
