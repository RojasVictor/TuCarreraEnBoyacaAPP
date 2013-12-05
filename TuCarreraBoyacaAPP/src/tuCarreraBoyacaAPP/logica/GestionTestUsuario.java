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
	private ArrayList<Double> puntaje;
//Building--------------------------------------
	public GestionTestUsuario(){
		testUsuario=new TestUsuario();
		testUsuario.cargarPreguntasUsuario();
		puntaje=new ArrayList<Double>();
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
		}
	}
}
