package com.lucia.veiculo;

import com.lucia.instrucao.Coordenada;
import com.lucia.instrucao.Direcao;

public class Sonda {
	
	private Coordenada coordenada;
	
	private Direcao direcao;
	
	private char[] instrucoes;
	

	public Sonda(Coordenada coordenada, Direcao direcao) {
		this.coordenada = coordenada;
		this.direcao = direcao;
	}
	
	public Sonda(Coordenada coordenada, Direcao direcao, char[] instrucoes){
		this(coordenada, direcao);
		this.instrucoes = instrucoes;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	public void girar(Direcao direcao) {
		this.direcao = direcao;
	}

	public void mover(Coordenada coordenada) {
		this.coordenada = coordenada;
	}
	
	public Coordenada getCoordenada() {
		return coordenada;
	}

	public char[] getInstrucoes() {
		return instrucoes;
	}
	

}
