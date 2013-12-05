package tuCarreraBoyacaAPP.logica;

import java.util.ArrayList;

/**
 * @author victor_rojas
 *
 */

public class TestUsuario {

	//Attributes---------------------------------------
	private int idTest;
	private String nombreUsuario;
	private  GestionPreguntaTest gestion;
	private ArrayList<PreguntaTest> preguntaTest;
	//Building-----------------------------------------
	public TestUsuario(){
		gestion=new GestionPreguntaTest();
		idTest = 0;
		nombreUsuario = "";
		preguntaTest = new ArrayList<>();
	}

	//Methods------------------------------------------
	
	public String toString() {
		return "TestUsuario [idTest=" + idTest + ", nombreUsuario="
				+ nombreUsuario + "]";
	}

	public int getIdTest() {
		return idTest;
	}

	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public ArrayList<PreguntaTest> getPreguntaTest() {
		return preguntaTest;
	}

	public void setPreguntaTest(ArrayList<PreguntaTest> preguntaTest) {
		this.preguntaTest = preguntaTest;
	}
	/**
	 * 
	 */
	public void cargarPreguntasUsuario(){
		for(int i=0;i<3;i++){
			preguntaTest.add(gestion.getPreguntas().get(i));
		}
	}
 	
}
