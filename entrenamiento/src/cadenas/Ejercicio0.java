package cadenas;

import java.util.Scanner;

/**
 * Programa descodificador que muestre un texto codificado con el programa realizado en el Ejemplo 10 del Apartado 4 de la teoría 2.6 de moodle.
 * 
 * @author Sergio Algarrada Miranda
 */

public class Ejercicio0 {
	
	/**
	 * Ejecuta el programa.
	 * @param args
	 */
	
	
		
		
		
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        final char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
	        final char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
	        char codificado[]; // array que contendrá la codificación del texto introducido
	        String texto;
	        
	        System.out.print("Introduzca un texto a codificar: ");
	        texto = sc.nextLine();
	        texto = texto.toLowerCase(); // convertimos el texto a minúscula, para poder
	        // codificar las mayúsculas y las minúsculas con el mismo conjunto
	        codificado = new char[texto.length()]; // creamos un array de igual tamaño que texto
	        
	        for (int i = 0; i < texto.length(); i++) { // recorremos el texto a codificar
	            // codificamos el i-ésimo carácter del texto
	            codificado[i] = descodifica(conjunto1, conjunto2, texto.charAt(i));
	        }
	        
	        texto = String.valueOf(codificado); // convertimos la tabla con la codificación en una cadena
	        System.out.println(texto);
	        sc.close();
	    }

	    public static char codifica(char[] conjunto1, char[] conjunto2, char c) {
	        for (int i = 0; i < conjunto1.length; i++) {
	            if (c == conjunto1[i]) {
	                return conjunto2[i];
	            }
	        }
	        return c; // si no está en conjunto1, se devuelve el carácter original
	    }
	    
	    
	    public static char descodifica(char[] conjunto1, char[] conjunto2, char c) {
	        for (int i = 0; i < conjunto2.length; i++) {
	            if (c == conjunto2[i]) {
	                return conjunto1[i];
	            }
	        }
	        return c; // si no está en conjunto1, se devuelve el carácter original
	    }

}
