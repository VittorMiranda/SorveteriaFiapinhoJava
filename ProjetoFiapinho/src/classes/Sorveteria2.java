package classes;

public class Sorveteria2 {

private String nome, cliente, funcionario, produtos, endereco, telefone, pedidos;


public Sorveteria2(String nome, String cliente, String funcionario, String produtos, String endereco, String telefone,
		String pedidos) {
	super();
	this.nome = nome;
	this.cliente = cliente;
	this.funcionario = funcionario;
	this.produtos = produtos;
	this.endereco = endereco;
	this.telefone = telefone;
	this.pedidos = pedidos;
}



public String mostrarDados() {
	return "\nNome: " + this.nome + "\nCliente: " + this.cliente + "\nFuncion�rio: " + this.funcionario + "\nProdutos: " + this.produtos + "\nEndere�o: " +
this.endereco + "\nTelefone: " + this.telefone + "\nPedidos: " + this.pedidos;
}

public String mostrarDadosNota() {
	return "\nNome: " + this.nome + "\nEndere�o: " +
			this.endereco;
}
}
