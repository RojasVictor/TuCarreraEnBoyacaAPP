/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author Victor_Rojas
 *
 */
public class ArchivoContraseña {
	
	//Attributes --------------------------------------------
	
	private File archivo;
    private FileReader lectorArchivo;
    private BufferedReader buferLectura;
	
    //Building ---------------------------------------------
    
    public ArchivoContraseña(){
    	archivo = null;
    	lectorArchivo = null;
    	buferLectura = null;
    	
    }
    
    
    //Methods ----------------------------------------------
	/**
	 * @return the archivo
	 */
	public File getArchivo() {
		return archivo;
	}

	/**
	 * @param archivo the archivo to set
	 */
	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}

	/**
	 * @return the lectorArchivo
	 */
	public FileReader getLectorArchivo() {
		return lectorArchivo;
	}

	/**
	 * @param lectorArchivo the lectorArchivo to set
	 */
	public void setLectorArchivo(FileReader lectorArchivo) {
		this.lectorArchivo = lectorArchivo;
	}

	/**
	 * @return the buferLectura
	 */
	public BufferedReader getBuferLectura() {
		return buferLectura;
	}

	/**
	 * @param buferLectura the buferLectura to set
	 */
	public void setBuferLectura(BufferedReader buferLectura) {
		this.buferLectura = buferLectura;
	}
	
	

}
