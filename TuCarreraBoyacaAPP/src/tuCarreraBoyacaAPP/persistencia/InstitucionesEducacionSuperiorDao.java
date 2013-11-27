/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	private Conexion conexion;
	
	//Building -----------------------------------------
	
	public InstitucionesEducacionSuperiorDao() {		
		sqlInstitucion=new InstitucionesEducacionSsuperiorSql();
		conexion=new Conexion();
	}
	
	//Methods --------------------------------------------
	
	/**
	 * 
	 * @param institucion
	 * @return
	 */
	public int insertInstitucion  (InstitucionEducacionSuperior institucion) {
		if(conexion.conectar()){
			try{
				Statement sentencia = conexion.getConexion().createStatement();
				return sentencia.executeUpdate(sqlInstitucion.insertInstituciones(institucion));
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return -1;
		
	}
	
	/**
	 * 
	 * @param idInstitucion
	 * @return
	 */
	public int deleteInstitucion (int idInstitucion) {
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(sqlInstitucion.deleteInstituciones(idInstitucion));
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return -1;	
	}
	/**
	 * 
	 * @param institucion
	 * @return
	 */
	public int updateInstitucion (InstitucionEducacionSuperior institucion) {
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(sqlInstitucion.updateInstituciones(institucion));
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return -1;
	}
	/**
	 * 
	 * @return
	 */
	public ResultSet selectInstitucion () {
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeQuery(sqlInstitucion.selectInstituciones());
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

}
