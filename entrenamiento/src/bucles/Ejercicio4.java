package bucles;
import java.util.Scanner;

/**
 * Realiza un programa que nos pida un número n, y nos diga cuántos números hay entre 1 y n que sean primos.
 * 
 * @param n - Variable tipo int que recoge el número introducido por el usuario.
 * @param primos - Variable tipo int que guarda el número de primos entre 1 y n.
 * @param divisores - Variable local de tipo int que recoge el número de divisores que tiene cada número. Se reinicia a 0 con cada iteración  del primer bucle for.
 * 
 * @author Sergio Algarrada Miranda
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Esta aplicación mostrará la cantidad de números primos que hay desde uno hasta el número que usted quiera consultar.");
		System.out.println("Introduzca el número natural que desee:");
		int n = sc.nextInt();
		int primos = 0;
		
	
		
	
		for (int i = 1; i<=n; i++) { //Recorremos todos los números desde el dos hasta el número introducido.
			int divisores = 0; //Se reinicia a 0 la variable divisores en cada iteración.
			for (int j=1; j<=i; j++) { //Con este bucle, recorremos todos los números desde 1 hasta el i actual, y realizamos el módulo para ver si es divisor.
				if(i%j==0) {
					divisores+=1;
				}
			}
			if (divisores<=2) { //Para cada i, si el número de divisores es menor o igual a 2, el número i es primo.
				primos+=1;
			}
	
		} 
		sc.close();
		System.out.println(primos); 
		
		


	}

	
	
	
}
