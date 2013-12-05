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
	 * @param pregunta - Objeto del cual se realizar�n las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String insertPregunta (PreguntaTest pregunta) {
		return "INSERT INTO pregunta_test VALUES("
				+pregunta.getId()+",'"
				+pregunta.getDescripcion()+"','"
				+pregunta.getRespuesta1()+"','"
				+pregunta.getRespuesta2()+"','"
				+pregunta.getRespuesta3()+"','"
				+pregunta.getRespuesta4()+"',"
				+pregunta.getRespuestaCorrecta()+")";		
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
	 * @param pregunta- Objeto del cual se realizar�n las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String updatePregunta (PreguntaTest pregunta) {
		String BaseDatos = conexion.getBaseDatos();
		
		return "UPDATE `"+BaseDatos+"`.`pregunta_test` SET `DESCRIPCION_PREGUNTA` = '"
				+pregunta.getDescripcion()+"',"
				+" `RESPUESTA_1` = '"+pregunta.getRespuesta1()+"',"
				+" `RESPUESTA_2` = '"+pregunta.getRespuesta2()+"',"
				+" `RESPUESTA_3` = '"+pregunta.getRespuesta3()+"',"
				+" `RESPUESTA_4` = '"+pregunta.getRespuesta4()+"',"
				+" `RESPUESTA_CORRECTA` = "+pregunta.getRespuestaCorrecta()
				+" WHERE `pregunta_test`.`ID_PREGUNTA` ="+pregunta.getId()+";";
	}
	
	/**
	 * 
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectPreguntasReporte() {
		return "SELECT pregunta_test.ID_PREGUNTA, "
				+"DESCRIPCION_PREGUNTA, RESPUESTA_1,"
				+"RESPUESTA_2, RESPUESTA_3, RESPUESTA_4,"
				+"RESPUESTA_CORRECTA, ID_PROGRAMA_ACADEMICO, PUNTAJE"
				+" FROM pregunta_test JOIN (progacademico_pregtest)" 
				+" WHERE progacademico_pregtest.ID_PREGUNTA = pregunta_test.ID_PREGUNTA"
				+" ORDER BY pregunta_test.ID_PREGUNTA";

	}
	 /**
	  * 
	  * @return String - Comando SQL para ejecutar sobre la base de datos
	  */
	public String selectPreguntas(){
		return "SELECT * From pregunta_test;";
	}

	/**
	 * @param idPregunta identificador pregunta a relacionar
	 * @param idPrograma identificador programa a relacionar
	 * @param puntaje valor que tiene esa pregunta para ese programa
	 * @return - Comando SQL para ejecutar sobre la base de datos
	 */
	public String insertRelacion(int idPregunta, int idPrograma, int puntaje) {
		return "INSERT INTO progacademico_pregtest VALUES("
				+ idPregunta +", "+ idPrograma +", "+ puntaje +");";
	}
	
	/**
	 * 
	 * @return - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectRelaciones(){
		return "SELECT * FROM progacademico_pregtest;";
	}

	/**
	 * @param pregunta
	 * @param idPrograma
	 * @return - Comando SQL para ejecutar sobre la base de datos
	 */
	public String deleteRelacion(int pregunta, int idPrograma) {
		return "DELETE FROM progacademico_pregtest WHERE ID_PREGUNTA = "+pregunta
				+" AND ID_PROGRAMA_ACADEMICO = "+idPrograma+";";
	}

	/**
	 * @param pregunta
	 * @param idPrograma
	 * @param puntaje
	 * @return - Comando SQL para ejecutar sobre la base de datos
	 */
	public String updateRelacion(int pregunta, int idPrograma, int puntaje) {
		return "UPDATE progacademico_pregtest SET PUNTAJE = "+puntaje
				+" WHERE ID_PREGUNTA = "+pregunta+ " AND ID_PROGRAMA_ACADEMICO = "+ idPrograma +";";
	}
	/**
	 * 
	 * @param idPregunta
	 * @param idPrograma
	 * @return
	 */
	public String seleccionarPuntaje(int idPregunta,int idPrograma){
		return "SELECT puntaje from progracademico_pregtest where id_programa_academico="+idPrograma+" and id_pregunta="+idPregunta+";";
	}

}
