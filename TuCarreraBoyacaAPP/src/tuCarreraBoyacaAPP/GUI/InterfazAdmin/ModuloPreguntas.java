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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import tuCarreraBoyacaAPP.logica.GestionPreguntaTest;
import tuCarreraBoyacaAPP.logica.PreguntaTest;

/**
 * @author JUDIT
 *
 */
public class ModuloPreguntas extends JFrame {

	private final String OPCION1 = "SELECCIONAR";
	private final String OPCION2 = "AGREGAR NUEVA PREGUNTA";
	private final String OPCION3 = "AGREGAR RELACIONES";
	private GestionPreguntaTest gesPreguntas;
	private JPanel contentPane;
	private JTextField txt_Id_Pregunta;
	private JTextField txt_EstimacionPuntaje;
	private JComboBox comboBoxOpcionPrincipal;
	private JSpinner spinner_RespuestaCorrecta;
	private JComboBox cmbBox_CategoriaPA;
	private JComboBox cmbBox_ProgramaAcademico;
	private JTextArea textAreaDescripcion;
	private JTextArea textAreaRespuesta1;
	private JTextArea textAreaRespuesta2;
	private JTextArea textAreaRespuesta3;
	private JTextArea textAreaRespuesta4;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_4;
	
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
		setBounds(100, 100, 612, 750);
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
		
		JLabel lbl_Id_Pregunta = new JLabel("Identificador Pregunta");
		lbl_Id_Pregunta.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_Id_Pregunta.setBounds(22, 193, 162, 26);
		contentPane.add(lbl_Id_Pregunta);
		
		txt_Id_Pregunta = new JTextField();
		txt_Id_Pregunta.setColumns(10);
		txt_Id_Pregunta.setBounds(207, 195, 273, 26);
		contentPane.add(txt_Id_Pregunta);
		
		JLabel lbl_DescripcionPregunta = new JLabel("Descripción Pregunta");
		lbl_DescripcionPregunta.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_DescripcionPregunta.setBounds(22, 242, 162, 26);
		contentPane.add(lbl_DescripcionPregunta);
		
		JLabel lbl_EstimacionPuntaje = new JLabel("Estimación Puntaje");
		lbl_EstimacionPuntaje.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_EstimacionPuntaje.setBounds(22, 664, 152, 26);
		contentPane.add(lbl_EstimacionPuntaje);
		
		txt_EstimacionPuntaje = new JTextField();
		txt_EstimacionPuntaje.setColumns(10);
		txt_EstimacionPuntaje.setBounds(208, 666, 272, 26);
		contentPane.add(txt_EstimacionPuntaje);
		
		JLabel lbl_ProgramasAcadmicos = new JLabel("Programas Académicos");
		lbl_ProgramasAcadmicos.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_ProgramasAcadmicos.setBounds(21, 613, 174, 25);
		contentPane.add(lbl_ProgramasAcadmicos);
		
		JButton btn_Regresar = new JButton("");
		btn_Regresar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Regresar.png")));
		btn_Regresar.setBounds(487, 608, 110, 45);
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
		btn_Agregar.setBounds(519, 110, 73, 66);
		contentPane.add(btn_Agregar);
		btn_Agregar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String opcion = comboBoxOpcionPrincipal.getSelectedItem().toString();
				if (opcion.equals(OPCION1)){
					JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion en la primera casilla");
				}else if(opcion.equals(OPCION2)){
					int identificador = 0;
					String descripcion = textAreaDescripcion.getText();
					String respuesta1 = textAreaRespuesta1.getText();
					String respuesta2 = textAreaRespuesta2.getText();
					String respuesta3 = textAreaRespuesta3.getText();
					String respuesta4 = textAreaRespuesta4.getText();
					int respuestaCor;
					try{	
						identificador = Integer.parseInt(txt_Id_Pregunta.getText());
					}catch(NumberFormatException e){
							JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
					}
					if (txt_Id_Pregunta.getText().equals("") || descripcion.equals("") 
							|| respuesta1.equals("") || respuesta2.equals("") || respuesta3.equals("") 
							|| respuesta4.equals("")){
						JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
					}else{
						respuestaCor = Integer.parseInt(spinner_RespuestaCorrecta.getValue().toString());
						PreguntaTest pregunta = new PreguntaTest(identificador, descripcion, respuesta1, respuesta2, respuesta3, respuesta4, respuestaCor);
						if(gesPreguntas.createPregunta(pregunta) == -1){
							JOptionPane.showMessageDialog(null, "No se pudo agregar la pregunta");
						}else {
							JOptionPane.showMessageDialog(null, "Se agrego la pregunta correctamente");
						}
					}					
				}else if(opcion.equals(OPCION3)){
					
				}
				
