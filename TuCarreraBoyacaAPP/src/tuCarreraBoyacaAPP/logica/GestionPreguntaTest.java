/**
 * 
 */
package tuCarreraBoyacaAPP.logica;

import java.util.ArrayList;

/**
 * @author victor_rojas*
 */
public class GestionPreguntaTest {

	//Attributes---------------------------------------
	
	private ArrayList<PreguntaTest> preguntas;
	
	//Building---------------------------------------
	
	public GestionPreguntaTest() {
		preguntas = new ArrayList<>();
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
	 * @return true - si el objeto se agrego satisfactoriamente en el ArrayList
	 ***/ 	
	public boolean createPregunta (PreguntaTest pregunta) {
		return getPreguntas().add(pregunta);
	}
	
	/**
	 ** @return ArrayList - un ArrayList de los objetos presentes
	 ***/ 
	public ArrayList<PreguntaTest> readPreguntaTests () {
		return (ArrayList<PreguntaTest>) preguntas.clone();
	}
	
	/**
	 ** @return PreguntaTest - un objeto de tipo PreguntaTest de acuerdo al id de busqueda
	 ** @param busqueda -- integer que es el criterio de busqueda en el ArrayList
	 ***/ 
	public PreguntaTest searchPreguntaTest (int busqueda){
		for (int i=0; i<preguntas.size();i++){
			if(preguntas.get(i).getId() == busqueda){
				return preguntas.get(i);
			}
		}
		return null;
	}
	
	/**
	 ** @return true - si se actualizo el registro del arrayList correctamente
	 ** @param id -- integer  -- identificador de la pregunta a actualizar
	 ** @param descripcion -- String -- enunciado de la pregunta
	 ** @param respuesta1 -- String -- enunciado de la respuesta 1 a actualizar
	 ** @param respuesta2 -- String -- enunciado de la respuesta 1 a actualizar
	 ** @param respuesta3 -- String -- enunciado de la respuesta 1 a actualizar
	 ** @param respuesta4 -- String -- enunciado de la respuesta 1 a actualizar
	 ** @param respuestaCorrecta -- Integer -- numero de la respuesta correcta
	 ***/ 
	public boolean updatePreguntaTest (int id, String descripcion, String respuesta1,
			String respuesta2, String respuesta3, String respuesta4,
			int respuestaCorrecta){
		
		for (int i=0; i<preguntas.size();i++){
			if(preguntas.get(i).getId() == id){
				preguntas.get(i).setDescripcion(descripcion);
				preguntas.get(i).setRespuesta1(respuesta1);
				preguntas.get(i).setRespuesta2(respuesta2);
				preguntas.get(i).setRespuesta3(respuesta3);
				preguntas.get(i).setRespuesta4(respuesta4);
				preguntas.get(i).setRespuestaCorrecta(respuestaCorrecta);
				return true;
			}
		}
		return false;
	}
		
	/**
	 ** @param id
	 ** @return - true si el registro se elimina satisfactoriamente
	 */
	public boolean removePreguntaTest(int id){
		for (int i=0; i<preguntas.size();i++){
			if(preguntas.get(i).getId() == id){
				preguntas.remove(i);
				return true;
			}
		}
		return false;
	}

}
