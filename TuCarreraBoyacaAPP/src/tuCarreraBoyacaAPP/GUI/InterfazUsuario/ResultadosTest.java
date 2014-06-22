/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazUsuario;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import tuCarreraBoyacaAPP.logica.GestionPreguntaTest;
import tuCarreraBoyacaAPP.logica.GestionProgramasAcademico;


/**
 * @author JUDIT
 *
 */
public class ResultadosTest extends JFrame {

	private JPanel contentPane;
	private GestionProgramasAcademico gesProgramas; 
	private ArrayList<String[]> resultados;
	private FiltroPreguntas ventanaPreguntas;
	private JRadioButton[][] matrizBotones;
	private Vector<String> categorias;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultadosTest frame = new ResultadosTest(null);
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
	public ResultadosTest(FiltroPreguntas ventana) {

		this.ventanaPreguntas = ventana;
		gesProgramas = new GestionProgramasAcademico();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 297, 581);
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
		label.setBounds(-6, -26, 305, 632);
		contentPane.add(label);		

		JLabel lbl_Titulo = new JLabel("TEST VOCACIONAL");
		lbl_Titulo.setForeground(new Color(25, 25, 112));
		lbl_Titulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lbl_Titulo.setBounds(53, 167, 165, 14);
		contentPane.add(lbl_Titulo);

		JLabel lbl_SubTitulo = new JLabel("Resultados");
		lbl_SubTitulo.setForeground(new Color(25, 25, 112));
		lbl_SubTitulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lbl_SubTitulo.setBounds(88, 191, 104, 14);
		contentPane.add(lbl_SubTitulo);

		JLabel lbl_ImagenVocacional = new JLabel("");
		lbl_ImagenVocacional.setIcon(new ImageIcon(this.getClass().getResource("Images/imagen_opcion.png")));
		lbl_ImagenVocacional.setBounds(229, 167, 46, 38);
		contentPane.add(lbl_ImagenVocacional);

		JLabel lbl_TituloPrincipal = new JLabel("");
		lbl_TituloPrincipal.setIcon(new ImageIcon(this.getClass().getResource("Images/TituloPrincipal.png")));
		lbl_TituloPrincipal.setBounds(2, 75, 295, 75);
		contentPane.add(lbl_TituloPrincipal);

		JLabel lbl_Nombre = new JLabel("Nombre: "+  ventanaPreguntas.getNombreUsuario());
		lbl_Nombre.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		lbl_Nombre.setBounds(77, 216, 139, 23);
		contentPane.add(lbl_Nombre);

		JLabel lbl_ResultadosIES = new JLabel("2. Resultados Instituciones de Educacion Superior");
		lbl_ResultadosIES.setForeground(new Color(25, 25, 112));
		lbl_ResultadosIES.setFont(new Font("Berlin Sans FB", Font.PLAIN, 13));
		lbl_ResultadosIES.setBounds(23, 331, 252, 28);
		contentPane.add(lbl_ResultadosIES);

		JLabel lbl_ResultadosPA = new JLabel("1. Resultados Programas Academicos");
		lbl_ResultadosPA.setForeground(new Color(25, 25, 112));
		lbl_ResultadosPA.setFont(new Font("Berlin Sans FB", Font.PLAIN, 13));
		lbl_ResultadosPA.setBounds(23, 250, 252, 28);
		contentPane.add(lbl_ResultadosPA);

		JComboBox cmbBox_IES = new JComboBox();
		cmbBox_IES.setFont(new Font("Berlin Sans FB", Font.PLAIN, 13));
		cmbBox_IES.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar Universidad"}));
		cmbBox_IES.setToolTipText("");
		cmbBox_IES.setBounds(23, 368, 252, 31);
		contentPane.add(cmbBox_IES);

		JComboBox<String> cmbBox_PA = new JComboBox();
		cmbBox_PA.setFont(new Font("Berlin Sans FB", Font.PLAIN, 13));
		cmbBox_PA.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar Programa"}));
		cmbBox_PA.setToolTipText("Instituciones de Educacion Superior");
		cmbBox_PA.setBounds(23, 289, 252, 31);
		contentPane.add(cmbBox_PA);

		JButton btn_salir = new JButton("");
		btn_salir.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Salir1.png")));
		btn_salir.setBounds(214, 426, 61, 61);
		contentPane.add(btn_salir);
		btn_salir.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MenuPrincipal.main(null);			
			}
		});

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(this.getClass().getResource("Images/panel.png")));
		label_1.setBounds(10, 420, 277, 75);
		contentPane.add(label_1);

		resultados = gesProgramas.readProgramasCosto();

		matrizBotones = ventanaPreguntas.getOpciones();
		categorias = ventanaPreguntas.getCategorias();

		Vector<String[]> categoriaGanadora = encontrarCategoriaGanadora(categorias, matrizBotones);
		
		ArrayList<String[]> programas = llenarProgramas(resultados);
					
		for (int i = 0; i < programas.size(); i++) {
			for (int j = 0; j < categoriaGanadora.size(); j++) 
				if(categoriaGanadora.get(j)[0].equals(programas.get(i)[1])){
					cmbBox_PA.addItem(programas.get(i)[0]);
					break;
				}
		}			
	}

	/**
	 * @param categorias2
	 * @param matrizBotones2
	 * @return
	 */
	private Vector<String[]> encontrarCategoriaGanadora(
			Vector<String> categorias2, JRadioButton[][] matrizBotones2) {

		String dato1 = "";
		int control = 0;
		int nextCategoria = 0;
		String [] parcial = new String[2];
		ArrayList<String[]> resultado = new ArrayList<String[]>();
		Vector<String[]> ganadora = new Vector<String[]>();

		for (int i = 0; i < matrizBotones2.length; i++) {			
			if(matrizBotones2[i][0].isSelected()){
				dato1 += "1";	
				control += 1;								
			}else{
				control += 1;
			}

			if (control == 3) {
				parcial[0] = categorias2.get(nextCategoria);				
				parcial[1] = dato1;				
				resultado.add(new String[]{parcial[0],parcial[1]});
				control = 0;
				nextCategoria += 1; 
				dato1="";
				
			}
		}
		
		ganadora.add(new String[]{resultado.get(0)[0], resultado.get(0)[1]});
		for (int i = 1; i < resultado.size(); i++) {
			if (ganadora.get(0)[1].length() < resultado.get(i)[1].length()){
				ganadora.removeAllElements();
				ganadora.add(resultado.get(i));
			} else if (ganadora.get(0)[1].length() == resultado.get(i)[1].length()){
				ganadora.add(resultado.get(i));
			}
		}

		return ganadora;
	}

	/**
	 * @param resultados2
	 * @return
	 */
	private ArrayList<String[]> llenarProgramas(ArrayList<String[]> resultados2) {
		ArrayList<String> programas = new ArrayList<String>();
		ArrayList<String> categoria = new ArrayList<String>();

		for (int j = 0; j < resultados2.size(); j++) {
			if(!programas.contains((resultados2.get(j)[0]))){
				programas.add(resultados2.get(j)[0]);
				categoria.add(resultados2.get(j)[5]);					
			}
		}
		ArrayList<String[]> combinado = new ArrayList<String[]>();
		for (int i = 0; i < programas.size(); i++) {
			combinado.add(new String []{programas.get(i), categoria.get(i)});
		}
		return combinado;
	}
}