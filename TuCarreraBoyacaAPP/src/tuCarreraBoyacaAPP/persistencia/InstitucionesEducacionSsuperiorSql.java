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
	 * @param educacionSuperior - Objeto del cual se realizar�n las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String insertInstituciones (InstitucionEducacionSuperior superior) {
		return "INSERT INTO institucion_educacion_superior VALUES("+Q+superior.getNombre()+Q+","+Q+superior.getDireccionURL()+Q+");";		
	}
			
	/**
	 * 
	 * @param id - Integer - identificador del elemento de la base de datos a eliminar
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String deleteInstituciones (int id) {
		return "DELETE FROM institucion_educacion_superior WHERE ID_INSTITUCION="+id+";";	
	
	}
		
	/**
	 * 
	 * @param educacionSuperior - Objeto del cual se realizar�n las actualizaciones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String updateInstituciones (InstitucionEducacionSuperior educacionSuperior){
		return "UPDATE FROM institucion_educacion_superior VALUES("
				+educacionSuperior.getNombre()+","
				+educacionSuperior.getDireccionURL()+") WHERE ID_INSTITUCION ="
				+educacionSuperior.getId()+";";

	}
	
	/**
	 * 
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectInstituciones(){
		return "SELECT * FROM institucion_educacion_superior;";
	}

}
