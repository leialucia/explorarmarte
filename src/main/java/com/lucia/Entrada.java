package com.lucia;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.lucia.comando.Comando;
import com.lucia.comando.ComandoFactory;
import com.lucia.excecoes.DirecaoInvalidaException;
import com.lucia.instrucao.Coordenada;
import com.lucia.instrucao.Direcao;

public class Entrada {
	
	
	public static Coordenada coordenada(Scanner scanner) {
		int x, y;
		
		Coordenada coordenada = null;
	
		try {
			
			System.out.printf("x = \n");
			x = scanner.nextInt();
			
			System.out.printf("y = \n");
			y = scanner.nextInt();
			
			coordenada = new Coordenada(x, y);
			
		} catch (InputMismatchException e) {
			System.out.println(" Formato Inválido! - O Sistema será encerrado");
			System.exit(0); 
		}
		
		return coordenada;
		
	}
	

	public static Direcao direcaoSonda(Scanner scanner) {
		String direcao	= scanner.next().toUpperCase();
		Direcao d = Direcao.valueOf(direcao);
		
		if(d == null)
			throw new DirecaoInvalidaException();

		return d;

	}
	
	public static List<Comando> intrucoesSonda(Scanner scanner) {
		String instrucao = scanner.next().toUpperCase();
		List<Comando> comandos = new ArrayList<Comando>();
				
		for(char caracter : instrucao.toCharArray()) {
			Comando comando = ComandoFactory.novaInstancia(caracter);
			comandos.add(comando);
		}
		
		return comandos;
	}
	
	
}
