/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import tuCarreraBoyacaAPP.logica.InstitucionEducacionSuperior;
import tuCarreraBoyacaAPP.logica.ProgramaAcademico;
/**
 * @author JUDIT
 * @author Victor_Rojas
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
		return "INSERT INTO `apptest`.`programa_academico` ( `ID_PROGRAMA_ACADEMICO` , `ID_AREA` ,"
				+ "`NOMBRE_PROGRAMA_ACADEMICO`)VALUES('"
				+ programa.getId()+"', '"+ programa.getIdArea()+"', '"+programa.getNombre()+"');";									
	}
	
	/**
	 * 
	 * @param programa - Objeto de tipo ProgramaAcademico
	 * @param institucion - Objeto de tipo InstitucionEducacionSuperior
	 * @return Sentencia SQL para ser ejecutada por la base de datos
	 */
	
	public String insertarRelacionPrograma (int idPrograma, int idInstitucion, String Costo){
		return "INSERT INTO programa_academico_institucion_educacion_superior VALUES ("
				+idInstitucion+","
				+idPrograma+","
				+Costo+");";
	}
	
	/**
	 * 
	 * @param id - identificador del elemento de la base de datos a eliminar
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String deletePrograma (int id) {
		return "DELETE FROM programa_academico WHERE ID_PROGRAMA_ACADEMICO ="+id+";";
				
	}
	
	public String deleteRelacion(String[] elemento){
		return "DELETE FROM programa_academico_institicion_educacion_superior WHERE "
				+ "ID_PROGRAMA_ACADEMICO = "+ Integer.parseInt(elemento[0])+" AND "
				+ "ID_INSTITUCION = "+Integer.parseInt(elemento[1])+";";
	}
	
	/**
	 * 
	 * @param programa - Objeto del cual se realizarán las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String updatePrograma (ProgramaAcademico programa) {
			
		return  "UPDATE programa_academico SET ID_AREA =" +programa.getIdArea() +","
				+" NOMBRE_PROGRAMA_ACADEMICO = '"+programa.getNombre()+"',"
				+" WHERE ID_PROGRAMA_ACADEMICO="+programa.getId()+";";				
	}
	
	/**
	 * 
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectProgramasReportes() {
		return "SELECT programa_academico.ID_PROGRAMA_ACADEMICO,"
				+"ID_AREA, NOMBRE_PROGRAMA_ACADEMICO, COSTO_PROGRAMA, ID_INSTITUCION"
				+" FROM programa_academico"
				+" JOIN (programa_academico_institucion_educacion_superior)"
				+" WHERE programa_academico.ID_PROGRAMA_ACADEMICO = programa_academico_institucion_educacion_superior.ID_PROGRAMA_ACADEMICO"
				+" ORDER BY ID_PROGRAMA_ACADEMICO";
	}
	
	/**
	 * 
	 * @return - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectProgramas(){
		return "SELECT * FROM programa_academico;";
	}
	
	public String selectProgramasCostos(){
		return "SELECT * FROM programa_academico_institucion_educacion_superior;";
	}
	
	/**
	 * 
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectAreas(){
		return "SELECT * FROM area;";
	}

}
