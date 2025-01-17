package secuenciales;
import java.util.Scanner; 

/**
 * Realizar un programa que pida como entrada un número decimal y lo muestre redondeado al entero más próximo.
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un número decimal (Recuerde que ha de usar la coma como separador)");
		double numero = sc.nextDouble();
//		Para quedarnos con la parte decimal, restamos la parte entera al número introducido
		int parteEntera = (int) numero;
		double parteDecimal = numero - parteEntera;
		
		if (parteDecimal >= 0.5) {
			parteEntera +=1;
		} 
		
		System.out.println("El número entero que más se aproxima a " + numero + " es " + parteEntera);
		sc.close();
	
	}

}
