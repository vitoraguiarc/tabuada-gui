package br.senai.sp.jandira;

import br.senai.sp.jandira.model.TabuadaFormula;
import br.senai.sp.jandira.ui.Tela;

public class AppTabuada {

	public static void main(String[] args) {
		
		Tela telaTabuada = new Tela();
		telaTabuada.criarTela();
		
		TabuadaFormula x = new TabuadaFormula();
		
		x.setMultiplicando(6);
		x.setMaxMultiplicador(10);
		
		String tabuadaX[] = x.calcular();
		
		for (int i = 0; i < tabuadaX.length; i++) {
			System.out.println(tabuadaX[i]);
		}

	}

}
