package secuenciales;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

/**		Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. 
		Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos) de cada semestre para cada fruta. 
		La aplicación mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado en 2,35 € y el kilo de peras en 1,95 €.
		*/
		Scanner sc = new Scanner(System.in);
		double precioPeras=1.95;
		double precioManzanas=2.35;
		
		System.out.println("Introduzca los kilogramos de peras vendidos durante el primer semestre del año:");
		double peras1semestre = sc.nextDouble();
		System.out.println("Introduzca los kilogramos de peras vendidos durante el segundo semestre del año:");
		double peras2semestre = sc.nextDouble();
		System.out.println("Introduzca los kilogramos de manzanas vendidos durante el primer semestre del año:");
		double manzanas1semestre = sc.nextDouble();
		System.out.println("Introduzca los kilogramos de manzanas vendidos durante el segundo semestre del año:");
		double manzanas2semestre = sc.nextDouble();
		
		double beneficios = ((peras1semestre + peras2semestre) * precioPeras) + ((manzanas1semestre+manzanas2semestre) * precioManzanas);
		
		System.out.println("El beneficio total de este año ha sido "+ beneficios + " euros.") ;
		sc.close();
	}

}
