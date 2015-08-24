package com.lucia.terreno;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.lucia.comando.Comando;
import com.lucia.comando.L;
import com.lucia.comando.M;
import com.lucia.comando.R;
import com.lucia.instrucao.Coordenada;
import com.lucia.instrucao.Direcao;
import com.lucia.veiculo.Sonda;

public class PlanaltoTeste {
	
	private Planalto planalto;
	
	private Comando l = new L();
	
	private Comando r = new R();
	
	private Comando m = new M();


	
	@Before
	public void iniciar() {
		Coordenada superior = new Coordenada(5, 5);
		planalto = new Planalto(superior);
	}
	
	
	@Test
	public void deveExibirPosicaoFinal13N() {		
		Comando [] comandos = new Comando [] {l,m,l,m,l,m,l,m,m};
		
		Coordenada coordenada = new Coordenada(1, 2);
		Sonda sonda = new Sonda(coordenada, Direcao.N, Arrays.asList(comandos));
		planalto.adicionarSonda(sonda);
		planalto.explorar();
		
		assertEquals(1, sonda.getCoordenada().getX());
		assertEquals(3, sonda.getCoordenada().getY());
		assertEquals(Direcao.N, sonda.getDirecao());

		
	}
	
	@Test
	public void deveExibirPosicaoFinal51E() {
	Comando [] comandos = new Comando [] {m,m,r,m,m,r,m,r,r,m};
		
		Coordenada coordenada = new Coordenada(3, 3);
		Sonda sonda = new Sonda(coordenada, Direcao.E, Arrays.asList(comandos));
		planalto.adicionarSonda(sonda);
		planalto.explorar();
		
		assertEquals(5, sonda.getCoordenada().getX());
		assertEquals(1, sonda.getCoordenada().getY());
		assertEquals(Direcao.E, sonda.getDirecao());

		
	}

}
