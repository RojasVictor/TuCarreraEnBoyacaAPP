/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import tuCarreraBoyacaAPP.logica.PreguntaTest;
/**
 * @author JUDIT
 * @author Victor_Rojas
 *
 */
public class PreguntaSql {
	
	//Attributes -----------------------------------------------	
		private static final String Q="\'";
		
	//Building -----------------------------------------
	public  PreguntaSql(){
		
	}
	
	/**
	 * 
	 * @param pregunta - Objeto del cual se realizarán las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String insertPregunta (PreguntaTest pregunta) {
		return "INSERT INTO pregunta_test VALUES("
				+Q+pregunta.getDescripcion()+Q+","
				+Q+pregunta.getRespuesta1()+Q+","
				+Q+pregunta.getRespuesta2()+Q+","
				+Q+pregunta.getRespuesta3()+Q+","
				+Q+pregunta.getRespuesta4()+Q+","
				+Q+pregunta.getRespuestaCorrecta()+Q+")";
		
	}
	
	/**
	 * 
	 * @param id - Identificador del elemento de la base de datos a eliminar
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String deletePregunta (int id) {
		return "DELETE FROM pregunta_test WHERE ID_PREGUNTA="+Q+id+Q+"";	
		
	}
	
	/**
	 * 
	 * @param pregunta- Objeto del cual se realizarán las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String updatePregunta (PreguntaTest pregunta) {
		return "UPDATE FROM pregunta_test VALUES("
				+Q+pregunta.getDescripcion()+Q+","
				+Q+pregunta.getRespuesta1()+Q+","
				+Q+pregunta.getRespuesta2()+Q+","
				+Q+pregunta.getRespuesta3()+Q+","
				+Q+pregunta.getRespuesta4()+Q+","
				+Q+pregunta.getRespuestaCorrecta()+Q+") WHERE ID_PREGUNTA="+Q+pregunta.getId()+Q+"";


	}
	
	/**
	 * 
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectPreguntas() {
		return "SLECT * FROM pregunta_test";

	}

}
