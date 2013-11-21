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

import tuCarreraBoycacaAPP.logica.GestionInstitucionesEducacionSuperior;
import tuCarreraBoycacaAPP.logica.GestionPreguntaTest;
import tuCarreraBoycacaAPP.logica.GestionProgramasAcademico;

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
		this.setLayout(new BorderLayout());
		this.setSize(450, 250);
		inicializar();
		agregar();
	}
	
//Mehods-------------------------------
	public void inicializar(){
		preguntaTest=new GestionPreguntaTest();
		proAcademico=new GestionProgramasAcademico();
		educacionSuperior=new GestionInstitucionesEducacionSuperior();
		eventsAdmin=new EventsAdmin(this);
		lblUserSesion=new JLabel();
		lblPasswordSesion=new JLabel();
		lblLogo=new JLabel();
		lblLogo.setIcon(new ImageIcon(getClass().getResource("images/logo.PNG")));
		btnIngresar=new JButton();
		btnIngresar.setIcon(new ImageIcon(getClass().getResource("images/btnIngresar.PNG")));
		btnIngresar.setActionCommand(eventsAdmin.INGRESAR);
		btnIngresar.addActionListener(eventsAdmin);
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
