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

/**
 * @author JUDIT
 *
 */
public class ModuloPreguntas extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Id_Pregunta;
	private JTextField txt_EstimacionPuntaje;

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
		setBounds(100, 100, 612, 703);
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
		lbl_Id_Pregunta.setBounds(20, 110, 162, 26);
		contentPane.add(lbl_Id_Pregunta);
		
		txt_Id_Pregunta = new JTextField();
		txt_Id_Pregunta.setColumns(10);
		txt_Id_Pregunta.setBounds(204, 112, 273, 26);
		contentPane.add(txt_Id_Pregunta);
		
		JLabel lbl_DescripcionPregunta = new JLabel("Descripción Pregunta");
		lbl_DescripcionPregunta.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_DescripcionPregunta.setBounds(20, 159, 162, 26);
		contentPane.add(lbl_DescripcionPregunta);
		
		JLabel lbl_EstimacionPuntaje = new JLabel("Estimación Puntaje");
		lbl_EstimacionPuntaje.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_EstimacionPuntaje.setBounds(20, 626, 152, 26);
		contentPane.add(lbl_EstimacionPuntaje);
		
		txt_EstimacionPuntaje = new JTextField();
		txt_EstimacionPuntaje.setColumns(10);
		txt_EstimacionPuntaje.setBounds(205, 626, 272, 26);
		contentPane.add(txt_EstimacionPuntaje);
		
		JLabel lbl_ProgramasAcadmicos = new JLabel("Programas Académicos");
		lbl_ProgramasAcadmicos.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_ProgramasAcadmicos.setBounds(20, 527, 174, 25);
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
				int identificador = 0;
				String descripcion = "";
				String respuesta1 = "";
				String respuesta2 = "";
				String respuesta3 = "";
				String respuesta4 = "";
				int respuestaCor = 0;
				try{	
					identificador = Integer.parseInt(txt_Id_Pregunta.getText());
				}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
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
		
		JScrollBar scrollBar_DescripcionPregunta = new JScrollBar();
		scrollBar_DescripcionPregunta.setBounds(460, 149, 17, 36);
		contentPane.add(scrollBar_DescripcionPregunta);
		
		JTextArea txtArea_DescripcionPregunta = new JTextArea();
		txtArea_DescripcionPregunta.setBounds(204, 151, 273, 34);
		contentPane.add(txtArea_DescripcionPregunta);
		
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
		
		JComboBox cmbBox_ProgramaAcademico = new JComboBox();
		cmbBox_ProgramaAcademico.setBounds(204, 528, 273, 26);
		contentPane.add(cmbBox_ProgramaAcademico);
		
		JLabel lbl_CategoriaPA = new JLabel("Categoria Programas ");
		lbl_CategoriaPA.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_CategoriaPA.setBounds(20, 429, 174, 25);
		contentPane.add(lbl_CategoriaPA);
		
		JComboBox cmbBox_CategoriaPA = new JComboBox();
		cmbBox_CategoriaPA.setBounds(204, 430, 273, 26);
		contentPane.add(cmbBox_CategoriaPA);
		
		JLabel lbl_RespuestaCuatro = new JLabel("Respuesta Cuatro");
		lbl_RespuestaCuatro.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_RespuestaCuatro.setBounds(19, 329, 174, 25);
		contentPane.add(lbl_RespuestaCuatro);
		
		JScrollBar scrollBar_Respuesta4 = new JScrollBar();
		scrollBar_Respuesta4.setBounds(460, 322, 17, 34);
		contentPane.add(scrollBar_Respuesta4);
		
		JLabel lbl_RespuestaUno = new JLabel("Respuesta Uno");
		lbl_RespuestaUno.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_RespuestaUno.setBounds(18, 200, 174, 25);
		contentPane.add(lbl_RespuestaUno);
		
		JScrollBar scrollBar_Respuesta1 = new JScrollBar();
		scrollBar_Respuesta1.setBounds(460, 196, 17, 33);
		contentPane.add(scrollBar_Respuesta1);
		
		JLabel lbl_RespuestaDos = new JLabel("Respuesta Dos");
		lbl_RespuestaDos.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_RespuestaDos.setBounds(20, 246, 174, 25);
		contentPane.add(lbl_RespuestaDos);
		
		JScrollBar scrollBar_Respuesta2 = new JScrollBar();
		scrollBar_Respuesta2.setBounds(460, 240, 17, 31);
		contentPane.add(scrollBar_Respuesta2);
		
		JLabel lblRespuestaTres = new JLabel("Respuesta Tres");
		lblRespuestaTres.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lblRespuestaTres.setBounds(19, 286, 174, 25);
		contentPane.add(lblRespuestaTres);
		
		JScrollBar scrollBar_Respuesta3 = new JScrollBar();
		scrollBar_Respuesta3.setBounds(460, 282, 17, 29);
		contentPane.add(scrollBar_Respuesta3);
		
		JTextArea txtArea_Respuesta2 = new JTextArea();
		txtArea_Respuesta2.setBounds(204, 242, 273, 29);
		contentPane.add(txtArea_Respuesta2);
		
		JTextArea txtArea_Respuesta4 = new JTextArea();
		txtArea_Respuesta4.setBounds(204, 324, 273, 32);
		contentPane.add(txtArea_Respuesta4);
		
		JTextArea txtArea_Respuesta3 = new JTextArea();
		txtArea_Respuesta3.setBounds(204, 284, 273, 27);
		contentPane.add(txtArea_Respuesta3);
		
		JTextArea txtArea_Respuesta1 = new JTextArea();
		txtArea_Respuesta1.setBounds(204, 198, 273, 31);
		contentPane.add(txtArea_Respuesta1);
		
		JLabel lbl_RespuestaCorrecta = new JLabel("Respuesta Correcta");
		lbl_RespuestaCorrecta.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_RespuestaCorrecta.setBounds(20, 375, 174, 25);
		contentPane.add(lbl_RespuestaCorrecta);
		
		JSpinner spinner_RespuestaCorrecta = new JSpinner();
		spinner_RespuestaCorrecta.setModel(new SpinnerNumberModel(1, 1, 4, 1));
		spinner_RespuestaCorrecta.setToolTipText("1\r\n2\r\n3\r\n4");
		spinner_RespuestaCorrecta.setBounds(204, 376, 272, 26);
		contentPane.add(spinner_RespuestaCorrecta);
	}
}
