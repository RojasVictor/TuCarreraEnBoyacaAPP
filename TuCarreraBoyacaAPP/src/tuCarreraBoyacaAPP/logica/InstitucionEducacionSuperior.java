package tuCarreraBoyacaAPP.logica;

public class InstitucionEducacionSuperior {

	private  int id;
	private String nombre;
	private String direccionURL;
		
	/**
	 * @param id
	 * @param nombre
	 * @param direccionURL
	 */
	public InstitucionEducacionSuperior(int id, String nombre,
			String direccionURL) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccionURL = direccionURL;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InstitucionEducacionSuperior [id=" + id + ", nombre=" + nombre
				+ ", direccionURL=" + direccionURL + "]";
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

	public String getDireccionURL() {
		return direccionURL;
	}

	public void setDireccionURL(String direccionURL) {
		this.direccionURL = direccionURL;
	}
	
	
}
