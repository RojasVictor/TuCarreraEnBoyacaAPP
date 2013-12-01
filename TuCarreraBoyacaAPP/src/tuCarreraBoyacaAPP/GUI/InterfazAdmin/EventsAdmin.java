/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import tuCarreraBoyacaAPP.persistencia.ArchivoContraseña;

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
		ArchivoContraseña validar = new ArchivoContraseña();
		ArrayList<String[]> conjuntoDatos = validar.lectura();		
		if(login.isIniciar()){
			String user=getLogin().getTxt_Usuario().getText();
			String password = "";
			char [] res = getLogin().getTxt_Contrasena().getPassword();
			for(int j=0;j<res.length;j++){
				password = password +res[j];
			}			
			if(user.length()!=0 && res.length!=0){
				int conteo = 0;
				for (conteo=0; conteo<conjuntoDatos.size();conteo++){
					String [] dato  = conjuntoDatos.get(conteo);
					String usuario = dato[0];
					String pass = dato[1];
					if(user.equals(usuario) && password.equals(pass)){
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
		System.out.println("lo recibi");
	}
	
	

}
