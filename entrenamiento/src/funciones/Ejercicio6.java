package funciones;

public class Ejercicio6 {
	 /**


	 * 


	 * @param n numero al que se le calculan los divisores primos.


	 */


	 public static void divisoresPrimos(int n) {


	 boolean divisor = false;


	 


	 /*Solo opera si i es primo. Cuando lo es, comprueba que sea divisor de n.


	 *Si ambas cosas son ciertas, imprime i como divisor primo de n.*/


	 for (int i = 2; i <= n; i++) { 


	 


	 if (esPrimo(i)) {


	 


	 divisor = n % i == 0;


	 if (divisor) {


	 System.out.println(i + " es primo y divisor de " + n);


	 }


	 }


	 } 


	 }



	 /**


	 * 


	 * @param n numero a determinar si es primo.


	 * @return true o false si es primo o no.


	 */


	 public static boolean esPrimo (int n) {


	 


	 boolean esPrimo = true; //es la variable que devolvera la funcion.


	 


	 /*el bucle comprueba que n no tenga divisores distintos de 1 y si mismo (o sea, que sea primo).


	 *Si los tiene, establece esPrimo como falso, y termina el proceso; si no los tiene, devuelve que si es primo.*/


	 for (int contadorDivisor = 2; contadorDivisor<n; contadorDivisor++) {


	 


	 esPrimo = n % contadorDivisor !=0; 


	 


	 if(esPrimo == false) {


	 break;


	 }


	 }


	 return (esPrimo);


	 }

}
