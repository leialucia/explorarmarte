package com.lucia.comando;

import com.lucia.instrucao.Coordenada;
import com.lucia.veiculo.Sonda;

public class M implements Comando {
	

	public void executar(Sonda sonda) {
		
		Coordenada coordenada = sonda.getCoordenada();
		
		int x = (coordenada.getX() + sonda.getDirecao().getCoordenada().getX());
		int y = (coordenada.getY() + sonda.getDirecao().getCoordenada().getY());	
		
		Coordenada novaCoordenada = new Coordenada(x, y);
		
		sonda.mover(novaCoordenada);
	}
	
	
	
}
