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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

/**
 * @author harold_patino
 *
 */
public class VistaPreguntas extends JFrame {

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
	public VistaPreguntas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 297, 552);
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
		label.setBounds(-10, -31, 305, 583);
		contentPane.add(label);
		
		JLabel lbl_TituloPrincipal = new JLabel("");
		lbl_TituloPrincipal.setIcon(new ImageIcon(this.getClass().getResource("Images/TituloPrincipal.png")));
		lbl_TituloPrincipal.setBounds(0, 50, 295, 75);
		contentPane.add(lbl_TituloPrincipal);
		
		JLabel lblTextoDeLa = new JLabel("Texto de la Pregunta");
		lblTextoDeLa.setBounds(10, 143, 277, 15);
		contentPane.add(lblTextoDeLa);
		
		
		JRadioButton rdbtnOpcion = new JRadioButton("Opcion1");
		rdbtnOpcion.setBounds(8, 261, 279, 23);
		contentPane.add(rdbtnOpcion);
		
		JRadioButton radioButton = new JRadioButton("Opcion1");
		radioButton.setBounds(8, 288, 279, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Opcion1");
		radioButton_1.setBounds(8, 315, 279, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Opcion1");
		radioButton_2.setBounds(8, 342, 279, 23);
		contentPane.add(radioButton_2);
		
		JButton btnNewButton = new JButton();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setIcon(new ImageIcon(VistaPreguntas.class.getResource("/tuCarreraBoyacaAPP/GUI/InterfazUsuario/Images/btn_siguiente.png")));
		btnNewButton.setBounds(113, 399, 54, 54);
		contentPane.add(btnNewButton);

	}
}
