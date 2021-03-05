package br.com.alura.rh.services.reajuste;

import java.math.BigDecimal;
import java.util.List;
import br.com.alura.rh.model.Funcionario;

public class ReajusteService {
	
	private List<ValidacaoReajuste> validacoes;
	
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}
	
	public void ReajustaSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		
		this.validacoes.forEach(v -> v.valida(funcionario, aumento));
		
		BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
		
		funcionario.atualizaSalario(salarioReajustado);
	}
	
	
}
