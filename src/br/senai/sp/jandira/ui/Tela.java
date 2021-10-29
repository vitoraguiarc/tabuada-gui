package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.senai.sp.jandira.model.TabuadaFormula;

public class Tela {
	
	public <E> void criarTela() {
		
		// FONTES DO PROJETO
		Font fontTitulo = new Font("Arial",Font.BOLD, 26);
		Font lblFont = new Font("Arial", Font.PLAIN, 20);
		Font btnFont = new Font("Arial", Font.BOLD, 26);
		Font fontResultados = new Font("Arial",Font.BOLD, 20);
		
		// CORES DO PROJETO
		Color azul = new Color(0,127,255);
		Color branco = new Color(255,255,255);
		Color preto = new Color(0,0,0);
		Color verde = new Color(147,219,112);
		Color vermelho = new Color(165,42,42);
		
		
		JFrame telaTabuada = new JFrame("Tabuada");
		telaTabuada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaTabuada.setSize(600, 600);
		telaTabuada.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBounds(0,0,600,70);
		header.setBackground(branco);
		header.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Tabuada");
		lblTitulo.setFont(fontTitulo);
		lblTitulo.setForeground(azul);
		lblTitulo.setBounds(20, 10, 180, 30);
		header.add(lblTitulo);
		
		
		ImageIcon iconCalculadora = new ImageIcon((getClass().getResource("/br/senai/sp/jandira/images/calculate.png")));
		JLabel lblImagem = new JLabel();
		lblImagem.setIcon(iconCalculadora);
		lblImagem.setBounds(500,5,64,64);
		header.add(lblImagem);
		
		
		
		JPanel panelFormulario = new JPanel();
		panelFormulario.setBounds(20,10,400,400);
		panelFormulario.setLayout(null);
		
		JLabel lblMultiplicando = new JLabel("Multiplicando:");
		lblMultiplicando.setBounds(20, 100, 200, 30);
		lblMultiplicando.setFont(lblFont);
		lblMultiplicando.setForeground(preto);
		lblMultiplicando.setHorizontalAlignment(SwingConstants.RIGHT);
		panelFormulario.add(lblMultiplicando);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(225, 100, 60, 30);
		panelFormulario.add(txtMultiplicando);
		
		JLabel lblMaxMuliplicador = new JLabel("Máximo multiplicador:");
		lblMaxMuliplicador.setBounds(20, 135, 200, 30);
		lblMaxMuliplicador.setFont(lblFont);
		lblMaxMuliplicador.setForeground(preto);
		lblMaxMuliplicador.setHorizontalAlignment(SwingConstants.RIGHT);
		panelFormulario.add(lblMaxMuliplicador);
		
		JTextField txtMaxMultiplicador = new JTextField();
		txtMaxMultiplicador.setBounds(225, 135, 60, 30);
		panelFormulario.add(txtMaxMultiplicador);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(20, 210, 265, 80);
		btnCalcular.setBackground(verde);
		btnCalcular.setForeground(branco);
		btnCalcular.setFont(btnFont);
		panelFormulario.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(20, 300, 265, 80);
		btnLimpar.setBackground(vermelho);
		btnLimpar.setForeground(branco);
		btnLimpar.setFont(btnFont);
		panelFormulario.add(btnLimpar);
		
		JLabel lblResultados = new JLabel("Resultado:");
		lblResultados.setForeground(azul);
		lblResultados.setFont(fontResultados);
		lblResultados.setBounds(340, 105, 120, 30);
		
		// JList
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(340, 140, 200, 400);
		
		JList  listTabuada = new JList ();
		scroll.getViewport().add(listTabuada);
		
		DefaultListModel modelTabuada = new DefaultListModel();
		listTabuada.setModel(modelTabuada);
		
		// adc
		telaTabuada.getContentPane().add(header);
		telaTabuada.getContentPane().add(lblResultados);
		telaTabuada.getContentPane().add(scroll);
		telaTabuada.getContentPane().add(panelFormulario);
		
		
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				TabuadaFormula tabuada = new TabuadaFormula();
				
				int multiplicando = Integer.parseInt(txtMultiplicando.getText());
				int multiplicador = Integer.parseInt(txtMaxMultiplicador.getText());
				
				tabuada.setMultiplicando(multiplicando);
				tabuada.setMaxMultiplicador(multiplicador);
				
				String[] resultadoTabuada = tabuada.calcular();
				
				for (int i = 0; i < resultadoTabuada.length; i++) {
					modelTabuada.addElement(resultadoTabuada[i]);
					
				}
				 	
				}
				
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtMultiplicando.setText("");
				txtMaxMultiplicador.setText("");
				txtMultiplicando.requestFocus();
				
				modelTabuada.clear();
				
			}
		});
		
		// Tela visivel
		telaTabuada.setVisible(true);
	}

}
