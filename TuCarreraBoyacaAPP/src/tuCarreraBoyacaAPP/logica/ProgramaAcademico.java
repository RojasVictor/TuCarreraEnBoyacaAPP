package tuCarreraBoyacaAPP.logica;

public class ProgramaAcademico {

	//ATTRIBUTES --------------------------
	
	private int id;	
	private int idArea;
	private String nombre;	
	private String costo;	
	private int idInstitucion;	
	
	//BUILDING -------------------------------------
	/**
	 * @param id
	 * @param nombre
	 * @param categoria
	 * @param institucion
	 * @param costo
	 */
	public ProgramaAcademico(int id, int idArea, String nombre, String costo,
			int idInstitucion) {
		this.id = id;
		this.idArea = idArea;
		this.nombre = nombre;
		this.costo = costo;
		this.idInstitucion = idInstitucion;
		
	}
	
	//METHODS -------------------------------

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the idArea
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

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the costo
	 */
	public String getCosto() {
		return costo;
	}

	/**
	 * @param costo the costo to set
	 */
	public void setCosto(String costo) {
		this.costo = costo;
	}

	/**
	 * @return the idInstitucion
	 */
	public int getIdInstitucion() {
		return idInstitucion;
	}

	/**
	 * @param idInstitucion the idInstitucion to set
	 */
	public void setIdInstitucion(int idInstitucion) {
		this.idInstitucion = idInstitucion;
	}
	
}
