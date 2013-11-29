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
	 * @param pregunta
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
	 * @param idPreguta
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
	public ArrayList<PreguntaTest> selectPreguntas() {
		ResultSet datos;
		PreguntaTest pregunta;
		ArrayList<PreguntaTest> preguntas = new ArrayList<PreguntaTest>();
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				datos = sentencia.executeQuery(sqlPregunta.selectPreguntas());
				while (datos.next()) {
					int id = Integer.parseInt(datos.getString("ID_PREGUNTA"));
					String descripcion = datos.getString("DESCRIPCION_PREGUNTA");
					String respuesta1 = datos.getString("RESPUESTA_1");
					String respuesta2 = datos.getString("RESPUESTA_2");
					String respuesta3 = datos.getString("RESPUESTA_3");
					String respuesta4 = datos.getString("RESPUESTA_4");
					int respuestaCorrecta = Integer.parseInt(datos.getString("RESPUESTA_CORRECTA"));
					pregunta = new PreguntaTest(id,descripcion,respuesta1,respuesta2,respuesta3,respuesta4,respuestaCorrecta);
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
