/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazUsuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRootPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.SystemColor;

/**
 * @author JUDIT
 *
 */
public class InicioAplicacion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioAplicacion frame = new InicioAplicacion();
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
	public InicioAplicacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 583);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder((Border) new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(this.getClass().getResource("Images/imagen_estMujer.png")));
		label_1.setBounds(174, 257, 54, 36);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(this.getClass().getResource("Images/imagen_estHombre.png")));
		label_2.setBounds(227, 231, 54, 36);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(this.getClass().getResource("Images/imagen_universidad.png")));
		label_3.setBounds(39, 266, 48, 56);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBackground(new Color(224, 255, 255));
		label_4.setIcon(new ImageIcon(this.getClass().getResource("Images/TituloInicio.png")));
		label_4.setBounds(42, 91, 216, 203);
		contentPane.add(label_4);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setIndeterminate(true);
		progressBar.setStringPainted(true);
		progressBar.setForeground(new Color(178, 34, 34));
		progressBar.setBackground(Color.WHITE);
		progressBar.setBounds(41, 448, 230, 27);
		contentPane.add(progressBar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("Images/Logo_Principal.png")));
		label.setBounds(39, 256, 232, 186);
		contentPane.add(label);
		
		
		JLabel label_celular = new JLabel("");
		label_celular.setIcon(new ImageIcon(this.getClass().getResource("Images/celularfondo.png")));
		label_celular.setBounds(0, 0, 305, 583);
		contentPane.add(label_celular);
	}
	
}
		