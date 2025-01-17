package funciones;

public class Ejercicio3 {
	
	// Ejercicio 3-------------------------------------------
	//
	//
	// Crea la función: static void muestraPares (int n)
	//
	// que muestre en consola los primeros números pares
	//
	// -----------------------------------------------------



	public static void main(String[] args) {
	// Este es el punto de inicio del programa.
	// Aquí configuramos cuántos números pares queremos ver y llamamos a otra función para mostrarlos.

	// Definimos cuántos números pares queremos mostrar.
	// Cambia este valor si deseas ver más o menos números pares en pantalla.
	int n = 5;

	// Llamamos a la función "muestraPares" y le damos el valor de "n".
	// Esta función va a mostrar los primeros "n" números pares.
	muestraPares(n);
	}

	// Esta función muestra una cierta cantidad de números pares empezando desde 0.
	// Parámetro:
	// - n: La cantidad de números pares que queremos ver.
	static void muestraPares(int n) {

	// Definimos dos variables:
	// "contador" llevará el conteo de cuántos números pares se han mostrado.
	// "numero" es el número par actual que vamos a mostrar, empezando desde 0.
	int contador = 0; // Comienza en 0 porque aún no hemos mostrado ningún número par
	int numero = 0; // Comienza en 0, que es el primer número par

	// Iniciamos un bucle (repetición) que se ejecuta hasta que hemos mostrado "n" números pares.
	while (contador < n) {
	// Mostramos el valor actual de "numero" en la consola.
	System.out.println(numero); // Esto imprime el número par actual

	// Actualizamos "numero" sumándole 2 para pasar al siguiente número par.
	// Los números pares van de dos en dos (0, 2, 4, 6...), por eso sumamos 2 cada vez.
	numero += 2;

	// Aumentamos el valor de "contador" en 1 porque acabamos de mostrar un número par más.
	contador++;
	}
	}

}
