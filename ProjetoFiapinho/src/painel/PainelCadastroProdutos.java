package painel;

import java.awt.Color;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import classes.Produto;

public class PainelCadastroProdutos extends JPanel {
	private JLabel jlcadastro, jlnomeProduto, jlpreco, jlpeso,jlvalidade, jlquantidade, jltipoproduto ;
	private JTextField jtfpreco, jtfpeso, jtfnomeProduto, jtfvalidade, jtfquantidade;
	private JRadioButton jrbsorvete, jrboutros;
	private ButtonGroup bgtipoprodutos;
	private List<Produto> produtos;
	//construtor
	
	public PainelCadastroProdutos(List<Produto> produtos) {
		super();
		this.produtos = produtos;
		setSize(400, 400);
		setLayout(null);
		setBackground(Color.YELLOW); 
		iniciarComponentes();
		criarEventos();
	}

	private void iniciarComponentes() {
		jlcadastro =  new JLabel("Cadastro");
		jlnomeProduto = new JLabel("Nome do Produto");
		jtfnomeProduto = new JTextField();
		jlpeso = new JLabel("Peso");
		jtfpeso = new JTextField();
		jlpreco = new JLabel("Preço");
		jtfpreco = new JTextField();
		jlquantidade = new JLabel("Quantidade");
		jtfquantidade = new JTextField();
		jltipoproduto = new JLabel("Produto");
		jlvalidade = new JLabel("Validade");
		jtfvalidade = new JTextField();
		jrboutros = new JRadioButton("Outros");
		jrbsorvete = new JRadioButton("Sorvete");
		bgtipoprodutos = new ButtonGroup();
		
		//add
		add(jlcadastro);
		add(jlnomeProduto);
		add(jtfnomeProduto);
		add(jlpeso);
		add(jtfpeso);
		add(jlpreco);
		add(jtfpreco);
		add(jlquantidade);
		add(jtfquantidade);
		add(jltipoproduto);
		add(jlvalidade);
		add(jtfvalidade);
		add(jrbsorvete);
		add(jrboutros);
		bgtipoprodutos.add(jrbsorvete);
		bgtipoprodutos.add(jrboutros);
		
		//dimencionar 
		
		jlcadastro.setBounds(175, 10, 80, 20);
		jlnomeProduto.setBounds(10, 40, 100, 20);
		
		
	}

	private void criarEventos() {
		// TODO Auto-generated method stub
		
	}
	
	
}
