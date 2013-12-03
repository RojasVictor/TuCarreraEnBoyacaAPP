/**
 * 
 */
package tuCarreraBoyacaAPP.logica;

import java.util.ArrayList;

import tuCarreraBoyacaAPP.persistencia.ProgramaAcademicoDao;

/**
 * @author victor_rojas
 *
 */
public class GestionProgramasAcademico {

	//Attributes --------------------------------------------------------
	
	private ArrayList<ProgramaAcademico> academicos;
	private ProgramaAcademicoDao academicoDao;
	private ArrayList<String []> areas; 
	
	//Building ----------------------------------------------------------
	public GestionProgramasAcademico() {
		academicos = new ArrayList<ProgramaAcademico>();
		academicoDao = new ProgramaAcademicoDao();
		academicos = readProgramasAcademico();
		areas = readAreas();
	}
	
	//Methods ------------------------------------------------------------
	
	/**
	 * 
	 * @return ArrayList<String[]> con los datos de la tabla area
	 */
	public ArrayList<String[]> readAreas() {
		return academicoDao.selectAreas();
	}
		
	/**
	 * @return the academicos
	 */
	public ArrayList<ProgramaAcademico> getAcademicos() {
		return academicos;
	}

	/**
	 * @param academicos the academicos to set
	 */
	public void setAcademicos(ArrayList<ProgramaAcademico> academicos) {
		this.academicos = academicos;
	}

	/**
	 * @param areas the areas to set
	 */
	public void setAreas(ArrayList<String[]> areas) {
		this.areas = areas;
	}

	/**
	 * 
	 * @param programa -- objeto de tipo ProgramaAcademico para agregar en el ArrayList
	 * @return true - si se crea exitosamente el elemento
	 */
	public int crearProgramaAcademico (ProgramaAcademico programa){
		return academicoDao.insertProgramaNuevo(programa);
	}
	
	public int crearRelacion (ProgramaAcademico programa){
		return academicoDao.insertRelacion(programa);
	}
	
	/**
	 * @param busqueda -- integer -- id del elemento a buscar en el ArrayList
	 * @return Objeto de tipo Programa Academico que se encuentra en el ArrayList**/
	public ProgramaAcademico searchProgramaAcademico (int busqueda){
		academicos = readProgramasAcademico();
		ProgramaAcademico programa =new ProgramaAcademico(busqueda, 0, null, null, 0);
		for(int i=0; i<academicos.size();i++){
			programa = getAcademicos().get(i);
			if(programa.getId()==busqueda){
				return programa;
			}
		}
		return null;
	}
	
	/**
	 * @return ArrayList de programas academicos existentes
	 */
	public ArrayList<ProgramaAcademico> readProgramasAcademico (){
		return academicoDao.selectProgramas();
	}
	
	/**
	 * @return the academicoDao
	 */
	public ProgramaAcademicoDao getAcademicoDao() {
		return academicoDao;
	}

	/**
	 * 
	 * @param id - identificador de elemento a actualizar
	 * @param nombre - nombre que queda actualizado del elemento
	 * @param area - nombre del area que queda actualizado en el elemento
	 * @return true - si se actualiza exitosamente el elemento del ArrayList
	 */
	public boolean updateProgramasAcademicos(int id, int idArea, String nombre, String costo, int idInstitucion){
		academicos = readProgramasAcademico();
		ProgramaAcademico actualizar = new ProgramaAcademico(id, idArea, nombre, costo, idInstitucion);
		if (searchProgramaAcademico(id) != null){
			for(int i=0; i<getAcademicos().size();i++){
				if(getAcademicos().get(i).getId() == id){
					academicoDao.updatePrograma(actualizar);
					academicos = readProgramasAcademico();
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param id - identificador de elemento a eliminar del ArrayList
	 * @return true - si se elimino el elemento correctamente 
	 */
	public boolean removeProgramasAcademicos(int id){
		academicos = readProgramasAcademico();
		ProgramaAcademico elemento = searchProgramaAcademico(id);
		ProgramaAcademico busqueda;
		if(elemento != null){
			for(int i=0; i<academicos.size();i++){
				busqueda = getAcademicos().get(i);
				if(academicos.get(i).getId() == id){
					academicoDao.deletePrograma(elemento.getId());
					academicos = readProgramasAcademico();
					return true;
				}
			}
		}
		
		return false;
	}
}
