package com.lucia.terreno;

import java.util.ArrayList;
import java.util.List;

import com.lucia.comando.Comando;
import com.lucia.excecoes.PosicaoSondaInvalidaException;
import com.lucia.excecoes.PosicaoSuperiorPlanaltoInvalidaException;
import com.lucia.instrucao.Coordenada;
import com.lucia.veiculo.Sonda;

public class Planalto {
	
	private Coordenada superior;
	
	private Coordenada inferior;
	
	private List<Sonda> sondas;
	
	
	public Planalto (Coordenada superior) {
		this.superior = superior;
		inferior = new Coordenada(0, 0);
	}
	
	
	public void explorar() {
		
		for(Sonda sonda: sondas) {
			
			for(Comando comando : sonda.getComandos()) {
				comando.executar(sonda);
			}
			
			sonda.imprimirPosicao();
		}
	
	}
	
	
	public void adicionarSonda(Sonda sonda) throws PosicaoSondaInvalidaException {
		
		if(sonda.getCoordenada().getX() > superior.getX() || 
				sonda.getCoordenada().getY() > superior.getY()) {
			
			throw new PosicaoSondaInvalidaException();
		}
			
		
		if(sondas == null) {
			sondas = new ArrayList<Sonda>();
		}
			
		sondas.add(sonda);
	}

		
	public void validarCoordenadaSuperior() {
		if(superior.getX() <= inferior.getX() || superior.getY() <= inferior.getY()) {
			throw new PosicaoSuperiorPlanaltoInvalidaException();
		}
	}
	

}
