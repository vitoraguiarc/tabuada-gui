package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class Tela {
	
	public <E> void criarTela() {
		
		Color azul = new Color(0,127,255);
		Font fontTitulo = new Font("Arial",Font.BOLD, 26);
		Color preto = new Color(0,0,0);
		Font lblFont = new Font("Arial", Font.PLAIN, 20);
		Font btnFont = new Font("Arial", Font.BOLD, 26);
		Color verde = new Color(147,219,112);
		Color vermelho = new Color(165,42,42);
		Color branco = new Color(255,255,255);
		Font fontResultados = new Font("Arial",Font.BOLD, 20);
		
		
		JFrame telaTabuada = new JFrame("Tabuada");
		telaTabuada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaTabuada.setSize(600, 800);
		telaTabuada.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Tabuada");
		lblTitulo.setFont(fontTitulo);
		lblTitulo.setForeground(azul);
		lblTitulo.setBounds(20, 10, 180, 30); 
		
		JLabel lblMultiplicando = new JLabel("Multiplicando:");
		lblMultiplicando.setBounds(90, 100, 180, 30);
		lblMultiplicando.setFont(lblFont);
		lblMultiplicando.setForeground(preto);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(220, 100, 60, 30);
		
		JLabel lblMaxMuliplicador = new JLabel("Máximo multiplicador:");
		lblMaxMuliplicador.setBounds(20, 135, 220, 30);
		lblMaxMuliplicador.setFont(lblFont);
		lblMaxMuliplicador.setForeground(preto);
		
		JTextField txtMaxMultiplicador = new JTextField();
		txtMaxMultiplicador.setBounds(220, 135, 60, 30);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(20, 210, 180, 30);
		btnCalcular.setSize(250, 80);
		btnCalcular.setBackground(verde);
		btnCalcular.setForeground(branco);
		btnCalcular.setFont(btnFont);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(20, 300, 180, 30);
		btnLimpar.setSize(250, 80);
		btnLimpar.setBackground(vermelho);
		btnLimpar.setForeground(branco);
		btnLimpar.setFont(btnFont);
		
		JLabel lblResultados = new JLabel("Resultado:");
		lblResultados.setForeground(azul);
		lblResultados.setFont(fontResultados);
		lblResultados.setBounds(330, 100, 120, 30);
		
		DefaultListModel listCalcular = new DefaultListModel();
		for (int i= 0;;i++) {
		listCalcular.addElement([i]);}
		
		JScrollPane scroll = new JScrollBar();
		
		JList listResultados = new JList();
		listResultados.setModel(listCalcular);
		scroll.setBounds(330, 135, 180, 30);
		listResultados.setSize(120, 220);
		scroll.add(listResultados);
		
		
		
		// adc
		telaTabuada.getContentPane().add(lblTitulo);
		telaTabuada.getContentPane().add(lblMultiplicando);
		telaTabuada.getContentPane().add(lblMaxMuliplicador);
		telaTabuada.getContentPane().add(txtMultiplicando);
		telaTabuada.getContentPane().add(txtMaxMultiplicador);
		telaTabuada.getContentPane().add(btnCalcular);
		telaTabuada.getContentPane().add(btnLimpar);
		telaTabuada.getContentPane().add(lblResultados);
		telaTabuada.getContentPane().add(listResultados);
		
		// Tela visivel
		telaTabuada.setVisible(true);
	}

}
