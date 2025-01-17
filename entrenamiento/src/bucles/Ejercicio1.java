

package bucles;
import java.util.Scanner;

/**
 * Realiza un programa que convierta un número decimal en su representación binaria. 
 * Hay que tener en cuenta que desconocemos cuántas cifras tiene el número que introduce el usuario.
 * Por simplicidad, iremos mostrando el número binario con un dígito por línea.
 * 
 * @param numero - Variable tipo int que almacenará el número que introduzca el usuario.
 * @param binario - Variable tipo String que almacena el número binario convertido en cadena.
 * 
 * @author Sergio Algarrada
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un número decimal:");
		int numero=sc.nextInt();
		String binario = "";
		while(numero>0) { //Mientras el número sea mayor que 0, divido entre 2 y guardo el resto en la variable binario.
			binario= (numero%2) + binario; // Voy añadiendo el resto al principio de la cadena.
			numero/=2;  //Actualizo la variable numero.
			
		} 
		for (int i=0; i<binario.length();i++) { //Recorro la cadena e imprimo un dígito por línea.
			System.out.println(binario.charAt(i)); 
		}
		
		sc.close();


		
	}
}
