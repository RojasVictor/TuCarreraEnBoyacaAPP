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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * @author JUDIT
 *
 */
public class ModuloPreguntas extends JFrame {

	private JPanel contentPane;
	private JTextField textField_identificador;
	private JTextField textField_descripcion;
	private JTextField textField_programaAcademico;
	private JTextField textField_puntaje;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("images/Logo_TCBAPP1.png")));
		label.setBounds(10, 11, 157, 123);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("TU CARRERA EN BOYACÁ APP");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lblNewLabel.setBounds(189, 33, 274, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblModuloPreuntas = new JLabel("Modulo Preuntas");
		lblModuloPreuntas.setForeground(new Color(0, 0, 128));
		lblModuloPreuntas.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lblModuloPreuntas.setBounds(251, 73, 151, 29);
		contentPane.add(lblModuloPreuntas);
		
		JLabel lblNewLabel_1 = new JLabel("Identificador Pregunta");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(40, 159, 157, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDescipcin = new JLabel("Descipción");
		lblDescipcin.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblDescipcin.setBounds(40, 184, 157, 14);
		contentPane.add(lblDescipcin);
		
		JLabel lblProgramaAcadmico = new JLabel("Programa Académico");
		lblProgramaAcadmico.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblProgramaAcadmico.setBounds(40, 209, 157, 14);
		contentPane.add(lblProgramaAcadmico);
		
		JLabel lblEstimacinPuntaje = new JLabel("Estimación Puntaje");
		lblEstimacinPuntaje.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblEstimacinPuntaje.setBounds(40, 234, 157, 14);
		contentPane.add(lblEstimacinPuntaje);
		
		textField_identificador = new JTextField();
		textField_identificador.setBounds(225, 157, 238, 20);
		contentPane.add(textField_identificador);
		textField_identificador.setColumns(10);
		
		textField_descripcion = new JTextField();
		textField_descripcion.setColumns(10);
		textField_descripcion.setBounds(225, 182, 238, 20);
		contentPane.add(textField_descripcion);
		
		textField_programaAcademico = new JTextField();
		textField_programaAcademico.setColumns(10);
		textField_programaAcademico.setBounds(225, 207, 238, 20);
		contentPane.add(textField_programaAcademico);
		
		textField_puntaje = new JTextField();
		textField_puntaje.setColumns(10);
		textField_puntaje.setBounds(225, 232, 238, 20);
		contentPane.add(textField_puntaje);
		
		JButton button_regresar = new JButton("");
		button_regresar.setIcon(new ImageIcon(this.getClass().getResource("images/regresar.png")));
		button_regresar.setBounds(40, 279, 87, 41);
		button_regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				MenuAdmin.main(null);				
			}
		});
		contentPane.add(button_regresar);
		
		JButton button_agregar = new JButton("");
		button_agregar.setIcon(new ImageIcon(this.getClass().getResource("images/add.png")));
		button_agregar.setBounds(152, 279, 45, 41);
		contentPane.add(button_agregar);
		
		JButton button_buscarActualizar = new JButton("");
		button_buscarActualizar.setIcon(new ImageIcon(this.getClass().getResource("images/reload.png")));
		button_buscarActualizar.setBounds(251, 279, 45, 41);
		contentPane.add(button_buscarActualizar);
		
		JButton button_guardar = new JButton("");
		button_guardar.setIcon(new ImageIcon(this.getClass().getResource("images/save.png")));
		button_guardar.setBounds(336, 279, 45, 41);
		contentPane.add(button_guardar);
		
		JButton button_eliminar = new JButton("");
		button_eliminar.setIcon(new ImageIcon(this.getClass().getResource("images/delete.png")));
		button_eliminar.setBounds(418, 279, 45, 41);
		contentPane.add(button_eliminar);
		
		button_agregar.addActionListener(new ActionListener() {
			
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
					identificador = Integer.parseInt(textField_identificador.getText());
				}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
				}
				//if (textField_descripcion.getText().equals("") || textField_.getText().equals("")){
				//	JOptionPane.showMessageDialog(null, "Todos los son campos obligatorios");
				//}
			}
		});
	}
}

