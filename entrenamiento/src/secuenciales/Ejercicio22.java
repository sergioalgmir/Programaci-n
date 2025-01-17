package secuenciales;
import java.util.Scanner;
/**
 * Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude 
 * a calcular el importe que hay que cobrar en la taquilla por la compra de una serie de entradas 
 * (cuyo número será introducido por el usuario). Existen dos tipos de entrada: infantiles, que cuestan 15,50 €; 
 * y de adultos, que cuestan 20 €.
 * En el caso de que el importe total sea igual o superior a 100 €, se aplicará automáticamente un bono descuento del 5%.
 * 
 */

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el número de entradas infantiles que desea: ");
		int entradasInfantiles = sc.nextInt();
		System.out.println("Introduzca el número de entradas adultas que desea: ");
		int entradasAdultas = sc.nextInt();
		double totalSinDescuento = entradasAdultas*20 + entradasInfantiles*15.50;
		
		double totalConDescuento = totalSinDescuento > 100 ? totalSinDescuento - (totalSinDescuento * 0.05): totalSinDescuento; // Este operador ternario evalúa si el precio a pagar es mayor o menor de 100 euros y en caso afirmativo aplica un descuento del 5%.
		
		System.out.println("El precio a pagar es de " + totalConDescuento + " euros.");
		sc.close();

	}

}
