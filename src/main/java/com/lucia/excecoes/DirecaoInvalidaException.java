package com.lucia.excecoes;

import java.io.Serializable;

public class DirecaoInvalidaException extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5654581476161280592L;

	public DirecaoInvalidaException () {
	    super("A direção espeficicada não existe!!!");
	 }
}
