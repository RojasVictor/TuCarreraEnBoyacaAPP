/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import java.sql.ResultSet;

import tuCarreraBoyacaAPP.logica.InstitucionEducacionSuperior;
import tuCarreraBoyacaAPP.persistencia.InstitucionesEducacionSsuperiorSql;

/**
 * @author JUDIT
 * @author Victor_Rojas
 *
 */
public class InstitucionesEducacionSuperiorDao {

	//Attributes --------------------------------------
	private InstitucionesEducacionSsuperiorSql sqlInstitucion;
	
	
	//Building -----------------------------------------
	
	public InstitucionesEducacionSuperiorDao() {		
		InstitucionEducacionSuperior institucion;		
	}
	
	//Methods --------------------------------------------
	
	/**
	 * 
	 * @param institucion
	 * @return
	 */
	public boolean insertInstitucion  (InstitucionEducacionSuperior institucion) {
		return true;
	
		
	}
	
	
	public int deleteInstitucion  (int idInstitucion) {
		return idInstitucion ;	
	
	}
	
	public int updateInstitucion  (InstitucionEducacionSuperior institucion) {
		return 0;
		

	}
	
	public ResultSet selectInstitucion () {
		return null;

	}

}
