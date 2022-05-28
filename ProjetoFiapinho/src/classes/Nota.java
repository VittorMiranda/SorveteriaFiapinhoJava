package classes;


public class Nota {
	private double total,quantidade,preco;
	
	
	
//construtor
	public Nota(double quantidade, double preco) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;

	}

//metodos




public double totalM() {
	return total = quantidade*30;
}



public String mostrarDadosNota() {
	return "\nTotal" + total;
}

}

