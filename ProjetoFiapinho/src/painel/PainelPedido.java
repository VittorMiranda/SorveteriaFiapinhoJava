package painel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PainelPedido extends JPanel {
	private JLabel jlPedido, jlNomeCliente,jlDescricaoPedido, jlEnderecoCliente, jlTelefone, jlFormaPagamento, jlCPF;
	private JTextField jtfNomeCliente, jtfEnderoCliente, jtfTelefone, jtfCPF;
	private JButton jbPedir;
	private JRadioButton jrbCredito, jrbDebito, jrbDinheiro,jrbPix;
	private ButtonGroup bgFormaPagamento;
	private JTextArea jtaArea;
	
	//construtor
	public PainelPedido() {
		super();
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
		jrbCredito = new JRadioButton("Credito");
		jrbDebito = new JRadioButton("Debito");
		jrbDinheiro = new JRadioButton("Dinheiro");
		jrbPix = new JRadioButton("Pix");
		jbPedir = new JButton("Pedir");
		jlCPF = new JLabel("CPF");
		jtfCPF = new JTextField();
		bgFormaPagamento = new ButtonGroup();
		jlDescricaoPedido = new JLabel("Descrição do Pedido");
		jtaArea = new JTextArea();
		
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
		add(jrbCredito);
		add(jrbDebito);
		add(jrbDinheiro);
		add(jrbPix);
		add(jbPedir);
		bgFormaPagamento.add(jrbDebito);
		bgFormaPagamento.add(jrbCredito);
		bgFormaPagamento.add(jrbPix);
		bgFormaPagamento.add(jbPedir);
		add(jlDescricaoPedido);
		add(jtaArea);
		
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
		jtaArea.setBounds(10, 200, 200, 50);
		jlFormaPagamento.setBounds(50, 280, 150, 20);
		jrbCredito.setBounds(10, 300, 70, 20);
		jrbDebito.setBounds(110, 300, 70, 20);
		jrbDinheiro.setBounds(210, 300, 80, 20);
		jrbPix.setBounds(310, 300, 50, 20);
		jbPedir.setBounds(50, 4430, 60, 40);
		
		
		
		
		
	}

	private void criarEventos() {
		jbPedir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome, formapagamento, endereco,descricao,telefone = null;
				double cpf = 0;
				
				
			}
		});
		
	}
	

}
