package condicionales;
import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario un número comprendido entre 1 y 99. El programa debe mostrarlo con letras, por ejemplo, para 56, se verá: "cincuenta y seis".
 * 
 * @param sc - Crea un objeto de tipo Scanner para recoger los datos que el usuario introduzca por teclado.
 * @param numero - Variable que almacena el numero entero introducido por el usuario.
 * @param decenas - Variable tipo entero que almacena la parte de las decenas del número introducido.
 * @param unidades - Variable tipo entero que almacena la parte de las unidades del número introducido.
 * @param decenasEscritas - Variable tipo String que guarda las decenas escritas con letras.
 * @param unidadesEscritas - Variable tipo String que guarda las unidades escritas con letras.
 * @param numeroEscrito - Variable tipo String que almacena el número escrito con letras que devolverá el programa.
 * @param conector - Variable tipo string que almacena la cadena " y ".
 * @author Sergio Algarrada Miranda
 * 
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un número entero entre 1 y 99");
		int numero = sc.nextInt();
		
		int decenas = numero/10;
		int unidades = numero % 10;
		String conector = " y ";
		String decenasEscritas = "";
		String unidadesEscritas = "";
		String numeroEscrito = "";
		
		
		if (numero < 1 || numero > 99) { //Si el número no entra en el rango especificado, finalizará el programa.
			System.out.println("El número debe comprenderse entre 1 y 99. Presione F11 para reiniciar el programa.");
			System.exit(1);
		} else {
			
			if (numero >9 && numero <20) { //Valora los numeros entre 11 y 19, ya que se forman de manera diferente al resto. los almacena directamente en numeroEscrito.
				
				switch (numero) {
				
				case 10:
					numeroEscrito= "diez";
					break;
				case 11:
					numeroEscrito= "once" ;
					break;
				case 12:
					numeroEscrito="doce" ;
					break;
				case 13:
					numeroEscrito="trece" ;
					break;	
				case 14:
					numeroEscrito="catorce" ;
					break;
				case 15:
					numeroEscrito="quince" ;
					break;
				case 16:
					numeroEscrito="dieciseis" ;
					break;
				case 17:
					numeroEscrito="diecisiete" ;
					break;
				case 18:
					numeroEscrito= "dieciocho" ;
					break;
				case 19:
					numeroEscrito="diecinueve" ;
					break;
				default:
					System.out.println("Error");
					
				} 
				
			} else if (numero==20) { //el 20 es un caso especial, que es más fácil valorarlo aparte
				numeroEscrito = "veinte";
			} else { //Se valoran el resto de números
			
				switch(decenas) { //Valora la primera cifra y la convierte a caracteres alfanuméricos.
				case 2:
					decenasEscritas= "veinti";
					break;
				case 3:
					decenasEscritas= "treinta";
					break;
				case 4:
					decenasEscritas= "cuarenta";
					break;
				case 5:
					decenasEscritas= "cincuenta";
					break;
				case 6:
					decenasEscritas= "sesenta";
					break;
				case 7:
					decenasEscritas= "setenta";
					break;
				case 8:
					decenasEscritas= "ochenta";
					break;
				case 9:
					decenasEscritas= "noventa";
					break;
				default:
					decenasEscritas=""; //En caso de ser 0 la cadena quedará vacía.
				}
				
				switch(unidades) { //Se valoran las unidades
				case 1:
					unidadesEscritas = "uno" ;
					break;
				case 2:
					unidadesEscritas ="dos" ;
					break;
				case 3:
					unidadesEscritas ="tres" ;
					break;
				case 4:
					unidadesEscritas ="cuatro" ;
					break;
				case 5:
					unidadesEscritas = "cinco";
					break;
				case 6:
					unidadesEscritas ="seis" ;
					break;
				case 7:
					unidadesEscritas = "siete" ;
					break;
				case 8:
					unidadesEscritas = "ocho";
					break;
				case 9:
					unidadesEscritas = "nueve" ;
					break;
				default:
					unidadesEscritas = ""; //En caso de ser 0 la cadena quedará vacía.
				
				}
				
				if (decenas==2 || decenas==0) { //En este caso se forma de la manera siguiente puesto que el numero no se escribe separado.
					numeroEscrito=decenasEscritas+unidadesEscritas; 
				} else if (unidades==0){ //En este caso el numero escrito con letras coincide con la cadena decenasEscritas.
					numeroEscrito=decenasEscritas;
				} else {numeroEscrito= decenasEscritas+conector+unidadesEscritas; //En cualquier otro caso, la cadena numeroEscrito se forma de la siguiente manera.
				}
				
				
			}
			
			
			
			
			
		} System.out.println("El número " + numero + " se escribe " + numeroEscrito);
		sc.close();

	}

}
