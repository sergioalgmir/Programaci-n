package poo_clases;


//TERMINADO
/** Implementa una clase que permita resolver ecuaciones de segundo grado. Los coeficientes pueden indicarse en el constructor y modificarse
 *  a posteriori. Es fundamental que la clase disponga de un método que devuelva las distintas soluciones y de un 
 *  método que nos informe si el discriminante es positivo*/
public class Ecuaciones {

	private int a;
	private int b;
	private int c;
	
	public Ecuaciones(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	public double getDiscriminante () {
		return Math.pow(this.b, 2)-4*this.a*this.c;
	}
	
public boolean discriminantePositivo() {
	boolean positivo = true;
	if(getDiscriminante()<0) {
		positivo=false;
	} return positivo;
}


public void soluciones () {
	if(getDiscriminante()>0) {
		System.out.println("Solución 1 = " + solucionPositiva());
		System.out.println("Solución 2 = " + solucionNegativa());
	} else if (getDiscriminante() == 0) {
		System.out.println("Solución = " + solucionPositiva());
	} else {
		System.out.println("No tiene solución");
	}
	
	}

@Override
public String toString() {
	return "Ecuaciones [a=" + a + ", b=" + b + ", c=" + c + ", getDiscriminante()=" + getDiscriminante()
			+ ", discriminantePositivo()=" + discriminantePositivo() + "]";
}
private double solucionPositiva(){
	return (-b+Math.sqrt(getDiscriminante()))/2*a;
	
}

private double solucionNegativa() {
	return (-b-Math.sqrt(getDiscriminante()))/2*a;
}
	
}



