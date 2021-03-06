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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
import javax.swing.Box;
import javax.swing.JSeparator;


/**
 * @author JUDIT
 * @author Victor_Rojas
 *
 */
public class ModuloProgramaAcademico extends JFrame {

	//ATTRIBUTES ------------------------------
	
	private JPanel contentPane;
	private JTextField txt_Nombre_PA;
	private JTextField txt_Id_ProgramasAcademicos;
	private GestionProgramasAcademico gestionProgramas;
	private GestionInstitucionesEducacionSuperior gestionInstituciones;
	private ArrayList<InstitucionEducacionSuperior> listadoInstituciones;
	private ArrayList<ProgramaAcademico> listadoProgramas;	
	private JComboBox comboBoxOpcionPrincipal;
	private JComboBox comboBoxListInstituciones;
	private JComboBox comboBoxListadoProgramas;
	private JTextField textFieldCostoRelacion;
	private final String OPCION1 = "SELECCIONAR";
	private final String OPCION2 = "AGREGAR NUEVO PROGRAMA ACADEMICO";
	private final String OPCION3 = "AGREGAR RELACIONES";	

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

	//BUILDING
	
	/**
	 * Create the frame.
	 */
	public ModuloProgramaAcademico() {
		gestionInstituciones = new GestionInstitucionesEducacionSuperior();
		gestionProgramas = new GestionProgramasAcademico();
		listadoInstituciones = gestionInstituciones.readInstitucionesEducacionSuperior();
		listadoProgramas = gestionProgramas.readProgramasAcademicos();
		listadoInstituciones = gestionInstituciones.readInstitucionesEducacionSuperior();
				
		setTitle("MODULO PROGRAMAS ACADEMICOS");
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Images/modulo_programas.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 500);
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
		
		JLabel lbl_IdProgramasAcadmicos = new JLabel("ID Programas Acad�micos");
		lbl_IdProgramasAcadmicos.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_IdProgramasAcadmicos.setBounds(19, 168, 215, 26);
		contentPane.add(lbl_IdProgramasAcadmicos);
		
		JLabel lbl_NombreProgramasAcadmicos = new JLabel("Nombre Programas Acad�micos");
		lbl_NombreProgramasAcadmicos.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_NombreProgramasAcadmicos.setBounds(19, 206, 237, 25);
		contentPane.add(lbl_NombreProgramasAcadmicos);
		
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
		btn_Agregar.setBounds(192, 385, 73, 66);
		contentPane.add(btn_Agregar);
				
		JButton btn_Guardar = new JButton("");
		btn_Guardar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Guardar.png")));
		btn_Guardar.setBounds(294, 385, 64, 66);
		contentPane.add(btn_Guardar);
		
		JButton btn_Buscar = new JButton("");
		btn_Buscar.setIcon(new ImageIcon(ModuloProgramaAcademico.class.getResource("/tuCarreraBoyacaAPP/GUI/InterfazAdmin/Images/btn_Busca.png")));
		btn_Buscar.setBounds(383, 385, 73, 66);
		contentPane.add(btn_Buscar);
		
		JButton btn_Eliminar = new JButton("");
		btn_Eliminar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Eliminar.png")));
		btn_Eliminar.setBounds(478, 385, 64, 66);
		contentPane.add(btn_Eliminar);
		
		txt_Nombre_PA = new JTextField();
		txt_Nombre_PA.setColumns(10);
		txt_Nombre_PA.setBounds(270, 203, 272, 26);
		txt_Nombre_PA.setEditable(false);
		contentPane.add(txt_Nombre_PA);
		
		txt_Id_ProgramasAcademicos = new JTextField();
		txt_Id_ProgramasAcademicos.setColumns(10);
		txt_Id_ProgramasAcademicos.setBounds(269, 168, 272, 26);
		txt_Id_ProgramasAcademicos.setEditable(false);
		contentPane.add(txt_Id_ProgramasAcademicos);
		
		JLabel lbl_Titulo = new JLabel("TU CARRERA EN BOYAC� APP");
		lbl_Titulo.setForeground(new Color(25, 25, 112));
		lbl_Titulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_Titulo.setBounds(194, 29, 298, 26);
		contentPane.add(lbl_Titulo);
		
