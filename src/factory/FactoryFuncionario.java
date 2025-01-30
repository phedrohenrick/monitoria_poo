package factory;

import model.Administrador;
import model.Empregado;
import model.Fornecedor;
import model.Operario;
import model.Pessoa;
import model.Vendedor;

public class FactoryFuncionario {
	
	public static Pessoa criarFuncinario(String tipo) {
		if(tipo.equalsIgnoreCase("FORNECEDOR")) {
			return new Fornecedor();
		} else if(tipo.equalsIgnoreCase("EMPREGADO")) {
			return new Empregado();
		} else if(tipo.equalsIgnoreCase("ADMINISTRADOR")){
			return new Administrador();
		}else if(tipo.equalsIgnoreCase("OPERARIO")){
			return new Operario();
		}else if(tipo.equalsIgnoreCase("VENDEDOR")){
			return new Vendedor();
		}
        throw new IllegalArgumentException("Tipo de pessoa inválido.");
	}
}
