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
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;

/**
 * @author JUDIT
 *
 */
public class FiltroPreguntas extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FiltroPreguntas frame = new FiltroPreguntas();
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
	public FiltroPreguntas() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 584);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 305, 585);
		label.setIcon(new ImageIcon(this.getClass().getResource("Images/celularfondo.png")));
		contentPane.add(label);
		
		JButton btn_regresar = new JButton("");
		btn_regresar.setIcon(new ImageIcon(this.getClass().getResource("Images/btb_regresar.png")));
		btn_regresar.setBounds(33, 432, 60, 58);
		contentPane.add(btn_regresar);
		btn_regresar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				InicioTest.main(null);				
			}
		});
		
		JButton btn_siguiente = new JButton("");
		btn_siguiente.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_siguiente.png")));
		btn_siguiente.setBounds(222, 432, 60, 58);
		contentPane.add(btn_siguiente);
		btn_siguiente.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				VistaPreguntas.main(null);				
			}
		});
		
		JLabel lbl_SubTitulo = new JLabel("TEST VOCACIONAL");
		lbl_SubTitulo.setForeground(new Color(25, 25, 112));
		lbl_SubTitulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lbl_SubTitulo.setBounds(44, 171, 165, 14);
		contentPane.add(lbl_SubTitulo);
		
		JLabel lbl_imagenVocacional = new JLabel("");
		lbl_imagenVocacional.setIcon(new ImageIcon(this.getClass().getResource("Images/imagen_opcion.png")));
		lbl_imagenVocacional.setBounds(222, 163, 46, 38);
		contentPane.add(lbl_imagenVocacional);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(this.getClass().getResource("Images/panel.png")));
		label_4.setBounds(10, 426, 285, 75);
		contentPane.add(label_4);
		
		JLabel lbl_Titulo = new JLabel("");
		lbl_Titulo.setIcon(new ImageIcon(this.getClass().getResource("Images/TituloPrincipal.png")));
		lbl_Titulo.setBounds(10, 77, 295, 75);
		contentPane.add(lbl_Titulo);
		
		JLabel lbl_Enunciado = new JLabel("Enunciado");
		lbl_Enunciado.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		lbl_Enunciado.setBounds(44, 220, 224, 30);
		contentPane.add(lbl_Enunciado);
		
		JRadioButton rdbtnSi = new JRadioButton("SI");
		rdbtnSi.setToolTipText("");
		rdbtnSi.setSelected(true);
		rdbtnSi.setBackground(Color.WHITE);
		rdbtnSi.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		rdbtnSi.setBounds(44, 283, 60, 23);
		contentPane.add(rdbtnSi);
		
		JRadioButton rdbtnNo = new JRadioButton("NO");
		rdbtnNo.setBackground(Color.WHITE);
		rdbtnNo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		rdbtnNo.setBounds(164, 283, 60, 23);
		contentPane.add(rdbtnNo);
		
		JLabel label_5 = new JLabel("Enunciado");
		label_5.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		label_5.setBounds(44, 329, 224, 30);
		contentPane.add(label_5);
		
		JRadioButton radioButton = new JRadioButton("SI");
		radioButton.setToolTipText("");
		radioButton.setSelected(true);
		radioButton.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		radioButton.setBackground(Color.WHITE);
		radioButton.setBounds(44, 392, 60, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("NO");
		radioButton_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		radioButton_1.setBackground(Color.WHITE);
		radioButton_1.setBounds(164, 392, 60, 23);
		contentPane.add(radioButton_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(278, 151, 17, 273);
		contentPane.add(scrollBar);
	
	}
}
