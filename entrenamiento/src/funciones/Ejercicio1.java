package funciones;

/**
 * Contiene el método <code> dimensionesEsfera</code>, que calcula la superficie y el volumen de una esfera.
 * 
 * @author Sergio Algarrada Miranda
 */

public class Ejercicio1 {
	/**
	 * Calcula y muestra por pantalla la superficie y el volumen de una esfera.
	 * @param radio radio de la esfera en metros.
	 */
	
	public static void dimensionesEsfera (double radio) {
		double superficie = 4*Math.PI*Math.pow(radio, 2);
		double volumen = ((4*Math.PI)/3)*Math.pow(radio, 3);
		
		System.out.println("La superficie de la esfera es " + superficie + " metros cuadrados y el volumen es " + volumen + " metros cúbicos.");
		
	}
	

}
