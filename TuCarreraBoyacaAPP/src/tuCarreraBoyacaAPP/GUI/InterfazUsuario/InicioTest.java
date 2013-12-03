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
		setBounds(100, 100, 295, 487);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		
		JLabel lbl_TituloPrincipal = new JLabel("");
		lbl_TituloPrincipal.setIcon(new ImageIcon(this.getClass().getResource("Images/TituloPrincipal.png")));
		lbl_TituloPrincipal.setBounds(0, 0, 295, 75);
		contentPane.add(lbl_TituloPrincipal);

		JLabel lbl_Titulo = new JLabel("TEST VOCACIONAL");
		lbl_Titulo.setForeground(new Color(25, 25, 112));
		lbl_Titulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lbl_Titulo.setBounds(50, 98, 165, 14);
		getContentPane().add(lbl_Titulo);
		
		JLabel lbl_ImagenVocacional = new JLabel("");
		lbl_ImagenVocacional.setIcon(new ImageIcon(this.getClass().getResource("Images/imagen_opcion.png")));
		lbl_ImagenVocacional.setBounds(225, 88, 46, 38);
		getContentPane().add(lbl_ImagenVocacional);
		
		JLabel lblNewLabel = new JLabel("Te gustaría estudiar en Boyacá, pero no  sabes");
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 152, 275, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSabesQue = new JLabel("aun que?");
		lblSabesQue.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblSabesQue.setBounds(10, 164, 249, 14);
		contentPane.add(lblSabesQue);
		
		JLabel lblNewLabel_1 = new JLabel("Esta aplicación te puede ayudar, mostrandote");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 191, 275, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblLosPosiblesProgramas = new JLabel("los posibles programas académicos de acuerdo");
		lblLosPosiblesProgramas.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblLosPosiblesProgramas.setBounds(10, 209, 275, 14);
		contentPane.add(lblLosPosiblesProgramas);
		
		JLabel lblTusFortalezasTambien = new JLabel("con tus fortalezas. También te mostraran las ");
		lblTusFortalezasTambien.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblTusFortalezasTambien.setBounds(10, 226, 275, 14);
		contentPane.add(lblTusFortalezasTambien);
		
		JLabel lblInstitucionesDeEducacin = new JLabel("posibles instituciones de educación superior que ");
		lblInstitucionesDeEducacin.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblInstitucionesDeEducacin.setBounds(10, 243, 275, 14);
		contentPane.add(lblInstitucionesDeEducacin);
		
		JLabel lblInstitucionelProgramaY = new JLabel("ofrecen el programa y que estan avaladas ");
		lblInstitucionelProgramaY.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblInstitucionelProgramaY.setBounds(10, 261, 275, 14);
		contentPane.add(lblInstitucionelProgramaY);
		
		JLabel lblPorElMinisterio = new JLabel("por el ministerio de educación. ");
		lblPorElMinisterio.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblPorElMinisterio.setBounds(10, 278, 275, 14);
		contentPane.add(lblPorElMinisterio);
		
		JLabel lbl_nombre = new JLabel("¿Como te llamas?");
		lbl_nombre.setForeground(new Color(128, 0, 0));
		lbl_nombre.setFont(new Font("Berlin Sans FB", Font.BOLD, 16));
		lbl_nombre.setBounds(108, 322, 133, 29);
		contentPane.add(lbl_nombre);

		JLabel lblEsperasParaIniciar = new JLabel("Que esperas ");
		lblEsperasParaIniciar.setForeground(new Color(128, 0, 0));
		lblEsperasParaIniciar.setFont(new Font("Berlin Sans FB", Font.BOLD, 16));
		lblEsperasParaIniciar.setBounds(108, 439, 115, 14);
		contentPane.add(lblEsperasParaIniciar);
		
		JLabel lblParaIniciar = new JLabel("para iniciar");
		lblParaIniciar.setForeground(new Color(128, 0, 0));
		lblParaIniciar.setFont(new Font("Berlin Sans FB", Font.BOLD, 16));
		lblParaIniciar.setBounds(108, 451, 105, 14);
		contentPane.add(lblParaIniciar);
		
		JLabel lbl_imagennombre = new JLabel("");
		lbl_imagennombre.setIcon(new ImageIcon(this.getClass().getResource("Images/imgaen_infoUsuario.png")));
		lbl_imagennombre.setBounds(50, 322, 48, 37);
		contentPane.add(lbl_imagennombre);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setBounds(50, 364, 191, 29);
		contentPane.add(txt_Nombre);
		txt_Nombre.setColumns(10);
		
		JButton btn_Regresar = new JButton("");
		btn_Regresar.setIcon(new ImageIcon(this.getClass().getResource("Images/btb_regresar.png")));
		btn_Regresar.setBounds(10, 423, 60, 53);
		contentPane.add(btn_Regresar);
		btn_Regresar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MenuPrincipal.main(null);				
			}
			});
			contentPane.add(btn_Regresar);
		
		JButton btn_IniciarTest = new JButton("");
		btn_IniciarTest.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_IniciarTest.png")));
		btn_IniciarTest.setBounds(225, 423, 60, 53);
		contentPane.add(btn_IniciarTest);
		
		JLabel lbl_panelBotones = new JLabel("");
		lbl_panelBotones.setIcon(new ImageIcon(this.getClass().getResource("Images/panel.png")));
		lbl_panelBotones.setBounds(0, 415, 295, 83);
		contentPane.add(lbl_panelBotones);

	}
}

