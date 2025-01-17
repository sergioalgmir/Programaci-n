package funciones;

public class Ejercicio8 {
	public static void numerosAleatorios(int numerosGenerados, int valorMinimo, int valorMaximo) {

		if (numerosGenerados<=0 || valorMinimo >= valorMaximo) { // Si se dan estas causas, los parámetros son incorrectos.
		System.out.println("Los parámetros son incorrectos.");
		return;
		}

		for (int i = 0; i< numerosGenerados;i++) {
		int numeroAleatorio = (int)(Math.random() * (valorMaximo - valorMinimo + 1)) + valorMinimo;
		System.out.println(numeroAleatorio);

		}
	}

}
