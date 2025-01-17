package bucles;
import java.util.Scanner;

/**
 * Diseña una aplicación que dibuje el triángulo de Pascal, para n filas. 
 *
 * 
 * @param n - Variable tipo int que almacena el número de filas que el usuario nos dice por pantalla.
 * @param iFactorial - Variable tipo int que almacena el factorial de i, que correspondería con n en la fórmula.
 * @param jFactorial - Variable tipo int que almacena el factorial de j, que correspondería con m en la fórmula.
 * @param i_jFactorial - Variable tipo int que almacena lo que en la fórmula del enunciado sería (n-m)!
 * @param combinación - Variable tipo int que almacena el resultado de aplicar la fórmula para cada elemento.
 *
 * 
 * @author Sergio Algarrada Miranda
 */ 
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el número de filas para el triángulo de Pascal: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) { //Itero el número de filas.
			
			int combinacion;
			
			for(int j=0; j<=i; j++) { //Itero el número de elementos de cada fila.
				int iFactorial=1; //Declaro variables locales para que se reinicien con cada iteración
				int jFactorial =1;
				int i_jFactorial=1;
				
				//Calculo los factoriales de los elementos que voy a necesitar en la operación combinatoria.
				
				for (int k=1; k<=i; k++) { 
					iFactorial*=k;
				}
				
				for (int k =1; k<=j; k++) {
					jFactorial*=k;
				}
				
				for(int k =1; k<=(i-j);k++) {
					i_jFactorial*=k;
				}
				
				
				
				combinacion= iFactorial/(jFactorial*i_jFactorial); //Calula el elemento que corresponde a cada lugar del triángulo
				System.out.print(combinacion + " "); //Saco por pantalla los elementos en la misma línea, separados por espacio.
			} System.out.println(" "); //Imprimo un salto de línea para que cada iteración me la escriba en una línea diferente.
			
		} sc.close();
		
		
		
		
		


		
		

	}

}

