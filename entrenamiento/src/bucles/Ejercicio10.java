package bucles;
import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario las distintas cantidades de dinero de las que dispone. La aplicación mostrará la suma total de dinero de la que dispone el usuario.
 * La manera de especificar que no se desea introducir más cantidades es mediante el cero.
 */

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este programa suma las diferentes cantidades de dinero de las que dispone.");
		System.out.println("Por ejemplo: la cantidad de dinero que tiene en el banco, la que tiene en casa y la que tiene en una hucha.");
		double total = 0;
		double euros;
		
		do {
		System.out.println("Introduzca la cantidad de dinero que desees sumar. La forma de indicar que ya no tiene nada más que sumar es introduciendo un 0.");
		euros = sc.nextDouble();
		total+=euros;
		} while(euros!=0);
		System.out.println("La cantidad total de dinero que usted tiene es " + total + " euros.");
		sc.close();
	}

}
