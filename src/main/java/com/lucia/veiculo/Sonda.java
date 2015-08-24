package com.lucia.veiculo;

import java.util.List;

import com.lucia.comando.Comando;
import com.lucia.instrucao.Coordenada;
import com.lucia.instrucao.Direcao;

public class Sonda {
	
	private Coordenada coordenada;
	
	private Direcao direcao;
	
	private List<Comando> comandos;

	public Sonda() {}
	
	public Sonda(Coordenada coordenada, Direcao direcao) {
		this.coordenada = coordenada;
		this.direcao = direcao;
	}
	
	public Sonda(Coordenada coordenada, Direcao direcao, List<Comando> comandos) {
		this(coordenada, direcao);
		this.comandos = comandos;
	}
	
	public Direcao getDirecao() {
		return direcao;
	}

	public void girar(Direcao direcao) {
		setDirecao(direcao);
	}

	public void mover(Coordenada coordenada) {
		setCoordenada(coordenada);
	}
	
	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void imprimirPosicao() {
		String message = String.format("\n\n %s %s %s", coordenada.getX(),
				coordenada.getY(),
				direcao.name());
		
		System.out.println(message);

	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

	public List<Comando> getComandos() {
		return comandos;
	}

	public void setComandos(List<Comando> comandos) {
		this.comandos = comandos;
	}


}