		JLabel lbl_SubTitulo = new JLabel("Modulo Programas Acad�micos");
		lbl_SubTitulo.setForeground(new Color(25, 25, 112));
		lbl_SubTitulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_SubTitulo.setBounds(194, 73, 298, 26);
		contentPane.add(lbl_SubTitulo);
		String [] dato;
		
				
		JLabel lblOpcionPrincipal = new JLabel("Seleccione una Opci\u00F3n");
		lblOpcionPrincipal.setBounds(20, 119, 235, 25);
		lblOpcionPrincipal.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		contentPane.add(lblOpcionPrincipal);
		
		comboBoxOpcionPrincipal = new JComboBox();
		comboBoxOpcionPrincipal.setBounds(270, 120, 272, 26);
		comboBoxOpcionPrincipal.addItem(OPCION1);
		comboBoxOpcionPrincipal.addItem(OPCION2);
		comboBoxOpcionPrincipal.addItem(OPCION3);
		contentPane.add(comboBoxOpcionPrincipal);
		
		comboBoxOpcionPrincipal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxOpcionPrincipal.getSelectedItem().toString().equals(OPCION2)){
					txt_Id_ProgramasAcademicos.setEditable(true);
					txt_Nombre_PA.setEditable(true);					
					comboBoxListadoProgramas.setEnabled(false);
					comboBoxListInstituciones.setEnabled(false);
					textFieldCostoRelacion.setEditable(false);
				}else{
					if(comboBoxOpcionPrincipal.getSelectedItem().toString().equals(OPCION3)){
						textFieldCostoRelacion.setEditable(true);
						comboBoxListadoProgramas.setEnabled(true);
						comboBoxListInstituciones.setEnabled(true);
						txt_Id_ProgramasAcademicos.setEditable(false);
						txt_Nombre_PA.setEditable(false);	
						agregarListadoProgramas();
				}else{
						txt_Id_ProgramasAcademicos.setEditable(false);
						txt_Nombre_PA.setEditable(false);						
						comboBoxListadoProgramas.setEnabled(false);
						comboBoxListInstituciones.setEnabled(false);
						textFieldCostoRelacion.setEditable(false);
					}
				}
				
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 155, 547, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 242, 547, 2);
		contentPane.add(separator_1);
		
		JLabel lblListadoInstituciones = new JLabel("Listado Instituciones");
		lblListadoInstituciones.setBounds(20, 255, 236, 26);
		lblListadoInstituciones.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		contentPane.add(lblListadoInstituciones);
		
		comboBoxListInstituciones = new JComboBox();
		comboBoxListInstituciones.setBounds(270, 255, 272, 26);
		comboBoxListInstituciones.setEnabled(false);
		comboBoxListInstituciones.addItem(OPCION1);
		for(int i=0;i<listadoInstituciones.size();i++){
			comboBoxListInstituciones.addItem(listadoInstituciones.get(i).getNombre());			
		}
		contentPane.add(comboBoxListInstituciones);
		
		JLabel lblListadoProgramas = new JLabel("Listado Programas");
		lblListadoProgramas.setBounds(21, 292, 235, 26);
		lblListadoProgramas.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		contentPane.add(lblListadoProgramas);
		
		comboBoxListadoProgramas = new JComboBox();
		comboBoxListadoProgramas.setBounds(270, 292, 272, 26);
		comboBoxListadoProgramas.setEnabled(false);
		comboBoxListadoProgramas.addItem(OPCION1);
		agregarListadoProgramas();				
		contentPane.add(comboBoxListadoProgramas);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 372, 547, 2);
		contentPane.add(separator_2);
		
		JLabel label_CostoRelacion = new JLabel("Costo Programa Acad\u00E9mico");
		label_CostoRelacion.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		label_CostoRelacion.setBounds(19, 329, 237, 22);
		contentPane.add(label_CostoRelacion);
		
		textFieldCostoRelacion = new JTextField();
		textFieldCostoRelacion.setEditable(false);
		textFieldCostoRelacion.setBounds(268, 329, 274, 26);
		contentPane.add(textFieldCostoRelacion);
		soloNumeros(textFieldCostoRelacion);
		
		btn_Agregar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(comboBoxOpcionPrincipal.getSelectedItem().toString().equals(OPCION2)){
					int identificador = 0;
					String nombre = "";										
					try{	
					identificador = Integer.parseInt(txt_Id_ProgramasAcademicos.getText());
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
					}
					if (txt_Nombre_PA.getText().equals("")){					
						JOptionPane.showMessageDialog(null, "Todos los son campos obligatorios");
					}else{					
						nombre = txt_Nombre_PA.getText();											
					}	
					
					ProgramaAcademico programa = new ProgramaAcademico(identificador, nombre);
					
					if(gestionProgramas.crearProgramaAcademico(programa) == -1){
						JOptionPane.showMessageDialog(null, "No se creo el registro");						
					}
					else{
						JOptionPane.showMessageDialog(null, "Se creo de forma exitosa");
					}
					txt_Id_ProgramasAcademicos.setText("");
					txt_Nombre_PA.setText("");					
				}
				else if(comboBoxOpcionPrincipal.getSelectedItem().toString().equals(OPCION3)){
					String eleIns = comboBoxListInstituciones.getSelectedItem().toString();
					String eleProg = comboBoxListadoProgramas.getSelectedItem().toString();
					String costo = textFieldCostoRelacion.getText();
					InstitucionEducacionSuperior componente1 = new InstitucionEducacionSuperior(0, eleIns, null);
					ProgramaAcademico componente2= new ProgramaAcademico(0, eleProg);
					for (int i=0;i<listadoInstituciones.size();i++){
						if (listadoInstituciones.get(i).getNombre().equals(eleIns)){
							componente1 = listadoInstituciones.get(i);
						}
					}
					for (int j=0; j<listadoProgramas.size();j++){
						if (listadoProgramas.get(j).getNombre().equals(eleProg)){
							componente2 = listadoProgramas.get(j);
						}
					}
					if(gestionProgramas.crearRelacion(componente2.getId(), componente1.getId(),costo) != -1){
						JOptionPane.showMessageDialog(null, "Se creo la relacion correctamente");
					}else{
						JOptionPane.showMessageDialog(null, "No se creo la relacion");	
					}
					textFieldCostoRelacion.setText("");
					comboBoxListadoProgramas.setSelectedItem(comboBoxListadoProgramas.getItemAt(0));
					comboBoxListInstituciones.setSelectedItem(comboBoxListInstituciones.getItemAt(0));					
				}
			}	
		});
		
		btn_Eliminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxOpcionPrincipal.getSelectedItem().toString().equals(OPCION2)){
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
				
				}else if(comboBoxOpcionPrincipal.getSelectedItem().toString().equals(OPCION3)){
					String eleIns = comboBoxListInstituciones.getSelectedItem().toString();
					String eleProg = comboBoxListadoProgramas.getSelectedItem().toString();					
					InstitucionEducacionSuperior componente1 = new InstitucionEducacionSuperior(0, eleIns, null);
					ProgramaAcademico componente2= new ProgramaAcademico(0, eleProg);
					for (int i=0;i<listadoInstituciones.size();i++){
						if (listadoInstituciones.get(i).getNombre().equals(eleIns)){
							componente1 = listadoInstituciones.get(i);
						}
					}
					for (int j=0; j<listadoProgramas.size();j++){
						if (listadoProgramas.get(j).getNombre().equals(eleProg)){
							componente2 = listadoProgramas.get(j);
						}
					}
					if(gestionProgramas.removeRelacion(componente2.getId(), componente1.getId())){
						JOptionPane.showMessageDialog(null, "Se elimino la relacion correctamente");
					}else{
						JOptionPane.showMessageDialog(null, "No se elimino la relacion");	
					}
					textFieldCostoRelacion.setText("");
					comboBoxListadoProgramas.setSelectedItem(comboBoxListadoProgramas.getItemAt(0));
					comboBoxListInstituciones.setSelectedItem(comboBoxListInstituciones.getItemAt(0));	
				}
							
			}
		});
		
		btn_Buscar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxOpcionPrincipal.getSelectedItem().toString().equals(OPCION2)){
					int identificador = 0;
					try{	
						identificador = Integer.parseInt(txt_Id_ProgramasAcademicos.getText());
						if(identificador!=0){
							ProgramaAcademico programa = gestionProgramas.searchProgramaAcademico(identificador);
							txt_Nombre_PA.setText(programa.getNombre());													
							}
						}catch(NumberFormatException e){
							JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
						}
						catch(NullPointerException e){
							JOptionPane.showMessageDialog(null, "No se encuentra elemento de acuerdo al parametro de busqueda");
						}
				} else{
					if(comboBoxOpcionPrincipal.getSelectedItem().toString().equals(OPCION3)){
						String eleIns = comboBoxListInstituciones.getSelectedItem().toString();
						String eleProg = comboBoxListadoProgramas.getSelectedItem().toString();
						String costo = textFieldCostoRelacion.getText();
						InstitucionEducacionSuperior componente1 = new InstitucionEducacionSuperior(0, eleIns, null);
						ProgramaAcademico componente2= new ProgramaAcademico(0, eleProg);
						for (int i=0;i<listadoInstituciones.size();i++){
							if (listadoInstituciones.get(i).getNombre().equals(eleIns)){
								componente1 = listadoInstituciones.get(i);
							}
						}
						for (int j=0; j<listadoProgramas.size();j++){
							if (listadoProgramas.get(j).getNombre().equals(eleProg)){
								componente2 = listadoProgramas.get(j);
							}
						}
						String[] dato = gestionProgramas.searchElementoRelacion(componente2.getId(), componente1.getId());
						if(dato != null){
							textFieldCostoRelacion.setText(""+dato[2]);	
						}else{
							JOptionPane.showMessageDialog(null, "No se encontro la relacion");	
						}
						
					}
				}
				
								
			}
		});
		
		btn_Guardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxOpcionPrincipal.getSelectedItem().toString().equals(OPCION2)){
					int identificador = 0;
					String nombre = "";
					int idArea = 0;
					String auxArea = "";				
					try{	
					identificador = Integer.parseInt(txt_Id_ProgramasAcademicos.getText());
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
					}
					if (txt_Nombre_PA.getText().equals("")){					
						JOptionPane.showMessageDialog(null, "Todos los son campos obligatorios");
					}else{					
						nombre = txt_Nombre_PA.getText();											
					}				
					if(gestionProgramas.updateProgramasAcademicos(identificador, nombre)){
						JOptionPane.showMessageDialog(null, "Se actualizo de forma exitosa");
					}
					else{
						JOptionPane.showMessageDialog(null, "No se actualizo el registro");
					}
					txt_Id_ProgramasAcademicos.setText("");
					txt_Nombre_PA.setText("");										
				}else{
					if(comboBoxOpcionPrincipal.getSelectedItem().toString().equals(OPCION3)){
						String eleIns = comboBoxListInstituciones.getSelectedItem().toString();
						String eleProg = comboBoxListadoProgramas.getSelectedItem().toString();
						String costo = textFieldCostoRelacion.getText();
						InstitucionEducacionSuperior componente1 = new InstitucionEducacionSuperior(0, eleIns, null);
						ProgramaAcademico componente2= new ProgramaAcademico(0, eleProg);
						for (int i=0;i<listadoInstituciones.size();i++){
							if (listadoInstituciones.get(i).getNombre().equals(eleIns)){
								componente1 = listadoInstituciones.get(i);
							}
						}
						for (int j=0; j<listadoProgramas.size();j++){
							if (listadoProgramas.get(j).getNombre().equals(eleProg)){
								componente2 = listadoProgramas.get(j);
							}
						}					
						if(gestionProgramas.updateRelacion(componente1.getId(), componente2.getId(), costo)){
							JOptionPane.showMessageDialog(null, "Se actualizo la relacion exitosamente");
						}else{
							JOptionPane.showMessageDialog(null, "No se actualizo la relacion");	
						}
					}
				}				
			}
		});		
	}
	
	/**
	 * @param comboBoxListadoProgramas2 
	 * 
	 */
	private void agregarListadoProgramas() {
		comboBoxListadoProgramas.removeAllItems();
		listadoProgramas = gestionProgramas.readProgramasAcademicos();
		for (int i=0;i<listadoProgramas.size();i++){
			ProgramaAcademico elemento = listadoProgramas.get(i);
			comboBoxListadoProgramas.addItem(elemento.getNombre());			
		}
		
	}

	public void soloNumeros(JTextField letra){
		
		letra.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				char ch= e.getKeyChar();
				if(Character.isLetter(ch)){
					getToolkit().beep();
					e.consume();

			}
			}
		});	
	}
	
}