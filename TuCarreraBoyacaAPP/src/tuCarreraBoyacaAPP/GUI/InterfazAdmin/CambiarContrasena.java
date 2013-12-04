/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

import tuCarreraBoyacaAPP.GUI.InterfazUsuario.MenuPrincipal;
import tuCarreraBoyacaAPP.persistencia.ArchivoContrasena;


/**
 * @author FABIO
 *
 */
public class CambiarContrasena extends JFrame{
	
	//Attributes ------------------------------------
	private JTextField JPasswordField_ContrasenaActual;
	private JTextField JPasswordField_ContrasenaNueva;
	private JLabel lblRespuesta; 
	private JTextField textField_Usuario;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CambiarContrasena frame = new CambiarContrasena();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	//Building -----------------------------------------------------------------------
	public CambiarContrasena (){
		setTitle("Cambiar Contrase\u00F1a");
		setSize(360, 380);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Images/modulo_admin.png")));
		setLocationRelativeTo(null);
		
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("CAMBIAR CONTRASE\u00D1A");
		lblTitulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lblTitulo.setForeground(new Color(25,25,112));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(45, 35, 268, 27);
		getContentPane().add(lblTitulo);
		
		JLabel lblContrasenaActual = new JLabel("Contrase\u00F1a Actual");
		lblContrasenaActual.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		lblContrasenaActual.setBounds(30, 120, 138, 27);
		getContentPane().add(lblContrasenaActual);
		
		JLabel lblContrasenaNueva = new JLabel("Contrase\u00F1a Nueva");
		lblContrasenaNueva.setBounds(30, 160, 138, 27);
		lblContrasenaNueva.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		getContentPane().add(lblContrasenaNueva);
		
		JButton btn_Regresar = new JButton("");
		btn_Regresar.setBounds(63, 268, 115, 45);
		btn_Regresar.setIcon(new ImageIcon(CambiarContrasena.class.getResource("/tuCarreraBoyacaAPP/GUI/InterfazAdmin/Images/btn_Regresar.png")));
		getContentPane().add(btn_Regresar);
		btn_Regresar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();		
				MenuAdmin.main(null);
			}
			});
		getContentPane().add(btn_Regresar);
		
		JPasswordField_ContrasenaActual = new JTextField();
		JPasswordField_ContrasenaActual.setBounds(178, 120, 135, 27);
		getContentPane().add(JPasswordField_ContrasenaActual);
		JPasswordField_ContrasenaActual.setColumns(10);
		
		JPasswordField_ContrasenaNueva = new JTextField();
		JPasswordField_ContrasenaNueva.setBounds(178, 162, 135, 27);
		getContentPane().add(JPasswordField_ContrasenaNueva);
		JPasswordField_ContrasenaNueva.setColumns(10);
		
		JButton btn_Guardar = new JButton("");
		btn_Guardar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Guardar.png")));
		btn_Guardar.setBounds(227, 256, 64, 66);
		getContentPane().add(btn_Guardar);
		
		lblRespuesta = new JLabel("");
		lblRespuesta.setHorizontalAlignment(SwingConstants.CENTER);
		lblRespuesta.setBounds(30, 215, 283, 30);
		lblRespuesta.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		getContentPane().add(lblRespuesta);
		
		JLabel lblNombreUsuario = new JLabel("Nombre Usuario");
		lblNombreUsuario.setBounds(30, 82, 138, 27);
		lblNombreUsuario.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		getContentPane().add(lblNombreUsuario);
		
		textField_Usuario = new JTextField();
		textField_Usuario.setBounds(178, 82, 135, 27);
		getContentPane().add(textField_Usuario);
		textField_Usuario.setColumns(10);
		
		btn_Guardar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean resaux = false;
				boolean respuesta;
				String usuCambiar = textField_Usuario.getText();
				float actual = Float.parseFloat(JPasswordField_ContrasenaActual.getText());
				float nueva = Float.parseFloat(JPasswordField_ContrasenaNueva.getText());
				ArchivoContrasena guardaDato = new ArchivoContrasena();
				ArrayList<String[]> listado = guardaDato.lectura();
				actual = EventsAdmin.encriptarContrasena(actual);
				nueva = EventsAdmin.encriptarContrasena(nueva);
				for (int i=0;i <listado.size();i++){
					String[] dato = listado.get(i);
					
					if(dato[0].equals(usuCambiar) && Float.parseFloat(dato[1]) == actual){
						dato[1] = Float.toString(nueva);
						listado.set(i, dato);
						resaux = true;
					}
				}
				respuesta = guardaDato.escribir(listado);
				if(resaux && respuesta){
					lblRespuesta.setForeground(Color.GREEN);
					lblRespuesta.setText("Contrasena Actualizada Correctamente");
					textField_Usuario.setText("");
					JPasswordField_ContrasenaActual.setText("");
					JPasswordField_ContrasenaNueva.setText("");
															
				}else{
					lblRespuesta.setForeground(Color.RED);
					lblRespuesta.setText("No se pueden actualizar los datos");
					textField_Usuario.setText("");
					JPasswordField_ContrasenaActual.setText("");
					JPasswordField_ContrasenaNueva.setText("");
				}
			}
			});		
		
		
	}
}
