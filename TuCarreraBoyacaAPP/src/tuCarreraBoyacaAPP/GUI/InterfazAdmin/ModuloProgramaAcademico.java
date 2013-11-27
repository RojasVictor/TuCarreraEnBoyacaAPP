/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.ImageIcon;

import tuCarreraBoyacaAPP.logica.GestionInstitucionesEducacionSuperior;
import tuCarreraBoyacaAPP.logica.GestionProgramasAcademico;
import tuCarreraBoyacaAPP.logica.InstitucionEducacionSuperior;
import tuCarreraBoyacaAPP.logica.ProgramaAcademico;


/**
 * @author JUDIT
 *
 */
public class ModuloProgramaAcademico  extends JFrame {

	private JPanel contentPane;
	private JTextField textField_idPrograma;
	private JTextField textField_NombrePrograma;
	private JTextField textField_CategoriaPrograma;
	private JTextField textField_Institucion;
	private JTextField textField_CostoPrograma;
	private GestionProgramasAcademico gestionProgramas;
	
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
		gestionProgramas = new GestionProgramasAcademico();
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
		
		textField_idPrograma = new JTextField();
		textField_idPrograma.setColumns(10);
		textField_idPrograma.setBounds(268, 131, 179, 20);
		contentPane.add(textField_idPrograma);
		
		textField_NombrePrograma = new JTextField();
		textField_NombrePrograma.setColumns(10);
		textField_NombrePrograma.setBounds(268, 160, 179, 20);
		contentPane.add(textField_NombrePrograma);
		
		textField_CategoriaPrograma = new JTextField();
		textField_CategoriaPrograma.setColumns(10);
		textField_CategoriaPrograma.setBounds(268, 193, 179, 20);
		contentPane.add(textField_CategoriaPrograma);
		
		textField_Institucion = new JTextField();
		textField_Institucion.setColumns(10);
		textField_Institucion.setBounds(268, 223, 179, 20);
		contentPane.add(textField_Institucion);
		
		textField_CostoPrograma = new JTextField();
		textField_CostoPrograma.setColumns(10);
		textField_CostoPrograma.setBounds(268, 256, 179, 20);
		contentPane.add(textField_CostoPrograma);
		
		JButton button_Agregar = new JButton("");
		button_Agregar .setIcon(new ImageIcon(this.getClass().getResource("images/add.png")));
		button_Agregar.setBounds(153, 292, 45, 41);
		contentPane.add(button_Agregar);
		
		JButton button_Actualizar = new JButton("");
		button_Actualizar.setIcon(new ImageIcon(this.getClass().getResource("images/delete.png")));
		button_Actualizar.setBounds(402, 292, 45, 41);
		contentPane.add(button_Actualizar);
		
		JButton button_Guardar = new JButton("");
		button_Guardar.setIcon(new ImageIcon(this.getClass().getResource("images/save.png")));
		button_Guardar.setBounds(320, 292, 45, 41);
		contentPane.add(button_Guardar);
		
		JButton button_Eliminar = new JButton("");
		button_Eliminar.setIcon(new ImageIcon(this.getClass().getResource("images/reload.png")));
		button_Eliminar.setBounds(235, 292, 45, 41);
		contentPane.add(button_Eliminar);
		
		JButton button_Regresar = new JButton("");
		button_Regresar.setIcon(new ImageIcon(this.getClass().getResource("images/regresar.png")));
		button_Regresar.setBounds(24, 292, 87, 41);
		contentPane.add(button_Regresar);
		button_Regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				MenuAdmin.main(null);
				
			}
		});
		
		JLabel lblCostoProgramaAcadmico = new JLabel("Costo  Programa Academico");
		lblCostoProgramaAcadmico.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCostoProgramaAcadmico.setBounds(30, 256, 217, 25);
		contentPane.add(lblCostoProgramaAcadmico);
		
		JLabel lblInstitucionesDeEducacin = new JLabel("Instituciones de Educacion Superior");
		lblInstitucionesDeEducacin.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblInstitucionesDeEducacin.setBounds(30, 223, 217, 25);
		contentPane.add(lblInstitucionesDeEducacin);
		
		button_Agregar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int identificador = 0;
				String nombre = "";
				String categoria = "";
				//institucion
				int costo = 0;
				try{	
				identificador = Integer.parseInt(textField_idPrograma.getText());
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
				}

				nombre = textField_NombrePrograma.getText();
				categoria = textField_CategoriaPrograma.getText();
				ProgramaAcademico programa = new ProgramaAcademico(identificador, nombre, categoria, null, costo) ;
				gestionProgramas.crearProgramaAcademico(programa);
				
				textField_idPrograma.setText("");
				textField_NombrePrograma.setText("");
				textField_CategoriaPrograma.setText("");
				textField_Institucion.setText("");
				textField_CostoPrograma.setText("");
				
			}	
		});

	}

}




