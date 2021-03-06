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
	private ArrayList<String[]> listado;
	
	//Building ----------------------------------------------------------
	public GestionProgramasAcademico() {
		academicos = new ArrayList<ProgramaAcademico>();
		academicoDao = new ProgramaAcademicoDao();
		academicos = readProgramasAcademicos();		
	}
	
	//Methods ------------------------------------------------------------
	
		
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
	 * 
	 * @param programa -- objeto de tipo ProgramaAcademico para agregar en el ArrayList
	 * @return true - si se crea exitosamente el elemento
	 */
	public int crearProgramaAcademico (ProgramaAcademico programa){
		return academicoDao.insertProgramaNuevo(programa);
	}
	
	/**
	 * 
	 * @param idPrograma - Integer - identificador del programa a crear en la relaci�n
	 * @param idInstitucion - Integer - identificador de la institucion a crear en la relaci�n
	 * @param costo - string - dato que contiene el costo de la matricula del programa Academico
	 * @return -1 si no se ejecuto el codigo SQL sobre la BD
	 */
	public int crearRelacion (int idPrograma, int idInstitucion, String costo){
		return academicoDao.insertRelacion(idPrograma, idInstitucion, costo);
	}
	
	/**
	 * @param busqueda -- integer -- id del elemento a buscar en el ArrayList
	 * @return Objeto de tipo Programa Academico que se encuentra en el ArrayList**/
	public ProgramaAcademico searchProgramaAcademico (int busqueda){
		academicos = readProgramasAcademicos();
		ProgramaAcademico programa =new ProgramaAcademico(busqueda, null);
		for(int i=0; i<academicos.size();i++){
			programa = getAcademicos().get(i);
			if(programa.getId()==busqueda){
				return programa;
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param idPrograma - Integer - identificador elemento a buscar
	 * @param idInstitucion - Integer - identificador elemento a buscar
	 * @return elemento - string [] - Objeto que contiene los datos de la busqueda
	 */
	public String[] searchElementoRelacion(int idPrograma, int idInstitucion){
		listado = readProgramasCosto();
		String[] elemento = new String[3];
		for(int t=0; t<listado.size();t++){
			elemento = listado.get(t);
			if(Integer.parseInt(elemento[1]) == idPrograma && Integer.parseInt(elemento[0]) == idInstitucion){
				return elemento;
			}
		}
		return null;
	}
	
	/**
	 * @return ArrayList de programas academicos existentes
	 */
	public ArrayList<ProgramaAcademico> readProgramasAcademicos (){
		return academicoDao.selectProgramas();
	}
	
	/**
	 * 
	 * @returnObjeto ArrayList que contiene objetos de tipo String[]
	 */
	public ArrayList<String[]> readProgramasCosto(){
		return academicoDao.selectProgramasCosto();
	}
	
	
	/**
	 * 
	 * @return Objeto ArrayList que contiene objetos de tipo String[]
	 */
	public ArrayList<String[]> readProgramasAcademicoReporte(){
		return academicoDao.selectProgramasReporte();
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
	public boolean updateProgramasAcademicos(int id, String nombre){
		academicos = readProgramasAcademicos();
		ProgramaAcademico actualizar = new ProgramaAcademico(id, nombre);
		if (searchProgramaAcademico(id) != null){
			for(int i=0; i<getAcademicos().size();i++){
				if(getAcademicos().get(i).getId() == id){
					academicoDao.updatePrograma(actualizar);
					academicos = readProgramasAcademicos();
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean updateRelacion(int idInstitucion, int idPrograma, String costo){
		listado = readProgramasCosto();
		if(searchElementoRelacion(idPrograma, idInstitucion) != null){
			for(int i=0; i<getAcademicos().size();i++){
				if(Integer.parseInt(listado.get(i)[0]) == idInstitucion && Integer.parseInt(listado.get(i)[1]) == idPrograma){
					academicoDao.updateRelacion(idInstitucion, idPrograma, costo);
					listado = readProgramasCosto();
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
		academicos = readProgramasAcademicos();
		ProgramaAcademico elemento = searchProgramaAcademico(id);
		ProgramaAcademico busqueda;
		if(elemento != null){
			for(int i=0; i<academicos.size();i++){
				busqueda = getAcademicos().get(i);
				if(academicos.get(i).getId() == id){
					academicoDao.deletePrograma(elemento.getId());
					academicos = readProgramasAcademicos();
					return true;
				}
			}
		}		
		return false;
	}
	
	/**
	 * 
	 * @param idPrograma - Integer - identificador del elemento a borrar
	 * @param idInstitucion - Integer - identificador del elemento a borrar
	 * @return true si se elimino correctamente
	 */
	public boolean removeRelacion (int idPrograma, int idInstitucion){
		ArrayList<String[]> elementos = readProgramasCosto();
		String[] dato = searchElementoRelacion(idPrograma, idInstitucion);
		String[] busqueda;
		if(dato != null){
			for(int i=0; i<elementos.size();i++){
				busqueda = elementos.get(i);
				if(Integer.parseInt(elementos.get(i)[0]) == idInstitucion && Integer.parseInt(elementos.get(i)[1]) == idPrograma){
					academicoDao.deleteRelacion(elementos.get(i));
					academicos = readProgramasAcademicos();
					return true;
				}
			}
		}		
		return false;
	}
}
