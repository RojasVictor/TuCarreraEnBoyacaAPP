/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JTextField;

import tuCarreraBoyacaAPP.logica.InstitucionEducacionSuperior;

/**
 * @author JUDIT
 *
 */

public class ModuloInstitucionesEducacionSuperior extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
			
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(294, 238, 169, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(293, 196, 169, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(294, 155, 169, 20);
		contentPane.add(textField_3);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(this.getClass().getResource("images/regresar.png")));
		button.setBounds(40, 279, 87, 41);
		button.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MenuAdmin.main(null);				
			}
			});
			contentPane.add(button);

		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(this.getClass().getResource("images/add.png")));
		button_1.setBounds(164, 279, 45, 41);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(this.getClass().getResource("images/reload.png")));
		button_2.setBounds(251, 279, 45, 41);
		contentPane.add(button_2);	
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(this.getClass().getResource("images/save.png")));
		button_3.setBounds(336, 279, 45, 41);
		contentPane.add(button_3);
			
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(this.getClass().getResource("images/delete.png")));
		button_4.setBounds(418, 279, 45, 41);
		contentPane.add(button_4);
		
		}
}