/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import tuCarreraBoyacaAPP.logica.InstitucionEducacionSuperior;
import tuCarreraBoyacaAPP.logica.PreguntaTest;
import tuCarreraBoyacaAPP.persistencia.PreguntaSql;

/**
 * @author JUDIT
 *
 */
public class PreguntaDao {
//Attributes-----------------------------------
	private PreguntaSql sqlPregunta;
	private Conexion conexion;
	/**
	 * 
	 */

//Building-------------------------------------
	public PreguntaDao() {
		sqlPregunta=new PreguntaSql();
		conexion=new Conexion();
	}
	
//Methods--------------------------------------
	/**
	 * 
	 * @param pregunta objeto de tipo PreguntaTest se que insertara en la BD
	 * @return -1 si la accion sobre la basde de datos no fue exitosa
	 */
	public int insertPregunta (PreguntaTest pregunta) {
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(sqlPregunta.insertPregunta(pregunta));
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return -1;	
	}
	
	/**
	 * 
	 * @param idPreguta identificador de la pregunta a ser eliminada
	 * @return -1 si la accion sobre la basde de datos no fue exitosa
	 */
	public int deletePregunta (int idPreguta) {
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(sqlPregunta.deletePregunta(idPreguta));
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return -1;	
	}
	/**
	 * 
	 * @param pregunta
	 * @return -1 si la accion sobre la basde de datos no fue exitosa
	 */
	public int updatePregunta (PreguntaTest pregunta) {
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(sqlPregunta.updatePregunta(pregunta));
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return -1;
	}
	/**
	 * 
	 * @return ArrayList con todos los datos de la tabla pregunta_test de la BD
	 */
	public ArrayList<String[]> selectPreguntasReportes() {
		ResultSet datos;		
		ArrayList<String[]> preguntas = new ArrayList<String[]>();
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				datos = sentencia.executeQuery(sqlPregunta.selectPreguntasReporte());
				while (datos.next()) {
					String[] pregunta = new String[4];
					pregunta[0] = datos.getString("ID_PREGUNTA");
					pregunta[1] = datos.getString("ENUNCIADO");
					pregunta[2] = datos.getString("NOMBRE_PROGRAMA");
					pregunta[3] = datos.getString("NOMBRE_CATEGORIA");					
					preguntas.add(pregunta);
				}
				return preguntas;
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return null;
	}
	
	/**
	 * @return ArrayList con todos los datos de la tabla pregunta_test de la BD
	 */
	public ArrayList<PreguntaTest> selectPreguntas() {
		ResultSet datos;
		PreguntaTest pregunta;
		ArrayList<PreguntaTest> preguntas = new ArrayList<PreguntaTest>();
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				datos = sentencia.executeQuery(sqlPregunta.selectPreguntas());
				while (datos.next()) {
					int identificador = Integer.parseInt(datos.getString("ID_PREGUNTA"));
					String descrip = datos.getString("ENUNCIADO");
					int idCategoria = Integer.parseInt(datos.getString("ID_CATEGORIA"));
					int idPrograma  = Integer.parseInt(datos.getString("ID_PROGRAMA"));					
					pregunta = new PreguntaTest(identificador, idCategoria, idPrograma, descrip);
					preguntas.add(pregunta);
				}
				return preguntas;
				}catch (SQLException e){
					System.out.println(e.getMessage());
				}
			}
		return null;
	}
}
