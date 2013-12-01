/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.BorderLayout;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import tuCarreraBoyacaAPP.logica.GestionInstitucionesEducacionSuperior;
import tuCarreraBoyacaAPP.logica.GestionPreguntaTest;
import tuCarreraBoyacaAPP.logica.GestionProgramasAcademico;
import javax.swing.SwingConstants;

/**
 * @author harold_patino
 *
 */
public class Login extends JFrame{
//Attributes---------------------------
	private JLabel lblLogo;
	private JLabel lblUserSesion;
	private JLabel lblPasswordSesion;
	private JButton btnIngresar;
	private LoginAdminText adminText;
	private EventsAdmin eventsAdmin;
	private GestionInstitucionesEducacionSuperior educacionSuperior;
	private GestionPreguntaTest preguntaTest;
	private GestionProgramasAcademico proAcademico;
	
//Building-----------------------------
	public Login(){
		this.setTitle("Tu Carrera en Boyaca APP");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(485, 290);
		inicializar();
		agregar();
	}
	
//Methods-------------------------------
	public void inicializar(){
		preguntaTest=new GestionPreguntaTest();
		proAcademico=new GestionProgramasAcademico();
		educacionSuperior=new GestionInstitucionesEducacionSuperior();
		//eventsAdmin=new EventsAdmin(this);
		lblUserSesion=new JLabel();
		lblPasswordSesion=new JLabel();
		lblLogo=new JLabel();
		lblLogo.setBounds(0, 0, 469, 92);
		lblLogo.setIcon(new ImageIcon(getClass().getResource("images/logo.PNG")));
		btnIngresar=new JButton();
		btnIngresar.setBounds(79, 199, 265, 53);
		btnIngresar.setIcon(new ImageIcon(getClass().getResource("images/btnIngresar.PNG")));
		btnIngresar.setActionCommand(eventsAdmin.INGRESAR);
		btnIngresar.addActionListener(eventsAdmin);
		adminText=new LoginAdminText();
		adminText.getLblUser().setText("Usuario");
		adminText.getLblUser().setHorizontalAlignment(SwingConstants.CENTER);
		adminText.getLblPassword().setHorizontalAlignment(SwingConstants.CENTER);
		adminText.setBounds(0, 92, 469, 107);
	}
	public void agregar(){
		getContentPane().setLayout(null);
		getContentPane().add(lblLogo);
		getContentPane().add(adminText);
		getContentPane().add(btnIngresar);
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
	 * @return the eventsAdmin
	 */
	public EventsAdmin getEventsAdmin() {
		return eventsAdmin;
	}
	
	/**
	 * @return the lblUserSesion
	 */
	public JLabel getLblUserSesion() {
		return lblUserSesion;
	}

	/**
	 * @return the lblPasswordSesion
	 */
	public JLabel getLblPasswordSesion() {
		return lblPasswordSesion;
	}

	/**
	 * @return the educacionSuperior
	 */
	public GestionInstitucionesEducacionSuperior getEducacionSuperior() {
		return educacionSuperior;
	}

	/**
	 * @return the preguntaTest
	 */
	public GestionPreguntaTest getPreguntaTest() {
		return preguntaTest;
	}

	/**
	 * @return the proAcademico
	 */
	public GestionProgramasAcademico getProAcademico() {
		return proAcademico;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Login myLogin=new Login();
		myLogin.setVisible(true);

	}

}
