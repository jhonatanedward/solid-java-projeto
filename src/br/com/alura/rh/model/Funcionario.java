package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		dadosPessoais.setNome(nome);
		dadosPessoais.setCpf(cpf);
		dadosPessoais.setCargo(cargo);
		dadosPessoais.setSalario(salario);
	}

	public void atualizaSalario(BigDecimal novoSalario) {
		this.dadosPessoais.setSalario(novoSalario);
	}
	
	public Cargo getCargo() {
		return this.dadosPessoais.getCargo();
	}
	
	public BigDecimal getSalario() {
		return this.dadosPessoais.getSalario();
	}
	
	public void promover(Cargo novoCargo) {
		dadosPessoais.setCargo(novoCargo);
	}

	public void setSalario(BigDecimal salario) {
		dadosPessoais.setSalario(salario);
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

}
