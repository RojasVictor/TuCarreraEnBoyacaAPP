/**
 * 
 */
package tuCarreraBoyacaAPP.logica;

import java.util.ArrayList;

import tuCarreraBoyacaAPP.persistencia.PreguntaDao;

/**
 * @author victor_rojas*
 */
public class GestionPreguntaTest {

	//Attributes---------------------------------------	
	private ArrayList<PreguntaTest> preguntas;
	private PreguntaDao preguntaDao;
	
	//Building---------------------------------------
	
	public GestionPreguntaTest() {
		preguntas = new ArrayList<>();
		preguntaDao = new PreguntaDao();
		preguntas = readPreguntaTests();
	}
	
	//Methods--------------------------------------------
	/**
	 * @return preguntas -- retorna un ArrayList de las preguntas existentes
	 ***/ 
	public ArrayList<PreguntaTest> getPreguntas() {
		return preguntas;
	}

	/**
	 * @param preguntas
	 ***/ 
	public void setPreguntas(ArrayList<PreguntaTest> preguntas) {
		this.preguntas = preguntas;
	}
	
	/**
	 * @param pregunta -- objeto de tipo PreguntaTest para agregar en el ArrayList
	 * @return respuesta - int ---> -1 si la accion no fue exitosa
	 ***/ 	
	public int createPregunta (PreguntaTest pregunta) {
		int respuesta = preguntaDao.insertPregunta(pregunta);
		preguntas = readPreguntaTests();
		return respuesta;
	}
	
	/**
	 ** @return ArrayList - un ArrayList de los objetos presentes
	 ***/ 
	public ArrayList<String[]> readPreguntaTestsReporte () {
		return preguntaDao.selectPreguntasReportes();
	}
	
	/**
	 * 
	 * @return ArrayList - un ArrayList con los objetos presentes en la tabla progacademico_pregtest de la BD
	 */
	
	
	/**
	 * @return rrayList - un ArrayList con los objetos presentes en la tabla pregunta_test de la BD
	 */
	public ArrayList<PreguntaTest> readPreguntaTests() {
		return preguntaDao.selectPreguntas();
	}
	
	/**
	 * @return the preguntaDao
	 */
	public PreguntaDao getPreguntaDao() {
		return preguntaDao;
	}

	/**
	 ** @return PreguntaTest - un objeto de tipo PreguntaTest de acuerdo al id de busqueda
	 ** @param busqueda -- integer que es el criterio de busqueda en el ArrayList
	 ***/ 
	public PreguntaTest searchPreguntaTest (int busqueda){
		preguntas = readPreguntaTests();
		PreguntaTest pregunt = new PreguntaTest(busqueda, 0, 0, "");
		for (int i=0; i<getPreguntas().size();i++){
			pregunt = getPreguntas().get(i);
			if(pregunt.getId() == busqueda){
				return pregunt;
			}
		}
		return null;
	}
	
	/** 
	 * @param id
	 * @param idCategoria
	 * @param idPrograma
	 * @param descripcion
	 * @return
	 */
	public boolean updatePreguntaTest (int id, int idCategoria, 
			int idPrograma, String descripcion){
		preguntas = readPreguntaTests();
		PreguntaTest actualizar = new PreguntaTest(id, idCategoria,idPrograma,descripcion);
		if(searchPreguntaTest(id)!= null){
			for (int i=0; i<preguntas.size();i++){
				if(preguntas.get(i).getId() == id){
					preguntaDao.updatePregunta(actualizar);
					preguntas = readPreguntaTests();
					return true;
				}
			}		
		}
		return false;
	}
		
	/**
	 ** @param id
	 ** @return - true si el registro se elimina satisfactoriamente
	 */
	public boolean removePreguntaTest(int id){
		preguntas = readPreguntaTests();
		PreguntaTest elemento = searchPreguntaTest(id);
		PreguntaTest busqueda;
		if(elemento!=null){
			for (int i=0; i<getPreguntas().size();i++){
				busqueda = getPreguntas().get(i);
				if(busqueda.getId() == elemento.getId()){
					preguntaDao.deletePregunta(elemento.getId());
					preguntas = readPreguntaTests();
					return true;
				}
			}
		}		
		return false;
	}
}
