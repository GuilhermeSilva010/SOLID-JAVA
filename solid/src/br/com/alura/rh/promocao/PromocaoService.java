package br.com.alura.rh.promocao;

import br.com.alura.rh.error.Validator;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

	public void promover(Funcionario funcionario, boolean metaBatida) {
	
		Cargo cargoAtual = funcionario.getCargo();
		if(Cargo.GERENTE == funcionario.getCargo()) {
			throw new Validator("Gerentes não podem ser promovidos");
		}
		
		if(metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo(); 
			funcionario.promover(novoCargo);
		}else {
			throw new Validator("Funcionario não bateu a meta");
		}
		
	}
	
	
}
