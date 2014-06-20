/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.color.CMMException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;

import tuCarreraBoyacaAPP.logica.Categoria;
import tuCarreraBoyacaAPP.logica.GestionCategorias;
import tuCarreraBoyacaAPP.logica.GestionPreguntaTest;
import tuCarreraBoyacaAPP.logica.GestionProgramasAcademico;
import tuCarreraBoyacaAPP.logica.PreguntaTest;
import tuCarreraBoyacaAPP.logica.ProgramaAcademico;

import javax.swing.SwingConstants;

/**
 * @author JUDIT
 *
 */
public class ModuloPreguntas extends JFrame {

	private final String OPCION1 = "SELECCIONAR";
	private final String OPCION2 = "AGREGAR NUEVA PREGUNTA";
	private GestionPreguntaTest gesPreguntas;
	private GestionProgramasAcademico gesProgramas;
	private GestionCategorias gesCategorias;
	private JPanel contentPane;
	private JTextField txt_Id_Pregunta;
	private JComboBox<String> comboBoxOpcionPrincipal;
	private JComboBox<String> comboBoxProgramas;
	private JComboBox<String> comboBoxCategorias;
	private JTextArea textAreaDescripcion;
	private JScrollPane scrollPane;
	private ArrayList<PreguntaTest> listadoPregunta;
	private ArrayList<String[]> elementos;
	private ArrayList<ProgramaAcademico> listadoProgramas;
	private ArrayList<Categoria> listadoCategorias;
		
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Images/modul_pregunta.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		gesPreguntas = new GestionPreguntaTest();
		gesProgramas = new GestionProgramasAcademico();	
		gesCategorias = new GestionCategorias();
		
