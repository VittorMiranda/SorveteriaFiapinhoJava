package telas;

import java.awt.Color;
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
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import java.awt.Container;

import classes.Cliente;
import classes.Produto;
import painel.PainelCadastroProdutos;
import painel.PainelPedido;
import painel.PainelSorvete;


public class TelaSorveteria extends JFrame {
	private JMenuBar Jmbbarra;
	private JMenu jmarquivo,jmcadastro,jmExibir;
	private JMenuItem jmisair,jmiProdutos,jmiPedidos,jmiperguntas,jmiprodutos,jmipedidos;
	private Container contentPane;
	private List<Produto> produtos = new ArrayList<>();
	private List<Cliente> clientes = new ArrayList<>();
	
	//construtor
	public TelaSorveteria(String title) throws HeadlessException {
		super(title);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(245, 56, 56));
		iniciarComponentes();
		criarEventos();
		
	}
	
	

	private void iniciarComponentes() {
		//criar objetos
		Jmbbarra = new JMenuBar();
		setJMenuBar(Jmbbarra);
		Jmbbarra.setBackground(Color.black);;
		jmarquivo = new JMenu("Arquivo");
		jmarquivo.setForeground(Color.white);
		jmcadastro = new JMenu("Cadastro");
		jmcadastro.setForeground(Color.gray);
		jmExibir = new JMenu("Exibir");
		jmExibir.setForeground(Color.white);
		jmipedidos = new JMenuItem("Pedidos");
		jmiprodutos = new JMenuItem("Produtos");
		jmisair = new JMenuItem("Sair");
		jmiProdutos = new JMenuItem("Produtos");
		jmiPedidos = new JMenuItem("Pedidos");
		jmiperguntas = new JMenuItem("Dúvidas Frequentes");
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
		jmExibir.add(jmiPedidos);
		
	
		
	}

	private void criarEventos() {
		jmisair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sorveteria", JOptionPane.YES_NO_OPTION);
				
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
				PainelSorvete painelSorvete = new PainelSorvete(produtos);
				contentPane.removeAll();
				contentPane.add(painelSorvete);
				contentPane.validate();
				
			}
		});
	
		
	}
	
	
	
}
