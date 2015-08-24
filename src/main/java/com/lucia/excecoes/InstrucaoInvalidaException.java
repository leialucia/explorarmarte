package com.lucia.excecoes;

import java.io.Serializable;

public class InstrucaoInvalidaException extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5654581476161280592L;

	public InstrucaoInvalidaException () {
	    super("Um das intruções digitadas é inválida!!!");
	 }
}
