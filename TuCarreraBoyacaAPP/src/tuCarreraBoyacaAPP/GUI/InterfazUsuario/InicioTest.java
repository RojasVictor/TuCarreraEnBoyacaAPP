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
public class InicioTest extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioTest frame = new InicioTest();
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
	public InicioTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 583);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);

		JLabel lbl_Titulo = new JLabel("TEST VOCACIONAL");
		lbl_Titulo.setForeground(new Color(25, 25, 112));
		lbl_Titulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lbl_Titulo.setBounds(48, 147, 165, 14);
		getContentPane().add(lbl_Titulo);
		
		JLabel lbl_ImagenVocacional = new JLabel("");
		lbl_ImagenVocacional.setIcon(new ImageIcon(this.getClass().getResource("Images/imagen_opcion.png")));
		lbl_ImagenVocacional.setBounds(223, 140, 46, 38);
		getContentPane().add(lbl_ImagenVocacional);
		
		JLabel lbl_nombre = new JLabel("¿Como te llamas?");
		lbl_nombre.setForeground(new Color(128, 0, 0));
		lbl_nombre.setFont(new Font("Berlin Sans FB", Font.BOLD, 16));
		lbl_nombre.setBounds(106, 347, 133, 29);
		contentPane.add(lbl_nombre);

		JLabel lblEsperasParaIniciar = new JLabel("Que esperas ");
		lblEsperasParaIniciar.setForeground(new Color(128, 0, 0));
		lblEsperasParaIniciar.setFont(new Font("Berlin Sans FB", Font.BOLD, 16));
		lblEsperasParaIniciar.setBounds(116, 459, 98, 14);
		contentPane.add(lblEsperasParaIniciar);
		
		JLabel lblParaIniciar = new JLabel("para iniciar");
		lblParaIniciar.setForeground(new Color(128, 0, 0));
		lblParaIniciar.setFont(new Font("Berlin Sans FB", Font.BOLD, 16));
		lblParaIniciar.setBounds(116, 471, 98, 14);
		contentPane.add(lblParaIniciar);
		
		JLabel lbl_imagennombre = new JLabel("");
		lbl_imagennombre.setIcon(new ImageIcon(this.getClass().getResource("Images/imgaen_infoUsuario.png")));
		lbl_imagennombre.setBounds(48, 347, 48, 37);
		contentPane.add(lbl_imagennombre);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setBounds(48, 387, 191, 29);
		contentPane.add(txt_Nombre);
		txt_Nombre.setColumns(10);
		
		JButton btn_Regresar = new JButton("");
		btn_Regresar.setIcon(new ImageIcon(this.getClass().getResource("Images/btb_regresar.png")));
		btn_Regresar.setBounds(22, 439, 60, 53);
		contentPane.add(btn_Regresar);
		btn_Regresar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MenuPrincipal.main(null);				
			}
			});
		
		JButton btn_IniciarTest = new JButton("");
		btn_IniciarTest.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_IniciarTest.png")));
		btn_IniciarTest.setBounds(212, 439, 60, 53);
		contentPane.add(btn_IniciarTest);
		btn_IniciarTest.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				VistaPreguntas.main(null);				
			}
			});
								
		JLabel label = new JLabel("");
		label.setBackground(Color.WHITE);
		label.setIcon(new ImageIcon(InicioTest.class.getResource("/tuCarreraBoyacaAPP/GUI/InterfazUsuario/Images/celularfondo.png")));
		label.setBounds(-7, 0, 309, 583);
		contentPane.add(label);
								
		JLabel lbl_TituloPrincipal = new JLabel("");
		lbl_TituloPrincipal.setIcon(new ImageIcon(this.getClass().getResource("Images/TituloPrincipal.png")));
		lbl_TituloPrincipal.setBounds(0, 73, 285, 60);
		contentPane.add(lbl_TituloPrincipal);
										
		JLabel label_1 = new JLabel("por el ministerio de educaci\u00F3n. ");
		label_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		label_1.setBounds(10, 315, 275, 14);
		contentPane.add(label_1);
										
		JLabel label_2 = new JLabel("ofrecen el programa y que estan avaladas ");
		label_2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		label_2.setBounds(10, 298, 275, 14);
		contentPane.add(label_2);
										
		JLabel label_3 = new JLabel("posibles instituciones de educaci\u00F3n superior que ");
		label_3.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		label_3.setBounds(10, 280, 275, 14);
		contentPane.add(label_3);
										
		JLabel label_4 = new JLabel("con tus fortalezas. Tambi\u00E9n te mostraran las ");
		label_4.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		label_4.setBounds(10, 263, 275, 14);
		contentPane.add(label_4);
										
		JLabel label_5 = new JLabel("los posibles programas acad\u00E9micos de acuerdo");
		label_5.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		label_5.setBounds(10, 246, 275, 14);
		contentPane.add(label_5);
										
		JLabel label_6 = new JLabel("Esta aplicaci\u00F3n te puede ayudar, mostrandote");
		label_6.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		label_6.setBounds(10, 228, 275, 14);
		contentPane.add(label_6);
										
		JLabel label_7 = new JLabel("aun que?");
		label_7.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		label_7.setBounds(10, 201, 249, 14);
		contentPane.add(label_7);
										
		JLabel label_8 = new JLabel("Te gustar\u00EDa estudiar en Boyac\u00E1, pero no  sabes");
		label_8.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		label_8.setBounds(10, 189, 275, 14);
		contentPane.add(label_8);
										
		JLabel lbl_panelBotones = new JLabel("");
		lbl_panelBotones.setIcon(new ImageIcon(this.getClass().getResource("Images/panel.png")));
		lbl_panelBotones.setBounds(10, 427, 278, 69);
		contentPane.add(lbl_panelBotones);

	}
}