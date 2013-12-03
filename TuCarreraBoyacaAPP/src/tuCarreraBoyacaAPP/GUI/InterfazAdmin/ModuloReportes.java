/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;

/**
 * @author Victor_Rojas
 *
 */
public class ModuloReportes extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModuloReportes frame = new ModuloReportes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ModuloReportes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("Images/modulo_reportes.png")));
		setTitle("MODULO REPORTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("Images/LogoPrincipal_TCBAPP.png")));
		label.setBounds(7, 11, 121, 95);
		contentPane.add(label);

		JLabel lbl_Titulo = new JLabel("TU CARRERA EN BOYACÁ APP");
		lbl_Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Titulo.setForeground(new Color(0, 0, 128));
		lbl_Titulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_Titulo.setBounds(138, 23, 321, 40);
		contentPane.add(lbl_Titulo);
		
		JLabel lbl_SubTitulo = new JLabel("Modulo de Reportes");
		lbl_SubTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_SubTitulo.setForeground(new Color(0, 0, 128));
		lbl_SubTitulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_SubTitulo.setBounds(160, 66, 247, 40);
		contentPane.add(lbl_SubTitulo);
		
		JButton btnRegresar = new JButton("");
		btnRegresar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Regresar.png")));
		btnRegresar.setBounds(51, 361, 114, 40);
		btnRegresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				MenuAdmin.main(null);				
			}
		});
		contentPane.add(btnRegresar);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Generar.png")));
		button.setBounds(329, 369, 114, 32);
		contentPane.add(button);
		
		JComboBox cmbBox_Modulos = new JComboBox();
		cmbBox_Modulos.setModel(new DefaultComboBoxModel(new String[] {"Listar Programas Academicos", "Listar Instituciones de Educacion Superior", "Listar Preguntas"}));
		cmbBox_Modulos.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		cmbBox_Modulos.setToolTipText("");
		cmbBox_Modulos.setBounds(51, 124, 392, 32);
		contentPane.add(cmbBox_Modulos);
		
		table = new JTable();
		
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(51, 167, 392, 183);
		scrollPane.setViewportView(table);
		
		contentPane.add(scrollPane);
		
	}
}

