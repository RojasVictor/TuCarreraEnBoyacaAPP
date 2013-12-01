/**
 * 
 */
package tuCarreraBoyacaAPP.persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author Victor_Rojas
 *
 */
public class ArchivoContraseña {
	
	//Attributes --------------------------------------------
	
	private final File ARCHIVO = new File("datosImportantes.tcb");
    private FileReader lectorArchivo;
    private BufferedReader buferLectura;
    private ArrayList<String[]> listaDatos;
	
    //Building ---------------------------------------------
    
    public ArchivoContraseña(){
    	lectorArchivo = null;
    	buferLectura = null;
    	listaDatos = null;
    	
    }
    
    
    //Methods ----------------------------------------------
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
	
	/**
	 * @return the listaDatos
	 */
	public ArrayList<String[]> getListaDatos() {
		return listaDatos;
	}


	/**
	 * @param listaDatos the listaDatos to set
	 */
	public void setListaDatos(ArrayList<String[]> listaDatos) {
		this.listaDatos = listaDatos;
	}


	public boolean escribir(ArrayList<String[]> datos){
		
	try{
		String [] elemento;
		FileWriter escribir = new FileWriter(ARCHIVO);
		BufferedWriter bufer = new BufferedWriter(escribir);
		PrintWriter escritor = new PrintWriter(bufer);
		for(int i=0;i<datos.size();i++){
			elemento = datos.get(i);
			escritor.write(""+elemento[0]+":"+elemento[1]);
			escritor.append("\r\n");
		}
		escritor.close();
		bufer.close();
		return true;
		}catch(IOException e){
			return false;
		}
	 }
	
	public ArrayList<String[]> lectura(){
		listaDatos = new ArrayList<String[]>();
	      FileReader leer = null;
	      BufferedReader buferLectura = null;
	try {	
        leer = new FileReader (ARCHIVO);
        buferLectura = new BufferedReader(leer);
        String linea;
        while((linea=buferLectura.readLine())!=null){
        	String[] dato = linea.split(":",2); 
        	listaDatos.add(dato);
        }
           
     }
     catch(Exception e){
        e.printStackTrace();
     }finally{
        try{                    
           if( null != leer ){   
              leer.close();     
           }                  
        }catch (Exception e2){ 
           e2.printStackTrace();
        }
     }if(listaDatos.size()!=0){
    	 return listaDatos;
     }
	return null;
	}
}
