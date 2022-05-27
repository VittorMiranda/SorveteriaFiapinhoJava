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
		setBackground(Color.lightGray); 
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
		
		jlcadastro.setBounds(150, 10, 80, 20);
		jlnomeProduto.setBounds(60, 40, 180, 20);
		jtfnomeProduto.setBounds(60, 60, 250, 20);
		jlvalidade.setBounds(60, 90, 100, 20);
		jtfvalidade.setBounds(60, 110, 100, 20);
		jlpreco.setBounds(60, 140, 100, 20);
		jtfpreco.setBounds(	60, 160, 100, 20);
		jlquantidade.setBounds(60, 190, 100, 20);
		jtfquantidade.setBounds(60, 210, 100, 20);
		jlpeso.setBounds(200, 190, 50, 20);
		jtfpeso.setBounds(200, 210, 110, 20);
		jltipoproduto.setBounds(200, 100, 80, 20);
		jrboutros.setBounds(195, 140, 80, 20);
		jrbsorvete.setBounds(195, 120, 80, 20);
		jbCadastrar.setBounds(135, 250, 100, 40);
		
		
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
