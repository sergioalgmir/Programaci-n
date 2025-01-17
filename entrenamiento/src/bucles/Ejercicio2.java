package bucles;
import java.util.Scanner;

/**
 * Modifica la aplicación anterior para que el usuario pueda introducir un número en binario y el programa muestre su conversión a decimal.
 * 
 * @param binario - Variable tipo String que almacena los datos que el usuario introduce por pantalla.
 * @param decimal - Variable tipo int que usaremos para guardar la representación decimal.
 * @param bit - Variable tipo char que usaremos para distinguir si el bit es 0 o 1.
 * 
 * @author Sergio Algarrada Miranda
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un número binario:");
		String binario= sc.next();
		int decimal = 0;
		char bit = ' ';

		
		for (int i=0; i<binario.length();i++) { //Recorro la cadena y almaceno en la variable bit el bit correspondiente en cada iteración.
			bit = binario.charAt(i);
			if (bit=='1') { //Si bit == 1, sumaremos a decimal el resultado de elevar 2 al índice de la posición que ocupe el bit.
				decimal+= Math.pow(2, (binario.length()-i-1)); // El segundo argumento del método Math.pow nos permite empezar a contar los índices de derecha a izquierda.
			}
			
			
		} System.out.println(decimal);
		
		sc.close();
		

	}

}
