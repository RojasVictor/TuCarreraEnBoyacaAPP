package tuCarreraBoyacaAPP.logica;

public class PreguntaTest {

	private int id;	
	private String descripcion;
	private int idCategoria;
	private int idPrograma;
	
	
	public PreguntaTest (int identificador, int idCategoria2,
			int idPrograma2, String enunciado){
		id = identificador;
		descripcion = enunciado;
		idCategoria = idCategoria2;
		idPrograma = idPrograma2;		
	}

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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the idCategoria
	 */
	public int getIdCategoria() {
		return idCategoria;
	}

	/**
	 * @param idCategoria the idCategoria to set
	 */
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	/**
	 * @return the idPrograma
	 */
	public int getIdPrograma() {
		return idPrograma;
	}

	/**
	 * @param idPrograma the idPrograma to set
	 */
	public void setIdPrograma(int idPrograma) {
		this.idPrograma = idPrograma;
	}
			
}
