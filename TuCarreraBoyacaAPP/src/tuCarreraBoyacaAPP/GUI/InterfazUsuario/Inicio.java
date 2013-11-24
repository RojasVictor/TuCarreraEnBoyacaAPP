/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazUsuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

import tuCarreraBoyacaAPP.GUI.InterfazAdmin.MenuAdmin;


/**
 * @author JUDIT
 *
 */
public class Inicio extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;

/**
 * Launch the application.
 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Inicio frame = new Inicio();
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
public Inicio() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 295, 487);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(255, 255, 255));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel label = new JLabel("");
	label.setIcon(new ImageIcon(this.getClass().getResource("images/titprincipal.png")));
	label.setBounds(0, 0, 295, 42);
	contentPane.add(label);
	
	JLabel label_1 = new JLabel("TEST  VOCACIONAL");
	label_1.setForeground(new Color(0, 0, 139));
	label_1.setFont(new Font("Berlin Sans FB", Font.BOLD, 16));
	label_1.setBounds(72, 69, 156, 29);
	contentPane.add(label_1);
	
	JLabel lblNewLabel = new JLabel("Te gustaría estudiar en Boyacá, pero no  sabes");
	lblNewLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
	lblNewLabel.setBounds(10, 129, 275, 14);
	contentPane.add(lblNewLabel);
	
	JLabel lblSabesQue = new JLabel("aun que?");
	lblSabesQue.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
	lblSabesQue.setBounds(10, 141, 249, 14);
	contentPane.add(lblSabesQue);
	
	JLabel lblNewLabel_1 = new JLabel("Esta aplicación te puede ayudar, mostrandote");
	lblNewLabel_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
	lblNewLabel_1.setBounds(10, 168, 275, 14);
	contentPane.add(lblNewLabel_1);
	
	JLabel lblLosPosiblesProgramas = new JLabel("los posibles programas académicos de acuerdo");
	lblLosPosiblesProgramas.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
	lblLosPosiblesProgramas.setBounds(10, 186, 275, 14);
	contentPane.add(lblLosPosiblesProgramas);
	
	JLabel lblTusFortalezasTambien = new JLabel("con tus fortalezas. También te mostraran las ");
	lblTusFortalezasTambien.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
	lblTusFortalezasTambien.setBounds(10, 203, 275, 14);
	contentPane.add(lblTusFortalezasTambien);
	
	JLabel lblInstitucionesDeEducacin = new JLabel("posibles instituciones de educación superior que ");
	lblInstitucionesDeEducacin.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
	lblInstitucionesDeEducacin.setBounds(10, 220, 275, 14);
	contentPane.add(lblInstitucionesDeEducacin);
	
	JLabel lblInstitucionelProgramaY = new JLabel("ofrecen el programa y que estan avaladas ");
	lblInstitucionelProgramaY.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
	lblInstitucionelProgramaY.setBounds(10, 238, 275, 14);
	contentPane.add(lblInstitucionelProgramaY);
	
	JLabel lblPorElMinisterio = new JLabel("por el ministerio de educación. ");
	lblPorElMinisterio.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
	lblPorElMinisterio.setBounds(10, 255, 275, 14);
	contentPane.add(lblPorElMinisterio);
	
	JLabel lblEsperasParaIniciar = new JLabel("Que esperas ");
	lblEsperasParaIniciar.setForeground(new Color(128, 0, 0));
	lblEsperasParaIniciar.setFont(new Font("Berlin Sans FB", Font.BOLD, 15));
	lblEsperasParaIniciar.setBounds(125, 439, 89, 14);
	contentPane.add(lblEsperasParaIniciar);
	
	JButton button = new JButton("");
	button.setIcon(new ImageIcon(this.getClass().getResource("images/questionario.png")));
	button.setBounds(220, 419, 50, 57);
	contentPane.add(button);
	
	JLabel lblcualEsTu = new JLabel("\u00BFComo te llamas?");
	lblcualEsTu.setForeground(new Color(139, 0, 0));
	lblcualEsTu.setFont(new Font("Berlin Sans FB", Font.BOLD, 16));
	lblcualEsTu.setBounds(95, 318, 133, 29);
	contentPane.add(lblcualEsTu);
	
	textField = new JTextField();
	textField.setBounds(31, 371, 228, 20);
	contentPane.add(textField);
	textField.setColumns(10);
	
	JLabel label_2 = new JLabel("");
	label_2.setIcon(new ImageIcon(this.getClass().getResource("images/options.png")));
	label_2.setBounds(16, 69, 46, 41);
	contentPane.add(label_2);
	
	JLabel label_3 = new JLabel("");
	label_3.setIcon(new ImageIcon(this.getClass().getResource("images/User_info.png")));
	label_3.setBounds(31, 311, 50, 36);
	contentPane.add(label_3);
	
	JButton button_1 = new JButton("");
	button_1.setIcon(new ImageIcon(this.getClass().getResource("images/regresar.png")));
	button_1.setBounds(22, 425, 60, 51);
	contentPane.add(button_1);
	button_1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			MenuPrincipal.main(null);				
		}
		});
		contentPane.add(button_1);
	
	JLabel lblParaIniciar = new JLabel("para iniciar");
	lblParaIniciar.setForeground(new Color(128, 0, 0));
	lblParaIniciar.setFont(new Font("Berlin Sans FB", Font.BOLD, 15));
	lblParaIniciar.setBounds(125, 451, 79, 14);
	contentPane.add(lblParaIniciar);
	
	setUndecorated(true);
	getRootPane().setWindowDecorationStyle(JRootPane.NONE);
	
	
}

}