		listadoPregunta = gesPreguntas.readPreguntaTests();
		listadoProgramas = gesProgramas.readProgramasAcademicos();	
		listadoCategorias = gesCategorias.getCategorias();
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("Images/LogoPrincipal_TCBAPP.png")));
		label.setBounds(10, 11, 120, 88);
		contentPane.add(label);
		
		JLabel lbl_Id_Pregunta = new JLabel("Identificador Pregunta");
		lbl_Id_Pregunta.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_Id_Pregunta.setBounds(22, 193, 162, 26);
		contentPane.add(lbl_Id_Pregunta);
		
		txt_Id_Pregunta = new JTextField();
		txt_Id_Pregunta.setEnabled(false);
		txt_Id_Pregunta.setColumns(10);
		txt_Id_Pregunta.setBounds(207, 195, 273, 26);
		contentPane.add(txt_Id_Pregunta);
		
		JLabel lbl_Enunciado = new JLabel("Enunciado Pregunta");
		lbl_Enunciado.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_Enunciado.setBounds(22, 318, 162, 26);
		contentPane.add(lbl_Enunciado);
		
		JButton btn_Regresar = new JButton("");
		btn_Regresar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Regresar.png")));
		btn_Regresar.setBounds(22, 384, 110, 45);
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
		btn_Agregar.setBounds(158, 376, 73, 66);
		contentPane.add(btn_Agregar);
		
		btn_Agregar.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String opcion = comboBoxOpcionPrincipal.getSelectedItem().toString();
				if (opcion.equals(OPCION1)){
					JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion en la primera casilla");
				}else if(opcion.equals(OPCION2)){
					txt_Id_Pregunta.setEnabled(true);
					comboBoxCategorias.setEnabled(true);
					comboBoxProgramas.setEnabled(true);
					textAreaDescripcion.setEnabled(true);
					
					int identificador = 0;					
					String enunciado = textAreaDescripcion.getText();					
					String categoria;
					String programa;
					
					try{	
						identificador = Integer.parseInt(txt_Id_Pregunta.getText());
					}catch(NumberFormatException e){
							JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
					}
					if (identificador == 0 || enunciado.equals("") || comboBoxCategorias.getSelectedItem().toString().equals(OPCION1) 
							|| comboBoxProgramas.getSelectedItem().toString().equals(OPCION1) ){
						JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");											
					}else{
						categoria = comboBoxCategorias.getSelectedItem().toString();
						programa = comboBoxProgramas.getSelectedItem().toString();
						int idCategoria = encontrarIdCategoria(categoria);
						int idPrograma = encontrarIdPrograma(programa);
						PreguntaTest pregunta = new PreguntaTest(identificador, idCategoria, idPrograma, enunciado);
						if(gesPreguntas.createPregunta(pregunta) == -1){
							JOptionPane.showMessageDialog(null, "No se pudo agregar la pregunta");
						}else {
							comboBoxCategorias.setSelectedItem(comboBoxCategorias.getItemAt(0));
							comboBoxProgramas.setSelectedItem(comboBoxProgramas.getItemAt(0));
							textAreaDescripcion.setText("");
							txt_Id_Pregunta.setText("");
							JOptionPane.showMessageDialog(null, "Se agrego la pregunta correctamente");							
						}
					}					
				}
			}			
		});
	
		JButton btn_Guardar = new JButton("");
		btn_Guardar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Guardar.png")));
		btn_Guardar.setBounds(241, 376, 73, 66);
		contentPane.add(btn_Guardar);
		
		JButton btn_Buscar = new JButton("");
		btn_Buscar.setIcon(new ImageIcon(ModuloPreguntas.class.getResource("/tuCarreraBoyacaAPP/GUI/InterfazAdmin/Images/btn_Busca.png")));
		btn_Buscar.setBounds(324, 376, 73, 66);
		contentPane.add(btn_Buscar);
		
		JButton btn_Eliminar = new JButton("");
		btn_Eliminar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Eliminar.png")));
		btn_Eliminar.setBounds(407, 376, 73, 66);
		contentPane.add(btn_Eliminar);
		
		JLabel lbl_Titulo = new JLabel("TU CARRERA EN BOYACÁ APP");
		lbl_Titulo.setForeground(new Color(25, 25, 112));
		lbl_Titulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_Titulo.setBounds(169, 29, 298, 26);
		contentPane.add(lbl_Titulo);
		
		JLabel lbl_SubTitulo = new JLabel("Modulo Preguntas");
		lbl_SubTitulo.setForeground(new Color(25, 25, 112));
		lbl_SubTitulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_SubTitulo.setBounds(232, 73, 174, 26);
		contentPane.add(lbl_SubTitulo);
				
		JLabel lbl_IdPrograma = new JLabel("Programa Academico");
		lbl_IdPrograma.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_IdPrograma.setBounds(22, 241, 174, 25);
		contentPane.add(lbl_IdPrograma);
		
		JLabel lbl_RespuestaDos = new JLabel("Categoria");
		lbl_RespuestaDos.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_RespuestaDos.setBounds(22, 280, 174, 25);
		contentPane.add(lbl_RespuestaDos);
		
		JLabel label_1 = new JLabel("Seleccione una Opci\u00F3n");
		label_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		label_1.setBounds(9, 124, 185, 25);
		contentPane.add(label_1);
		
		comboBoxOpcionPrincipal = new JComboBox();
		comboBoxOpcionPrincipal.addItem(OPCION1);
		comboBoxOpcionPrincipal.addItem(OPCION2);
		
		comboBoxOpcionPrincipal.setBounds(207, 125, 272, 26);		
		contentPane.add(comboBoxOpcionPrincipal);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 171, 487, 2);
		contentPane.add(separator_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(207, 318, 273, 36);
		contentPane.add(scrollPane);
		
		textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setEnabled(false);
		scrollPane.setViewportView(textAreaDescripcion);
				
		comboBoxProgramas = new JComboBox();
		comboBoxProgramas.setEnabled(false);
		comboBoxProgramas.setBounds(207, 242, 273, 26);
		comboBoxProgramas.addItem(OPCION1);
		contentPane.add(comboBoxProgramas);
		
		comboBoxCategorias = new JComboBox();
		comboBoxCategorias.setEnabled(false);
		comboBoxCategorias.setBounds(207, 281, 273, 26);
		comboBoxCategorias.addItem(OPCION1);
		contentPane.add(comboBoxCategorias);
		
		for (int i=0;i<listadoProgramas.size();i++){			
			ProgramaAcademico elemento = listadoProgramas.get(i);
			comboBoxProgramas.addItem(elemento.getNombre());			
		}
		
		for (int j=0;j<listadoCategorias.size();j++){			
			Categoria elemento = listadoCategorias.get(j);
			comboBoxCategorias.addItem(elemento.getNombreCategoria());			
		}
				
		comboBoxOpcionPrincipal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			String seleccion = comboBoxOpcionPrincipal.getSelectedItem().toString();
				if (seleccion.equals(OPCION1)){
					
					txt_Id_Pregunta.setEnabled(false);					
					textAreaDescripcion.setEnabled(false);
					comboBoxCategorias.setEnabled(false);
					comboBoxProgramas.setEnabled(false);
					
				}else if(seleccion.equals(OPCION2)){
					txt_Id_Pregunta.setEnabled(true);
					textAreaDescripcion.setEnabled(true);
					comboBoxCategorias.setEnabled(true);
					comboBoxProgramas.setEnabled(true);					
				}
			}
		});
		
		btn_Eliminar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxOpcionPrincipal.getSelectedItem().toString().equals(OPCION2)){
					int identificador = 0;
					try{	
						identificador = Integer.parseInt(txt_Id_Pregunta.getText());
						boolean respuesta = gesPreguntas.removePreguntaTest(identificador);
						if(respuesta){
							comboBoxCategorias.setSelectedItem(0);
							comboBoxProgramas.setSelectedItem(0);
							textAreaDescripcion.setText("");
							txt_Id_Pregunta.setText("");
							JOptionPane.showMessageDialog(null, "Se elimino satisfactoriamente");
							
						}else{
							JOptionPane.showMessageDialog(null, "No se elimino o no existe el elemento");
						}
						}catch(NumberFormatException e){
							JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
						}					
					textAreaDescripcion.setText("");				
				}							
			}
		});
		
		btn_Buscar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxOpcionPrincipal.getSelectedItem().toString().equals(OPCION2)){
					int identificador = 0;
					try{	
						identificador = Integer.parseInt(txt_Id_Pregunta.getText());
						if(identificador!=0){
							PreguntaTest pregunta = gesPreguntas.searchPreguntaTest(identificador);
							textAreaDescripcion.setText(pregunta.getDescripcion());	
							int idPrograma = pregunta.getIdPrograma();
							int idCategoria = pregunta.getIdCategoria();
							seleccionarNombreCategoria(idCategoria);
							seleccionarNombrePrograma(idPrograma);						
						}
						}catch(NumberFormatException e){
							JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
						}
						catch(NullPointerException e){
							JOptionPane.showMessageDialog(null, "No se encuentra elemento de acuerdo al parametro de busqueda");
						}
				}							
			}

			private void seleccionarNombrePrograma(int idPrograma) {
				listadoProgramas = gesProgramas.readProgramasAcademicos();
				for(int i=0;i<listadoProgramas.size();i++){
					if(listadoProgramas.get(i).getId() == idPrograma){
						comboBoxProgramas.setSelectedItem(comboBoxProgramas.getItemAt(i+1));						
					}
				}				
			}

			private void seleccionarNombreCategoria(int idCategoria) {
				listadoCategorias = gesCategorias.getCategorias();
				for(int i=0;i<listadoCategorias.size();i++){				
					if(listadoCategorias.get(i).getIdentificador() == idCategoria){						
						comboBoxCategorias.setSelectedItem(comboBoxCategorias.getItemAt(i+1));						
					}
				}
				
			}
		});
		
		btn_Guardar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxOpcionPrincipal.getSelectedItem().toString().equals(OPCION2)){
					int identificador = 0;					
					String enunciado = textAreaDescripcion.getText();					
					String categoria;
					String programa;					
					PreguntaTest pregunta;	
					int idCategoria = 0;
					int idPrograma = 0;
					try{	
					identificador = Integer.parseInt(txt_Id_Pregunta.getText());
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
					}
					if (identificador == 0 || enunciado.equals("") || comboBoxCategorias.getSelectedItem().toString().equals(OPCION1) 
							|| comboBoxProgramas.getSelectedItem().toString().equals(OPCION1) ){
						JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");	
					}else{					
						enunciado = textAreaDescripcion.getText();
						categoria = comboBoxCategorias.getSelectedItem().toString();
						programa = comboBoxProgramas.getSelectedItem().toString();
						idCategoria = encontrarIdCategoria(categoria);
						idPrograma = encontrarIdPrograma(programa);
						pregunta = new PreguntaTest(identificador, idCategoria, idPrograma, enunciado);				
					}				
					if(gesPreguntas.updatePreguntaTest(identificador, idCategoria, idPrograma, enunciado)){
						comboBoxCategorias.setSelectedItem(0);
						comboBoxProgramas.setSelectedItem(0);
						textAreaDescripcion.setText("");
						txt_Id_Pregunta.setText("");
						JOptionPane.showMessageDialog(null, "Se actualizo de forma exitosa");
					}
					else{
						JOptionPane.showMessageDialog(null, "No se actualizo el registro");
					}
					textAreaDescripcion.setText("");										
				}				
			}
		});
	}
	
	private int encontrarIdPrograma(String busqueda) {
		ArrayList<ProgramaAcademico> programa = gesProgramas.getAcademicos();
		for(int i=0;i<programa.size();i++){
			if(programa.get(i).getNombre().equals(busqueda) ){
				return programa.get(i).getId();
			}
		}
		return -1;
	}

	private int encontrarIdCategoria(String busqueda) {
		ArrayList<Categoria> categoria = gesCategorias.getCategorias();
		for(int i=0;i<categoria.size();i++){
			if(categoria.get(i).getNombreCategoria().equals(busqueda)){
				return categoria.get(i).getIdentificador();
			}
		}
		return -1;
	}
}
