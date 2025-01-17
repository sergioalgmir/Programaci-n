package secuenciales;
import java.util.Scanner;
/**
 * Pide dos números al usuario: a y b. Deberá mostrarse true si ambos números son iguales y false en caso contrario.
 */

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca dos números enteros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean sonIguales = a == b ? true:false;
		System.out.println(sonIguales);
		sc.close();
		

	}

}
