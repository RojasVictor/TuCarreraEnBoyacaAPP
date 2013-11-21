/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import tuCarreraBoyacaAPP.logica.InstitucionEducacionSuperior;

/**
 * @author JUDIT
 *
 */
public class InstitucionesEducacionSsuperiorSql {
	
	private static final String Q="\'";

	/**
	 * 
	 */
	public InstitucionesEducacionSsuperiorSql() {
		
	}
	
	public String insertInstituciones (InstitucionEducacionSuperior educacionSuperior) {
		return "INSERT INTO Cita VALUES("+Q+educacionSuperior.getNombre()+Q+","+Q+educacionSuperior.getDireccion()+Q+","+Q+educacionSuperior.getTelefono()+Q+","+Q+educacionSuperior.getDireccionURL()+Q+")";
		
	}
	
	
	public String deleteInstituciones (int id) {
		return "DELETE FROM Cita WHERE id_cita="+Q+id+Q+"";	
	
	}
	
	public String updateInstituciones (String descripcion) {
		return descripcion;

	}

}
