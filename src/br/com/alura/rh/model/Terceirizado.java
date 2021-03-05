package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {

	private DadosPessoais dadosPessoais;
	private String empresa;
	
	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		dadosPessoais.setNome(nome);
		dadosPessoais.setCpf(cpf);
		dadosPessoais.setCargo(cargo);
		dadosPessoais.setSalario(salario);
	}

	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}
