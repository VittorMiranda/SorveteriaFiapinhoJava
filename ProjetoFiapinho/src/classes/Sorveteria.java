package classes;

public class Sorveteria {
	
	//variaveis
	
	String cliente, endereco, telefone;
	double valortotal, sabor, morango, chocolate, baumilha, ovomautine,nutella, brigadeiro, flocos, uva, abacaxi, limao, acai, cupuacu, calda, cobertura;
	
	//construtor
	
	public Sorveteria(String cliente, String endereco, String telefone, double morango, double chocolate,
			double baumilha, double ovomautine, double nutella, double brigadeiro, double flocos, double uva,
			double abacaxi, double limao, double acai, double cupuacu, double calda, double cobertura) {
		super();
		this.cliente = cliente;
		this.endereco = endereco;
		this.telefone = telefone;
		this.morango = morango;
		this.chocolate = chocolate;
		this.baumilha = baumilha;
		this.ovomautine = ovomautine;
		this.nutella = nutella;
		this.brigadeiro = brigadeiro;
		this.flocos = flocos;
		this.uva = uva;
		this.abacaxi = abacaxi;
		this.limao = limao;
		this.acai = acai;
		this.cupuacu = cupuacu;
		this.calda = calda;
		this.cobertura = cobertura;
	}
	public String mostrarDados() {
		return "\nNome: "+this.cliente+"\nTelefone: "+this.telefone+"\nEndereço: "+this.endereco+ "Total: " + this.valortotal;
	}
	//public void somaSabor() {
		//valortotal = (morango+chocolate+baumilha+ovomautine+nutella+brigadeiro+flocos+uva+abacaxi+limao+acai+cupuacu+calda+cobertura)*sabor
	
	
	
	

}
