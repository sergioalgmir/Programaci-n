package condicionales;
import java.util.Scanner;

/**
 * Crea una aplicación que solicite al usuario cuántos grados tiene un ángulo y muestre el equivalente en radianes. 
 * Si el ángulo introducido por el usuario no se encuentra en el rango de 0° a 360°, hay que transformarlo a dicho rango.
 * 
 *  @param sc - Crea un objeto Scanner para que el usuario pueda introducir información por el teclado.
 *  @param gradosARadianes- Constante que usaremos como conversor de grados a radianes.
 *  @param angulo - Variable tipo double que almacena el valor del ángulo introducido por el usuario.
 *  @param rango - Variable tipo double que almacena el valor del angulo después de haberlo convertido en uno que esté en el rango de 0 a 360º
 *  @param conversion - Variable tipo double que muestra el resultado de multiplicar la variable angulo por la constante gradosARadianes. Es decir, actúa como conversor. 
 * 
 * @author Sergio Algarrada
 */



public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final double gradosARadianes = Math.PI/180;
		
		System.out.println("Introduzca el grado del ángulo:"); //Pedimos al usuario que introduzca un ángulo.
		double angulo = sc.nextDouble();
		 double rango = angulo % 360;  //Nos aseguramos de que el ángulo se encuentre en el rango pedido.
	        if (rango < 0) {
	            rango += 360; 
	        }
		double conversion = rango * gradosARadianes;
		System.out.println( angulo + "º son " + conversion + " radianes.");

		sc.close();
	}

}
