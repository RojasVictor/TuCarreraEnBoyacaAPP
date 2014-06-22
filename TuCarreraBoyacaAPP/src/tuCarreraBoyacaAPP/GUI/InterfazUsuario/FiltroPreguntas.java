/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazUsuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;

import tuCarreraBoyacaAPP.logica.Categoria;
import tuCarreraBoyacaAPP.logica.GestionPreguntaTest;
import tuCarreraBoyacaAPP.persistencia.CategoriaDao;
import tuCarreraBoyacaAPP.GUI.InterfazUsuario.*;
import net.miginfocom.swing.MigLayout;

/**
 * @author JUDIT
 *
 */
public class FiltroPreguntas extends JFrame {

	private JPanel contentPane;
	private JRadioButton[][] opciones;
	private JLabel[] enunciados;
	private ArrayList<String[]> listaPreguntas;
	private GestionPreguntaTest gesPreguntas;
	private int controlEnunciado = 0;
	private ArrayList<ArrayList<String>> listadoPorCategorias;
	private ArrayList<ArrayList<String>> listadoPorCategoriasElim;
	private Vector<String> categorias;
	private String nombreUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FiltroPreguntas frame = new FiltroPreguntas(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param inicio 
	 */
	public FiltroPreguntas(InicioTest inicio) {
		nombreUsuario = inicio.getTxt_Nombre().getText();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 584);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);

		gesPreguntas = new GestionPreguntaTest();
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
		final FiltroPreguntas fp = this;
		btn_siguiente.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				boolean marcados = false;
				for (int i = 0; i < opciones.length; i++) {
					if(opciones[i][0].isSelected() || opciones[i][1].isSelected()){
						marcados = true;
					}else{
						marcados = false;
						break;
					}
				}				
				if(marcados){
					setVisible(false);					
					ResultadosTest resultadosTest = new ResultadosTest(fp);
					resultadosTest.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(null, "Debe responder todas las preguntas");					
				}
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

		//--------

		int numPreguntas = 3;
		listaPreguntas = gesPreguntas.readPreguntaTestsReporte();
		String[][] preguntas = selecionarEnuciados(listaPreguntas, numPreguntas);
		numPreguntas *= preguntas.length;

		opciones = new JRadioButton[numPreguntas][2];
		JLabel[] enunciados = new JLabel[numPreguntas];
		Vector<String> lista = new Vector<String>();
		for (int i = 0; i < preguntas.length; i++) 
			for (int j = 1; j < preguntas[0].length; j++)
				lista.add(preguntas[i][j]);

		for (int i = 0; i < enunciados.length; i++) {
			enunciados[i] = new JLabel(lista.get(i));
			enunciados[i].setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
		}

		JPanel panelTabla = new JPanel(new MigLayout("", "[][]", "[][]"));

		for (int i = 0; i < numPreguntas; i ++) {
			//enunciados[i].setBounds(0, 40*i, 270, 20);

			ButtonGroup bg = new ButtonGroup();
			opciones[i][0] = new JRadioButton("Si");
			opciones[i][0].setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
			//opciones[i][0].setBounds(10, 20+40*i, 125, 20);
			opciones[i][1] = new JRadioButton("No");
			opciones[i][1].setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
			//opciones[i][1].setBounds(135, 20+40*i, 130, 20);
			bg.add(opciones[i][0]);
			bg.add(opciones[i][1]);

			panelTabla.add(enunciados[i], "cell 0 "+(i*2)+" 2 1");
			panelTabla.add(opciones[i][0], "cell 0 "+(1+i*2)+" 1 1");
			panelTabla.add(opciones[i][1], "cell 1 "+(1+i*2)+" 1 1");
		}

		JScrollPane sp = new JScrollPane(panelTabla);
		sp.setBounds(20, 210, 270, 215);
		contentPane.add(sp);
		//--------

	}

	/**
	 * @param i
	 * @param listadoPorCategorias
	 * @return
	 */

	/**
	 * @param listaPreguntas2 
	 * @return
	 */

	/**
	 * 
	 * @param listaPreguntas2
	 * @param numPreguntas 
	 * @return cantidad de categorias
	 */
	public String[][] selecionarEnuciados (ArrayList<String[]> listaPreguntas2, int numPreguntas) {
		categorias = new Vector<String>();
		for (int i = 0; i < listaPreguntas2.size(); i++) 
			if(!categorias.contains(listaPreguntas2.get(i)[3]))
				categorias.add(listaPreguntas2.get(i)[3]);

		String[][] enunciados = new String[categorias.size()][numPreguntas+1];
		for (int i = 0; i < categorias.size(); i++){ 
			enunciados[i][0] = categorias.get(i);
			Vector<String> preguntas = seleccionarPreguntas(listaPreguntas2, categorias.get(i));
			while (preguntas.size() > numPreguntas)
				preguntas.removeElementAt((int) (Math.random()*preguntas.size()-1));
			for (int j = 1; j < enunciados[0].length; j++) 
				enunciados[i][j] = preguntas.get(j-1);
		}

		return enunciados;
	}

	/**
	 * @param listaPreguntas2
	 * @param string
	 * @return
	 */
	private Vector<String> seleccionarPreguntas(ArrayList<String[]> listaPreguntas2,
			String categoria) {
		Vector<String> enunciados = new Vector<String>();
		for (int i = 0; i < listaPreguntas2.size(); i++){			
			if (listaPreguntas2.get(i)[3].equals(categoria))
				enunciados.add(listaPreguntas2.get(i)[1]);
		}
			return enunciados;
	}

	public JRadioButton[][] getOpciones() {
		return opciones;
	}

	/**
	 * @param opciones the opciones to set
	 */
	public void setOpciones(JRadioButton[][] opciones) {
		this.opciones = opciones;
	}

	/**
	 * @return the controlEnunciado
	 */
	public int getControlEnunciado() {
		return controlEnunciado;
	}

	/**
	 * @param controlEnunciado the controlEnunciado to set
	 */
	public void setControlEnunciado(int controlEnunciado) {
		this.controlEnunciado = controlEnunciado;
	}

	/**
	 * @return the listadoPorCategoriasElim
	 */
	public ArrayList<ArrayList<String>> getListadoPorCategoriasElim() {
		return listadoPorCategoriasElim;
	}

	/**
	 * @param listadoPorCategoriasElim the listadoPorCategoriasElim to set
	 */
	public void setListadoPorCategoriasElim(
			ArrayList<ArrayList<String>> listadoPorCategoriasElim) {
		this.listadoPorCategoriasElim = listadoPorCategoriasElim;
	}

	/**
	 * @return the categorias
	 */
	public Vector<String> getCategorias() {
		return categorias;
	}

	/**
	 * @param categorias the categorias to set
	 */
	public void setCategorias(Vector<String> categorias) {
		this.categorias = categorias;
	}

	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	
}
