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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;

/**
 * @author Victor_Rojas
 *
 */
public class ModuloReportes extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModuloReportes frame = new ModuloReportes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ModuloReportes() {
		setTitle("MODULO PROGRAMA ACADÉMICO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("images/Logo_TCBAPP1.png")));
		label.setBounds(10, 11, 157, 123);
		contentPane.add(label);

		JLabel label_1 = new JLabel("TU CARRERA EN BOYACÁ APP");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		label_1.setBounds(177, 23, 282, 40);
		contentPane.add(label_1);
		
		JLabel lblModuloDeReportes = new JLabel("Modulo de Reportes");
		lblModuloDeReportes.setHorizontalAlignment(SwingConstants.CENTER);
		lblModuloDeReportes.setForeground(new Color(0, 0, 128));
		lblModuloDeReportes.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lblModuloDeReportes.setBounds(175, 41, 295, 40);
		contentPane.add(lblModuloDeReportes);
		
		JRadioButton rdbtnListarInstitucionesSuperior = new JRadioButton("Listar Instituciones de Educacion Superior");
		rdbtnListarInstitucionesSuperior.setBounds(40, 145, 225, 23);
		contentPane.add(rdbtnListarInstitucionesSuperior);
		
		JRadioButton rdbtnListarProgramas = new JRadioButton("Listar Programas Academicos");
		rdbtnListarProgramas.setBounds(285, 145, 174, 23);
		contentPane.add(rdbtnListarProgramas);
		
		JRadioButton rdbtnListarPreguntas = new JRadioButton("Listar Preguntas");
		rdbtnListarPreguntas.setBounds(200, 185, 109, 23);
		contentPane.add(rdbtnListarPreguntas);
		
		JButton btnRegresar = new JButton("");
		btnRegresar.setIcon(new ImageIcon(ModuloReportes.class.getResource("/tuCarreraBoyacaAPP/GUI/InterfazAdmin/images/btnExit.PNG")));
		btnRegresar.setBounds(40, 352, 88, 33);
		btnRegresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				MenuAdmin.main(null);				
			}
		});
		contentPane.add(btnRegresar);
		
		JButton btnGenerar = new JButton("");
		btnGenerar.setIcon(new ImageIcon(ModuloReportes.class.getResource("/tuCarreraBoyacaAPP/GUI/InterfazAdmin/images/btnGenerar.png")));
		btnGenerar.setBounds(200, 362, 125, 23);
		contentPane.add(btnGenerar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(51, 223, 392, 115);
		contentPane.add(textArea);
	}
}
