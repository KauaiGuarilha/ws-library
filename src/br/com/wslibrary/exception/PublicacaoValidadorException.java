package br.com.wslibrary.exception;

import java.util.List;

public class PublicacaoValidadorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PublicacaoValidadorException(List<String> erros) {
		super(erros.toString());
	}	
}
