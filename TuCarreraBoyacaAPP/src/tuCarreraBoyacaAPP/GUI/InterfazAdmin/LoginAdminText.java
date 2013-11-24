/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author harold_patino
 *
 */
public class LoginAdminText extends JPanel{
//Attributes-------------------------------
	private JLabel lblUser;
	private JLabel lblPassword;
	private JTextField txtUser;
	//private JTextField txtPassword;
	private JPasswordField jpwPassword;
	
//Building---------------------------------
	public LoginAdminText(){
		this.setLayout(new GridLayout(2,2));
		inicializar();
		agregar();
	}
//Methods----------------------------------
	/**
	 * Aca se inicializan todos los atributos
	 */
	public void inicializar(){
		lblUser=new JLabel("Usuario:");
		lblPassword=new JLabel("Contrasena");
		txtUser=new JTextField();
		jpwPassword=new JPasswordField();
	}
	
	/**
	 * Aca se agregan los elementos al panel
	 */
	public void agregar(){
		this.add(lblUser);
		this.add(txtUser);
		this.add(lblPassword);
		this.add(jpwPassword);
	}
	
	/**
	 * @return the lblUser
	 */
	public JLabel getLblUser() {
		return lblUser;
	}
	/**
	 * @return the lblPassword
	 */
	public JLabel getLblPassword() {
		return lblPassword;
	}
	/**
	 * @return the txtUser
	 */
	public JTextField getTxtUser() {
		return txtUser;
	}
	/**
	 * @return the txtPassword
	 */
	public JTextField getTxtPassword() {
		return jpwPassword;
	}
	
}
