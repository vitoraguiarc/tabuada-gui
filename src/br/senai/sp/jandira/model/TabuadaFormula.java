package br.senai.sp.jandira.model;

public class TabuadaFormula {
	
	private int multiplicando;
	private int maxMultiplicador;
	
	public int getMultiplicando() {
		return multiplicando;
	}
	
	public void setMultiplicando(int multiplicando) {
		this.multiplicando = multiplicando;
	}
	
	public int getMaxMultiplicador() {
		return maxMultiplicador;
	}
	
	public void setMaxMultiplicador(int maxMultiplicador) {
		this.maxMultiplicador = maxMultiplicador;
	}
	
	
	public String[] calcular() {
		
		String t [] = new String [maxMultiplicador + 1];
		
		for (int i = 0; i <= maxMultiplicador; i++) {
			int produto = multiplicando * i;
			t[i] = multiplicando + "X" + i + "=" + produto;
		}

	
		return t;
		

}

}	
