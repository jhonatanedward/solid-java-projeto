package br.com.alura.rh.services.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
	public void  promover(Funcionario funcionario, boolean metaBatida) {
		
		Cargo cargoAtual = funcionario.getCargo(); 
		
		if(cargoAtual == Cargo.GERENTE) {
			throw new ValidacaoException("Gerentes nao podem ser promovidos");
		}
		
		if(metaBatida) {
			
			Cargo novoCargo = cargoAtual.getProximoCargo();
			
			
			funcionario.promover(novoCargo);	
			
		}else {
			throw new ValidacaoException("Usuario não bateu a meta.");
		}
		
	}
}
