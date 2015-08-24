package com.lucia.comando;

import com.lucia.excecoes.InstrucaoInvalidaException;

public class ComandoFactory {

	public static Comando novaInstancia(char nome) {
		
		if(nome == 'M') {
			return MSingleton.criar();
		
		} else if(nome == 'L') {
			return LSingleton.criar();
		
		} else if(nome == 'R') {
			return RSingleton.criar();

		}
		
		throw new InstrucaoInvalidaException();
	}
	
	

}
