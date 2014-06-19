/**
 * 
 */
package tuCarreraBoyacaAPP.logica;

/**
 * @author GandalfXI
 *
 */
public class Categoria {

	//ATTRIBUTES --------------------------
	private int identificador;
	private String nombreCategoria;
	
	//BUILDING -------------------------------------
	/**
	 * 
	 * @param identificador
	 * @param nombre
	 */
	public Categoria(int identificador, String nombre) {
		this.identificador = identificador;
		this.nombreCategoria = nombre;
	}

	//METHODS -------------------------------
	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	/**
	 * @return the nombreCategoria
	 */
	public String getNombreCategoria() {
		return nombreCategoria;
	}

	/**
	 * @param nombreCategoria the nombreCategoria to set
	 */
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	
}
