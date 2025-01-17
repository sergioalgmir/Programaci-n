package secuenciales;
import java.util.Scanner;

/**
 * Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que sumarle para que el resultado sea múltiplo de 7.
 */

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un número entero:");
		int numero = sc.nextInt();
		int resto = numero % 7;
		int respuesta; //En esta variable guardo el resultado final
		
		if (resto == 0) {
			System.out.println("El número ya es múltiplo de 7.");
		} else if (numero < 0){
			respuesta = - resto; 
			// En este caso, el resto lo guarda como número negativo. Por ejemplo: -13%7 = -6. Si hicésemos 7- resto, 7-(-6)=-13. Basta con cambiarle el signo al resto para quedarnos con la cantidad que falta para ser múltiplo de 7.
			System.out.println("A " + numero + " hay que sumarle " + respuesta + " para que sea múltiplo de 7.");
		}
		else {
			respuesta = 7 - resto;
			System.out.println("A " + numero + " hay que sumarle " + respuesta + " para que sea múltiplo de 7.");	
		}
		sc.close();

	}

}
