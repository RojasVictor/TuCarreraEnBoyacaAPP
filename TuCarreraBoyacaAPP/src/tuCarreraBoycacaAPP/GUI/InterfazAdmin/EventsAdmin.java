/**
 * 
 */
package tuCarreraBoycacaAPP.GUI.InterfazAdmin;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * @author harold_patino
 *
 */
public class EventsAdmin implements ActionListener{
//Attributes-------------------------------------------
	public static final String INGRESAR="Ingresar";
	private Login login;
	
//Building---------------------------------------------
	public EventsAdmin(Login login){
		this.login=login;
	}
	
//Methods----------------------------------------------
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(INGRESAR)){
			String user=getLogin().getAdminText().getTxtUser().getText();
			String password=getLogin().getAdminText().getTxtPassword().getText();
			if(user.length()>0 && password.length()>0){
				if(user.equals("admin01") && password.equals("12345")){
					getLogin().getLblUserSesion().setText(user);
					getLogin().getLblPasswordSesion().setText(password);
				}
				else{
					JOptionPane.showMessageDialog(login, "El nombre de usuario o la contrasena son incorrectos");
					getLogin().getAdminText().getTxtPassword().setText("");
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
	public Login getLogin() {
		return login;
	}
	

}
