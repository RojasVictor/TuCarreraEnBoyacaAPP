/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;

/**
 * @author JUDIT
 *
 */
public class CATestTCBAPP extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CATestTCBAPP frame = new CATestTCBAPP();
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
	public CATestTCBAPP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTuCarreraEn = new JLabel("TU CARRERA EN BOYAC� APP");
		lblTuCarreraEn.setFont(new Font("Berlin Sans FB", Font.BOLD, 16));
		lblTuCarreraEn.setForeground(new Color(0, 0, 128));
		lblTuCarreraEn.setBounds(154, 31, 244, 40);
		contentPane.add(lblTuCarreraEn);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CATestTCBAPP.class.getResource("/imagenes/Logo_TCBAPP2.png")));
		label.setBounds(10, 11, 107, 91);
		contentPane.add(label);
		
		JLabel lblUsuario = new JLabel("USUARIO :");
		lblUsuario.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblUsuario.setBounds(111, 116, 86, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASE�A :");
		lblContrasea.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblContrasea.setBounds(111, 159, 100, 14);
		contentPane.add(lblContrasea);
		
		textField = new JTextField();
		textField.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		textField.setBounds(236, 113, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		textField_1.setBounds(236, 156, 128, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBackground(SystemColor.inactiveCaption);
		btnIngresar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnIngresar.setBounds(111, 197, 253, 40);
		contentPane.add(btnIngresar);
	}
}
