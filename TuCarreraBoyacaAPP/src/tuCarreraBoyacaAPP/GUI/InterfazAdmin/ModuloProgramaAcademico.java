/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.ScrollPane;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.ImageIcon;

import tuCarreraBoyacaAPP.logica.GestionInstitucionesEducacionSuperior;
import tuCarreraBoyacaAPP.logica.GestionProgramasAcademico;
import tuCarreraBoyacaAPP.logica.InstitucionEducacionSuperior;
import tuCarreraBoyacaAPP.logica.ProgramaAcademico;

import javax.swing.JList;


/**
 * @author JUDIT
 * @author Victor Rojas
 *
 */
public class ModuloProgramaAcademico extends JFrame {

	private JPanel contentPane;
	private JTextField txt_CategoriaPA;
	private JTextField txt_Nombre_PA;
	private JTextField txt_Id_ProgramasAcademicos;
	private JTextField txt_Costo_PA;
	private GestionProgramasAcademico gestionProgramas;
	private GestionInstitucionesEducacionSuperior gestionInstituciones;

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
		gestionInstituciones = new GestionInstitucionesEducacionSuperior();
		gestionProgramas = new GestionProgramasAcademico();
		ArrayList<InstitucionEducacionSuperior> listadoInstituciones;
		setTitle("MODULO PROGRAMAS ACADEMICOS");
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Images/modulo_programas.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("Images/LogoPrincipal_TCBAPP.png")));
		label.setBounds(10, 11, 120, 88);
		contentPane.add(label);
		
		JLabel lbl_IdProgramasAcadmicos = new JLabel("ID Programas Académicos");
		lbl_IdProgramasAcadmicos.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_IdProgramasAcadmicos.setBounds(10, 141, 215, 26);
		contentPane.add(lbl_IdProgramasAcadmicos);
		
		JLabel lbl_NombreProgramasAcadmicos = new JLabel("Nombre Programas Académicos");
		lbl_NombreProgramasAcadmicos.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_NombreProgramasAcadmicos.setBounds(10, 185, 237, 25);
		contentPane.add(lbl_NombreProgramasAcadmicos);
		
		JLabel lbl_IES = new JLabel("Inst. de Educación Superior");
		lbl_IES.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_IES.setBounds(10, 312, 237, 22);
		contentPane.add(lbl_IES);
		
		JButton btn_Regresar = new JButton("");
		btn_Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Regresar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Regresar.png")));
		btn_Regresar.setBounds(40, 395, 110, 45);
		contentPane.add(btn_Regresar);
		btn_Regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				MenuAdmin.main(null);
				
			}
		});
		
		JButton btn_Agregar = new JButton("");
		btn_Agregar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Agrega.png")));
		btn_Agregar.setBounds(194, 395, 73, 66);
		contentPane.add(btn_Agregar);
		btn_Agregar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int identificador = 0;
				String nombre = "";
				String categoria = "";
				//institucion
				int costo = 0;
				try{	
				identificador = Integer.parseInt(txt_Id_ProgramasAcademicos.getText());
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
				}

				nombre = txt_Nombre_PA.getText();
				categoria = txt_CategoriaPA.getText();
				ProgramaAcademico programa = new ProgramaAcademico(identificador, nombre, categoria, null, costo) ;
				gestionProgramas.crearProgramaAcademico(programa);
				
				txt_Id_ProgramasAcademicos.setText("");
				txt_Nombre_PA.setText("");
				txt_CategoriaPA.setText("");
				txt_Costo_PA.setText("");
			
			}	
		});
		
		JButton btn_Guardar = new JButton("");
		btn_Guardar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Guardar.png")));
		btn_Guardar.setBounds(296, 395, 64, 66);
		contentPane.add(btn_Guardar);
		
		JButton btn_Actualizar = new JButton("");
		btn_Actualizar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Actualiza.png")));
		btn_Actualizar.setBounds(385, 395, 73, 66);
		contentPane.add(btn_Actualizar);
		
		JButton btn_Eliminar = new JButton("");
		btn_Eliminar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Eliminar.png")));
		btn_Eliminar.setBounds(480, 395, 64, 66);
		contentPane.add(btn_Eliminar);
		
		txt_CategoriaPA = new JTextField();
		txt_CategoriaPA.setColumns(10);
		txt_CategoriaPA.setBounds(272, 227, 272, 26);
		contentPane.add(txt_CategoriaPA);
		
		txt_Nombre_PA = new JTextField();
		txt_Nombre_PA.setColumns(10);
		txt_Nombre_PA.setBounds(272, 184, 272, 26);
		contentPane.add(txt_Nombre_PA);
		
		txt_Id_ProgramasAcademicos = new JTextField();
		txt_Id_ProgramasAcademicos.setColumns(10);
		txt_Id_ProgramasAcademicos.setBounds(271, 143, 273, 26);
		contentPane.add(txt_Id_ProgramasAcademicos);
		
		JLabel lbl_CategoriaPA = new JLabel("Categoria Programas Académicos");
		lbl_CategoriaPA.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_CategoriaPA.setBounds(10, 226, 248, 25);
		contentPane.add(lbl_CategoriaPA);
		
		JLabel lbl_Costo_ProgramaAcadmico = new JLabel("Costo Programa Académico");
		lbl_Costo_ProgramaAcadmico.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_Costo_ProgramaAcadmico.setBounds(10, 269, 237, 22);
		contentPane.add(lbl_Costo_ProgramaAcadmico);
		
		txt_Costo_PA = new JTextField();
		txt_Costo_PA.setColumns(10);
		txt_Costo_PA.setBounds(272, 269, 272, 26);
		contentPane.add(txt_Costo_PA);
		
		JLabel lbl_Titulo = new JLabel("TU CARRERA EN BOYACÁ APP");
		lbl_Titulo.setForeground(new Color(25, 25, 112));
		lbl_Titulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_Titulo.setBounds(194, 29, 298, 26);
		contentPane.add(lbl_Titulo);
		
		JLabel lbl_SubTitulo = new JLabel("Modulo Programas Académicos");
		lbl_SubTitulo.setForeground(new Color(25, 25, 112));
		lbl_SubTitulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_SubTitulo.setBounds(194, 73, 298, 26);
		contentPane.add(lbl_SubTitulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(272, 316, 272, 58);
		contentPane.add(scrollPane);
		listadoInstituciones = gestionInstituciones.readInstitucionesEducacionSuperior();
		String[] nombreInst = new String[listadoInstituciones.size()];
		for(int i=0;i<listadoInstituciones.size();i++){
			nombreInst[i] = listadoInstituciones.get(i).getNombre();			
		}
		JList list = new JList(nombreInst);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);	
		
		scrollPane.setViewportView(list);
		
	}
}


