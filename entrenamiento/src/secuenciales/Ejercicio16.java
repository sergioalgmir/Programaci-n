package secuenciales;
import java.util.Scanner;


/**
 * Modifica el programa anterior para que, indicando dos números n y m, diga qué cantidad hay que sumarle a n para que sea múltiplo de m.
 */

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un número entero n:");
		int n = sc.nextInt();
		System.out.println("Introduzca otro número entero m:");
		int m = sc.nextInt();
		int resto = n % m;
		int respuesta;
		if (resto == 0) {
			System.out.println(n + " es múltiplo de " + m);
		} else if (n < 0){
			respuesta = - resto;
			System.out.println("A " + n + " hay que sumarle " + respuesta + " para que sea múltiplo de " + m);
		}
		else {
			respuesta = m - resto;
			System.out.println("A " + n + " hay que sumarle " + respuesta + " para que sea múltiplo de " + m);	
		}
		sc.close();
		
	}

}
