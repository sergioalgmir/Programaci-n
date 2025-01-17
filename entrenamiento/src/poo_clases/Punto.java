package poo_clases;

//TERMINADO

/**
 * Escribe la clase Punto que representa un punto en el plano (con un componente
 * x y un componente y), con los métodos:
 * 
 * Punto (double x, double y): construye un objeto con los datos pasados como
 * parámetros. void desplazaX (double dx): incrementa el componente x en la
 * cantidad dx. void desplazaY (double dy): incrementa el componente y en la
 * cantidad dy. void desplaza (double dx, double dy): desplaza ambos componentes
 * según las cantidades dx (en el eje x) y dy (en el componente y). double
 * distanciaEuclidea (Punto otro): calcula y devuelve la distancia euclídea
 * entre el punto invocante y el punto otro. 
 * void muestra (): muestra por
 * consola la información relativa al punto
 */

public class Punto {

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void desplazaX(double dx) {
		this.x += dx;
	}

	public void desplazaY(double dy) {
		this.y += dy;
	}

	public void desplaza(double dx, double dy) {
		desplazaX(dx);
		desplazaY(dy);

	}
	
	
	public double distanciaEuclidea (Punto otro){
		double distanciaEuclidea = Math.sqrt((otro.getX()-this.x)*(otro.getX()-this.x)+ (otro.getY()-this.y)*(otro.getY()-this.y));
		return distanciaEuclidea;
	}
	
	
	public void muestra() {
		System.out.println("Coordenada X = "+ this.getX());
		System.out.println("Coordenada Y = " + this.getY());
		
	}
}
