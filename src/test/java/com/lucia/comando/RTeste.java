package com.lucia.comando;

import org.junit.Test;

import junit.framework.Assert;

import com.lucia.instrucao.Coordenada;
import com.lucia.instrucao.Direcao;
import com.lucia.veiculo.Sonda;

public class RTeste {
	
	@Test
	public void deveGirarSondaDoNorteParaOLeste() {
		
		Coordenada coordenada = new Coordenada(1, 1);		
		Sonda sonda = new Sonda(coordenada, Direcao.N);
		
		Comando comando = new R();
		
		comando.executar(sonda);
		
		Assert.assertEquals(Direcao.E, sonda.getDirecao());
	}
	
	
	@Test
	public void deveGirarSondaDoLesteParaOSul() {
		
		Coordenada coordenada = new Coordenada(1, 1);
		
		Sonda sonda = new Sonda(coordenada, Direcao.E);
		Comando comando = new R();
		
		comando.executar(sonda);
		
		Assert.assertEquals(Direcao.S, sonda.getDirecao());
	}
	
	
	@Test
	public void deveGirarSondaDoSulParaOOeste() {
		
		Coordenada coordenada = new Coordenada(1, 1);
		
		Sonda sonda = new Sonda(coordenada, Direcao.S);
		Comando comando = new R();
		
		comando.executar(sonda);
		
		Assert.assertEquals(Direcao.W, sonda.getDirecao());
	}
	
	@Test
	public void deveGirarSondaDoOesteParaONorte() {
		
		Coordenada coordenada = new Coordenada(1, 1);
		
		Sonda sonda = new Sonda(coordenada, Direcao.W);
		Comando comando = new R();
		
		comando.executar(sonda);
		
		Assert.assertEquals(Direcao.N, sonda.getDirecao());
	}
}
