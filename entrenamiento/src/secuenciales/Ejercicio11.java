package secuenciales;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
//		Escribir un programa que pida un número al usuario y muestre su valor absoluto.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este programa muestra el valor absoluto del número introducido por el usuario.");
		System.out.println("Introduzca un número");
		double numero = sc.nextDouble();
		double valorAbsoluto;
		if (numero>=0) {
			valorAbsoluto=numero;
		} else {
			valorAbsoluto = -numero;
		}
		
		System.out.println("El valor absoluto de " + numero + " es " + valorAbsoluto);
		sc.close();

	}

}
