package tuCarreraBoyacaAPP.logica;

public class PreguntaTest {

	private  int id;	
	private String descripcion;	
	private String respuesta1;	
	private String respuesta2;	
	private String respuesta3;	
	private String respuesta4;
	private int respuestaCorrecta;
	private int idPrograma;
	private int puntaje;
	
	public PreguntaTest (int identificador, String descrip,String r1, String r2, String r3, String r4, int respuestaC, int idProg, int punt){
		id=identificador;
		descripcion=descrip;
		respuesta1=r1;
		respuesta2=r2;
		respuesta3=r3;
		respuesta4=r4;
		respuestaCorrecta=respuestaC;
		idPrograma = idProg;
		puntaje = punt;		
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
	 * @return the respuesta1
	 */
	public String getRespuesta1() {
		return respuesta1;
	}

	/**
	 * @param respuesta1 the respuesta1 to set
	 */
	public void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}

	/**
	 * @return the respuesta2
	 */
	public String getRespuesta2() {
		return respuesta2;
	}

	/**
	 * @param respuesta2 the respuesta2 to set
	 */
	public void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}

	/**
	 * @return the respuesta3
	 */
	public String getRespuesta3() {
		return respuesta3;
	}

	/**
	 * @param respuesta3 the respuesta3 to set
	 */
	public void setRespuesta3(String respuesta3) {
		this.respuesta3 = respuesta3;
	}

	/**
	 * @return the respuesta4
	 */
	public String getRespuesta4() {
		return respuesta4;
	}

	/**
	 * @param respuesta4 the respuesta4 to set
	 */
	public void setRespuesta4(String respuesta4) {
		this.respuesta4 = respuesta4;
	}

	/**
	 * @return the respuestaCorrecta
	 */
	public int getRespuestaCorrecta() {
		return respuestaCorrecta;
	}

	/**
	 * @param respuestaCorrecta the respuestaCorrecta to set
	 */
	public void setRespuestaCorrecta(int respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
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

	/**
	 * @return the puntaje
	 */
	public int getPuntaje() {
		return puntaje;
	}

	/**
	 * @param puntaje the puntaje to set
	 */
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
			
}
