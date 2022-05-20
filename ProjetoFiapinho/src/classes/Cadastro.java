package classes;

import java.util.List;

public class Cadastro {
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



