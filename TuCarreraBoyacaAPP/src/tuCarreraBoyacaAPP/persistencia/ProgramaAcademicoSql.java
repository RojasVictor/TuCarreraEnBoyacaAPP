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
		return "INSERT INTO programa_academico values ("
				+ programa.getId()+", '"+programa.getNombre()+"');";									
	}
	
	/**
	 * 
	 * @param programa - Objeto de tipo ProgramaAcademico
	 * @param institucion - Objeto de tipo InstitucionEducacionSuperior
	 * @return Sentencia SQL para ser ejecutada por la base de datos
	 */
	
	public String insertarRelacionPrograma (int idPrograma, int idInstitucion, String Costo){
		return "INSERT INTO programa_institucion VALUES ("
				+idPrograma+","
				+idInstitucion+","				
				+Costo+");";
	}
	
	/**
	 * 
	 * @param id - identificador del elemento de la base de datos a eliminar
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String deletePrograma (int id) {
		return "DELETE FROM programa_academico WHERE ID_PROGRAMA ="+id+";";
				
	}
	
	/**
	 * 
	 * @param elemento - Objeto de tipo String[] que debe ser eliminado de la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String deleteRelacion(String[] elemento){
		return "DELETE FROM programa_institucion WHERE "
				+ "ID_PROGRAMA = "+ Integer.parseInt(elemento[1])+" AND "
				+ "ID_INSTITUCION = "+Integer.parseInt(elemento[0])+";";
	}
	
	/**
	 * 
	 * @param programa - Objeto del cual se realizarán las insersiones en la base de datos
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String updatePrograma (ProgramaAcademico programa) {
			
		return  "UPDATE programa_academico"
				+" NOMBRE_PROGRAMA = '"+programa.getNombre()+"',"
				+" WHERE ID_PROGRAMA="+programa.getId()+";";				
	}
	
	/**
	 * 
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectProgramasReportes() {
		return "SELECT programa_academico.ID_PROGRAMA,"
				+"NOMBRE_PROGRAMA_ACADEMICO, COSTO, ID_INSTITUCION"
				+" FROM programa_academico"
				+" JOIN (programa_institucion)"
				+" WHERE programa_academico.ID_PROGRAMA = programa_institucion.ID_PROGRAMA_ACADEMICO"
				+" ORDER BY ID_PROGRAMA";
	}
	
	/**
	 * 
	 * @return - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectProgramas(){
		return "SELECT * FROM programa_academico;";
	}
	
	/**
	 * 
	 * @return - Comando SQL para ejecutar sobre la base de datos
	 */
	public String selectProgramasCostos(){
		return "SELECT * FROM programa_institucion;";
	}
	
	/**
	 * 
	 * @return String - Comando SQL para ejecutar sobre la base de datos
	 */
	/**
	 * @param idInstitucion
	 * @param idPrograma
	 * @param costo
	 * @return
	 */
	public String updateRelacion(int idInstitucion, int idPrograma, String costo) {
		return "UPDATE programa_institucion SET COSTO = '"
				+ costo+"' WHERE ID_INSTITUCION = "+ idInstitucion + " AND "
				+ " ID_PROGRAMA = "+ idPrograma +";";
	}

}
