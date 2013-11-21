/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
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


/**
 * @author JUDIT
 *
 */
public class ModuloProgramaAcademico  extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModuloProgramaAcademico frame = new ModuloProgramaAcademico();
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
	public ModuloProgramaAcademico() {
		setTitle("MODULO PROGRAMA ACADEMICO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("images/Logo_TCBAPP1.png")));
		label.setBounds(10, 11, 157, 123);
		contentPane.add(label);

		JLabel label_1 = new JLabel("TU CARRERA EN BOYACA APP");
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		label_1.setBounds(177, 23, 282, 40);
		contentPane.add(label_1);
		
		JLabel lblModuloDePrograma = new JLabel("Modulo de  Programa Academico");
		lblModuloDePrograma.setForeground(new Color(0, 0, 128));
		lblModuloDePrograma.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lblModuloDePrograma.setBounds(175, 41, 295, 40);
		contentPane.add(lblModuloDePrograma);
		
		JLabel lblIdentificadorProgramaAcadmico = new JLabel("Identificador Programa Academico");
		lblIdentificadorProgramaAcadmico.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblIdentificadorProgramaAcadmico.setBounds(30, 131, 217, 25);
		contentPane.add(lblIdentificadorProgramaAcadmico);
		
		JLabel lblNombreProgramaAcadmico = new JLabel("Nombre Programa Academico");
		lblNombreProgramaAcadmico.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNombreProgramaAcadmico.setBounds(30, 160, 217, 25);
		contentPane.add(lblNombreProgramaAcadmico);
		
		JLabel lblCategoriaProgramaAcadmico = new JLabel("Categoria Programa Academico");
		lblCategoriaProgramaAcadmico.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCategoriaProgramaAcadmico.setBounds(30, 193, 217, 25);
		contentPane.add(lblCategoriaProgramaAcadmico);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(268, 131, 179, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(268, 160, 179, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(268, 193, 179, 20);
		contentPane.add(textField_2);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(this.getClass().getResource("images/delete.png")));
		button_1.setBounds(376, 297, 32, 33);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(this.getClass().getResource("images/save.png")));
		button_2.setBounds(305, 297, 32, 33);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(this.getClass().getResource("images/reload.png")));
		button_3.setBounds(226, 302, 32, 28);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(this.getClass().getResource("images/add.png")));
		button_4.setBounds(152, 298, 32, 32);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setIcon(new ImageIcon(this.getClass().getResource("images/btnExit.PNG")));
		button_5.setBounds(29, 297, 88, 25);
		button_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				MenuAdmin.main(null);
				
			}
		});
		contentPane.add(button_5);
		
		JLabel lblCostoProgramaAcadmico = new JLabel("Costo  Programa Academico");
		lblCostoProgramaAcadmico.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCostoProgramaAcadmico.setBounds(30, 256, 217, 25);
		contentPane.add(lblCostoProgramaAcadmico);
		
		JLabel lblInstitucionesDeEducacin = new JLabel("Instituciones de Educacion Superior");
		lblInstitucionesDeEducacin.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblInstitucionesDeEducacin.setBounds(30, 223, 217, 25);
		contentPane.add(lblInstitucionesDeEducacin);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(268, 223, 179, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(268, 256, 179, 20);
		contentPane.add(textField_4);
	
	}

}

