package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.rh.error.Validator;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoReajustePercentual implements ValidacaoReajuste {

	public void valida(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new Validator("Reajuste nao pode ser superior a 40% do salario!");
		}
	}
}
