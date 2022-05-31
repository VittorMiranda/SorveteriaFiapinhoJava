package classes;
import java.io.Serializable;

import classes.Sorveteria2;

public class Pedido extends Cliente implements Serializable{
	private String descricao, sorvete;
	private double  quantidade;
	
	private int numeroPedido = 0, resultado;
	
	//construtor
		



//metodos
public void numeropedido() {
	
		for (int i = 0; i <= 10000000; i++) {
			resultado = numeroPedido + i++;
		}
		}

public Pedido(String nome, String telefone, String endereco, String formaPagamento, String cpf, String descricao,
		String sorvete, double quantidade) {
	super(nome, telefone, endereco, formaPagamento, cpf);
	this.descricao = descricao;
	this.sorvete = sorvete;
	this.quantidade = quantidade;
}

public double totalM() {
	return quantidade*30;
}

public String mostrarDados() {
	return mostrarDadosNota() +"\nSorvete: " + this.sorvete + "\nQTD: " + this.quantidade + "\nDescrição: " + this.descricao;
}

public String mostrarDadosPedido() {
	return "\nNº Pedido" + resultado + mostrarDadosNota() + "\nSorvete: " + this.sorvete + "\nQTD: " + this.quantidade + "Kg"+ "\nTotal: "+totalM() + "R$";
}


}
