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
				
	//Building -----------------------------------------
	public ProgramaAcademicoSql() {
		
	}
	//METHODS -----------------------------------------
	/**
	 * 
	 * @param programa - Objeto del cual se realizarán las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String insertProgramaNuevo (ProgramaAcademico programa) {
		return "START TRANSACTION; INSERT INTO programa_academico VALUES ("
				+programa.getId()+","
				+programa.getIdArea()+",'"
				+programa.getNombre()+"'"
				+");"
				+"INSERT INTO programa_academico_institucion_educacion_superior VALUES ("
				+programa.getIdInstitucion()+","
				+programa.getId()+","
				+programa.getCosto()+");COMMIT;";		
	}
	
	public String insertarRelacionPrograma (ProgramaAcademico programa){
		return "INSERT INTO programa_academico_institucion_educacion_superior VALUES ("
				+programa.getIdInstitucion()+","
				+programa.getId()+","
				+programa.getCosto()+");";
	}
	
	/**
	 * 
	 * @param id - identificador del elemento de la base de datos a eliminar
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String deletePrograma (int id) {
		return "DELETE FROM programa_academico WHERE ID_PROGRAMA_ACADEMICO ="+id+";";
				
	}
	
	/**
	 * 
	 * @param programa - Objeto del cual se realizarán las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String updatePrograma (ProgramaAcademico programa) {
			
		return  "UPDATE programa_academico AS a1, programa_academico_institucion_educacion_superior as a2 "
				+"SET a1.ID_AREA =" +programa.getIdArea() +","
				+" a1.NOMBRE_PROGRAMA_ACADEMICO = '"+programa.getNombre()+"',"
				+" a2.ID_INSTITUCION="+programa.getIdInstitucion()+","
				+"a2.COSTO_PROGRAMA='"+programa.getCosto()+"'"
				+" WHERE a1.ID_PROGRAMA_ACADEMICO=a2.ID_PROGRAMA_ACADEMICO;";				
	}
	
	/**
	 * 
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectProgramas() {
		return "SELECT programa_academico.ID_PROGRAMA_ACADEMICO,"
				+"ID_AREA, NOMBRE_PROGRAMA_ACADEMICO, COSTO_PROGRAMA, ID_INSTITUCION"
				+" FROM programa_academico"
				+" JOIN (programa_academico_institucion_educacion_superior)"
				+" WHERE programa_academico.ID_PROGRAMA_ACADEMICO = programa_academico_institucion_educacion_superior.ID_PROGRAMA_ACADEMICO"
				+" ORDER BY ID_PROGRAMA_ACADEMICO";
	}
	
	public String selectAreas(){
		return "SELECT * FROM area;";
	}

}
