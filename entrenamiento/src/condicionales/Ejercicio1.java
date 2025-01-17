package condicionales;

import java.util.Scanner;

/**
 *  Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. La aplicación tendrá que indicar si el número introducido es capicúa.
 *  
 *  @param sc - Crea un objeto Scanner para almacenar la información introducida por el usuario.
 *  @param numero - Almacena el numero entero introducido por el usuario.
 *  @param esCapicua - De tipo booleano, toma el valor true si el numero es capicúa y false en el caspo contrario.
 *  
 *  @author Sergio
 */


public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero entre 0 y 9999");
		int numero = sc.nextInt();
		boolean esCapicua = false;
		
		if ((numero/10)==0) { //Comprobamos si el número tiene una sola cifra. Todos los números de una cifra son capicúas.
			esCapicua = true;
			
		} else if ((numero/100)==0) { 	//Comprobamos si el número es de dos cifras.
			int primeraCifra = numero/10; 	//Para quedarnos con la primera cifra dividimos el número entre 10.
			int ultimaCifra = numero%10; 	//Para quedarnos con la segunda, tenemos que hacer numero %10.
			if (primeraCifra == ultimaCifra) {
				esCapicua = true;
			} 
		} else if ((numero/1000)==0) {	//Comprobamos si el número es de 3 cifras.
			int primeraCifra = numero/100; //Esta vez, para quedarnos con la primera cifra habrá que dividir entre 100.
			int ultimaCifra = numero%10; 	//Para quedarnos con la última, tenemos que hacer numero %10.
			if (primeraCifra == ultimaCifra) { 	//En este caso, si la primera y la última cifra son iguales, el numero es capicúa, independientemente de la cifra del medio.
				esCapicua = true;
				}
		} else if ((numero/10000)==0) {		//Comprobamos si el número es de 4 cifras.
			//Separamos el numero en dos mitades.
			int primeraMitad= numero/100;
			int segundaMitad= numero %100;
			//A partir de estas dos mitades, sacamos las 4 cifras siguiendo el método de división y módulo entre 10.
			int primeraCifra = primeraMitad/10;
			int segundaCifra = primeraMitad%10;
			int terceraCifra = segundaMitad/10;
			int ultimaCifra = segundaMitad%10;
			
			//Pasamos a comprobar mediante condicionales si el número cumple las condiciones para ser capicúa.
			
			if (primeraCifra==ultimaCifra && segundaCifra== terceraCifra) { //Si la primera cifra coincide con la última, y la segunda con la tercera, el número es capicúa.
				esCapicua=true;
			} 
		}
			
			if (esCapicua) {
				System.out.println("El número " + numero + " es un número capicúa.");
			} else {
				System.out.println("El número " + numero + " no es un número capicúa.");

				
			}sc.close();

		}
	
}


