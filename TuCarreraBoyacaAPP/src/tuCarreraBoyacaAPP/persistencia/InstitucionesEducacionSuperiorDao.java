/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
	 * @return -1 si la accion sobre la basde de datos no fue exitosa
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
	 * @return -1 si la accion sobre la basde de datos no fue exitosa
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
	 * @return -1 si la accion sobre la basde de datos no fue exitosa
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
	 * @return ArrayList con todos los datos de la tabla instituciones_educacion_superior de la BD
	 */
	public ArrayList<InstitucionEducacionSuperior> selectInstitucion () {
		ResultSet datos;
		InstitucionEducacionSuperior institucion;
		ArrayList<InstitucionEducacionSuperior> superiors = new ArrayList<InstitucionEducacionSuperior>();
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				datos = sentencia.executeQuery(sqlInstitucion.selectInstituciones());
				while (datos.next()) {
					int id = Integer.parseInt(datos.getString("ID_INSTITUCION"));
					String nombre = datos.getString("NOMBRE_INSTITUCION");
					String url = datos.getString("URL");
					institucion = new InstitucionEducacionSuperior(id, nombre, url);
				    superiors.add(institucion);
				}
				return superiors;
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

}
