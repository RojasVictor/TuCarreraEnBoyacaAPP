package tuCarreraBoyacaAPP.logica;

public class ProgramaAcademico {

	//ATTRIBUTES --------------------------
	
	private int id;		
	private String nombre;	
		
	//BUILDING -------------------------------------
	/**
	 * @param id
	 * @param nombre
	 * @param categoria
	 */
	public ProgramaAcademico(int id, String nombre) {
		this.id = id;		
		this.nombre = nombre;		
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
	
}
