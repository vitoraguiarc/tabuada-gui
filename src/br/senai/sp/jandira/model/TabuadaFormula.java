package br.senai.sp.jandira.model;

public class TabuadaFormula {
	
	private int multiplicando;
	private int maxMultiplicador;
	private int contador = 0;
	
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
	
	public int getContador() {
		return contador;
	}
	
	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public String[] calcular() {
		
		System.out.println("TABUADA DO " + multiplicando);
		System.out.println("------------------");
		
		String t [] = new String [maxMultiplicador + 1];
		
		for (int i = 0; i <= maxMultiplicador; i++) {
			int produto = multiplicando * i;
			t[i] = multiplicando + "X" + i + "=" + produto;
		}

	
		return t;
		

}

}	
