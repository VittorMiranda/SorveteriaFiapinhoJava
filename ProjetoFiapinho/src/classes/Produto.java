package classes;

import java.io.Serializable;

public class Produto implements Serializable {
	protected String validade,Nome,tipoproduto;
	protected double preco,peso;
	protected int quantidade;


	//construtor
	public Produto(String validade, String nome, String tipoproduto, double preco, double peso, int quantidade) {
		super();
		this.validade = validade;
		Nome = nome;
		this.tipoproduto = tipoproduto;
		this.preco = preco;
		this.peso = peso;
		this.quantidade = quantidade;
	}


	public String mostrarDados() {
		return "\nNome: " + this.Nome + "\nValidade: " + this.validade + "\nPreço: " + this.preco + "\nPeso: " + this.peso + "\nQuantidade: " + this.quantidade + "\nTipo do produto: " + this.tipoproduto;
	}


	


	public String getNome() {
		return Nome;
	}


	public String getTipoproduto() {
		return tipoproduto;
	}


}
