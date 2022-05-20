package classes;

public class Funcionario extends Pessoa {
private String usuario, senha;

//construtor 
public Funcionario(String nome, String telefone, String endereco, String usuario, String senha) {
	super(nome, telefone, endereco);
	this.usuario = usuario;
	this.senha = senha;
}

}
