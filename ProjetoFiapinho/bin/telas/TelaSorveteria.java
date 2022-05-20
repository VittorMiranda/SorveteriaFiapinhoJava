package telas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import classes.Produto;
import painel.PainelCadastro;

public class TelaSorveteria extends JFrame {
	private JMenuBar Jmbbarra;
	private JMenu jmarquivo,jmcadastro,jmprodutos,jmpedidos;
	private JMenuItem jmisair,jmisorvetes,jmioutros,jmiperguntas;
	private List<Produto> produtos = new ArrayList<>();
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
		jmarquivo = new JMenu("Arquivo");
		jmcadastro = new JMenu("Cadastro");
		jmprodutos = new JMenu("Produtos");
		jmpedidos = new JMenu("Pedidos");
		jmisair = new JMenuItem("Sair");
		jmisorvetes = new JMenuItem("Sorvetes");
		jmioutros = new JMenuItem("Outros");
		jmiperguntas = new JMenuItem("Dúvidas Frequentes");
		
		
		//adicionar o menu a barra de  menu
		Jmbbarra.add(jmarquivo);
		Jmbbarra.add(jmcadastro);
		Jmbbarra.add(jmprodutos);
		Jmbbarra.add(jmpedidos);
		
		//adicionar o menu ao item menu
		jmarquivo.add(jmiperguntas);
		jmarquivo.add(jmisair);
		
		
		jmprodutos.add(jmisorvetes);
		jmprodutos.add(jmioutros);
		
	
		
	}

	private void criarEventos() {
		jmisair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sorveteria", JOptionPane.YES_NO_OPTION);
				
				System.exit(0);
			}
		});
		jmcadastro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastro cadastro = new PainelCadastro(produtos);
				contentPane.removeAll(); //REMOVE TODOS OS COMPONENTES DA TELA
				contentPane.add(cadastro); //ADICIONANDO UM PAINEL
				contentPane.validate(); //VALIDA OS COMPONENTES
				
			}
		});
		
	}
	
	
	
}
