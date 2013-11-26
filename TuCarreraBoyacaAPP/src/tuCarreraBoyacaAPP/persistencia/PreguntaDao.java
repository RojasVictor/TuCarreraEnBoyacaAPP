/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tuCarreraBoyacaAPP.logica.PreguntaTest;

/**
 * @author JUDIT
 *
 */
public class PreguntaDao {
//Attributes-----------------------------------
	private PreguntaSql sql;
	private Conexion conexion;
	/**
	 * 
	 */

//Building-------------------------------------
	public PreguntaDao() {
		sql=new PreguntaSql();
		conexion=new Conexion();
	}
	
//Methods--------------------------------------
	/**
	 * 
	 * @param pregunta
	 * @return
	 */
	public int insertPregunta (PreguntaTest pregunta) {
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(sql.insertPregunta(pregunta));
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return -1;	
	}
	/**
	 * 
	 * @param idPreguta
	 * @return
	 */
	public int deletePregunta (int idPreguta) {
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(sql.deletePregunta(idPreguta));
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return -1;	
	}
	/**
	 * 
	 * @param pregunta
	 * @return
	 */
	public int updatePregunta (PreguntaTest pregunta) {
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(sql.updatePregunta(pregunta));
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
	public ResultSet selectPreguntas() {
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeQuery(sql.selectPreguntas());
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

}
