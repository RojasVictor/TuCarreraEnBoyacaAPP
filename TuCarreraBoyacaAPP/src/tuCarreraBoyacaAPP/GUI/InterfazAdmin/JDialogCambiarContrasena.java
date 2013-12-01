/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JWindow;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;


/**
 * @author FABIO
 *
 */
public class JDialogCambiarContrasena extends JDialog{
	
	//Attributes ------------------------------------
	private JTextField textField_ContrasenaActual;
	private JTextField textField_ContrasenaNueva;
	private JLabel lblRespuesta; 
	
	//Building -----------------------------------------------------------------------
	public JDialogCambiarContrasena (){
		setTitle("Cambiar Contrase\u00F1a");
		setSize(360, 340);
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
		lblContrasenaActual.setBounds(30, 100, 138, 27);
		getContentPane().add(lblContrasenaActual);
		
		JLabel lblContrasenaNueva = new JLabel("Contrase\u00F1a Nueva");
		lblContrasenaNueva.setBounds(30, 140, 138, 27);
		lblContrasenaNueva.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		getContentPane().add(lblContrasenaNueva);
		
		JButton btn_Regresar = new JButton("");
		btn_Regresar.setBounds(64, 238, 104, 46);
		btn_Regresar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Regresar.png")));
		getContentPane().add(btn_Regresar);
		btn_Regresar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();				
			}
			});
		getContentPane().add(btn_Regresar);
		
		textField_ContrasenaActual = new JTextField();
		textField_ContrasenaActual.setBounds(178, 100, 135, 27);
		getContentPane().add(textField_ContrasenaActual);
		textField_ContrasenaActual.setColumns(10);
		
		textField_ContrasenaNueva = new JTextField();
		textField_ContrasenaNueva.setBounds(178, 142, 135, 27);
		getContentPane().add(textField_ContrasenaNueva);
		textField_ContrasenaNueva.setColumns(10);
		
		JButton btn_Guardar = new JButton("");
		btn_Guardar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Guardar.png")));
		btn_Guardar.setBounds(227, 226, 64, 66);
		getContentPane().add(btn_Guardar);
		
		lblRespuesta = new JLabel("");
		lblRespuesta.setHorizontalAlignment(SwingConstants.CENTER);
		lblRespuesta.setBounds(30, 185, 283, 30);
		lblRespuesta.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		getContentPane().add(lblRespuesta);
		
		btn_Guardar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//EventsAdmin evento = new EventsAdmin();
				String actual = textField_ContrasenaActual.getText();
				String nueva = textField_ContrasenaNueva.getText();
				/*if(evento.cambiarContraseña(actual, nueva)){
					lblRespuesta.setForeground(Color.GREEN);
					lblRespuesta.setText("Contraseña Actualizada Correctamente");
				}else{
					lblRespuesta.setForeground(Color.RED);
					lblRespuesta.setText("Contraseña Actual Incorrecta");
				}*/
			}
			});		
	}

}
