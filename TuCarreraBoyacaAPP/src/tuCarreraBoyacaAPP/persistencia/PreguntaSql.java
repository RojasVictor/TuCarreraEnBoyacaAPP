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
		return "INSERT INTO pregunta VALUES("
				+pregunta.getId()+","
				+pregunta.getIdPrograma()+","
				+pregunta.getIdCategoria()+",'"
				+pregunta.getDescripcion()
				+"');";		
	}
	
	/**
	 * 
	 * @param id - Identificador del elemento de la base de datos a eliminar
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String deletePregunta (int id) {
		return "DELETE FROM pregunta WHERE ID_PREGUNTA="+id+";";		
	}
	
	/**
	 * 
	 * @param pregunta- Objeto del cual se realizar�n las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String updatePregunta (PreguntaTest pregunta) {
		String BaseDatos = conexion.getBaseDatos();
		
		return "UPDATE `"+BaseDatos+"`.`pregunta` SET `DESCRIPCION_PREGUNTA` = '"
				+pregunta.getDescripcion()				
				+" WHERE `pregunta`.`ID_PREGUNTA` ="+pregunta.getId()+";";
	}
	
	/**
	 * 
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectPreguntasReporte() {
		return "SELECT ID_PREGUNTA,"
				+" ENUNCIADO, NOMBRE_PROGRAMA,"
				+" NOMBRE_CATEGORIA"
				+" FROM pregunta JOIN (categoria) JOIN (programa_academico)" 
				+" WHERE programa_academico.ID_PROGRAMA = pregunta.ID_PROGRAMA AND"
				+" pregunta.ID_CATEGORIA = categoria.ID_CATEGORIA"
				+" ORDER BY pregunta.ID_PREGUNTA;";

	}
	 /**
	  * 
	  * @return String - Comando SQL para ejecutar sobre la base de datos
	  */
	public String selectPreguntas(){
		return "SELECT * From pregunta;";
	}

	

}
