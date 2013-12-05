/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazUsuario;

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSeparator;

/**
 * @author JUDIT
 *
 */
public class ComoComenzar extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComoComenzar frame = new ComoComenzar();
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
	public ComoComenzar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 299, 581);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(this.getClass().getResource("Images/celularfondo.png")));
		label_2.setBounds(0, 0, 299, 581);
		contentPane.add(label_2);
		
		JLabel lbl_SubTitulo = new JLabel("Como funciona la aplicación");
		lbl_SubTitulo.setForeground(new Color(25, 25, 112));
		lbl_SubTitulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lbl_SubTitulo.setBounds(43, 180, 244, 14);
		contentPane.add(lbl_SubTitulo);
		
		JLabel lblUnaVezCargue = new JLabel("Una vez cargue la pantalla de incio de la");
		lblUnaVezCargue.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblUnaVezCargue.setBounds(22, 208, 244, 14);
		contentPane.add(lblUnaVezCargue);
		
		JLabel lblAplicacinSeMostrara = new JLabel("aplicación se mostrara el menu de la aplicación,");
		lblAplicacinSeMostrara.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblAplicacinSeMostrara.setBounds(22, 222, 277, 14);
		contentPane.add(lblAplicacinSeMostrara);
		
		JLabel lblEnLaQue = new JLabel("en la que podras activar el sonido y  entrar a");
		lblEnLaQue.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblEnLaQue.setBounds(22, 235, 277, 14);
		contentPane.add(lblEnLaQue);
		
		JLabel lblEstaAyudaPara = new JLabel("esta ayuda. Para acceder al inicio del test ");
		lblEstaAyudaPara.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblEstaAyudaPara.setBounds(22, 247, 277, 14);
		contentPane.add(lblEstaAyudaPara);
		
		JLabel lblDeberasSeleccionarEl = new JLabel("deberas seleccionar el boton de ingrear o de lo");
		lblDeberasSeleccionarEl.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblDeberasSeleccionarEl.setBounds(22, 260, 277, 14);
		contentPane.add(lblDeberasSeleccionarEl);
		
		JLabel lblContrarioSiTe = new JLabel("contrario si te equivocaste  podras seleccionar ");
		lblContrarioSiTe.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblContrarioSiTe.setBounds(22, 272, 277, 14);
		contentPane.add(lblContrarioSiTe);
		
		JLabel lblParaAbadonarLa = new JLabel("para abadonar la aplicación.");
		lblParaAbadonarLa.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblParaAbadonarLa.setBounds(22, 285, 190, 14);
		contentPane.add(lblParaAbadonarLa);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("Images/imagen_estMujer.png")));
		label.setBounds(23, 161, 55, 34);
		contentPane.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 307, 1, 2);
		contentPane.add(separator);
		
		JLabel lblUnaVezSelecciones = new JLabel("Una vez selecciones ingresar, te mostrara  la ");
		lblUnaVezSelecciones.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblUnaVezSelecciones.setBounds(20, 321, 277, 14);
		contentPane.add(lblUnaVezSelecciones);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 310, 265, 2);
		contentPane.add(separator_1);
		
		JLabel lblPantallaParaPoder = new JLabel("otra ventana donde deberas ingresar  tu");
		lblPantallaParaPoder.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblPantallaParaPoder.setBounds(20, 336, 244, 14);
		contentPane.add(lblPantallaParaPoder);
		
		JLabel lblNombreSiNo = new JLabel("nombre, si no llenas este campo no se ");
		lblNombreSiNo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNombreSiNo.setBounds(20, 349, 233, 14);
		contentPane.add(lblNombreSiNo);
		
		JLabel lblAContestarEl = new JLabel("te dejara contestar el test. Cuando lo ");
		lblAContestarEl.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblAContestarEl.setBounds(20, 361, 233, 14);
		contentPane.add(lblAContestarEl);
		
		JLabel lblPodrasSeleccionarEl = new JLabel("anterior este listo podras seleccionar ");
		lblPodrasSeleccionarEl.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblPodrasSeleccionarEl.setBounds(20, 374, 223, 14);
		contentPane.add(lblPodrasSeleccionarEl);
		
		JLabel lblImagen = new JLabel("el boton con la siguiente imagen.");
		lblImagen.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblImagen.setBounds(20, 386, 190, 14);
		contentPane.add(lblImagen);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_IniciarTest.png")));
		label_1.setBounds(241, 352, 46, 48);
		contentPane.add(label_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(22, 411, 265, 2);
		contentPane.add(separator_2);
		
		JButton btn_regresar = new JButton("");
		btn_regresar.setIcon(new ImageIcon(this.getClass().getResource("Images/btb_regresar.png")));
		btn_regresar.setBounds(22, 434, 55, 59);
		contentPane.add(btn_regresar);
		btn_regresar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MenuPrincipal.main(null);				
			}
		});
		
		JButton btn_siguiente = new JButton("");
		btn_siguiente.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_siguiente.png")));
		btn_siguiente.setBounds(232, 434, 55, 59);
		contentPane.add(btn_siguiente);
		btn_siguiente.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				ComoComenzar2.main(null);				
			}
		});

		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(this.getClass().getResource("Images/panel.png")));
		label_3.setBounds(11, 423, 289, 75);
		contentPane.add(label_3);
		
		JLabel lbl_TituloPrincipal = new JLabel("");
		lbl_TituloPrincipal.setIcon(new ImageIcon(this.getClass().getResource("Images/TituloPrincipal.png")));
		lbl_TituloPrincipal.setBounds(10, 69, 289, 75);
		contentPane.add(lbl_TituloPrincipal);
	}

}