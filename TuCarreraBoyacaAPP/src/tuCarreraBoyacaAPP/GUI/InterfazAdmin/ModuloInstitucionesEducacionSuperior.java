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
import java.awt.Toolkit;
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
	private JTextField txt_Id_IES;
	private JTextField txt_Nombre_IES;
	private JTextField txt_Url_IES;
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
		setTitle("MODULO INSTITUCIONES EDUCACIÓN SUPERIOR");
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Images/modulo_universidades.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//this.setEnabled(false);
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("Images/LogoPrincipal_TCBAPP.png")));
		label.setBounds(10, 11, 120, 88);
		contentPane.add(label);
		
		JLabel lbl_Id_IES = new JLabel("ID Inst. de Educación Superior");
		lbl_Id_IES.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_Id_IES.setBounds(15, 137, 215, 26);
		contentPane.add(lbl_Id_IES);
		
		JLabel lbl_Nombre_IES = new JLabel("Nombre Inst. de Educación Superior");
		lbl_Nombre_IES.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_Nombre_IES.setBounds(15, 181, 257, 25);
		contentPane.add(lbl_Nombre_IES);
		
		JLabel lbl_Url_IES = new JLabel("URL Inst. de Educación Superior");
		lbl_Url_IES.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lbl_Url_IES.setBounds(15, 227, 257, 22);
		contentPane.add(lbl_Url_IES);
		
		txt_Id_IES = new JTextField();
		txt_Id_IES.setBounds(276, 139, 273, 26);
		contentPane.add(txt_Id_IES);
		txt_Id_IES.setColumns(10);
		
		txt_Nombre_IES = new JTextField();
		txt_Nombre_IES.setColumns(10);
		txt_Nombre_IES.setBounds(277, 180, 272, 26);
		contentPane.add(txt_Nombre_IES);
		
		txt_Url_IES = new JTextField();
		txt_Url_IES.setColumns(10);
		txt_Url_IES.setBounds(277, 223, 272, 26);
		contentPane.add(txt_Url_IES);
		
		JButton btn_Regresar = new JButton("");
		btn_Regresar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Regresar.png")));
		btn_Regresar.setBounds(20, 296, 110, 45);
		contentPane.add(btn_Regresar);
		btn_Regresar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MenuAdmin.main(null);				
			}
			});
		
		JButton btn_Guardar = new JButton("");
		btn_Guardar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Guardar.png")));
		btn_Guardar.setBounds(296, 275, 64, 66);
		contentPane.add(btn_Guardar);
		btn_Guardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int identificador = 0;
				String nombre = "";
				String url= "";
				try{	
				identificador = Integer.parseInt(txt_Id_IES.getText());
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
				}
				if (txt_Nombre_IES.getText().equals("") || txt_Url_IES.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Todos los son campos obligatorios");
				}else{
					nombre = txt_Nombre_IES.getText();
					url = txt_Url_IES.getText();
				}				
				if(gestionInstituciones.updateInstitucionesEducacionSuperior(identificador, nombre, url)){
					JOptionPane.showMessageDialog(null, "Se actualizo de forma exitosa");
				}
				txt_Id_IES.setText("");
				txt_Nombre_IES.setText("");
				txt_Url_IES.setText("");
			}	
		});
		
		JButton btn_Agregar = new JButton("");
		btn_Agregar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Agrega.png")));
		btn_Agregar.setBounds(194, 275, 73, 66);
		contentPane.add(btn_Agregar);
		btn_Agregar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int identificador = 0;
				String nombre = "";
				String url= "";
				try{	
				identificador = Integer.parseInt(txt_Id_IES.getText());
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
				}
				if (txt_Nombre_IES.getText().equals("") || txt_Url_IES.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Todos los son campos obligatorios");
				}else{
					nombre = txt_Nombre_IES.getText();
					url = txt_Url_IES.getText();
					InstitucionEducacionSuperior institucion = new InstitucionEducacionSuperior(identificador, nombre, url);
					int respuesta = gestionInstituciones.createInstitucionEducacionSuperior(institucion);
					if (respuesta != -1){
						JOptionPane.showMessageDialog(null, "Se agrego de forma exitosa");
					}else{
						JOptionPane.showMessageDialog(null, "No Se agrego el elemento, problema en base de datos");
					}					
				}				
				txt_Id_IES.setText("");
				txt_Nombre_IES.setText("");
				txt_Url_IES.setText("");
			}	
		});
		
		
		JButton btn_Buscar = new JButton("");
		btn_Buscar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Busca.png")));
		btn_Buscar.setBounds(386, 275, 73, 66);
		contentPane.add(btn_Buscar);
		btn_Buscar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int identificador = 0;
				try{	
					identificador = Integer.parseInt(txt_Id_IES.getText());
					if(identificador!=0){
						InstitucionEducacionSuperior institucion = gestionInstituciones.searchInstucionEducacionSuperior(identificador);
						txt_Nombre_IES.setText(institucion.getNombre());
						txt_Url_IES.setText(institucion.getDireccionURL());
						}
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
					}
					catch(NullPointerException e){
						JOptionPane.showMessageDialog(null, "No se encuentra elemento de acuerdo al parametro de busqueda");
					}
				
			}
		});
		
		
		JButton btn_Eliminar = new JButton("");
		btn_Eliminar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Eliminar.png")));
		btn_Eliminar.setBounds(480, 275, 64, 66);
		contentPane.add(btn_Eliminar);
		btn_Eliminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int identificador = 0;
				try{	
					identificador = Integer.parseInt(txt_Id_IES.getText());
					boolean respuesta = gestionInstituciones.removeInstitucionEducacionSuperior(identificador);
					if(respuesta){
						JOptionPane.showMessageDialog(null, "Se elimino satisfactoriamente");
					}else{
						JOptionPane.showMessageDialog(null, "No se elimino o no existe el elemento");
					}
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "El espacio ''identificador'' no puede estar en blanco");
					}					
				txt_Id_IES.setText("");
				txt_Nombre_IES.setText("");
				txt_Url_IES.setText("");
			}
		});	
		JLabel lbl_Titulo = new JLabel("TU CARRERA EN BOYACÁ APP");
		lbl_Titulo.setForeground(new Color(25, 25, 112));
		lbl_Titulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_Titulo.setBounds(190, 29, 298, 26);
		contentPane.add(lbl_Titulo);
		
		JLabel lbl_SubTitulo = new JLabel("Modulo Instituiciones de Educación Superior");
		lbl_SubTitulo.setForeground(new Color(25, 25, 112));
		lbl_SubTitulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_SubTitulo.setBounds(134, 73, 410, 26);
		contentPane.add(lbl_SubTitulo);

	}
}