				//if (textField_descripcion.getText().equals("") || textField_.getText().equals("")){
				//	JOptionPane.showMessageDialog(null, "Todos los son campos obligatorios");
				//}
			}
		});
	
		JButton btn_Guardar = new JButton("");
		btn_Guardar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Guardar.png")));
		btn_Guardar.setBounds(519, 225, 73, 66);
		contentPane.add(btn_Guardar);
		
		JButton btn_Buscar = new JButton("");
		btn_Buscar.setIcon(new ImageIcon(ModuloPreguntas.class.getResource("/tuCarreraBoyacaAPP/GUI/InterfazAdmin/Images/btn_Busca.png")));
		btn_Buscar.setBounds(519, 352, 73, 66);
		contentPane.add(btn_Buscar);
		
		JButton btn_Eliminar = new JButton("");
		btn_Eliminar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Eliminar.png")));
		btn_Eliminar.setBounds(519, 467, 73, 66);
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
		
		cmbBox_ProgramaAcademico = new JComboBox();
		cmbBox_ProgramaAcademico.setBounds(205, 614, 273, 26);
		contentPane.add(cmbBox_ProgramaAcademico);
		
		JLabel lbl_CategoriaPA = new JLabel("Categoria Programas ");
		lbl_CategoriaPA.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_CategoriaPA.setBounds(21, 559, 174, 25);
		contentPane.add(lbl_CategoriaPA);
		
		cmbBox_CategoriaPA = new JComboBox();
		cmbBox_CategoriaPA.setBounds(207, 560, 273, 26);
		contentPane.add(cmbBox_CategoriaPA);
		
		JLabel lbl_RespuestaCuatro = new JLabel("Respuesta Cuatro");
		lbl_RespuestaCuatro.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_RespuestaCuatro.setBounds(22, 428, 174, 25);
		contentPane.add(lbl_RespuestaCuatro);
		
		JLabel lbl_RespuestaUno = new JLabel("Respuesta Uno");
		lbl_RespuestaUno.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_RespuestaUno.setBounds(22, 283, 174, 25);
		contentPane.add(lbl_RespuestaUno);
		
		JLabel lbl_RespuestaDos = new JLabel("Respuesta Dos");
		lbl_RespuestaDos.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_RespuestaDos.setBounds(22, 333, 174, 25);
		contentPane.add(lbl_RespuestaDos);
		
		JLabel lblRespuestaTres = new JLabel("Respuesta Tres");
		lblRespuestaTres.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lblRespuestaTres.setBounds(21, 382, 174, 25);
		contentPane.add(lblRespuestaTres);
		
		JLabel lbl_RespuestaCorrecta = new JLabel("Respuesta Correcta");
		lbl_RespuestaCorrecta.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_RespuestaCorrecta.setBounds(22, 486, 174, 25);
		contentPane.add(lbl_RespuestaCorrecta);
		
		spinner_RespuestaCorrecta = new JSpinner();
		spinner_RespuestaCorrecta.setModel(new SpinnerNumberModel(1, 1, 4, 1));
		spinner_RespuestaCorrecta.setToolTipText("1\r\n2\r\n3\r\n4");
		spinner_RespuestaCorrecta.setBounds(206, 487, 272, 26);
		contentPane.add(spinner_RespuestaCorrecta);
		
		JLabel label_1 = new JLabel("Seleccione una Opci\u00F3n");
		label_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		label_1.setBounds(9, 124, 185, 25);
		contentPane.add(label_1);
		
		comboBoxOpcionPrincipal = new JComboBox();
		comboBoxOpcionPrincipal.addItem(OPCION1);
		comboBoxOpcionPrincipal.addItem(OPCION2);
		comboBoxOpcionPrincipal.addItem(OPCION3);
		comboBoxOpcionPrincipal.setBounds(207, 125, 272, 26);		
		contentPane.add(comboBoxOpcionPrincipal);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 538, 487, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 171, 487, 2);
		contentPane.add(separator_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(207, 232, 273, 36);
		contentPane.add(scrollPane);
		
		textAreaDescripcion = new JTextArea();
		scrollPane.setViewportView(textAreaDescripcion);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(207, 283, 273, 36);
		contentPane.add(scrollPane_1);
		
		textAreaRespuesta1 = new JTextArea();
		scrollPane_1.setViewportView(textAreaRespuesta1);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(207, 335, 273, 36);
		contentPane.add(scrollPane_2);
		
		textAreaRespuesta2 = new JTextArea();
		scrollPane_2.setViewportView(textAreaRespuesta2);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(207, 382, 273, 36);
		contentPane.add(scrollPane_3);
		
		textAreaRespuesta3 = new JTextArea();
		scrollPane_3.setViewportView(textAreaRespuesta3);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(207, 428, 273, 36);
		contentPane.add(scrollPane_4);
		
		textAreaRespuesta4 = new JTextArea();
		scrollPane_4.setViewportView(textAreaRespuesta4);
		
		txt_Id_Pregunta.setEnabled(false);
		txt_EstimacionPuntaje.setEnabled(false);
		spinner_RespuestaCorrecta.setEnabled(false);
		cmbBox_CategoriaPA.setEnabled(false);
		cmbBox_ProgramaAcademico.setEnabled(false);
		textAreaDescripcion.setEnabled(false);
		textAreaRespuesta1.setEnabled(false);
		textAreaRespuesta2.setEnabled(false);
		textAreaRespuesta3.setEnabled(false);
		textAreaRespuesta4.setEnabled(false);
		
		comboBoxOpcionPrincipal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			String seleccion = comboBoxOpcionPrincipal.getSelectedItem().toString();
				if (seleccion.equals(OPCION1)){
					
					txt_Id_Pregunta.setEnabled(false);
					txt_EstimacionPuntaje.setEnabled(false);
					spinner_RespuestaCorrecta.setEnabled(false);
					cmbBox_CategoriaPA.setEnabled(false);
					cmbBox_ProgramaAcademico.setEnabled(false);
					textAreaDescripcion.setEnabled(false);
					textAreaRespuesta1.setEnabled(false);
					textAreaRespuesta2.setEnabled(false);
					textAreaRespuesta3.setEnabled(false);
					textAreaRespuesta4.setEnabled(false);
					
				}else if(seleccion.equals(OPCION2)){
					txt_Id_Pregunta.setEnabled(true);
					textAreaDescripcion.setEnabled(true);
					textAreaRespuesta1.setEnabled(true);
					textAreaRespuesta2.setEnabled(true);
					textAreaRespuesta3.setEnabled(true);
					textAreaRespuesta4.setEnabled(true);
					spinner_RespuestaCorrecta.setEnabled(true);
					txt_EstimacionPuntaje.setEnabled(false);
					cmbBox_CategoriaPA.setEnabled(false);
					cmbBox_ProgramaAcademico.setEnabled(false);
					
				}else if(seleccion.equals(OPCION3)){
					txt_EstimacionPuntaje.setEnabled(true);
					cmbBox_CategoriaPA.setEnabled(true);
					cmbBox_ProgramaAcademico.setEnabled(true);
					txt_Id_Pregunta.setEnabled(false);
					textAreaDescripcion.setEnabled(false);
					textAreaRespuesta1.setEnabled(false);
					textAreaRespuesta2.setEnabled(false);
					textAreaRespuesta3.setEnabled(false);
					textAreaRespuesta4.setEnabled(false);
					spinner_RespuestaCorrecta.setEnabled(false);
				}
			}
		});
		
		
	}
}
