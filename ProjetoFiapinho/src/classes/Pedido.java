package classes;
import classes.Sorveteria2;

public class Pedido extends Cliente{
	private String descricao, sorvete;
	private double  quantidade;
	private Cliente cliente;
	private Sorveteria2 sorveteria2;
	
	
	//construtor
		
public Pedido(String nome, String telefone, String endereco, String formaPagamento, String cpf, String descricao,
			String sorvete, double quantidade) {
		super(nome, telefone, endereco, formaPagamento, cpf);
		this.descricao = descricao;
		this.sorvete = sorvete;
		this.quantidade = quantidade;
	}


//metodos
public void numeropedido() {
	int numeroPedido = 0, resultado;
		for (int i = 0; i <= 10000000; i++) {
			resultado = numeroPedido + i++;
		}
		}

public double totalM() {
	return quantidade*30;
}

public String mostrarDados() {
	return mostrarDadosNota() +"\nSorvete: " + this.sorvete + "QTD: " + this.quantidade + "\nDescrição: " + this.descricao;
}

public String mostrarDadosPedido() {
	return "\nSorvete: " + this.sorvete + "QTD: " + this.quantidade;
}

public String mostrarDadosNota() {
	return cliente.mostrarDadosNota() + mostrarDadosPedido() + "\nTotal" + totalM() + sorveteria2.mostrarDadosNota(); 
}
}
