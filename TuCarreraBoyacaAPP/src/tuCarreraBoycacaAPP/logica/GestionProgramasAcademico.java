/**
 * 
 */
package tuCarreraBoycacaAPP.logica;

import java.util.ArrayList;

/**
 * @author victor_rojas
 *
 */
public class GestionProgramasAcademico {

	//Attributes --------------------------------------------------------
	
	private ArrayList<ProgramaAcademico> academicos;
	
	//Building ----------------------------------------------------------
	public GestionProgramasAcademico() {
		academicos = new ArrayList<ProgramaAcademico>();
		
	}
	
	//Methods ------------------------------------------------------------
	
	public ArrayList<ProgramaAcademico> getAcademicos() {
		return academicos;
	}

	public void setAcademicos(ArrayList<ProgramaAcademico> academicos) {
		this.academicos = academicos;
	}
	
	/**
	 * 
	 * @param programa -- objeto de tipo ProgramaAcademico para agregar en el ArrayList
	 * @return true - si se crea exitosamente el elemento
	 */
	public boolean crearProgramaAcademico (ProgramaAcademico programa){
		return academicos.add(programa);
	}
	
	/**
	 * @param busqueda -- integer -- id del elemento a buscar en el ArrayList
	 * @return Objeto de tipo Programa Academico que se encuentra en el ArrayList**/
	public ProgramaAcademico searchProgramaAcademico (int busqueda){
		
		for(int i=0; i<academicos.size();i++){
			if(academicos.get(i).getId()==busqueda){
				return academicos.get(i);
			}
		}
		return null;
	}
	
	/**
	 * @return ArrayList de programas academicos existentes
	 */
	public ArrayList<ProgramaAcademico> readProgramasAcademico (){
		return (ArrayList<ProgramaAcademico>) academicos.clone();
	}
	
	/**
	 * 
	 * @param id - identificador de elemento a actualizar
	 * @param nombre - nombre que queda actualizado del elemento
	 * @param area - nombre del area que queda actualizado en el elemento
	 * @return true - si se actualiza exitosamente el elemento del ArrayList
	 */
	public boolean updateProgramasAcademicos(int id, String nombre, String area){
		for(int i=0; i<academicos.size();i++){
			if(academicos.get(i).getId() == id){
				academicos.get(i).setNombre(nombre);
				academicos.get(i).setArea(area);
				return true;
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
		for(int i=0; i<academicos.size();i++){
			if(academicos.get(i).getId() == id){
				return academicos.remove(academicos.get(i));
			}
		}
		return false;
	}

}
