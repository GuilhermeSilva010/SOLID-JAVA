package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.error.Validator;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodoReajuste implements ValidacaoReajuste {

	public void valida(Funcionario funcionario, BigDecimal aumento) {
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		if (mesesDesdeUltimoReajuste < 6) {
			throw new Validator("Intervalo entre os reajustes deve ser de no mínimo 6 meses");
		}

	}
}