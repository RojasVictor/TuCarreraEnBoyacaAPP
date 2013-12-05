/**
 * 
 */
package tuCarreraBoyacaAPP.logica;

import java.util.ArrayList;

/**
 * @author harold_patino
 *
 */
public class GestionTestUsuario {
//Attributes------------------------------------
	private TestUsuario testUsuario;
	private ArrayList<Integer> selecciones;
	private Double puntaje;
//Building--------------------------------------
	public GestionTestUsuario(){
		testUsuario=new TestUsuario();
		testUsuario.cargarPreguntasUsuario();
		selecciones=new ArrayList<Integer>();
	}
//Methods---------------------------------------
	public InstitucionEducacionSuperior institucion(){
		return null;
	}
	public ProgramaAcademico programa(){
		return null;
	}
	public void calificar(){
		for(int i=0;i<testUsuario.getPreguntaTest().size();i++){
			PreguntaTest preguntaActual=testUsuario.getPreguntaTest().get(i);
			if(selecciones.get(i)==preguntaActual.getRespuestaCorrecta()){
				puntaje=puntaje+1;
			}
		}
	}
}
