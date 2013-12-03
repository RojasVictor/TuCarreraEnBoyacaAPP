package tuCarreraBoyacaAPP.logica;

public class ProgramaAcademico {

	private int id;	
	private String nombre;	
	private String categoria;	
	private InstitucionEducacionSuperior institucion;
	private int costo;
	private int idArea;	
	/**
	 * @param id
	 * @param nombre
	 * @param categoria
	 * @param institucion
	 * @param costo
	 */
	public ProgramaAcademico(int id, String nombre, String categoria,
			InstitucionEducacionSuperior institucion, int costo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.institucion = institucion;
		this.costo = costo;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the costo
	 */
	public int getCosto() {
		return costo;
	}

	/**
	 * @param costo the costo to set
	 */
	public void setCosto(int costo) {
		this.costo = costo;
	}

	public ProgramaAcademico () { 
		
	}
	
	public String toString (){
		
		return null;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return
	 */	
	public int getIdArea() {
		return idArea;
	}

	/**
	 * @param idArea the idArea to set
	 */
	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}		
	
	
	
}
