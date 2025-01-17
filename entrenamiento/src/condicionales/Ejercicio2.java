package condicionales;
import java.util.Scanner;

/**
 * Diseña una aplicación en la que, dado un número de DNI, calcule la letra que le corresponde.
 * 
 * @param sc - Crea un objeto Scanner para que el usuario pueda introducir información por el teclado.
 * @param numeroDNI - Variable entera que almacena el número de DNI que el usuario introducirá por teclado.
 * @param modulo - Variable entera que almacena el resto de numero%23, según el cual identificaremos la letra del DNI correspondiente.
 * @param letra - Variable de tipo char que recoge la letra del DNI que corresponde al usuario.
 * 
 * @author Sergio
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Esta aplicación le dirá la letra de su DNI.");
		System.out.println("Introduzca el número de su DNI, por favor: ");
		int numeroDNI = sc.nextInt();
		int modulo = numeroDNI%23;
		char letra = ' '; 
		
		if ((numeroDNI/10000000)>=1 && (numeroDNI/100000000)==0) { //Comprobamos que el número introducido sea de 8 cifras.
		switch(modulo) { //En caso positivo, según el valor de numeroDNI%23 se asignará un valor a la variable letra.
		case 0: 
			letra = 'T';
			break;
		case 1: 
			letra = 'R' ;
			break;
		case 2: 
			letra = 'W';
			break;
		case 3: 
			letra = 'A';
			break;
		case 4: 
			letra = 'G';
			break;
		case 5: 
			letra = 'M';
			break;
		case 6: 
			letra = 'Y';
			break;
		case 7: 
			letra = 'F';
			break;
		case 8: 
			letra = 'P' ;
			break;
		case 9: 
			letra ='D' ;
			break;
		case 10: 
			letra = 'X' ;
			break;
		case 11: 
			letra = 'B' ;
			break;
		case 12: 
			letra ='N' ;
			break;
		case 13: 
			letra = 'J' ;
			break;
		case 14: 
			letra ='Z' ;
			break;
		case 15: 
			letra = 'S' ;
			break;
		case 16: 
			letra ='Q' ;
			break;
		case 17: 
			letra ='V' ;
			break;
		case 18: 
			letra ='H' ;
			break;
		case 19: 
			letra ='L' ;
			break;
		case 20: 
			letra ='C' ;
			break;
		case 21: 
			letra ='K' ;
			break;
		case 22: 
			letra ='E' ;
			break;
		default:
			System.out.println("El número del DNI introducido es erróneo.");
		
		}
		
		System.out.println("La letra de su DNI es la " + letra );
		
	} else { //En caso de no cumplirse las condiciones del if, se imprimirá por pantalla lo siguiente y se cerrará el programa.
		System.out.println("El número del DNI debe contener 8 cifras y debe ser positivo."); 
		System.exit(1);
	}sc.close();
		
		
		

	}

}
