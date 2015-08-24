package com.lucia.excecoes;

import java.io.Serializable;

public class PosicaoSuperiorPlanaltoInvalidaException extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5654581476161280592L;

	public PosicaoSuperiorPlanaltoInvalidaException () {
	    super(" A posição superior do Planalto é inválida! :( ");
	 }
}
