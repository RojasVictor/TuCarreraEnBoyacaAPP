package tuCarreraBoyacaAPP.logica;

public class InstitucionEducacionSuperior {

	private  int id;
	
	private String nombre;
	
	private String direccionURL;
	
	private String direccion;
	
	private String telefono;
	
	public InstitucionEducacionSuperior(){
		
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InstitucionEducacionSuperior [id=" + id + ", nombre=" + nombre
				+ ", direccionURL=" + direccionURL + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}



	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}



	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}



	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
