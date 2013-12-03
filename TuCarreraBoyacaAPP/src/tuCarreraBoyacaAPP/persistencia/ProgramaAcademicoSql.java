/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import tuCarreraBoyacaAPP.logica.ProgramaAcademico;
/**
 * @author JUDIT
 *
 */
public class ProgramaAcademicoSql {
	
	//Attributes -----------------------------------------------	
	private static final String Q="\'";
			
	//Building -----------------------------------------
	public ProgramaAcademicoSql() {
		
	}
	//METHODS -----------------------------------------
	/**
	 * 
	 * @param programa - Objeto del cual se realizarán las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String insertPrograma (ProgramaAcademico programa) {
		return "INSERT INTO programa_academico VALUES('"
				+programa.getId()+"','"
				+programa.getIdArea()+"','"
				+programa.getNombre()+"','"
				+programa.getCosto()+"')";
		
	}
	
	/**
	 * 
	 * @param id - identificador del elemento de la base de datos a eliminar
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String deletePrograma (int id) {
		return "DELETE FROM programa_academico WHERE ID_PROGRAMA="+id+";";	
	
	}
	
	/**
	 * 
	 * @param programa - Objeto del cual se realizarán las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String updatePrograma (ProgramaAcademico programa) {
			
		return  "UPDATE  `apptest`.`programa_academico` SET  `ID_AREA` ="+"'"+programa.getIdArea()+"',"
				+"`NOMBRE_PROGRAMA_ACADEMICO` = '"+programa.getNombre()+"',"
				+"`COSTO_PROGRAMA` =  '"+programa.getCosto()+"'"
				+"WHERE  `programa_academico`.`ID_PROGRAMA_ACADEMICO` ="+programa.getId()+";";

	}
	/**
	 * 
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectProgramas() {
		return "SELECT * FROM programa_academico;";

	}
	
	public String selectAreas(){
		return "SELECT * FROM area;";
	}

}
