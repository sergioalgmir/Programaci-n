package condicionales;
import java.util.Random;
import java.util.Scanner;

/**
 * Modifica la aplicación anterior para que, además de los dos números aleatorios, también aparezca la operación que debe realizar el jugador: suma, resta o multiplicación.
 * 
 * @param sc - Crea un objeto Scanner para que el usuario pueda introducir información por el teclado.
 * @param random - Crea un objeto de tipo random para generar números aleatorios.
 * 
 * @param random1 - Almacena un número aleatorio de tipo entero.
 * @param random2 - Almacena un número aleatorio de tipo entero.
 * @param operacion - variable de tipo entero que almacena la suma de random1+random2.
 * @param operador - variable tipo int que almacena un número entre 0 y 2. Lo usaremos posteriormente para evaluar mediante un switch el tipo de operador aritmético.
 * @param operadorAleatorio- Variable tipo String que almacena una cadena con el operador correspondiente que nos indique el switch.
 * @param resultado - variable de tipo int que almacena el resultado que el usuario introduce por pantalla.
 * 
 * 
 * @author Sergio Algarrada
 */
 

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int operador = random.nextInt(3); //Genera un número entre 0 y 2
		String operadorAleatorio;
		
		int random1 = random.nextInt(1, 100); //Crea número aleatorios entre 1 y 99.
		int random2 = random.nextInt(1, 100);

		
		switch(operador) { //Para cada posible valor de operador, guarda en operadorAleatorio una cadena con el operador correspondiente.
		
		case 0:	
			operadorAleatorio = "+";
			break;
		case 1:
			operadorAleatorio = "-";
			break;
		case 2:
			operadorAleatorio = "*";
			
			
		default:
			operadorAleatorio = "";
		}
		
		
		if (operadorAleatorio.equals("+")) {
			int operacion = random1+random2; // Aquí almacenamos el resultado correcto de la suma.
			System.out.println("Introduzca el resultado de sumar " + random1 + "+"+ random2); //Pedimos al usuario que introduzca por pantalla el resultado de la operación.
			int resultado = sc.nextInt();
			if (resultado == operacion) { //Valoramos si el usuario ha introducido el resultado correcto.
				System.out.println("Correcto");
			}else {
				System.out.println("Incorrecto");
			
			} 
			
		} else if (operadorAleatorio.equals("-")) {
			int operacion = random1-random2; // Aquí almacenamos el resultado correcto de la resta.
			System.out.println("Introduzca el resultado de restar " + random1 + "-"+ random2); //Pedimos al usuario que introduzca por pantalla el resultado de la operación.
			int resultado = sc.nextInt();
			if (resultado == operacion) { //Valoramos si el usuario ha introducido el resultado correcto.
				System.out.println("Correcto");
			}else {
				System.out.println("Incorrecto");
			
			
		} 
		}else {
				int operacion = random1*random2; // Aquí almacenamos el resultado correcto de la multiplicación.
				System.out.println("Introduzca el resultado de multiplicar " + random1 + "*"+ random2); //Pedimos al usuario que introduzca por pantalla el resultado de la operación.
				int resultado = sc.nextInt(); 
				if (resultado == operacion) { //Valoramos si el usuario ha introducido el resultado correcto.
					System.out.println("Correcto");
				}else {
					System.out.println("Incorrecto");
				
		
				}
		}sc.close();
	}
}
		
		
		
		
		

	


