package com.lucia.comando;

import com.lucia.instrucao.Direcao;
import com.lucia.veiculo.Sonda;

public class R implements Comando {

	public void executar(Sonda sonda) {
		
		Direcao direcao = sonda.getDirecao();
		
		String novaDirecao = new StringBuilder()
			.append(direcao.name())
			.append("-90").toString();
		
		direcao = Direcao.por(novaDirecao);
	
		sonda.girar(direcao);
	}

}
