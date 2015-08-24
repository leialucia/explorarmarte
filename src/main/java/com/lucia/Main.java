package com.lucia;

import java.util.List;
import java.util.Scanner;

import com.lucia.comando.Comando;
import com.lucia.instrucao.Coordenada;
import com.lucia.instrucao.Direcao;
import com.lucia.terreno.Planalto;
import com.lucia.veiculo.Sonda;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		String resposta = "N";
		
		Mensagem.pontoSuperior();
		Coordenada coordenada = Entrada.coordenada(scanner);
		
		Planalto planalto = new Planalto(coordenada);
		planalto.validarCoordenadaSuperior();
		
		
		do {
			
			Mensagem.posicaoSonda();
			Coordenada coordenadaSonda = Entrada.coordenada(scanner);
		
			Sonda sonda = new Sonda();
			sonda.setCoordenada(coordenadaSonda);
			planalto.adicionarSonda(sonda);
		
		
			Mensagem.direcaoSonda();
			Direcao direcao = Entrada.direcaoSonda(scanner);
			sonda.setDirecao(direcao);
		

			Mensagem.instrucoes();
			List<Comando> comandos = Entrada.intrucoesSonda(scanner);
			sonda.setComandos(comandos);
		
			System.out.printf("\n Deseja adicionar uma nova Sonda ? (S/N)");
			resposta = scanner.next().toUpperCase();
			

		} while (resposta.equals("S"));
	
		
		planalto.explorar();

	}
}
