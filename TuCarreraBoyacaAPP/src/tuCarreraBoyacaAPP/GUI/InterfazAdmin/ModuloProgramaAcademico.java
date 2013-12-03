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
import javax.swing.JComboBox;
import javax.swing.JCheckBox;


/**
 * @author JUDIT
 * @author Victor_Rojas
 *
 */
public class ModuloProgramaAcademico extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Nombre_PA;
	private JTextField txt_Id_ProgramasAcademicos;
	private JTextField txt_Costo_PA;
	private GestionProgramasAcademico gestionProgramas;
	private GestionInstitucionesEducacionSuperior gestionInstituciones;
	private ArrayList<InstitucionEducacionSuperior> listadoInstituciones;
	private ArrayList<ProgramaAcademico> listadoProgramas;
	private ArrayList<String[]> listadoAreas;
	private JComboBox comboBox_Instituciones;
	private JComboBox comboBox_AreaPrograma;
	private JCheckBox chckboxRelacion; 

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
		listadoInstituciones = gestionInstituciones.readInstitucionesEducacionSuperior();
		listadoProgramas = gestionProgramas.readProgramasAcademico();
		listadoAreas = gestionProgramas.readAreas();
		listadoInstituciones = gestionInstituciones.readInstitucionesEducacionSuperior();
				
		setTitle("MODULO PROGRAMAS ACADEMICOS");
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Images/modulo_programas.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 485);
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
		lbl_IdProgramasAcadmicos.setBounds(10, 125, 215, 26);
		contentPane.add(lbl_IdProgramasAcadmicos);
		
		JLabel lbl_NombreProgramasAcadmicos = new JLabel("Nombre Programas Académicos");
		lbl_NombreProgramasAcadmicos.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_NombreProgramasAcadmicos.setBounds(10, 163, 237, 25);
		contentPane.add(lbl_NombreProgramasAcadmicos);
		
		JLabel lbl_IES = new JLabel("Inst. de Educación Superior");
		lbl_IES.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_IES.setBounds(10, 236, 237, 22);
		contentPane.add(lbl_IES);
		
		JButton btn_Regresar = new JButton("");
		btn_Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Regresar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Regresar.png")));
		btn_Regresar.setBounds(40, 375, 110, 45);
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
		btn_Agregar.setBounds(194, 367, 73, 66);
		contentPane.add(btn_Agregar);
		
		
		JButton btn_Guardar = new JButton("");
		btn_Guardar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Guardar.png")));
		btn_Guardar.setBounds(296, 367, 64, 66);
		contentPane.add(btn_Guardar);
		
		JButton btn_Buscar = new JButton("");
		btn_Buscar.setIcon(new ImageIcon(ModuloProgramaAcademico.class.getResource("/tuCarreraBoyacaAPP/GUI/InterfazAdmin/Images/btn_Busca.png")));
		btn_Buscar.setBounds(385, 367, 73, 66);
		contentPane.add(btn_Buscar);
		
		JButton btn_Eliminar = new JButton("");
		btn_Eliminar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Eliminar.png")));
		btn_Eliminar.setBounds(480, 367, 64, 66);
		contentPane.add(btn_Eliminar);
		
		txt_Nombre_PA = new JTextField();
		txt_Nombre_PA.setColumns(10);
		txt_Nombre_PA.setBounds(272, 162, 272, 26);
		contentPane.add(txt_Nombre_PA);
		
		txt_Id_ProgramasAcademicos = new JTextField();
		txt_Id_ProgramasAcademicos.setColumns(10);
		txt_Id_ProgramasAcademicos.setBounds(271, 127, 273, 26);
		contentPane.add(txt_Id_ProgramasAcademicos);
		
		JLabel lbl_CategoriaPA = new JLabel("Categoria Programas Académicos");
		lbl_CategoriaPA.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_CategoriaPA.setBounds(10, 199, 248, 25);
		contentPane.add(lbl_CategoriaPA);
		
		JLabel lbl_Costo_ProgramaAcadmico = new JLabel("Costo Programa Académico");
		lbl_Costo_ProgramaAcadmico.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_Costo_ProgramaAcadmico.setBounds(10, 278, 237, 22);
		contentPane.add(lbl_Costo_ProgramaAcadmico);
		
		txt_Costo_PA = new JTextField();
		txt_Costo_PA.setColumns(10);
		txt_Costo_PA.setBounds(272, 278, 272, 26);
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
		
		comboBox_AreaPrograma = new JComboBox();
		comboBox_AreaPrograma.setBounds(272, 199, 272, 28);
		String [] dato;
		comboBox_AreaPrograma.addItem("SELECCIONAR");
		for (int i=0;i<listadoAreas.size();i++){
			dato = listadoAreas.get(i);
			comboBox_AreaPrograma.addItem(""+dato[1]);			
		}		
		contentPane.add(comboBox_AreaPrograma);
		
		comboBox_Instituciones = new JComboBox();
		comboBox_Instituciones.setBounds(272, 235, 274, 28);
		comboBox_Instituciones.addItem("SELECCIONAR");
		for(int i=0;i<listadoInstituciones.size();i++){
			comboBox_Instituciones.addItem(listadoInstituciones.get(i).getNombre());			
		}		
		contentPane.add(comboBox_Instituciones);
		
		chckboxRelacion = new JCheckBox("Estoy agregando una relacion nueva entre un Programa y una Institucion");
		chckboxRelacion.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		chckboxRelacion.setBounds(10, 320, 534, 26);
		contentPane.add(chckboxRelacion);
		
		btn_Agregar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int identificador = 0;
				String nombre = "";
				String costo = "";
				int idArea = 0;
				int idInstitucion = 0;
				String auxIns = "";
				String auxArea = "";	
				try{	
				identificador = Integer.parseInt(txt_Id_ProgramasAcademicos.getText());
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
				}
				if (txt_Nombre_PA.getText().equals("") || txt_Costo_PA.getText().equals("")
						|| comboBox_AreaPrograma.getSelectedItem().toString().equals("SELECCIONAR") 
								|| comboBox_Instituciones.getSelectedItem().toString().equals("SELECCIONAR")){					
					JOptionPane.showMessageDialog(null, "Todos los son campos obligatorios");
				}else{					
					nombre = txt_Nombre_PA.getText();
					costo = txt_Costo_PA.getText();
					auxIns = comboBox_Instituciones.getSelectedItem().toString();
					auxArea = comboBox_AreaPrograma.getSelectedItem().toString();
					for (int z=0;z<listadoAreas.size();z++){
						String [] aux = listadoAreas.get(z);
						if(aux[1].equals(auxArea)){
							idArea = Integer.parseInt(aux[0]);
						}
					}
					for (int t=0;t<listadoInstituciones.size();t++){
						String aux = listadoInstituciones.get(t).getNombre();
						if(aux.equals(auxIns)){
							idInstitucion = listadoInstituciones.get(t).getId();
						}
					}					
				}	
				ProgramaAcademico programa = new ProgramaAcademico(identificador, idArea, nombre, costo, idInstitucion);
				if(chckboxRelacion.isSelected()== false){					
					if(gestionProgramas.crearProgramaAcademico(programa) == -1){
						JOptionPane.showMessageDialog(null, "No se creo el registro");						
					}
					else{
						JOptionPane.showMessageDialog(null, "Se creo de forma exitosa");
					}
				}else{
					if(gestionProgramas.crearRelacion(programa) == -1){
						JOptionPane.showMessageDialog(null, "No se creo la relacion entre Programa e Institucion");						
					}
					else{
						JOptionPane.showMessageDialog(null, "Se creo la relacion entre Programa e Institucion exitosamente");
					}
				}
					txt_Id_ProgramasAcademicos.setText("");
					txt_Nombre_PA.setText("");
					txt_Costo_PA.setText("");
					comboBox_AreaPrograma.setSelectedItem(comboBox_AreaPrograma.getItemAt(0));
					comboBox_Instituciones.setSelectedItem(comboBox_Instituciones.getItemAt(0));
				
			}	
		});
		
		btn_Eliminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int identificador = 0;
				try{	
					identificador = Integer.parseInt(txt_Id_ProgramasAcademicos.getText());
					boolean respuesta = gestionProgramas.removeProgramasAcademicos(identificador);
					if(respuesta){
						JOptionPane.showMessageDialog(null, "Se elimino satisfactoriamente");
					}else{
						JOptionPane.showMessageDialog(null, "No se elimino o no existe el elemento");
					}
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
					}					
				txt_Id_ProgramasAcademicos.setText("");
				txt_Nombre_PA.setText("");
				txt_Costo_PA.setText("");
				comboBox_AreaPrograma.setSelectedItem(comboBox_AreaPrograma.getItemAt(0));
				comboBox_Instituciones.setSelectedItem(comboBox_Instituciones.getItemAt(0));
				
			}
		});
		
		btn_Buscar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int identificador = 0;
				try{	
					identificador = Integer.parseInt(txt_Id_ProgramasAcademicos.getText());
					if(identificador!=0){
						ProgramaAcademico programa = gestionProgramas.searchProgramaAcademico(identificador);
						txt_Nombre_PA.setText(programa.getNombre());
						txt_Costo_PA.setText(programa.getCosto());
						int area = programa.getIdArea();
						int ins = programa.getIdInstitucion();
						for (int z=0;z<listadoAreas.size();z++){
							String [] aux = listadoAreas.get(z);
							int aux1 = Integer.parseInt(aux[0]);
							if(aux1 == area){
								comboBox_AreaPrograma.setSelectedItem(comboBox_AreaPrograma.getItemAt(z+1));
							}
						}
						for (int t=0;t<listadoInstituciones.size();t++){
							int insti = listadoInstituciones.get(t).getId();
							if(insti == ins){
								comboBox_Instituciones.setSelectedItem(comboBox_Instituciones.getItemAt(t+1));
							}
						}
						}
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
					}
					catch(NullPointerException e){
						JOptionPane.showMessageDialog(null, "No se encuentra elemento de acuerdo al parametro de busqueda");
					}
				
			}
		});
		
		btn_Guardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int identificador = 0;
				String nombre = "";
				String costo= "";
				int idArea = 0;
				int idInstitucion = 0;
				String auxIns = "";
				String auxArea = "";				
				try{	
				identificador = Integer.parseInt(txt_Id_ProgramasAcademicos.getText());
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
				}
				if (txt_Nombre_PA.getText().equals("") || txt_Costo_PA.getText().equals("")
						|| comboBox_AreaPrograma.getSelectedItem().toString().equals("SELECCIONAR") 
								|| comboBox_Instituciones.getSelectedItem().toString().equals("SELECCIONAR")){					
					JOptionPane.showMessageDialog(null, "Todos los son campos obligatorios");
				}else{					
					nombre = txt_Nombre_PA.getText();
					costo = txt_Costo_PA.getText();
					auxIns = comboBox_Instituciones.getSelectedItem().toString();
					auxArea = comboBox_AreaPrograma.getSelectedItem().toString();
					for (int z=0;z<listadoAreas.size();z++){
						String [] aux = listadoAreas.get(z);
						if(aux[1].equals(auxArea)){
							idArea = Integer.parseInt(aux[0]);
						}
					}
					for (int t=0;t<listadoInstituciones.size();t++){
						String aux = listadoInstituciones.get(t).getNombre();
						if(aux.equals(auxIns)){
							idInstitucion = listadoInstituciones.get(t).getId();
						}
					}					
				}				
				if(gestionProgramas.updateProgramasAcademicos(identificador, idArea, nombre, costo, idInstitucion)){
					JOptionPane.showMessageDialog(null, "Se actualizo de forma exitosa");
				}
				else{
					JOptionPane.showMessageDialog(null, "No se actualizo el registro");
				}
				txt_Id_ProgramasAcademicos.setText("");
				txt_Nombre_PA.setText("");
				txt_Costo_PA.setText("");
				comboBox_AreaPrograma.setSelectedItem(comboBox_AreaPrograma.getItemAt(0));
				comboBox_Instituciones.setSelectedItem(comboBox_Instituciones.getItemAt(0));
			}
		});
		
	}
}


