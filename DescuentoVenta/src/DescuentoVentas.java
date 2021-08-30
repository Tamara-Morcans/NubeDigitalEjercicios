import java.util.Scanner;


public class DescuentoVentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	/* 
	 *  Crea un programa que aplique el 15% de descuento sobre el monto de una venta (ingresado por el usuario)
	 * solo si esta es mayor a $1000 pesos, y muestre el monto a pagar.
	 * */
	
	Scanner lector = new Scanner(System.in);
	
	double precio; 
	
	System.out.println("Ingrese el monto de la venta: ");
	precio = lector.nextDouble();
	
	
	if(precio>=1000) {
		precio = precio - (precio * 0.15);
		System.out.print("Felicidades, ha recibido un descuento del 15% y su precio final es: $" + precio);
	} else {
		System.out.print("Lo siento no se puede aplicar tu descuento, el total es $" + precio );
	}
	
	}
}


