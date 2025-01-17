package secuenciales;
import java.util.Scanner;


//Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que influirán en esta decisión: 
//si está lloviendo y si hemos terminado nuestras tareas. Solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. 
//Existe una opción en la que, indistintamente de lo anterior, podremos salir a la calle: 
//el hecho de que tengamos que ir a la biblioteca (para realizar algún trabajo, entregar un libro, etc.). 
//Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca. 
//El algoritmo debe mostrar mediante un booleano (true o false) si es posible que se le otorgue permiso para ir a la calle.

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Este programa le indicará si usted puede salir hoy a la calle");
		boolean llueve;
		boolean tareaTerminada;
		boolean biblioteca;
		boolean salir;
		
		System.out.println("A continuación, le haremos algunas preguntas para saber si podrá salir. Responda 'true' en caso afirmativo o 'false' en caso contrario.");
		System.out.println("¿Está lloviendo?");
		llueve = sc.nextBoolean();
		System.out.println("¿Ha terminado la tarea de hoy?");
		tareaTerminada = sc.nextBoolean();
		System.out.println("¿Necesita ir a la biblioteca?");
		biblioteca = sc.nextBoolean();
		
		if (biblioteca) {
			salir = true;
		} else if (tareaTerminada && !llueve) {
			salir = true;
		} else {
			salir = false;
		}
		
		System.out.println("¿Puede salir?: " + salir);
		sc.close();
	}

}
