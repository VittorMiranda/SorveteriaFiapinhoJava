package painel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import classes.Cadastro;
import classes.Produto;

public class PainelCadastroProdutos extends JPanel {
	private JLabel jlcadastro, jlnomeProduto, jlpreco, jlpeso,jlvalidade, jlquantidade, jltipoproduto ;
	private JTextField jtfpreco, jtfpeso, jtfnomeProduto, jtfvalidade, jtfquantidade;
	private JRadioButton jrbsorvete, jrboutros;
	private ButtonGroup bgtipoprodutos;
	private JButton jbCadastrar;
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
		jlnomeProduto = new JLabel("Nome do Produto:");
		jtfnomeProduto = new JTextField();
		jlpeso = new JLabel("Peso:");
		jtfpeso = new JTextField();
		jlpreco = new JLabel("Preço:");
		jtfpreco = new JTextField();
		jlquantidade = new JLabel("Quantidade:");
		jtfquantidade = new JTextField();
		jltipoproduto = new JLabel("Produto:");
		jlvalidade = new JLabel("Validade:");
		jtfvalidade = new JTextField();
		jrboutros = new JRadioButton("Outros");
		jrboutros.setOpaque(false);
		jrbsorvete = new JRadioButton("Sorvete");
		jrbsorvete.setOpaque(false);
		bgtipoprodutos = new ButtonGroup();
		jbCadastrar = new JButton("Cadastrar");
		
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
		add(jbCadastrar);
		
		//dimencionar 
		
		jlcadastro.setBounds(100, 10, 80, 20);
		jlnomeProduto.setBounds(10, 40, 240, 20);
		jtfnomeProduto.setBounds(10, 60, 150, 20);
		jlvalidade.setBounds(10, 90, 80, 20);
		jtfvalidade.setBounds(10, 110, 80, 20);
		jlpreco.setBounds(10, 140, 80, 20);
		jtfpreco.setBounds(	10, 160, 50, 20);
		jlquantidade.setBounds(10, 190, 100, 20);
		jtfquantidade.setBounds(10, 210, 100, 20);
		jlpeso.setBounds(150, 190, 50, 20);
		jtfpeso.setBounds(150, 210, 50, 20);
		jltipoproduto.setBounds(150, 100, 80, 20);
		jrboutros.setBounds(145, 140, 80, 20);
		jrbsorvete.setBounds(145, 120, 80, 20);
		jbCadastrar.setBounds(60, 250, 100, 40);
		
		
	}

	private void criarEventos() {
		jbCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String validade,nome,tipoproduto = null;
				double preco,peso = 0;
				int quantidade = 0;
				
				validade = jtfvalidade.getText();
				nome = jtfnomeProduto.getText();
				preco = Double.parseDouble(jtfpreco.getText());
				peso = Double.parseDouble(jtfpeso.getText());
				quantidade = Integer.parseInt(jtfquantidade.getText());
				
				if (jrboutros.isSelected()) tipoproduto = "Outros";
				if (jrbsorvete.isSelected()) tipoproduto = "Sorvetes";
				
				produtos.add(new Produto(validade, nome, tipoproduto, preco, peso, quantidade));
				jtfnomeProduto.setText("");
				jtfpeso.setText("");
				jtfpreco.setText("");
				jtfquantidade.setText("");
				jtfvalidade.setText("");
				
				
				
				
			}
		});
		
	}
	
	
}
