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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import classes.Cliente;

public class PainelPedido extends JPanel {
	private JLabel jlPedido, jlNomeCliente,jlDescricaoPedido, jlEnderecoCliente, jlTelefone, jlFormaPagamento, jlCPF;
	private JTextField jtfNomeCliente, jtfEnderoCliente, jtfTelefone, jtfCPF;
	private JButton jbPedir;
	private JRadioButton jrbCartao, jrbVale, jrbDinheiro,jrbPix;
	private ButtonGroup bgFormaPagamento;
	private JTextArea jtaArea;
	private JScrollPane jspArea;
	private List<Cliente> clientes;
	//construtor
	public PainelPedido(List<Cliente> clientes) {
		super();
		this.clientes = clientes;
		setSize(400, 400);
		setLayout(null);
		setBackground(Color.YELLOW); 
		iniciarComponentes();
		criarEventos();
	}

	private void iniciarComponentes() {
		jlPedido = new JLabel("Pedido");
		jlNomeCliente = new JLabel("Nome:");
		jtfNomeCliente = new JTextField();
		jlTelefone = new JLabel("Telefone:");
		jtfTelefone = new JTextField();
		jlEnderecoCliente = new JLabel("Endereço:");
		jtfEnderoCliente = new JTextField();
		jlFormaPagamento = new JLabel("Forma de Pagamento");
		jrbCartao = new JRadioButton("Cartão");
		jrbCartao.setOpaque(false);
		jrbVale = new JRadioButton("Vale Alimentação");
		jrbVale.setOpaque(false);
		jrbDinheiro = new JRadioButton("Dinheiro");
		jrbDinheiro.setOpaque(false);
		jrbPix = new JRadioButton("Pix");
		jrbPix.setOpaque(false);
		jbPedir = new JButton("Pedir");
		jlCPF = new JLabel("CPF:");
		jtfCPF = new JTextField();
		bgFormaPagamento = new ButtonGroup();
		jlDescricaoPedido = new JLabel("Descrição do Pedido:");
		jtaArea = new JTextArea();
		jspArea = new JScrollPane(jtaArea);
		
		//add
		add(jlCPF);
		add(jtfCPF);
		add(jlEnderecoCliente);
		add(jtfEnderoCliente);
		add(jlFormaPagamento);
		add(jlNomeCliente);
		add(jtfNomeCliente);
		add(jlPedido);
		add(jlTelefone);
		add(jtfTelefone);
		add(jrbCartao);
		add(jrbVale);
		add(jrbDinheiro);
		add(jrbPix);
		add(jbPedir);
		bgFormaPagamento.add(jrbVale);
		bgFormaPagamento.add(jrbCartao);
		bgFormaPagamento.add(jrbPix);
		bgFormaPagamento.add(jbPedir);
		add(jlDescricaoPedido);
		add(jtaArea);
		add(jspArea);
		
		//dimencionar
		jlPedido.setBounds(150, 10, 80, 20);
		jlNomeCliente.setBounds(10, 30, 50, 20);
		jtfNomeCliente.setBounds(10, 50, 200, 20);
		jlCPF.setBounds(10, 80, 50, 20);
		jtfCPF.setBounds(10, 100, 80, 20);
		jlTelefone.setBounds(120, 80, 100, 20);
		jtfTelefone.setBounds(120, 100, 80, 20);
		jlEnderecoCliente.setBounds(10, 130, 100, 20);
		jtfEnderoCliente.setBounds(10, 150, 200, 20);
		jlDescricaoPedido.setBounds(10, 180, 120, 20);
		jspArea.setBounds(10, 200, 200, 50);
		jlFormaPagamento.setBounds(120, 270, 150, 20);
		jrbCartao.setBounds(10, 300, 70, 20);
		jrbVale.setBounds(80, 300, 130, 20);
		jrbDinheiro.setBounds(210, 300, 80, 20);
		jrbPix.setBounds(290, 300, 50, 20);
		jbPedir.setBounds(240, 200, 100, 40);
		
		
		
		
	}

	private void criarEventos() {
		jbPedir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome, formapagamento = null, endereco, descricao, telefone, cpf;
				
				nome = jtfNomeCliente.getText();
				endereco = jtfEnderoCliente.getText();
				descricao = jtaArea.getText();
				telefone = jtfTelefone.getText();
				cpf = jtfCPF.getText();
				
				if(jrbCartao.isSelected()) formapagamento = "Crédito";
				if(jrbVale.isSelected()) formapagamento = "Vale alimentação";
				if(jrbDinheiro.isSelected()) formapagamento = "Dinheiro";
				if(jrbPix.isSelected()) formapagamento = "Pix";
				
				clientes.add(new Cliente(nome, telefone, endereco, formapagamento, cpf));
				
				jtfCPF.setText("");
				jtfEnderoCliente.setText("");
				jtfNomeCliente.setText("");
				jtfTelefone.setText("");
				jtaArea.setText("");
				
				
				
			}
		});
		
	}
	

}
