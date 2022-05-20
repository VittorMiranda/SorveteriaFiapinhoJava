package classes;

import java.io.Serializable;

public class Produto implements Serializable {
protected String validade,Nome;
protected double preco,peso;
protected int quantidade;

//construtor
public Produto(String validade, String nome, double preco, double peso, int quantidade) {
	super();
	this.validade = validade;
	Nome = nome;
	this.preco = preco;
	this.peso = peso;
	this.quantidade = quantidade;
}


public String mostrarDados() {
	return "\nNome: " + this.Nome + "\nValidade: " + this.validade + "\nPreço: " + this.preco + "\nPeso: " + this.peso + "\nQuantidade: " + this.quantidade;
}



}
