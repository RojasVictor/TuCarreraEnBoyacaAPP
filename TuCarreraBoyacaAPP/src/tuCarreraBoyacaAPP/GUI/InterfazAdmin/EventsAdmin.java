/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import tuCarreraBoyacaAPP.persistencia.ArchivoContrasena;

import javax.swing.JOptionPane;

/**
 * @author harold_patino
 *
 */
public class EventsAdmin implements ActionListener{
//Attributes-------------------------------------------
	public static final String INGRESAR="Ingresar";
	public static final String IES="Universidades";
	private LoginAdmin login;
	
//Building---------------------------------------------
	public EventsAdmin(){
		this.login=null;
	}
	
//Methods----------------------------------------------
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		ArchivoContrasena validar = new ArchivoContrasena();
		ArrayList<String[]> conjuntoDatos = validar.lectura();		
		if(login.isIniciar()){
			String user=getLogin().getTxt_Usuario().getText();
			String word = "";
			float password;
			float desencriptada;
			char [] res = getLogin().getTxt_Contrasena().getPassword();
			for(int j=0;j<res.length;j++){
				word = word +res[j];
			}
			if(word.equals("")){
				password = 0;
			}else{
				password= Float.parseFloat(word);
			}
			if(user.length()!=0 && password!=0){
				int conteo = 0;
				for (conteo=0; conteo<conjuntoDatos.size();conteo++){
					String [] dato  = conjuntoDatos.get(conteo);
					String usuario = dato[0];
					float pass = Float.parseFloat(dato[1]);
					desencriptada = desencirptarContrasena(pass);
					if(user.equals(usuario) && password==desencriptada){
						login.dispose();
						MenuAdmin.main(null);
						break;
					}					
				}
				if(conteo == conjuntoDatos.size() ){
					JOptionPane.showMessageDialog(login, "El nombre de usuario o la contrasena son incorrectos");
					getLogin().getTxt_Contrasena().setText("");
					getLogin().getTxt_Usuario().setText("");
				}				
			}
			else{
				JOptionPane.showMessageDialog(login, "Alguno de los campos solicitados ha quedado vacio");
			}
		}
		
	}

	/**
	 * @return the login
	 */
	public LoginAdmin getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(LoginAdmin login) {
		this.login = login;
	}
	
	
	/**
	 * 
	 * @param sinEncriptar - float - Contrase�a extraida del campo de texto para codificar
	 * @return encriptada - float - Contrase�a que ya esta encriptada
	 */
	public static float encriptarContrasena(float sinEncriptar){
		float encriptada = (sinEncriptar - 346) / 222;		
		return encriptada;
		
	}
	
	/**
	 * 
	 * @param encriptada -  Contrase�a obtenida, para desencriptarla
	 * @return desencriptada - float - Contrase�a que ya esta desencriptada
	 */
	public static float desencirptarContrasena(float encriptada){
		float desencriptada = (encriptada * 222) + 346;
		return desencriptada;
	}

}
