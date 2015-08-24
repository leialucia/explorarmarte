package com.lucia.instrucao;


public enum Direcao {
	
	N("W-90", "E+90", new Coordenada(0,1)), 
	W("S-90", "N+90", new Coordenada(-1,0)),
	S("E-90", "W+90", new Coordenada(0,-1)), 
	E("N-90", "S+90", new Coordenada(1,0));
	
	private String horaria;
	
	private String antiHoraria;

	private Coordenada coordenada;
	
	Direcao(String horaria, String antiHoraria, Coordenada coordenada) {
		this.coordenada = coordenada;
		this.horaria = horaria;
		this.antiHoraria = antiHoraria;
	}


	public Coordenada getCoordenada() {
		return coordenada;
	}


	public String getHoraria() {
		return horaria;
	}


	public String getAntiHoraria() {
		return antiHoraria;
	}


	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}
	
	public static Direcao por(String value) {
		
		for(int i = 0; i < values().length; i++) {
			Direcao direcao = values()[i];
			
			if(direcao.getAntiHoraria().equals(value) ||
					direcao.getHoraria().equals(value)) {
				
				return direcao;
			}
		}
		
		return null;
	}
	
	
	
	
	

}
