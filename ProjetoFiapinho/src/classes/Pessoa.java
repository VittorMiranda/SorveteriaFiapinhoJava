package classes;

public class Pessoa {

	private String nome, pedido, telefone, endereco;
	
	
	//construtor
	
	
	public Pessoa(String nome, String telefone, String endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	
	}

	//m�todo
	
	public String mostrarDados() {
		return "\nNome: " + this.nome + "\nTelefone: "+ this.telefone + "\nEndere�o: " + this.endereco + "\nPedido: " + this.pedido;
	}
}
