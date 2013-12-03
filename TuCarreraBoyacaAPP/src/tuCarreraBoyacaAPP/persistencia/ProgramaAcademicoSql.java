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
		return "START TRANSACTION; INSERT INTO programa_academico VALUES ("
				+programa.getId()+","
				+programa.getIdArea()+",'"
				+programa.getNombre()+"',"
				+programa.getCosto()+");"
				+"INSERT INTO programa_academico_institucion_educacion_superior VALUES ("
				+programa.getIdInstitucion()+","
				+programa.getId()+");COMMIT;";		
	}
	
	/**
	 * 
	 * @param id - identificador del elemento de la base de datos a eliminar
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String deletePrograma (int id) {
		return "START TRANSACTION;"
				+" DELETE FROM programa_academico_institucion_educacion_superior"
				+" WHERE ID_PROGRAMA_ACADEMICO ="+ id+";"
				+"DELETE FROM programa_academico WHERE ID_PROGRAMA_ACADEMICO = "+ 90+";"
				+"COMMIT;";	
	}
	
	/**
	 * 
	 * @param programa - Objeto del cual se realizarán las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String updatePrograma (ProgramaAcademico programa) {
			
		return  "START TRANSACTION;"
				+"UPDATE programa_academico SET ID_AREA ="+ programa.getIdArea()+","
				+"NOMBRE_PROGRAMA_ACADEMICO = '"+programa.getNombre()+"',"
				+"COSTO_PROGRAMA = "+programa.getCosto()
				+" WHERE ID_PROGRAMA_ACADEMICO = "+programa.getId()+";"
				+"UPDATE programa_academico_institucion_educacion_superior "
				+"SET ID_INSTITUCION =" +programa.getIdInstitucion()
				+" WHERE ID_PROGRAMA_ACADEMICO = "+programa.getId()+";"
				+"COMMIT;";
	}
	
	/**
	 * 
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectProgramas() {
		return "SELECT programa_academico.ID_PROGRAMA_ACADEMICO,"
				+"ID_AREA, NOMBRE_PROGRAMA_ACADEMICO, COSTO_PROGRAMA, ID_INSTITUCION"
				+"FROM programa_academico"
				+"JOIN ( programa_academico_institucion_educacion_superior)"
				+"ORDER BY ID_PROGRAMA_ACADEMICO";

	}
	
	public String selectAreas(){
		return "SELECT * FROM area;";
	}

}
