/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import tuCarreraBoyacaAPP.logica.InstitucionEducacionSuperior;
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
	public int insertProgramaNuevo(ProgramaAcademico programa){
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				int s1 = sentencia.executeUpdate(academicoSql.insertProgramaNuevo(programa));
				return s1;				
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return -1;
	}
	
	/**
	 * 
	 * @param programa - Objeto de tipo ProgramaAcademico
	 * @param institucion - Objeto de tipo InstitucionEducacionSuperior
	 * @return -1 si el comando sql no se ejecuta correctamente
	 */
	
	public int insertRelacion(int idPrograma, int idInstitucion, String costo){
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(academicoSql.insertarRelacionPrograma(idPrograma, idInstitucion, costo));
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
	 * @param elemento - Objeto de tipo String[] que debe ser eliminado de la base de datos
	 * @return -1 si la eliminiacion no se realizo en la base de datos
	 */
	public int deleteRelacion(String [] elemento){
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(academicoSql.deleteRelacion(elemento));
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
	
	public int updateRelacion(int idInstitucion, int idPrograma, String costo){
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				return sentencia.executeUpdate(academicoSql.updateRelacion(idInstitucion,idPrograma,costo));
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
	public ArrayList<String[]> selectProgramasReporte(){
		ResultSet datos;		
		ArrayList<String[]> academicos = new ArrayList<String[]>();
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				datos = sentencia.executeQuery(academicoSql.selectProgramasReportes());
				while (datos.next()) {
					String[] programa = new String[4];
					programa[0] = datos.getString("ID_PROGRAMA");					
					programa[1] = datos.getString("NOMBRE_PROGRAMA");
					programa[2] = datos.getString("COSTO");
					programa[3] = datos.getString("ID_INSTITUCION");
					academicos.add(programa);					
				}					
				return academicos;
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @return Obejto de tipo ArrayList que contiene objetos de tipo String[]
	 */
	public ArrayList<String[]> selectProgramasCosto(){
		ResultSet datos;		
		ArrayList<String[]> resultado = new ArrayList<String[]>();
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				datos = sentencia.executeQuery(academicoSql.selectProgramasCostos());
				while (datos.next()) {
					String idPrograma = datos.getString("ID_PROGRAMA");
					String idInstitucion = datos.getString("ID_INSTITUCION");
					String costo = datos.getString("COSTO");
					String [] elemento = new String[3];
					elemento[0] = idInstitucion;
					elemento[1] = idPrograma;					
					elemento[2] = costo;
					resultado.add(elemento);
				}
				return resultado;
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}				
		}
		return null;
	}
	 
	/**
	 * 
	 * @return Objeto tipo ArrayList que contiene objetos de tipo ProgramaAcademico obtenidos de la BD
	 */
	public ArrayList<ProgramaAcademico> selectProgramas(){
		ResultSet datos;
		ProgramaAcademico programa;
		ArrayList<ProgramaAcademico> academicos = new ArrayList<ProgramaAcademico>();
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				datos = sentencia.executeQuery(academicoSql.selectProgramas());
				while (datos.next()) {
					int idPrograma = Integer.parseInt(datos.getString("ID_PROGRAMA"));
					String nombre = datos.getString("NOMBRE_PROGRAMA");
					programa = new ProgramaAcademico(idPrograma, nombre);
					academicos.add(programa);
				}
				return academicos;
			}catch (SQLException e){
				System.out.println(e.getMessage());
			}				
		}
		return null;
	}
}
