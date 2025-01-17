package secuenciales;

public class Ejercicio4 {
	
//	El tipo short permite almacenar valores comprendidos entre -32768 y 32767. 
//	Escribir un programa que compruebe que el rango de valores de un tipo se comporta de forma cíclica, es decir, el valor siguiente al máximo es el valor mínimo.
	
	public static void main (String [] args) {
		short numero = 32767;
		System.out.println("El numero que sigue a " + numero + " si usamos el tipo short es el " + (short) (numero + 1));
			
	}

}
