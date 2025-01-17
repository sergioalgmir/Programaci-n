package condicionales;
import java.util.Scanner;

/**
 *
 *Diseña un programa que solicite al usuario los valores de comida comprada al día, número de animales que alimentar 
 *y cantidad de comida en Kg que come cada animal y determine si disponemos de alimento suficiente para cada animal. 
 *En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales.
 *La aplicación no puede realizar divisiones por 0.
 *
 *@param sc - Crea un objeto Scanner para que el usuario pueda introducir información por el teclado.
 *@param comidaDiaria - Variable de tipo double que guarda los kilogramos de comida comprada, los cuáles serán introducidos por el usuario.
 *@param numAnimales - Variable de tipo int que guarda el número de animales a los que hay que alimentar, el cual será introducido por el usuario.
 *@param numAnimales2 - Variable de tipo int que almacenará el número de animales que hay que alimentar en el caso de que haya que preguntarle de nuevo al usuario.
 *@param kilosPorAnimal - Variable de tipo double que guarda la cantidad de comida en Kg que come cada animal, la cual será introducida por el usuario.
 *@param comidaCorrespondiente Variable de tipo double que indicará la comida que corresponde a cada animal en caso de que no haya la comida necesaria para todos. Solo se usará en caso necesario.
 *
 *
 *@author Sergio
 */

public class Ejercicio3 {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca la cantidad de comida en kilogramos que ha comprado para hoy:");
		double comidaDiaria = sc.nextDouble();
		System.out.println("Introduzca el número de animales a los que hay que alimentar:");
		int numAnimales = sc.nextInt();
		System.out.println("Introduzca los kilogramos de media necesarios para alimentar cada animal:");
		double kilosPorAnimal = sc.nextDouble();
		double comidaCorrespondiente;
		
		if (numAnimales<=0) { //Así evitamos que más adelante el programa tenga que dividir entre 0. Volvemos a preguntar el número de animales.
			System.out.println("¡Todas las granjas tienen al menos un animal!");
			System.out.println("Introduzca el número de animales a los que hay que alimentar:");
			int numAnimales2 = sc.nextInt();
			numAnimales = numAnimales2; //Almacenamos el nuevo dato en la variable numAnimales, que es la que usaremos en las operaciones posteriores.
			if (numAnimales == 0) {
				System.out.println("Presione F11 y reinicie el programa. Le recuerdo que  el número de animales no puede ser 0.");
				System.exit(1);
			}
		}
		
		if (comidaDiaria>= (kilosPorAnimal*numAnimales)) { //Calculamos si hay comida suficiente para todos.
			System.out.println("¡Estás de suerte! Hay comida para todos.");
		} else {  // En caso negativo, calculamos la comida con la que tendría que conformarse cada animal.
			comidaCorrespondiente= comidaDiaria/numAnimales; 
			System.out.println("Lamentablemente no ha comprado comida suficiente");
			System.out.println("Cada animal tendrá que conformarse con " + comidaCorrespondiente + " kilogramos de comida.");
			
		}sc.close();
		
	
		
	}
	
	

}
