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

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 * @author JUDIT
 *
 */

public class ModuloIntitucionesEducacionSuperior extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModuloIntitucionesEducacionSuperior frame = new ModuloIntitucionesEducacionSuperior();
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
	public ModuloIntitucionesEducacionSuperior() {
		setTitle("MODULO INSTITUCIONES DE EDUCACI\u00D3N SUPERIOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("images/Logo_TCBAPP2.png")));
		label.setBounds(10, 11, 107, 91);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("TU CARRERA EN BOYAC\u00C1 APP");
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		label_1.setBounds(139, 31, 282, 40);
		contentPane.add(label_1);
		
		JLabel lblModulloInstitucionesDe = new JLabel("Modulo de Instituciones de ");
		lblModulloInstitucionesDe.setForeground(new Color(0, 0, 128));
		lblModulloInstitucionesDe.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lblModulloInstitucionesDe.setBounds(167, 52, 241, 40);
		contentPane.add(lblModulloInstitucionesDe);
		
		JLabel lblEducacinSuperior = new JLabel(" Educaci\u00F3n Superior");
		lblEducacinSuperior.setForeground(new Color(0, 0, 128));
		lblEducacinSuperior.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lblEducacinSuperior.setBounds(191, 70, 178, 40);
		contentPane.add(lblEducacinSuperior);
		
		JLabel lblNewLabel = new JLabel("ID Instituciones de Educaci\u00F3n Superior");
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNewLabel.setBounds(20, 133, 225, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombreInstitucionesDe = new JLabel("Nombre Instituciones de Educaci\u00F3n Superior");
		lblNombreInstitucionesDe.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNombreInstitucionesDe.setBounds(20, 162, 273, 25);
		contentPane.add(lblNombreInstitucionesDe);
		
		JLabel lblUrlInstitucionesDe = new JLabel("URL Instituciones de Educaci\u00F3n Superior");
		lblUrlInstitucionesDe.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblUrlInstitucionesDe.setBounds(20, 198, 241, 25);
		contentPane.add(lblUrlInstitucionesDe);
		
		textField = new JTextField();
		textField.setBounds(284, 165, 179, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(284, 136, 179, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(284, 198, 179, 20);
		contentPane.add(textField_2);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(this.getClass().getResource("images/btnExit.PNG")));
		button_1.setBounds(20, 237, 88, 25);
		button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MenuAdmin.main(null);				
			}
		});
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(this.getClass().getResource("images/add.png")));
		button_2.setBounds(152, 230, 32, 32);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(this.getClass().getResource("images/reload.png")));
		button_3.setBounds(226, 234, 32, 28);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(this.getClass().getResource("images/save.png")));
		button_4.setBounds(305, 229, 32, 33);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setIcon(new ImageIcon(this.getClass().getResource("images/delete.png")));
		button_5.setBounds(376, 229, 32, 33);
		contentPane.add(button_5);
	}

}