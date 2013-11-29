/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import tuCarreraBoyacaAPP.logica.InstitucionEducacionSuperior;
import tuCarreraBoyacaAPP.persistencia.Conexion;
/**
 * @author JUDIT
 * @author Victor_Rojas
 *
 */
public class InstitucionesEducacionSsuperiorSql {
	
	//Attributes -----------------------------------------------	
	private Conexion conexion;
	
	//Building -----------------------------------------	
	public InstitucionesEducacionSsuperiorSql() {
		conexion = new Conexion();
	}
	
	//Methods --------------------------------------------	
	/**
	 * 
	 * @param educacionSuperior - Objeto del cual se realizarán las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String insertInstituciones (InstitucionEducacionSuperior superior) {
		return "INSERT INTO institucion_educacion_superior VALUES('"+superior.getId()+"','"+superior.getNombre()+"','"+superior.getDireccionURL()+"')";		
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
	 * @param educacionSuperior - Objeto del cual se realizarán las actualizaciones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String updateInstituciones (InstitucionEducacionSuperior educacionSuperior){
		String BaseDatos = conexion.getBaseDatos();
		
		return "UPDATE `"+BaseDatos+"`.`institucion_educacion_superior` SET  `NOMBRE_INSTITUCION` = '"
				+educacionSuperior.getNombre()+"', `URL_INSTITUCION` = '"
				+educacionSuperior.getDireccionURL()+"' WHERE `institucion_educacion_superior`.`ID_INSTITUCION` ="
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
