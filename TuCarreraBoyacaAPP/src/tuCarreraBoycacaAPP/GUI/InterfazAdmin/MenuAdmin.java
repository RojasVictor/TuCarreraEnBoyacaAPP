/**
 * 
 */
package tuCarreraBoycacaAPP.GUI.InterfazAdmin;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author harold_patino
 *
 */
public class MenuAdmin extends JPanel{
//Attributes--------------------------
	private JButton btnIES;
	private JButton btnProgramas;
	private JButton btnPreguntas;
	private JButton btnExit;
	private JButton btnListar;
	private JButton btnCambiarContrasena;
//Building---------------------------
	public MenuAdmin(){
		this.setLayout(new GridLayout(3,2));
		inicializar();
		agregar();
	}
	
//Methods----------------------------
	/**
	 * Aca se inicializan todos los atributos
	 */
	public void inicializar(){
		btnIES=new JButton();
		btnIES.setIcon(new ImageIcon("images/btnIES.png"));
		btnProgramas=new JButton();
		btnProgramas.setIcon(new ImageIcon("images/btnProgramas.png"));
		btnPreguntas=new JButton();
		btnPreguntas.setIcon(new ImageIcon("images/btnPreguntas.png"));
		btnListar=new JButton();
		btnListar.setIcon(new ImageIcon("images/btnListar.png"));
		btnCambiarContrasena=new JButton();
		btnIES.setIcon(new ImageIcon("images/btnCambiarContrasena.png"));
		btnExit=new JButton();
		btnIES.setIcon(new ImageIcon("images/btnExit.png"));
	}
	/**
	 * Aca se agregan los elementos al panel
	 */
	public void agregar(){
		this.add(btnIES);
		this.add(btnListar);
		this.add(btnProgramas);
		this.add(btnCambiarContrasena);
		this.add(btnPreguntas);
		this.add(btnExit);
	}
	/**
	 * @return the btnIES
	 */
	public JButton getBtnIES() {
		return btnIES;
	}

	/**
	 * @return the btnProgramas
	 */
	public JButton getBtnProgramas() {
		return btnProgramas;
	}

	/**
	 * @return the btnPreguntas
	 */
	public JButton getBtnPreguntas() {
		return btnPreguntas;
	}

	/**
	 * @return the btnExit
	 */
	public JButton getBtnExit() {
		return btnExit;
	}

	/**
	 * @return the btnListar
	 */
	public JButton getBtnListar() {
		return btnListar;
	}

	/**
	 * @return the btnCambiarContrasena
	 */
	public JButton getBtnCambiarContrasena() {
		return btnCambiarContrasena;
	}
}
