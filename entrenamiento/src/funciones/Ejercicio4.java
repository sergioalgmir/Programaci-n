package funciones;


/**Ejercicio 4.
*Escribe una función a la que se pase como parámetros de entrada una cantidad de días,
* horas y minutos. La función calculará y devolverá el número de segundos que
* existen en los datos de entrada.*/

public class Ejercicio4 {
	/**
	*
	* @param dias parametros para los digitos de los dias
	* @param horas parametros para los digitos de los horas
	* @param minutos parametros para los digitos de los segundos
	* @return nos devuelve los segundos calculados
	*/
	/*vamos a darle valores enteros a dias, horas, minutos para luego poder multiplicarlos
	*por los segundos correspondientes y que nos devuelva con return los segundos calculados*/
	 
	public static int calcularSeg (int dias, int horas, int minutos) {
	int segundos = (dias * 24 * 3600 + horas * 3600 + minutos * 60);
	return segundos;
	}

}
