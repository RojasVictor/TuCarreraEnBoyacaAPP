/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazUsuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

/**
 * @author harold_patino
 * @author JUDIT
 *
 */
public class EstadisticaPreguntas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstadisticaPreguntas frame = new EstadisticaPreguntas();
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
	public EstadisticaPreguntas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 293, 580);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("Images/celularfondo.png")));
		label.setBounds(-9, 0, 302, 580);
		contentPane.add(label);
		
		JButton btn_regresar = new JButton("");
		btn_regresar.setIcon(new ImageIcon(this.getClass().getResource("Images/btb_regresar.png")));
		btn_regresar.setBounds(33, 428, 54, 54);
		contentPane.add(btn_regresar);
		btn_regresar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				FiltroPreguntas.main(null);				
			}
			});
		JScrollPane panel=new JScrollPane();
		//---------------------------------------------------------------------------------------------------------------//
		JLabel lblTextoDeLa = new JLabel("Para poder instalar un programa de computador debe tener:");
		lblTextoDeLa.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		lblTextoDeLa.setBounds(20, 224, 234, 15);
		contentPane.add(lblTextoDeLa);
		
		ButtonGroup grupo=new ButtonGroup();
		JRadioButton rdbtn_Opcion1 = new JRadioButton("Un usuario que sepa realizar la instalacion del sistema operativo");
		rdbtn_Opcion1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		rdbtn_Opcion1.setBounds(20, 270, 234, 23);
		contentPane.add(rdbtn_Opcion1);
		
		JRadioButton rdbtn_Opcion2 = new JRadioButton("Un disco duro donde se albergue el sistema operativo");
		rdbtn_Opcion2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		rdbtn_Opcion2.setBounds(20, 297, 234, 23);
		contentPane.add(rdbtn_Opcion2);
		
		JRadioButton rdbtn_Opcion3 = new JRadioButton("Unos parlantes");
		rdbtn_Opcion3.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		rdbtn_Opcion3.setBounds(20, 324, 234, 23);
		contentPane.add(rdbtn_Opcion3);
		
		JRadioButton rdbtn_Opcion4 = new JRadioButton("Conexion a una red");
		rdbtn_Opcion4.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		rdbtn_Opcion4.setBounds(20, 351, 234, 23);
		contentPane.add(rdbtn_Opcion4);
		
		grupo.add(rdbtn_Opcion2);
		grupo.add(rdbtn_Opcion3);
		grupo.add(rdbtn_Opcion1);
		grupo.add(rdbtn_Opcion4);
		
		panel.add(lblTextoDeLa);
		panel.add(rdbtn_Opcion1);
		panel.add(rdbtn_Opcion2);
		panel.add(rdbtn_Opcion3);
		panel.add(rdbtn_Opcion4);
		//---------------------------------------------------------------------------------------------------------------//
				JLabel lblTextDos = new JLabel("La formula para hallar el area de un cuadrado es:");
				lblTextoDeLa.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
				lblTextoDeLa.setBounds(20, 224, 234, 15);
				contentPane.add(lblTextDos);
				
				ButtonGroup grupo2=new ButtonGroup();
				JRadioButton rdbtn_Opcion5 = new JRadioButton("lado * lado");
				rdbtn_Opcion1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
				rdbtn_Opcion1.setBounds(20, 270, 234, 23);
				contentPane.add(rdbtn_Opcion5);
				
				JRadioButton rdbtn_Opcion6 = new JRadioButton("lado + lado");
				rdbtn_Opcion2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
				rdbtn_Opcion2.setBounds(20, 297, 234, 23);
				contentPane.add(rdbtn_Opcion6);
				
				JRadioButton rdbtn_Opcion7 = new JRadioButton("lado * 3pi");
				rdbtn_Opcion3.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
				rdbtn_Opcion3.setBounds(20, 324, 234, 23);
				contentPane.add(rdbtn_Opcion7);
				
				JRadioButton rdbtn_Opcion8 = new JRadioButton("lado - (lado+3)");
				rdbtn_Opcion4.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
				rdbtn_Opcion4.setBounds(20, 351, 234, 23);
				contentPane.add(rdbtn_Opcion8);
				
				grupo2.add(rdbtn_Opcion5);
				grupo2.add(rdbtn_Opcion6);
				grupo2.add(rdbtn_Opcion7);
				grupo2.add(rdbtn_Opcion8);
				
		//---------------------------------------------------------------------------------------------------------------//
				JLabel lblTextTres = new JLabel("Cual es la formula quimica del agua:");
				lblTextoDeLa.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
				lblTextoDeLa.setBounds(20, 224, 234, 15);
				contentPane.add(lblTextTres);
				
				ButtonGroup grupo3=new ButtonGroup();
				JRadioButton rdbtn_Opcion9 = new JRadioButton("HCCHO");
				rdbtn_Opcion1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
				rdbtn_Opcion1.setBounds(20, 270, 234, 23);
				contentPane.add(rdbtn_Opcion9);
				
				JRadioButton rdbtn_Opcion10 = new JRadioButton("H2O4");
				rdbtn_Opcion2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
				rdbtn_Opcion2.setBounds(20, 297, 234, 23);
				contentPane.add(rdbtn_Opcion10);
				
				JRadioButton rdbtn_Opcion11 = new JRadioButton("H2O");
				rdbtn_Opcion3.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
				rdbtn_Opcion3.setBounds(20, 324, 234, 23);
				contentPane.add(rdbtn_Opcion11);
				
				JRadioButton rdbtn_Opcion12 = new JRadioButton("LIOH");
				rdbtn_Opcion4.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
				rdbtn_Opcion4.setBounds(20, 351, 234, 23);
				contentPane.add(rdbtn_Opcion12);
				
				grupo3.add(rdbtn_Opcion9);
				grupo3.add(rdbtn_Opcion10);
				grupo3.add(rdbtn_Opcion11);
				grupo3.add(rdbtn_Opcion12);
				
		//---------------------------------------------------------------------------------------------------------------//
				JLabel lblTextCuatro = new JLabel("Quien planteo la ley de la relatividad:");
				lblTextoDeLa.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
				lblTextoDeLa.setBounds(20, 224, 234, 15);
				contentPane.add(lblTextCuatro);
				
				ButtonGroup grupo4=new ButtonGroup();
				JRadioButton rdbtn_Opcion13 = new JRadioButton("Albert Einstein");
				rdbtn_Opcion1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
				rdbtn_Opcion1.setBounds(20, 270, 234, 23);
				contentPane.add(rdbtn_Opcion13);
				
				JRadioButton rdbtn_Opcion14 = new JRadioButton("Isaac Newton");
				rdbtn_Opcion2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
				rdbtn_Opcion2.setBounds(20, 297, 234, 23);
				contentPane.add(rdbtn_Opcion14);
				
				JRadioButton rdbtn_Opcion15 = new JRadioButton("Nicolay Tesla");
				rdbtn_Opcion3.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
				rdbtn_Opcion3.setBounds(20, 324, 234, 23);
				contentPane.add(rdbtn_Opcion15);
				
				JRadioButton rdbtn_Opcion16 = new JRadioButton("Friederich Von Del Haum");
				rdbtn_Opcion4.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
				rdbtn_Opcion4.setBounds(20, 351, 234, 23);
				contentPane.add(rdbtn_Opcion16);
				
				grupo2.add(rdbtn_Opcion13);
				grupo2.add(rdbtn_Opcion14);
				grupo2.add(rdbtn_Opcion15);
				grupo2.add(rdbtn_Opcion16);
		JButton btn_siguiente = new JButton();
		btn_siguiente.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_siguiente.png")));
		btn_siguiente.setBounds(219, 428, 54, 54);
		contentPane.add(btn_siguiente);
		btn_siguiente.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				ResultadosTest.main(null);				
			}
			});

		JLabel lbl_SubTitutlo = new JLabel("Test Vocacional");
		lbl_SubTitutlo.setForeground(new Color(25, 25, 112));
		lbl_SubTitutlo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_SubTitutlo.setBounds(54, 170, 145, 23);
		contentPane.add(lbl_SubTitutlo);
		
		JLabel lbl_imagenVocaional = new JLabel("");
		lbl_imagenVocaional.setIcon(new ImageIcon(this.getClass().getResource("Images/imagen_opcion.png")));
		lbl_imagenVocaional.setBounds(208, 159, 46, 34);
		contentPane.add(lbl_imagenVocaional);
		
		contentPane.add(panel);
		
		JLabel lbl_TituloPrincipal = new JLabel("");
		lbl_TituloPrincipal.setIcon(new ImageIcon(this.getClass().getResource("Images/TituloPrincipal.png")));
		lbl_TituloPrincipal.setBounds(0, 71, 284, 75);
		contentPane.add(lbl_TituloPrincipal);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(this.getClass().getResource("Images/panel.png")));
		label_1.setBounds(0, 419, 285, 75);
		contentPane.add(label_1);

	}
}
