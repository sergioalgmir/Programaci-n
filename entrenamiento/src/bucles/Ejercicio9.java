package bucles;
import java.util.Scanner;

/**
 * Calcula la raíz cuadrada de un número natural mediante aproximaciones. En el caso de que no sea exacta, muestra el resto.
 *
 *@author Sergio Algarrada Miranda
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un número por pantalla. Calcularemos su raíz cuadrada.:");
		
		int numero=sc.nextInt(); 
		int raizCuadrada=1;
		
		
		for(int i=1; i<=numero; i++) { //Recorro los números anteriores a numero.
			if(i*i>numero) { //Hago el cuadrado de cada uno, y una vez un cuadrado sea mayor que numero, el bucle finaliza.
				raizCuadrada = i-1; // Restamos uno ya que la raíz cuadrada será el número inmediatamente anterior al número que se pase.
				break;
				
			}
			
			
			
		}
		int resto = numero-raizCuadrada*raizCuadrada; //Calculo el resto
		System.out.println("La raíz cuadrada de " + numero + " es " + raizCuadrada + ", con un resto de " + resto );
		sc.close();
		
		
		

	}

}
