/**
 * 
 */
package tuCarreraBoycacaAPP.GUI.InterfazAdmin;

import java.awt.BorderLayout;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author harold_patino
 *
 */
public class Login extends JFrame{
//Attributes---------------------------
	private JLabel lblLogo;
	private JButton btnIngresar;
	private LoginAdminText adminText;
	
//Building-----------------------------
	public Login(){
		this.setTitle("Tu Carrera en Boyaca APP");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setSize(450, 250);
		inicializar();
		agregar();
	}
	
//Mehods-------------------------------
	public void inicializar(){
		lblLogo=new JLabel();
		lblLogo.setIcon(new ImageIcon(getClass().getResource("images/logo.PNG")));
		btnIngresar=new JButton();
		btnIngresar.setIcon(new ImageIcon(getClass().getResource("images/btnIngresar.PNG")));
		adminText=new LoginAdminText();
	}
	public void agregar(){
		this.add(lblLogo,BorderLayout.NORTH);
		this.add(adminText,BorderLayout.CENTER);
		this.add(btnIngresar,BorderLayout.SOUTH);
	}
	/**
	 * @return the lblLogo
	 */
	public JLabel getLblLogo() {
		return lblLogo;
	}

	/**
	 * @return the btnIngresar
	 */
	public JButton getBtnIngresar() {
		return btnIngresar;
	}

	/**
	 * @return the adminText
	 */
	public LoginAdminText getAdminText() {
		return adminText;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Login myLogin=new Login();
		myLogin.setVisible(true);

	}

}
