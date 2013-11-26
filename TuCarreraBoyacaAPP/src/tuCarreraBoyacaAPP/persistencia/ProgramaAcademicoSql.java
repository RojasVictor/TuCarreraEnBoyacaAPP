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
		return "INSERT INTO programa_academico VALUES("
				+Q+programa.getNombre()+Q+","
				+Q+programa.getCategoria()
				+Q+programa.getCosto()+Q+");";
		
	}
	
	/**
	 * 
	 * @param id - identificador del elemento de la base de datos a eliminar
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String deletePrograma (int id) {
		return "DELETE FROM programa_academico WHERE ID_PROGRAMA="+Q+id+Q+";";	
	
	}
	
	/**
	 * 
	 * @param programa - Objeto del cual se realizarán las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String updatePrograma (ProgramaAcademico programa) {
		return  "UPDATE INTO programa_academico VALUES("
				+Q+programa.getNombre()+Q+","
				+Q+programa.getCategoria()+Q+") WHERE ID_PROGRAMA="+Q+programa.getId()+Q+";";

	}
	/**
	 * 
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectProgramas() {
		return "SELECT * FROM programa_academico;";

	}

}
