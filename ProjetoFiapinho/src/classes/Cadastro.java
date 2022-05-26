package classes;

import java.io.Serializable;
import java.util.List;

public class Cadastro implements Serializable {
	private String loguin;
	private String senha;

	//construtor
	public Cadastro(String loguin, String senha) {
		
		super();
		this.loguin = loguin;
		this.senha = senha;
	}
	//getter

	public String getLoguin() {
		return loguin;
	}

	public String getSenha() {
		return senha;
	}

	}



