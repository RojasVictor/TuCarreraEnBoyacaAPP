package tuCarreraBoycacaAPP.logica;

import java.util.ArrayList;

public class TestUsuario {

	private int idTest;
	private String nombreUsuario;
	private ArrayList preguntaTest;
	
	/*Constructor de la clase TestUsuario*/
	public TestUsuario(){
		
	}

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
 	
}
