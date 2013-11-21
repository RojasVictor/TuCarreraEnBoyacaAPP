
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
		setTitle("MENÚ ADMINISTRADOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("images/Logo_TCBAPP1.png")));
		label.setBounds(10, 11, 157, 123);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("TU CARRERA EN BOYACÁ APP");
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		label_1.setBounds(189, 33, 274, 29);
		contentPane.add(label_1);
		
		JLabel lblModuloAdministrador = new JLabel("Menú Administrador");
		lblModuloAdministrador.setForeground(new Color(0, 0, 128));
		lblModuloAdministrador.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lblModuloAdministrador.setBounds(225, 65, 197, 29);
		contentPane.add(lblModuloAdministrador);
		
		JButton button = new JButton("");
		button.setFont(new Font("Berlin Sans FB", Font.PLAIN, 10));
		button.setIcon(new ImageIcon(this.getClass().getResource("images/btnIES.PNG")));
		button.setBounds(35, 145, 303, 47);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ModuloInstitucionesEducacionSuperior.main(null);				
			}
		});
		
		JButton button_1 = new JButton("");
		button_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 10));
		button_1.setIcon(new ImageIcon(this.getClass().getResource("images/btnProgramas.PNG")));
		button_1.setBounds(35, 203, 303, 47);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ModuloProgramaAcademico.main(null);				
			}
		});
				
		JButton button_2 = new JButton("");
		button_2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 10));
		button_2.setIcon(new ImageIcon(this.getClass().getResource("images/btnPreguntas.PNG")));
		button_2.setBounds(35, 261, 303, 47);
		contentPane.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				ModuloPreguntas.main(null);
			}
		});
			
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(this.getClass().getResource("images/btn_Listar.png")));
		button_3.setBounds(361, 105, 77, 73);
		button_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				ModuloReportes.main(null);
			}
		});
		contentPane.add(button_3);
				
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(this.getClass().getResource("images/btnCambiarContrasena.png")));
		button_4.setBounds(361, 189, 77, 73);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setIcon(new ImageIcon(this.getClass().getResource("images/regresar.png")));
		button_5.setBounds(349, 277, 87, 41);
		contentPane.add(button_5);
		button_5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
					Login.main(null);
					
				}
			});
			contentPane.add(button_5);	
			
	}

}
