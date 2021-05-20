package br.com.alura.rh.error;

public class Validator extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public Validator(String mensagem) {
		super(mensagem);
	}
}
