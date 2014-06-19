/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

/**
 * @author GandalfXI
 *
 */
public class CategoriaSql {
	//Attributes -----------------------------------------------	
		private Conexion conexion;
			
	//Building -----------------------------------------
		
	public CategoriaSql() {
		conexion = new Conexion();
	}

	/**
	 * @return
	 */
	public String selectCategorias(){
		return "SELECT * From categoria;";
	}

}
