package br.com.alura.rh.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajustes {


	public void valida(Funcionario funcionario, BigDecimal aumento) {
		
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		
		LocalDate dataAtual = LocalDate.now();
		
		long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		
		if(mesesDesdeUltimoReajuste < 6) {
			throw new ValidacaoException("Intervalo de reajuste deve ser de no mínimo 6 meses.");
		}
	}
}
