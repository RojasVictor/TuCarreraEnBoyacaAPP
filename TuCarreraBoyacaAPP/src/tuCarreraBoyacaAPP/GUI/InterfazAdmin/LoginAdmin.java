package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginAdmin extends JFrame {

	private JPanel contentPane;
	private JPasswordField txt_Contrasena;
	private JTextField txt_Usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAdmin frame = new LoginAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginAdmin() {
		setTitle("INGRESO MODULO ADMINISTRADOR");
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("images/ingreso.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 299);
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
		button_ingresar.setIcon(new ImageIcon(this.getClass().getResource("images/btn_IngresarADM.png")));
		button_ingresar.setBounds(144, 212, 178, 38);
		contentPane.add(button_ingresar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("images/LogoPrincipal_TCBAPP.png")));
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
		
		button_ingresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MenuAdmin.main(null);
			}
		});
	}
}
