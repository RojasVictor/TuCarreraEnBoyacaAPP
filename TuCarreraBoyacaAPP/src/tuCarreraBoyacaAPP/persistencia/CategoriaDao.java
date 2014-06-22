/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import tuCarreraBoyacaAPP.logica.Categoria;
import tuCarreraBoyacaAPP.logica.PreguntaTest;

/**
 * @author GandalfXI
 *
 */
public class CategoriaDao {

	private static CategoriaSql sqlCategoria;
	private static Conexion conexion;
	
	
	/**
	 * 
	 */
	public CategoriaDao() {
		sqlCategoria = new CategoriaSql();
		conexion = new Conexion();
	}
	
	public static ArrayList<Categoria> selectCategorias() {
		ResultSet datos;
		Categoria categoria;
		ArrayList<Categoria> categorias = new ArrayList<Categoria>();
		if(conexion.conectar()){
			try{
				Statement sentencia=conexion.getConexion().createStatement();
				datos = sentencia.executeQuery(sqlCategoria.selectCategorias());
				while (datos.next()) {
					int identificador = Integer.parseInt(datos.getString("ID_CATEGORIA"));
					String nombre = datos.getString("NOMBRE_CATEGORIA");					
					categoria = new Categoria(identificador, nombre);
					categorias.add(categoria);
				}
				return categorias;
				}catch (SQLException e){
					System.out.println(e.getMessage());
				}
			}
		return null;
	}

}
