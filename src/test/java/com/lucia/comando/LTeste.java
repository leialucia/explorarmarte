package com.lucia.comando;

import junit.framework.Assert;

import org.junit.Test;

import com.lucia.instrucao.Coordenada;
import com.lucia.instrucao.Direcao;
import com.lucia.veiculo.Sonda;

public class LTeste {

	@Test
	public void deveGirarSondaDoSulParaOLeste() {
		
		Coordenada coordenada = new Coordenada(1, 1);		
		Sonda sonda = new Sonda(coordenada, Direcao.S);
		
		Comando comando = new L();
		comando.executar(sonda);
		
		Assert.assertEquals(Direcao.E, sonda.getDirecao());
	}
	
	
	@Test
	public void deveGirarSondaDoOesteParaOSul() {
		
		Coordenada coordenada = new Coordenada(1, 1);		
		Sonda sonda = new Sonda(coordenada, Direcao.W);
		
		Comando comando = new L();
		comando.executar(sonda);
		
		Assert.assertEquals(Direcao.S, sonda.getDirecao());
	}
	
	
	@Test
	public void deveGirarSondaDoNorteParaOOeste() {
		
		Coordenada coordenada = new Coordenada(1, 1);		
		Sonda sonda = new Sonda(coordenada, Direcao.N);
		
		Comando comando = new L();
		comando.executar(sonda);
		
		Assert.assertEquals(Direcao.W, sonda.getDirecao());
	}
	
	@Test
	public void deveGirarSondaDoLesteParaONorte() {
		
		Coordenada coordenada = new Coordenada(1, 1);		
		Sonda sonda = new Sonda(coordenada, Direcao.E);
		
		Comando comando = new L();
		comando.executar(sonda);
		
		Assert.assertEquals(Direcao.N, sonda.getDirecao());
	}

}
