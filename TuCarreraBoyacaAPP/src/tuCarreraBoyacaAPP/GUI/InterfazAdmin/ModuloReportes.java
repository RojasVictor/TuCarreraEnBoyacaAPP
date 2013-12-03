/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import tuCarreraBoyacaAPP.logica.GestionInstitucionesEducacionSuperior;
import tuCarreraBoyacaAPP.logica.GestionPreguntaTest;
import tuCarreraBoyacaAPP.logica.GestionProgramasAcademico;
import tuCarreraBoyacaAPP.logica.InstitucionEducacionSuperior;
import tuCarreraBoyacaAPP.logica.ProgramaAcademico;

/**
 * @author Victor_Rojas
 *
 */
public class ModuloReportes extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JComboBox cmbBox_Modulos;
	private final String dato0 = "SELECCIONAR";
	private final String dato1 = "Listar Programas Academicos";
	private final String dato2 = "Listar Instituciones de Educacion Superior";
	private final String dato3 = "Listar Preguntas";
	private DefaultTableModel datos;
	private GestionInstitucionesEducacionSuperior gesInstituciones;
	private GestionProgramasAcademico gesProgramas;
	private GestionPreguntaTest gesPreguntas;

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
		
		gesInstituciones = new GestionInstitucionesEducacionSuperior();
		//gesPreguntas = new GestionPreguntaTest();
		gesProgramas = new GestionProgramasAcademico();
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Images/modulo_reportes.png")));
		setTitle("MODULO REPORTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("Images/LogoPrincipal_TCBAPP.png")));
		label.setBounds(7, 11, 121, 95);
		contentPane.add(label);

		JLabel lbl_Titulo = new JLabel("TU CARRERA EN BOYACÁ APP");
		lbl_Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Titulo.setForeground(new Color(0, 0, 128));
		lbl_Titulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_Titulo.setBounds(138, 23, 321, 40);
		contentPane.add(lbl_Titulo);
		
		JLabel lbl_SubTitulo = new JLabel("Modulo de Reportes");
		lbl_SubTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_SubTitulo.setForeground(new Color(0, 0, 128));
		lbl_SubTitulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_SubTitulo.setBounds(160, 66, 247, 40);
		contentPane.add(lbl_SubTitulo);
		
		JButton btnRegresar = new JButton("");
		btnRegresar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Regresar.png")));
		btnRegresar.setBounds(51, 361, 114, 40);
		btnRegresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				MenuAdmin.main(null);				
			}
		});
		contentPane.add(btnRegresar);
		
		JButton buttonGenerar = new JButton("");
		buttonGenerar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Generar.png")));
		buttonGenerar.setBounds(329, 369, 114, 32);
		contentPane.add(buttonGenerar);
		
		cmbBox_Modulos = new JComboBox();
		
		cmbBox_Modulos.setModel(new DefaultComboBoxModel());
		cmbBox_Modulos.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		cmbBox_Modulos.setToolTipText("");
		cmbBox_Modulos.setBounds(51, 124, 392, 32);
		cmbBox_Modulos.addItem(dato0);
		cmbBox_Modulos.addItem(dato1);
		cmbBox_Modulos.addItem(dato2);
		cmbBox_Modulos.addItem(dato3);
		contentPane.add(cmbBox_Modulos);
		
		datos = new DefaultTableModel();
		table = new JTable(datos);		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));;
		table.setPreferredScrollableViewportSize(Toolkit.getDefaultToolkit().getScreenSize());
		table.setEnabled(false);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(51, 167, 392, 183);
		scrollPane.setViewportView(table);
		
		contentPane.add(scrollPane);
		
		buttonGenerar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String seleccion = cmbBox_Modulos.getSelectedItem().toString();	
				if(seleccion.equals(dato1)){
					datos.setColumnCount(0);
					datos.setNumRows(0);
					ArrayList<ProgramaAcademico> programas = gesProgramas.readProgramasAcademico();
					datos.addColumn("ID PROGRAMA");
					datos.addColumn("ID AREA");
					datos.addColumn("NOMBRE PROGRAMA");
					datos.addColumn("COSTO PROGRAMA");
					datos.addColumn("ID INSTITUCION");
					for (int j=0;j<programas.size();j++){
						Vector<String> lista = new Vector<String>();
						lista.add(Integer.toString(programas.get(j).getId()));
						lista.add(Integer.toString(programas.get(j).getIdArea()));
						lista.add(programas.get(j).getNombre());
						lista.add(programas.get(j).getCosto());
						lista.add(Integer.toString(programas.get(j).getIdInstitucion()));
						datos.addRow(lista);
					}
				}else if(seleccion.equals(dato2)){
					datos.setColumnCount(0);
					datos.setNumRows(0);
					ArrayList<InstitucionEducacionSuperior> instituciones = gesInstituciones.readInstitucionesEducacionSuperior();
					datos.addColumn("ID INSTITUCION");
					datos.addColumn("NOMBRE INSTITUCION");
					datos.addColumn("URL INSTITUCION");
					for (int j=0; j<instituciones.size();j++){
						Vector<String> lista = new Vector<String>();
						lista.add(Integer.toString(instituciones.get(j).getId()));
						lista.add(instituciones.get(j).getNombre());
						lista.add(instituciones.get(j).getDireccionURL());
						datos.addRow(lista);
					}
					
				}else if(seleccion.equals(dato3)){
					
				}else{
					
				}
				
			}
		});
		
	}
}

