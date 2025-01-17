package secuenciales;

import java.util.Scanner;


//Escribir un programa que pida un número al usuario e indique mediante un literal booleano (true o false) si el número es par.

public class Ejercicio8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa le indicará si el número introducido es par o impar.");
		System.out.println("Introduzca un número entero, por favor:");
		int numero = sc.nextInt();
		boolean esPar;
	
		
		if (numero%2==0) {
			esPar = true;
		} else { esPar=false;}
		
		System.out.println(esPar);
		sc.close();
		
	}
		

}
