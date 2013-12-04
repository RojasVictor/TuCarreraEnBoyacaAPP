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
	 * @param idPregunta identificador pregunta a relacionar
	 * @param idPrograma identificador programa a relacionar
	 * @param puntaje valor que tiene esa pregunta para ese programa
	 * @return -1 si la accion no se desarrollo con exito
	 */
	public int insertRelacion(int idPregunta, int idPrograma, int puntaje) {
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(sqlPregunta.insertRelacion(idPregunta, idPrograma, puntaje));
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
					String[] pregunta = new String[9];
					pregunta[0] = datos.getString("ID_PREGUNTA");
					pregunta[1] = datos.getString("DESCRIPCION_PREGUNTA");
					pregunta[2] = datos.getString("RESPUESTA_1");
					pregunta[3] = datos.getString("RESPUESTA_2");
					pregunta[4] = datos.getString("RESPUESTA_3");
					pregunta[5] = datos.getString("RESPUESTA_4");
					pregunta[6] = datos.getString("RESPUESTA_CORRECTA");
					pregunta[7] = datos.getString("ID_PROGRAMA_ACADEMICO");
					pregunta[8] = datos.getString("PUNTAJE");
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
	 * 
	 * @return ArrayList con todos los datos de la tabla progacademico_pregtest de la BD
	 */
	public ArrayList<String[]> selectRelaciones(){
		ResultSet datos;		
		ArrayList<String[]> preguntas = new ArrayList<String[]>();
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				datos = sentencia.executeQuery(sqlPregunta.selectRelaciones());
				while (datos.next()) {
					String[] pregunta = new String[3];
					pregunta[0] = datos.getString("ID_PREGUNTA");
					pregunta[1] = datos.getString("ID_PROGRAMA_ACADEMICO");
					pregunta[2] = datos.getString("PUNTAJE");
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
					String descrip = datos.getString("DESCRIPCION_PREGUNTA");
					String r1 = datos.getString("RESPUESTA_1");
					String r2 = datos.getString("RESPUESTA_2");
					String r3 = datos.getString("RESPUESTA_3");
					String r4 = datos.getString("RESPUESTA_4");
					int respuestaC = Integer.parseInt(datos.getString("RESPUESTA_CORRECTA"));
					pregunta = new PreguntaTest(identificador, descrip, r1, r2, r3, r4, respuestaC);
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
