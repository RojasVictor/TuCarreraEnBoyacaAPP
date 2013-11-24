/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import tuCarreraBoyacaAPP.logica.InstitucionEducacionSuperior;

/**
 * @author JUDIT
 * @author Victor_Rojas
 *
 */
public class InstitucionesEducacionSsuperiorSql {
	
	//Attributes -----------------------------------------------	
	private static final String Q="\'";
	
	//Building -----------------------------------------	
	public InstitucionesEducacionSsuperiorSql() {
		
	}
	
	//Methods --------------------------------------------	
	/**
	 * 
	 * @param educacionSuperior - Objeto del cual se realizarán las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String insertInstituciones (InstitucionEducacionSuperior educacionSuperior) {
		return "INSERT INTO institucion_educacion_superior VALUES("
				+Q+educacionSuperior.getNombre()+Q+","
				+Q+educacionSuperior.getDireccionURL()+Q+")";		
	}
			
	/**
	 * 
	 * @param id - Integer - identificador del elemento de la base de datos a eliminar
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String deleteInstituciones (int id) {
		return "DELETE FROM institucion_educacion_superior WHERE ID_INSTITUCION="+Q+id+Q+"";	
	
	}
		
	/**
	 * 
	 * @param educacionSuperior - Objeto del cual se realizarán las actualizaciones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String updateInstituciones (InstitucionEducacionSuperior educacionSuperior){
		return "UPDATE FROM institucion_educacion_superior VALUES("
				+Q+educacionSuperior.getNombre()+Q+","
				+Q+educacionSuperior.getDireccionURL()+Q+") WHERE ID_INSTITUCION"+Q+educacionSuperior.getId()+Q+"";

	}
	
	/**
	 * 
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectInstituciones(){
		return "SELECT * FROM institucion_educacion_superior;";
	}

}
