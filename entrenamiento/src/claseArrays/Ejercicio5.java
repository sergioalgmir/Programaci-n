package claseArrays;


import java.util.Scanner;

/**
 * Aplicación que gestiona las notas de un centro educativo.
 * Los alumnos se organizan en grupos compuestos por 5 personas. 
 * Leer las notas (números enteros) del primer, segundo y tercer trimestre de un grupo. 
 * Debes mostrar al final la nota media del grupo en cada trimestre y la media del alumno 
 * que se encuentra en una posición dada (que el usuario introduce por teclado).
 */

public class Ejercicio5 {
	
	public static void leeNotas() {
		
		Scanner sc = new Scanner(System.in);
		double totalTrimestre1 = 0;
		double totalTrimestre2 = 0;
		double totalTrimestre3 = 0;
		
		
		
		int [] primerTrimestre = new int[5];
		System.out.println("Vamos a introducir las notas del primer trimestre: ");
		System.out.println();
		for (int i = 0; i< primerTrimestre.length; i++) {
			System.out.println("Introduzca la nota del alumno " +(i+1));
			primerTrimestre[i]=sc.nextInt();
			totalTrimestre1+=primerTrimestre[i];
			}
		System.out.println();
		
		System.out.println("Vamos a introducir las notas del segundo trimestre: ");
		System.out.println();
		int [] segundoTrimestre = new int[5];
		for (int i = 0; i< segundoTrimestre.length; i++) {
			System.out.println("Introduzca la nota del alumno " + (i+1));
			segundoTrimestre[i]=sc.nextInt();
			totalTrimestre2+=segundoTrimestre[i];
		}
		System.out.println();
		
		System.out.println("Vamos a introducir las notas del tercer trimestre: ");
		System.out.println();
		int [] tercerTrimestre = new int[5];
		for (int i = 0; i< tercerTrimestre.length; i++) {
			System.out.println("Introduzca la nota del alumno " + (i+1));
			tercerTrimestre[i]=sc.nextInt();	
			totalTrimestre3+=tercerTrimestre[i];
		
		} 
		System.out.println();
		System.out.println("La media de la clase en el primer trimestre es " + (double) totalTrimestre1/5);
		System.out.println("La media de la clase en el segundo trimestre es " + (double) totalTrimestre2/5);
		System.out.println("La media de la clase en el tercer trimestre es " + (double) totalTrimestre3/5);
		System.out.println("¿De qué alumno quiere saber la media del curso?");
		int alumno = sc.nextInt();
		double media = (primerTrimestre[alumno-1]+segundoTrimestre[alumno - 1] + tercerTrimestre [alumno-1])/3;
		System.out.println("La nota media del curso del alumno " + alumno + " es " + media);
		sc.close();
	}
		

}
