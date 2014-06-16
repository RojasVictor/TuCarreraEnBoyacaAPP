/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * @author GandalfXI
 *
 */
public class IniciarSesion extends JFrame{

	private JPanel contentPane;
	private JPasswordField txt_Contrasena;
	private JTextField txt_Usuario;
	private EventsAdmin eventsAdmin;
	private boolean iniciar = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IniciarSesion window = new IniciarSesion();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IniciarSesion() {		
		setTitle("INGRESO MODULO ADMINISTRADOR");
		setBounds(100, 100, 463, 299);
		setIconImage(Toolkit.getDefaultToolkit().getImage(IniciarSesion.class.getResource("/tuCarreraBoyacaAPP/GUI/InterfazAdmin/Images/ingreso.png")));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setForeground(new Color(0, 0, 0));
		lblUsuario.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lblUsuario.setBounds(52, 123, 127, 26);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASEÑA");
		lblContrasea.setForeground(new Color(0, 0, 0));
		lblContrasea.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lblContrasea.setBounds(52, 168, 127, 27);
		contentPane.add(lblContrasea);
		
		txt_Contrasena = new JPasswordField();
		txt_Contrasena.setBounds(205, 169, 193, 26);
		contentPane.add(txt_Contrasena);
		txt_Contrasena.setColumns(10);
		
		
		txt_Usuario = new JTextField();
		txt_Usuario.setBounds(205, 123, 193, 26);
		contentPane.add(txt_Usuario);
		txt_Usuario.setColumns(10);
		
		JButton button_ingresar = new JButton("");
		ImageIcon imagen1 =new ImageIcon(this.getClass().getResource("Images/btn_IngresarADM.png"));
		button_ingresar.setIcon(imagen1);
		
		button_ingresar.setBounds(144, 212, 178, 38);
		contentPane.add(button_ingresar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("Images/LogoPrincipal_TCBAPP.png")));
		label.setBounds(10, 11, 120, 81);
		contentPane.add(label);
				
		JLabel lbl_Titulo = new JLabel("TU CARRERA EN BOYACÁ APP");
		lbl_Titulo.setForeground(new Color(25, 25, 112));
		lbl_Titulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_Titulo.setBounds(139, 22, 298, 26);
		contentPane.add(lbl_Titulo);
		
		JLabel lbl_SubTitulo = new JLabel("Modulo Administrador");
		lbl_SubTitulo.setForeground(new Color(25, 25, 112));
		lbl_SubTitulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_SubTitulo.setBounds(185, 66, 215, 26);
		contentPane.add(lbl_SubTitulo);
		
		eventsAdmin = new EventsAdmin();
		eventsAdmin.setLogin(this);
		
		button_ingresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				iniciar = true;
				eventsAdmin.actionPerformed(e);
			}
		});
		
	}	
	
	//Methods ---------------------------------------------
	/**
	 * @return the eventsAdmin
	 */
	public EventsAdmin getEventsAdmin() {
		return eventsAdmin;
	}

	/**
	 * @return the txt_Contrasena
	 */
	public JPasswordField getTxt_Contrasena() {
		return txt_Contrasena;
	}

	/**
	 * @param txt_Contrasena the txt_Contrasena to set
	 */
	public void setTxt_Contrasena(JPasswordField txt_Contrasena) {
		this.txt_Contrasena = txt_Contrasena;
	}

	/**
	 * @return the txt_Usuario
	 */
	public JTextField getTxt_Usuario() {
		return txt_Usuario;
	}

	/**
	 * @param txt_Usuario the txt_Usuario to set
	 */
	public void setTxt_Usuario(JTextField txt_Usuario) {
		this.txt_Usuario = txt_Usuario;
	}
	
	/**
	 * @return the iniciar
	 */
	public boolean isIniciar() {
		return iniciar;
	}

}
