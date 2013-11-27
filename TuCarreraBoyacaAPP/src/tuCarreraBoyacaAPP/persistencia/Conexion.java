/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author harold_patino
 *
 */
public class Conexion {
//Attributes--------------------------------
	private Connection conexion;
	private final String DRIVER="com.mysql.jdbc.Driver";
	private final String URL="jdbc:mysql://localhost:3306/apptest";
	private final String USER="tucarrera";
	private final String PASSWORD="1234";
		
//Building----------------------------------
	public Conexion(){
		
	}
	
//Methods-----------------------------------
	/**
	 * @return the conexion
	 */
	public Connection getConexion() {
		return conexion;
	}

	/**
	 * @param conexion the conexion to set
	 */
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	/**
	 * @return the dRIVER
	 */
	public String getDRIVER() {
		return DRIVER;
	}

	/**
	 * @return the uRL
	 */
	public String getURL() {
		return URL;
	}

	/**
	 * @return the uSER
	 */
	public String getUSER() {
		return USER;
	}

	/**
	 * @return the pASSWORD
	 */
	public String getPASSWORD() {
		return PASSWORD;
	}
	/**
	 * 
	 * @return true si se logro conectar de manera exitosa con la BD
	 */
	public boolean conectar(){
		boolean resp=false;
		try{
			Class.forName(DRIVER).newInstance();
			conexion=DriverManager.getConnection(URL,USER,PASSWORD);
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		}catch (InstantiationException e) {
			System.out.println(e.getMessage());
		}
		resp=true;
		return resp;
	}
	public void close(){
		try{
			conexion.close();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Conexion [conexion=" + conexion + ", DRIVER=" + DRIVER
				+ ", URL=" + URL + ", USER=" + USER + ", PASSWORD=" + PASSWORD
				+ "]";
	}
}

