
package tuCarreraBoyacaAPP.GUI.InterfazAdmin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author JUDIT
 *
 */
public class MenuAdmin extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdmin frame = new MenuAdmin();
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
	public MenuAdmin() {
		setTitle("Menú Administrador");
		setIconImage(Toolkit.getDefaultToolkit().getImage(IniciarSesion.class.getResource("/tuCarreraBoyacaAPP/GUI/InterfazAdmin/Images/ingreso.png")));
		//setIconImage(Toolkit.getDefaultToolkit().getImage(IniciarSesion.class.getResource("/tuCarreraBoyacaAPP/GUI/InterfazAdmin/Images/modulo_admin.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		
		JLabel label = new JLabel("");
		ImageIcon imagen1 =new ImageIcon(this.getClass().getResource("Images/LogoPrincipal_TCBAPP.png"));
		label.setIcon(imagen1);
		label.setBounds(10, 11, 120, 81);
		contentPane.add(label);
		
		JButton btn_IES = new JButton("");
		ImageIcon imagen2 =new ImageIcon(this.getClass().getResource("Images/btn_IES.png"));
		btn_IES.setIcon(imagen2);
		btn_IES.setBounds(178, 115, 384, 42);
		contentPane.add(btn_IES);
		btn_IES.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ModuloInstitucionesEducacionSuperior.main(null);				
			}
		});
		
		JButton btn_ProgramasAcademicos = new JButton("");
		ImageIcon imagen3 =new ImageIcon(this.getClass().getResource("Images/btn_Programas.png"));
		btn_ProgramasAcademicos.setIcon(imagen3);
		btn_ProgramasAcademicos.setBounds(178, 168, 384, 42);
		contentPane.add(btn_ProgramasAcademicos);
		btn_ProgramasAcademicos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ModuloProgramaAcademico.main(null);				
			}
		});
		
		JButton btn_Preguntas = new JButton("");
		ImageIcon imagen4 =new ImageIcon(this.getClass().getResource("Images/btn_Preguntas.png"));
		btn_Preguntas.setIcon(imagen4);
		btn_Preguntas.setBounds(178, 221, 384, 41);
		contentPane.add(btn_Preguntas);
		btn_Preguntas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				ModuloPreguntas.main(null);
			}
		});			
		
		JButton btn_Regresar = new JButton("");
		ImageIcon imagen5 =new ImageIcon(this.getClass().getResource("Images/btn_CerrearSesion.png"));
		btn_Regresar.setIcon(imagen5);
		btn_Regresar.setBounds(10, 221, 158, 41);
		contentPane.add(btn_Regresar);
		btn_Regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				IniciarSesion.main(null);
				
			}
		});
		
		JButton btn_CambioContrasena = new JButton("");
		btn_CambioContrasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CambiarContrasena.main(null);
				
				
			}
		});
		
		ImageIcon imagen6 =new ImageIcon(this.getClass().getResource("Images/btn_CambiarContraseña.png"));
		btn_CambioContrasena.setIcon(imagen6);
		btn_CambioContrasena.setBounds(10, 123, 74, 81);
		contentPane.add(btn_CambioContrasena);
		
		JButton btn_Reportes = new JButton("");
		ImageIcon imagen7 =new ImageIcon(this.getClass().getResource("Images/btn_Reporte.png"));
		btn_Reportes.setIcon(imagen7);
		btn_Reportes.setBounds(92, 123, 68, 81);
		contentPane.add(btn_Reportes);
		btn_Reportes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				ModuloReportes.main(null);
			}
		});
		
		JLabel lbl_Titulo = new JLabel("TU CARRERA EN BOYACÁ APP");
		lbl_Titulo.setForeground(new Color(25, 25, 112));
		lbl_Titulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_Titulo.setBounds(195, 22, 298, 26);
		contentPane.add(lbl_Titulo);
		
		JLabel lbl_SubTitulo = new JLabel("Menú Administrador");
		lbl_SubTitulo.setForeground(new Color(25, 25, 112));
		lbl_SubTitulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		lbl_SubTitulo.setBounds(241, 66, 215, 26);
		contentPane.add(lbl_SubTitulo);
	}
}
