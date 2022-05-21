package classes;

public class Cliente extends Pessoa {
private String formaPagamento;
private Pessoa pessoa;
private double cpf;


//construtor
public Cliente(String nome, String telefone, String endereco, String formaPagamento, Pessoa pessoa, double cpf) {
	super(nome, telefone, endereco);
	this.formaPagamento = formaPagamento;
	this.pessoa = pessoa;
	this.cpf = cpf;
}



public double getCpf() {
	return cpf;
}



public String mostrarDados() {
	return "\nDados Cliente: " + pessoa.mostrarDados() + "\nForma de pagamento: " + this.formaPagamento;
}


}
