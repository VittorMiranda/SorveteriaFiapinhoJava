package telas;

import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import arquivo.EscreverLerArquivo;
import classes.Cliente;
import classes.Produto;
import painel.PainelCadastroProdutos;
import painel.PainelExibirPedidos;
import painel.PainelNota;
import painel.PainelPedido;
import painel.PainelProdutos;


public class TelaSorveteria extends JFrame {
	private JMenuBar Jmbbarra;
	private JMenu jmarquivo,jmcadastro,jmExibir;
	private JMenuItem jmisair,jmiProdutos,jmiMostrarPedidos,jmiperguntas,jmiprodutos,jmipedidos, jmiNotas;
	private Container contentPane;
	private EscreverLerArquivo arquivo = new EscreverLerArquivo();
	private List<Produto> produtos = new ArrayList<>();
	private List<Cliente> clientes = new ArrayList<>();

	
	//construtor
	public TelaSorveteria(String title) throws HeadlessException {
		super(title);
		setSize(400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(245, 56, 56));
		iniciarComponentes();
		criarEventos();
		escreverLerArquivos();
		
	}
	
	

	private void escreverLerArquivos() {
		if (arquivo.lerArquivo() != null) {
			produtos = arquivo.lerArquivo();
			
		}
		
	}

	private void iniciarComponentes() {
		//criar objetos
		Jmbbarra = new JMenuBar();
		setJMenuBar(Jmbbarra);
		Jmbbarra.setBackground(Color.black);;
		jmarquivo = new JMenu("Arquivo");
		jmarquivo.setForeground(Color.white);
		jmcadastro = new JMenu("Cadastro");
		jmcadastro.setForeground(Color.white);
		jmExibir = new JMenu("Exibir");
		jmExibir.setForeground(Color.white);
		jmipedidos = new JMenuItem("Pedidos");
		jmiprodutos = new JMenuItem("Produtos");
		jmisair = new JMenuItem("Sair");
		jmiProdutos = new JMenuItem("Produtos");
		jmiMostrarPedidos = new JMenuItem("Pedidos");
		jmiperguntas = new JMenuItem("Dúvidas Frequentes");
		jmiNotas = new JMenuItem("Notas");
		contentPane = getContentPane();
		
		
		//adicionar o menu a barra de  menu
		Jmbbarra.add(jmarquivo);
		Jmbbarra.add(jmcadastro);
		Jmbbarra.add(jmExibir);
		
		jmcadastro.add(jmipedidos);
		jmcadastro.add(jmiprodutos);
		
		
		//adicionar o menu ao item menu
		jmarquivo.add(jmiperguntas);
		jmarquivo.add(jmisair);
		
		
		jmExibir.add(jmiProdutos);
		jmExibir.add(jmiMostrarPedidos);
		jmExibir.add(jmiNotas);
	
		
	}

	private void criarEventos() {
		jmisair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sorveteria", JOptionPane.YES_NO_OPTION);
				if(resposta == 0) {
					arquivo.escreverArquivo(produtos);
					
				}
				System.exit(0);
			}
		});
		//evento do botao cadastrar
		jmipedidos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelPedido painelPedido = new PainelPedido(clientes);
				contentPane.removeAll();
				contentPane.add(painelPedido);
				contentPane.validate();
				
			}
		});
jmiprodutos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastroProdutos cadastroProdutos = new PainelCadastroProdutos(produtos);
				contentPane.removeAll();
				contentPane.add(cadastroProdutos);
				contentPane.validate();
				
			}
		});
		
		
		
jmiProdutos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelProdutos painelSorvete = new PainelProdutos(produtos);
				contentPane.removeAll();
				contentPane.add(painelSorvete);
				contentPane.validate();
				
			}
		});

jmiMostrarPedidos.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		PainelExibirPedidos exibirPedidos = new PainelExibirPedidos(clientes);
		contentPane.removeAll();
		contentPane.add(exibirPedidos);
		contentPane.validate();
		
	}
});

jmiNotas.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		PainelNota painelNota = new PainelNota(clientes);
		contentPane.removeAll();
		contentPane.add(painelNota);
		contentPane.validate();
		
	}
});
	
		
	}
	
	
	
}
