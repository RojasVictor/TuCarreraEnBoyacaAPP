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

import tuCarreraBoyacaAPP.logica.GestionPreguntaTest;
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
		btn_siguiente.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//--FALTA COLOCAR QUE TODAS LAS PREGUNTAS ESTEN RESUELTAS
				//--PARA QUE CONTINUE LA APLICACION
				dispose();
				EstadisticaPreguntas.main(null);				
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
		listaPreguntas = gesPreguntas.readPreguntaTestsReporte();
		int numCategoria = cantidadCategorias(listaPreguntas).size()*3;		
		 
		ArrayList<ArrayList<String>> listadoPorCategorias = preguntasCategoria(listaPreguntas);
		
		
		Object[][] preguntas = new Object[numCategoria*2][2];
		String[] columnas = {"A","B"};
		
		opciones = new JRadioButton[numCategoria][2];
		
		JLabel[] enunciados = new JLabel[numCategoria];
		for (int i = 0; i < enunciados.length; i++) {
			enunciados[i] = new JLabel("Enunciado "+i);
			enunciados[i].setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
			// cargar de base de datos en base al nuemro
		}
		
		JPanel panelTabla = new JPanel(new MigLayout("", "[][]", "[][]"));
		
		for (int i = 0; i < numCategoria; i ++) {
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
	 * @param listaPreguntas2 
	 * @return
	 */
	private ArrayList<ArrayList<String>> preguntasCategoria(ArrayList<String[]> listaPreguntas2) {
		
		ArrayList<ArrayList<String>> resultado = new ArrayList<ArrayList<String>>() ;		
		ArrayList<String> categorias = cantidadCategorias(listaPreguntas2);
		String aux1 ="";
		
		for(int j=0; j<categorias.size();j++){
			resultado.add(new ArrayList<String>());
			resultado.get(j).add(categorias.get(j));
		}
	
		for(int i=0;i<listaPreguntas2.size();i++){			
				aux1 = listaPreguntas2.get(i)[3];
				for(int z=0;z<resultado.size();z++){
					if(resultado.get(z).get(i).equals(aux1)){
						resultado.get(z).add(listaPreguntas2.get(i)[1]);
					}	
				}
			}
		
		return resultado;
	}

	/**
	 * 
	 * @param listaPreguntas2
	 * @return cantidad de categorias
	 */
	public ArrayList<String> cantidadCategorias(ArrayList<String[]> listaPreguntas2) {
		ArrayList<String> cantidad = new ArrayList<String>();
		String aux = "";
		/*
		 * 0 -- ID
		 * 1 -- ENUNCIADO
		 * 2 -- NOMBRE PROGRAMA
		 * 3 -- NOMBRE CATEGORIA
		 */
		for(int i=0;i<listaPreguntas2.size();i++){
			if(i==0){
				aux = listaPreguntas2.get(i)[3];
				cantidad.add(aux);
			}
			if(i > 0){
				if(!aux.equals(listaPreguntas2.get(i)[3])){
					cantidad.add(listaPreguntas2.get(i)[3]);
				}
			}
		}
		
		return cantidad;
	}
}
