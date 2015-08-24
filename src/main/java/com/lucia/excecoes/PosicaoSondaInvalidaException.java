package com.lucia.excecoes;

import java.io.Serializable;

public class PosicaoSondaInvalidaException extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5654581476161280592L;

	public PosicaoSondaInvalidaException () {
	    super(" A posição da sonda é inválida!!");
	 }
}
