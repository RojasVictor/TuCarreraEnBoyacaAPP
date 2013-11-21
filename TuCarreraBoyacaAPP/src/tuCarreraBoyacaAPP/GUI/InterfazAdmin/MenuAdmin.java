
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author JUDIT
 *
 */
public class MenuAdmin extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdmin frame = new MenuAdmin();
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
	public MenuAdmin() {
		setTitle("Men\u00FA Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(MenuAdmin.class.getResource("images/Logo_TCBAPP2.png")));
		label.setBounds(10, 11, 107, 91);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("TU CARRERA EN BOYAC\u00C1 APP");
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		label_1.setBounds(139, 31, 282, 40);
		contentPane.add(label_1);
		
		JLabel lblModuloAdministrador = new JLabel("Men\u00FA Administrador");
		lblModuloAdministrador.setForeground(new Color(0, 0, 128));
		lblModuloAdministrador.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lblModuloAdministrador.setBounds(181, 53, 204, 40);
		contentPane.add(lblModuloAdministrador);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFont(new Font("Berlin Sans FB", Font.PLAIN, 10));
		btnNewButton.setIcon(new ImageIcon(this.getClass().getResource("images/btnPreguntas.PNG")));
		btnNewButton.setBackground(new Color(0, 102, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(30, 226, 303, 40);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setFont(new Font("Berlin Sans FB", Font.PLAIN, 10));
		button.setIcon(new ImageIcon(this.getClass().getResource("images/btnIES.PNG")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ModuloIntitucionesEducacionSuperior.main(null);
				
			}
		});
		button.setBounds(30, 124, 303, 40);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 10));
		button_1.setIcon(new ImageIcon(this.getClass().getResource("images/btnProgramas.PNG")));
		button_1.setBackground(new Color(0, 102, 153));
		button_1.setBounds(30, 175, 303, 40);
		contentPane.add(button_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(this.getClass().getResource("images/reportes.png")));
		label_2.setBounds(357, 100, 64, 64);
		contentPane.add(label_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(this.getClass().getResource("images/btnCambiarContrasena.PNG")));
		lblNewLabel.setBounds(357, 168, 64, 64);
		contentPane.add(lblNewLabel);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(this.getClass().getResource("images/btnExit.PNG")));
		button_2.setBounds(343, 233, 90, 33);
		contentPane.add(button_2);
	}

}
