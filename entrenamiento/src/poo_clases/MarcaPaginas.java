package poo_clases;

//TERMINADO
public class MarcaPaginas {

	private int pagina;
	
	public MarcaPaginas(int pagina) {
		super();
		this.pagina = pagina;
	}
	
	public MarcaPaginas() {
		super();
		this.pagina = 0;
	}

	public int getPagina() {
		return pagina;
	}

	@Override
	public String toString() {
		return "MarcaPaginas [pagina=" + pagina + "]";
	}
	
	
	public void incrementaPagina (int numero) {
		 this.pagina += numero;
	}
	
	public void leerDeNuevo() {
		this.pagina=0;
	}
}
