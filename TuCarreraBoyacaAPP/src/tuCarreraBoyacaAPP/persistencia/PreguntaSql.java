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
	private Conexion conexion;
		
	//Building -----------------------------------------
	public  PreguntaSql(){
		conexion = new Conexion();
	}
	
	/**
	 * 
	 * @param pregunta - Objeto del cual se realizarán las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String insertPregunta (PreguntaTest pregunta) {
		return "INSERT INTO pregunta_test VALUES('"
				+pregunta.getDescripcion()+"','"
				+pregunta.getRespuesta1()+"','"
				+pregunta.getRespuesta2()+"','"
				+pregunta.getRespuesta3()+"','"
				+pregunta.getRespuesta4()+"','"
				+pregunta.getRespuestaCorrecta()+"')";
		
	}
	
	/**
	 * 
	 * @param id - Identificador del elemento de la base de datos a eliminar
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String deletePregunta (int id) {
		return "DELETE FROM pregunta_test WHERE ID_PREGUNTA="+id+";";	
		
	}
	
	/**
	 * 
	 * @param pregunta- Objeto del cual se realizarán las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String updatePregunta (PreguntaTest pregunta) {
		String BaseDatos = conexion.getBaseDatos();
		
		return "UPDATE `"+BaseDatos+"`.`pregunta_test``DESCRIPCION_PREGUNTA` = '"
				+pregunta.getDescripcion()+"',"
				+"`RESPUESTA_1` = '"+pregunta.getRespuesta1()+"','"
				+"`RESPUESTA_2` = '"+pregunta.getRespuesta2()+"','"
				+"`RESPUESTA_3` = '"+pregunta.getRespuesta3()+"','"
				+"`RESPUESTA_4` = '"+pregunta.getRespuesta4()+"','"
				+"`RESPUESTA_CORRECTA` = '"+pregunta.getRespuestaCorrecta()
				+"' WHERE `pregunta_test`.`ID_PREGUNTA` ="+pregunta.getId()+";";


	}
	
	/**
	 * 
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectPreguntas() {
		return "SELECT pregunta_test.ID_PREGUNTA, "
				+"DESCRIPCION_PREGUNTA, RESPUESTA_1,"
				+"RESPUESTA_2, RESPUESTA_3, RESPUESTA_4,"
				+"RESPUESTA_CORRECTA, ID_PROGRAMA_ACADEMICO, PUNTAJE"
				+" FROM pregunta_test JOIN (progacademico_pregtest)" 
				+" WHERE progacademico_pregtest.ID_PREGUNTA = pregunta_test.ID_PREGUNTA"
				+" ORDER BY pregunta_test.ID_PREGUNTA";

	}

}
