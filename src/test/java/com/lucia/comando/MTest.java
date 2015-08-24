package com.lucia.comando;

import junit.framework.Assert;

import org.junit.Test;

import com.lucia.instrucao.Coordenada;
import com.lucia.instrucao.Direcao;
import com.lucia.veiculo.Sonda;

public class MTest {
	
	@Test
	public void deveMoverSondaParaEsquerda() {
		
		Coordenada coordenada = new Coordenada(0, 0);		
		Sonda sonda = new Sonda(coordenada, Direcao.E);
		
		Comando comando = new M();
		comando.executar(sonda);
		
		Assert.assertEquals(1, sonda.getCoordenada().getX());
		Assert.assertEquals(0, sonda.getCoordenada().getY());

		
	}
	
	@Test
	public void deveMoverSondaParaDireita() {
		
		Coordenada coordenada = new Coordenada(4, 5);
		
		Sonda sonda = new Sonda(coordenada, Direcao.W);
		Comando comando = new M();
		comando.executar(sonda);
		
		Assert.assertEquals(3, sonda.getCoordenada().getX());
		Assert.assertEquals(5, sonda.getCoordenada().getY());

		
	}
	
	
	@Test
	public void deveMoverSondaParaCima() {
		
		Coordenada coordenada = new Coordenada(4, 5);
		
		Sonda sonda = new Sonda(coordenada, Direcao.N);
		Comando comando = new M();
		comando.executar(sonda);
		
		Assert.assertEquals(4, sonda.getCoordenada().getX());
		Assert.assertEquals(6, sonda.getCoordenada().getY());
	}
	
	
	@Test
	public void deveMoverSondaParaBaixo() {
		
		Coordenada coordenada = new Coordenada(4, 5);
		
		Sonda sonda = new Sonda(coordenada, Direcao.S);
		Comando comando = new M();
		comando.executar(sonda);
		
		Assert.assertEquals(4, sonda.getCoordenada().getX());
		Assert.assertEquals(4, sonda.getCoordenada().getY());
	}
	
}
