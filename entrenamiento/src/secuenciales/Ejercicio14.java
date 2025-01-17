package secuenciales;
import java.util.Scanner;

/**
 * Un economista te ha encargado un programa para realizar cálculos con el IVA. 
 * La aplicación debe solicitar la base imponible y el IVA que se debe aplicar. 
 * Muestra en pantalla el importe correspondiente al IVA y al total.
 */

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca el total de la base imponible:");
		double baseImp = sc.nextDouble();
		System.out.println("Introduzca el tipo de IVA a aplicar (4%, 10% o 21%)");
		int iva = sc.nextInt();
		System.out.println("El total de la factura es " + (baseImp + (baseImp * iva / 100)) + " euros.");
		System.out.println("El importe a pagar de IVA es " + (baseImp * iva / 100) + " euros." );
		System.out.println();

		
		sc.close();
	}

}
