/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazUsuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import tuCarreraBoyacaAPP.logica.GestionInstitucionesEducacionSuperior;

/**
 * @author JUDIT
 *
 */

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 487);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		
		JLabel lblTest = new JLabel("TEST  VOCACIONAL");
		lblTest.setForeground(new Color(0, 0, 139));
		lblTest.setFont(new Font("Berlin Sans FB", Font.BOLD, 16));
		lblTest.setBounds(72, 69, 156, 29);
		contentPane.add(lblTest);
		
		JLabel lblMenPrincipal = new JLabel("Menú Principal");
		lblMenPrincipal.setForeground(new Color(0, 0, 139));
		lblMenPrincipal.setFont(new Font("Berlin Sans FB", Font.BOLD, 16));
		lblMenPrincipal.setBounds(80, 90, 123, 29);
		contentPane.add(lblMenPrincipal);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(this.getClass().getResource("images/titprincipal.png")));
		label_2.setBounds(0, 0, 295, 42);
		contentPane.add(label_2);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(this.getClass().getResource("images/nina.png")));
		label_6.setBounds(32, 225, 48, 42);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(this.getClass().getResource("images/nino.png")));
		label_7.setBounds(234, 100, 51, 37);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(this.getClass().getResource("images/estudiantes.png")));
		label_8.setBounds(24, 334, 46, 42);
		contentPane.add(label_8);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(this.getClass().getResource("images/Universidad.png")));
		label_10.setBounds(221, 315, 46, 61);
		contentPane.add(label_10);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(this.getClass().getResource("images/options.png")));
		label_5.setBounds(0, 69, 46, 41);
		contentPane.add(label_5);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("images/Logo_TCBAPP.png")));
		label.setBounds(44, 130, 216, 186);
		contentPane.add(label);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(this.getClass().getResource("images/iniciar.png")));
		button_2.setBounds(10, 387, 275, 42);
		contentPane.add(button_2);
		button_2.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Inicio.main(null);				
			}
			});
			contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(this.getClass().getResource("images/salir.png")));
		button_3.setBounds(10, 434, 275, 42);
		contentPane.add(button_3);
		button_3.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				System.exit (0);			
			}
			});
			contentPane.add(button_3);
				
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(this.getClass().getResource("images/help.png")));
		button.setBounds(91, 321, 51, 55);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(this.getClass().getResource("images/sonido.png")));
		button_1.setBounds(152, 321, 51, 55);
		contentPane.add(button_1);
		
	}
}

