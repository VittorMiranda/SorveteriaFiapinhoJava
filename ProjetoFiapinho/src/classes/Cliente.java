package classes;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable{

private String formaPagamento;
private String cpf;


//construtor

public Cliente(String nome, String telefone, String endereco, String formaPagamento, String cpf) {
	super(nome, telefone, endereco);
	this.formaPagamento = formaPagamento;
	this.cpf = cpf;
}


public String getCpf() {
	return cpf;
}

public String mostrarDados() {
	return "\nDados Cliente: " +  mostrarDados() + "\nForma de pagamento: " + this.formaPagamento + "\nCPF: " + this.cpf;
}
public String mostrarDadosNota() {
	return "\nCPF: " + this.cpf + "\nForma de pagamento: " + this.formaPagamento;
}

}
