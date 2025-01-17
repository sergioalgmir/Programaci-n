package bucles;
import java.util.Scanner;

/**
 * Realiza un programa que calcule el máximo común divisor de dos números.
 * 
 * @param a - Guarda el primer número introducido por el usuario. Variable tipo int.
 * @param b - Guarda el segundo número introducido por el usuario. Variable tipo int.
 * @param masGrande - Almacena el número más grande entre a y b. Variable tipo int.
 * @param masPequeño - Almacena el número más pequeño entre a y b. Variable tipo int.
 * @param mcd - Guarda el máximo común divisor de a y b. Variable tipo int.
 * 
 * @author Sergio Algarrada Miranda
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a calcular el máximo común divisor de dos números.");
		System.out.println("Introduzca el primer número:");
		int a = sc.nextInt();
		System.out.println("Introduzca el segundo número:");
		
		int b = sc.nextInt();
		int masPequeño;
		int masGrande;
		int mcd=1;
		
		
		if (a<b) { //Comparo los números para empezar a iterar sobre el más pequeño de los dos.
			masPequeño=a;
			masGrande=b;
		} else {
			masPequeño=b;
			masGrande=a;
		}
		
		for (int i = masPequeño; i>0; i--) { 
												
			
			if (masPequeño%i==0 && masGrande%i==0) { //Itero todos los números anteriores a masPequeño y veo si son divisores.
													 //Si a su vez es divisor de masGrande, guardo ese valor en mcd y finalizo el bucle.
				mcd = i;
				break;
				
				
			}
			
			

	} System.out.println("El máximo común divisor de " + a + " y " + b + " es " + mcd);
	sc.close();
	} 

}
