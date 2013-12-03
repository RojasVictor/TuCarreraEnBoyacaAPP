/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import tuCarreraBoyacaAPP.logica.ProgramaAcademico;

/**
 * @author JUDIT
 *
 */
public class ProgramaAcademicoDao {
//Attributes----------------------------------
	private ProgramaAcademicoSql academicoSql;
	private Conexion conexion;
	
//Building------------------------------------
	public ProgramaAcademicoDao(){
		academicoSql=new ProgramaAcademicoSql();
		conexion=new Conexion();
	}

//Methods-------------------------------------
	/**
	 * 
	 * @param programa
	 * @return -1 si el comando sql no se ejecuta correctamente
	 */
	public int insertPrograma(ProgramaAcademico programa){
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(academicoSql.insertPrograma(programa));
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return -1;
	}

	/**
	 * 
	 * @param idPrograma
	 * @return -1 si el comando sql no se ejecuta correctamente
	 */
	public int deletePrograma(int idPrograma){
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(academicoSql.deletePrograma(idPrograma));
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return -1;
	}

	/**
	 * 
	 * @param programa
	 * @return -1 si el comando sql no se ejecuta correctamente
	 */
	public int updatePrograma(ProgramaAcademico programa){
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(academicoSql.updatePrograma(programa));
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return -1;
	}

	/**
	 * 
	 * @return null - si no hay registros en la base de datos, y en caso contrario retorna objeto de tipo ResultSet con los datos de la base de datos
	 * 
	 */
	public ResultSet selectProgramas(){
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeQuery(academicoSql.selectProgramas());
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @return null - si no hay registros en la base de datos, y en caso contrario retorna objeto de tipo ResultSet con los datos de la base de datos
	 */
	public ResultSet selectAreas(){
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeQuery(academicoSql.selectAreas());
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

}
