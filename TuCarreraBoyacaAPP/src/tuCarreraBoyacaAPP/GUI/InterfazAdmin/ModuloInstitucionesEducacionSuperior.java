/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

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

import javax.swing.ImageIcon;
import javax.swing.JTextField;

import tuCarreraBoyacaAPP.logica.InstitucionEducacionSuperior;
import tuCarreraBoyacaAPP.logica.GestionInstitucionesEducacionSuperior;

/**
 * @author JUDIT
 *
 */

public class ModuloInstitucionesEducacionSuperior extends JFrame {

	private JPanel contentPane;
	private JTextField textField_urlInstitucion;
	private JTextField textField_NombreInstitucion;
	private JTextField textField_idInstitucion;
	private GestionInstitucionesEducacionSuperior gestionInstituciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModuloInstitucionesEducacionSuperior frame = new ModuloInstitucionesEducacionSuperior();
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
	public ModuloInstitucionesEducacionSuperior() {
		gestionInstituciones = new GestionInstitucionesEducacionSuperior();
		setTitle("MODULO INSTITUCIONES DE EDUCACIÓN SUPERIOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("images/Logo_TCBAPP1.png")));
		label.setBounds(10, 11, 157, 123);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("TU CARRERA EN BOYACÁ APP");
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		label_1.setBounds(189, 33, 274, 29);
		contentPane.add(label_1);
		
		JLabel lblModuloInstitucionesDe = new JLabel("Modulo Instituciones de");
		lblModuloInstitucionesDe.setForeground(new Color(0, 0, 128));
		lblModuloInstitucionesDe.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lblModuloInstitucionesDe.setBounds(232, 73, 211, 29);
		contentPane.add(lblModuloInstitucionesDe);
		
		JLabel lblEducacinSuperior = new JLabel("Educación Superior");
		lblEducacinSuperior.setForeground(new Color(0, 0, 128));
		lblEducacinSuperior.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lblEducacinSuperior.setBounds(251, 91, 175, 29);
		contentPane.add(lblEducacinSuperior);
		
		JLabel lblIdInstitucionesDe = new JLabel("ID Instituciones de Educación Superior");
		lblIdInstitucionesDe.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblIdInstitucionesDe.setBounds(27, 157, 256, 14);
		contentPane.add(lblIdInstitucionesDe);
		
		JLabel lblNombreInstitucionesDe = new JLabel("Nombre Instituciones de Educación Superior");
		lblNombreInstitucionesDe.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNombreInstitucionesDe.setBounds(27, 198, 256, 14);
		contentPane.add(lblNombreInstitucionesDe);
		
		JLabel lblUrlInstitucionesDe = new JLabel("URL Instituciones de Educación Superior");
		lblUrlInstitucionesDe.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblUrlInstitucionesDe.setBounds(27, 240, 256, 14);
		contentPane.add(lblUrlInstitucionesDe);
			
		textField_urlInstitucion = new JTextField();
		textField_urlInstitucion.setColumns(10);
		textField_urlInstitucion.setBounds(294, 238, 169, 20);
		contentPane.add(textField_urlInstitucion);
		
		textField_NombreInstitucion = new JTextField();
		textField_NombreInstitucion.setColumns(10);
		textField_NombreInstitucion.setBounds(293, 196, 169, 20);
		contentPane.add(textField_NombreInstitucion);
		
		textField_idInstitucion = new JTextField();
		textField_idInstitucion.setColumns(10);
		textField_idInstitucion.setBounds(294, 155, 169, 20);
		contentPane.add(textField_idInstitucion);
		
		JButton button_Regresar = new JButton("");
		button_Regresar.setIcon(new ImageIcon(this.getClass().getResource("images/regresar.png")));
		button_Regresar.setBounds(40, 279, 87, 41);
		button_Regresar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MenuAdmin.main(null);				
			}
			});
			contentPane.add(button_Regresar);

		JButton button_Agregar = new JButton("");
		button_Agregar.setIcon(new ImageIcon(this.getClass().getResource("images/add.png")));
		button_Agregar.setBounds(164, 279, 45, 41);
		contentPane.add(button_Agregar);
		
		JButton button_ActualizarBuscar = new JButton("");
		button_ActualizarBuscar.setIcon(new ImageIcon(this.getClass().getResource("images/reload.png")));
		button_ActualizarBuscar.setBounds(251, 279, 45, 41);
		contentPane.add(button_ActualizarBuscar);	
		
		JButton button_Guardar = new JButton("");
		button_Guardar.setIcon(new ImageIcon(this.getClass().getResource("images/save.png")));
		button_Guardar.setBounds(336, 279, 45, 41);
		contentPane.add(button_Guardar);
			
		JButton button_Eliminar = new JButton("");
		button_Eliminar.setIcon(new ImageIcon(this.getClass().getResource("images/delete.png")));
		button_Eliminar.setBounds(418, 279, 45, 41);
		contentPane.add(button_Eliminar);
		
		button_Agregar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int identificador = 0;
				String nombre = "";
				String url= "";
				try{	
				identificador = Integer.parseInt(textField_idInstitucion.getText());
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
				}
				if (textField_NombreInstitucion.getText().equals("") || textField_urlInstitucion.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Todos los son campos obligatorios");
				}else{
					nombre = textField_NombreInstitucion.getText();
					url = textField_urlInstitucion.getText();
					InstitucionEducacionSuperior institucion = new InstitucionEducacionSuperior(identificador, nombre, url);
					int respuesta = gestionInstituciones.createInstitucionEducacionSuperior(institucion);
					if (respuesta != -1){
						JOptionPane.showMessageDialog(null, "Se agrego de forma exitosa");
					}else{
						JOptionPane.showMessageDialog(null, "No Se agrego el elemento, problema en base de datos");
					}					
				}				
				textField_idInstitucion.setText("");
				textField_NombreInstitucion.setText("");
				textField_urlInstitucion.setText("");
			}	
		});
		
		button_ActualizarBuscar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int identificador = 0;
				try{	
					identificador = Integer.parseInt(textField_idInstitucion.getText());
					if(identificador!=0){
						InstitucionEducacionSuperior institucion = gestionInstituciones.searchInstucionEducacionSuperior(identificador);
						textField_NombreInstitucion.setText(institucion.getNombre());
						textField_urlInstitucion.setText(institucion.getDireccionURL());
						}
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
					}
					catch(NullPointerException e){
						JOptionPane.showMessageDialog(null, "No se encuentra elemento de acuerdo al parametro de busqueda");
					}
				
			}
		});
		
		button_Guardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int identificador = 0;
				String nombre = "";
				String url= "";
				try{	
				identificador = Integer.parseInt(textField_idInstitucion.getText());
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
				}
				if (textField_NombreInstitucion.getText().equals("") || textField_urlInstitucion.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Todos los son campos obligatorios");
				}else{
					nombre = textField_NombreInstitucion.getText();
					url = textField_urlInstitucion.getText();
				}				
				if(gestionInstituciones.updateInstitucionesEducacionSuperior(identificador, nombre, url)){
					JOptionPane.showMessageDialog(null, "Se actualizo de forma exitosa");
				}
				textField_idInstitucion.setText("");
				textField_NombreInstitucion.setText("");
				textField_urlInstitucion.setText("");
			}	
		});
		
		button_Eliminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int identificador = 0;
				try{	
					identificador = Integer.parseInt(textField_idInstitucion.getText());
					boolean respuesta = gestionInstituciones.removeInstitucionEducacionSuperior(identificador);
					if(respuesta){
						JOptionPane.showMessageDialog(null, "Se elimino satisfactoriamente");
					}else{
						JOptionPane.showMessageDialog(null, "No se elimino o no existe el elemento");
					}
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
					}					
				textField_idInstitucion.setText("");
				textField_NombreInstitucion.setText("");
				textField_urlInstitucion.setText("");
			}
		});		
		}
}