/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * @author JUDIT
 *
 */
public class ModuloPreguntas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModuloPreguntas frame = new ModuloPreguntas();
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
	public ModuloPreguntas() {
		setTitle("MODULO PREGUNTAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("images/Logo_TCBAPP1.png")));
		label.setBounds(10, 11, 157, 123);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("TU CARRERA EN BOYACÁ APP");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lblNewLabel.setBounds(189, 33, 274, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblModuloPreuntas = new JLabel("Modulo Preuntas");
		lblModuloPreuntas.setForeground(new Color(0, 0, 128));
		lblModuloPreuntas.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lblModuloPreuntas.setBounds(251, 73, 151, 29);
		contentPane.add(lblModuloPreuntas);
		
		JLabel lblNewLabel_1 = new JLabel("Identificador Pregunta");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(40, 159, 157, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDescipcin = new JLabel("Descipción");
		lblDescipcin.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblDescipcin.setBounds(40, 184, 157, 14);
		contentPane.add(lblDescipcin);
		
		JLabel lblProgramaAcadmico = new JLabel("Programa Académico");
		lblProgramaAcadmico.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblProgramaAcadmico.setBounds(40, 209, 157, 14);
		contentPane.add(lblProgramaAcadmico);
		
		JLabel lblEstimacinPuntaje = new JLabel("Estimación Puntaje");
		lblEstimacinPuntaje.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblEstimacinPuntaje.setBounds(40, 234, 157, 14);
		contentPane.add(lblEstimacinPuntaje);
		
		textField = new JTextField();
		textField.setBounds(225, 157, 238, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(225, 182, 238, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(225, 207, 238, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(225, 232, 238, 20);
		contentPane.add(textField_3);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(this.getClass().getResource("images/regresar.png")));
		button.setBounds(40, 279, 87, 41);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(this.getClass().getResource("images/add.png")));
		button_1.setBounds(152, 279, 45, 41);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(this.getClass().getResource("images/reload.png")));
		button_2.setBounds(251, 279, 45, 41);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(this.getClass().getResource("images/save.png")));
		button_3.setBounds(336, 279, 45, 41);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(this.getClass().getResource("images/delete.png")));
		button_4.setBounds(418, 279, 45, 41);
		contentPane.add(button_4);
		
		
	}
}

