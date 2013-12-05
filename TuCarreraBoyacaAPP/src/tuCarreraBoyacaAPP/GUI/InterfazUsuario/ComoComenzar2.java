/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazUsuario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @author JUDIT
 *
 */
public class ComoComenzar2 extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComoComenzar2 frame = new ComoComenzar2();
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
	public ComoComenzar2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 303, 568);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(this.getClass().getResource("Images/celularfondo.png")));
		label_1.setBounds(0, 0, 307, 570);
		contentPane.add(label_1);

		JLabel lbl_TituloPrincipal = new JLabel("");
		lbl_TituloPrincipal.setIcon(new ImageIcon(this.getClass().getResource("Images/TituloPrincipal.png")));
		lbl_TituloPrincipal.setBounds(2, 67, 295, 75);
		contentPane.add(lbl_TituloPrincipal);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("Images/imagen_estMujer.png")));
		label.setBounds(18, 159, 55, 34);
		contentPane.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 307, 1, 2);
		contentPane.add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(18, 377, 269, 2);
		contentPane.add(separator_2);
		
		JLabel lblEnLaSiguiente = new JLabel("En la siguiente pantalla se te mostraran las ");
		lblEnLaSiguiente.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblEnLaSiguiente.setBounds(20, 219, 277, 14);
		contentPane.add(lblEnLaSiguiente);
		
		JLabel lblPrimerasPreguntasLas = new JLabel("primeras preguntas de las cuales deberas selec-");
		lblPrimerasPreguntasLas.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblPrimerasPreguntasLas.setBounds(20, 229, 277, 14);
		contentPane.add(lblPrimerasPreguntasLas);
		
		JLabel lblS = new JLabel("cionar si o no. En las suiente pantalla se mostran");
		lblS.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblS.setBounds(20, 242, 277, 14);
		contentPane.add(lblS);
		
		JLabel lblPreguntasYaFiltradas = new JLabel("preguntas ya filtradas.");
		lblPreguntasYaFiltradas.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblPreguntasYaFiltradas.setBounds(20, 254, 277, 14);
		contentPane.add(lblPreguntasYaFiltradas);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(20, 279, 267, 2);
		contentPane.add(separator_3);
		
		JLabel lblCuandoTermineDe = new JLabel("Cuando termine de responder, se le mostraran");
		lblCuandoTermineDe.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblCuandoTermineDe.setBounds(20, 289, 277, 14);
		contentPane.add(lblCuandoTermineDe);
		
		JLabel lblLosPosiblesProgramas = new JLabel("los posibles programas y instituciones. Usted");
		lblLosPosiblesProgramas.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblLosPosiblesProgramas.setBounds(20, 302, 277, 14);
		contentPane.add(lblLosPosiblesProgramas);
		
		JLabel lblPodraSeleccionarPara = new JLabel("podra seleccionar para mirar mas informacion ");
		lblPodraSeleccionarPara.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblPodraSeleccionarPara.setBounds(20, 314, 277, 14);
		contentPane.add(lblPodraSeleccionarPara);
		
		JLabel lblSeleccionandoCadaPrograma = new JLabel("seleccionando cada programa que le arrojara");
		lblSeleccionandoCadaPrograma.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblSeleccionandoCadaPrograma.setBounds(20, 327, 277, 14);
		contentPane.add(lblSeleccionandoCadaPrograma);
		
		JLabel lblUnaInstitucion = new JLabel("una institucion.");
		lblUnaInstitucion.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblUnaInstitucion.setBounds(20, 339, 277, 14);
		contentPane.add(lblUnaInstitucion);
		
		JLabel lblGracias = new JLabel("GRACIAS POR TENER NUSTRA APLICACIÓN");
		lblGracias.setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
		lblGracias.setBounds(20, 352, 252, 27);
		contentPane.add(lblGracias);
		
		JButton btn_regresar = new JButton("");
		btn_regresar.setIcon(new ImageIcon(this.getClass().getResource("Images/btb_regresar.png")));
		btn_regresar.setBounds(25, 420, 55, 59);
		contentPane.add(btn_regresar);
		btn_regresar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MenuPrincipal.main(null);				
			}
		});
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(this.getClass().getResource("Images/Logo_TCBAPP.png")));
		label_2.setBounds(115, 373, 167, 120);
		contentPane.add(label_2);
	}
}