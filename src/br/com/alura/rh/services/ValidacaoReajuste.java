package br.com.alura.rh.services;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

public interface ValidacaoReajuste {
	void valida(Funcionario funcionario, BigDecimal aumento);
}
