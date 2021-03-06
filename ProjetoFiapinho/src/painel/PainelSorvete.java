package painel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import classes.Produto;

public class PainelSorvete extends JPanel {
	private JLabel jlProdutos;
	private JTextField jtfProdutos;
	private JButton jbMostrar, jbPesquisar;
	private JTextArea jtaMostrarProdutos;
	private JScrollPane jsbMostrarProdutos;
	private List<Produto> produtos;
	//construtor
	public PainelSorvete(List<Produto> produtos) {
		super();
		this.produtos = produtos;
		setSize(400, 400);
		setLayout(null);
		setBackground(Color.lightGray); 
		iniciarComponentes();
		criarEventos();
	}
	private void iniciarComponentes() {
		//criando objetos
		jlProdutos = new JLabel("Produtos");
		jtfProdutos = new JTextField();
		jbMostrar = new JButton("MOSTRAR");
	    jbPesquisar = new JButton("PESQUISAR");
	    jtaMostrarProdutos = new JTextArea();
	    jtaMostrarProdutos.setEditable(false);
	    jsbMostrarProdutos = new JScrollPane(jtaMostrarProdutos);
	    
	    //adicionando
	    add(jlProdutos);
	    add(jtfProdutos);
	    add(jbMostrar);
	    add(jbPesquisar);
	    add(jsbMostrarProdutos);
	    
	    //dimencionando
	    jlProdutos.setBounds(165, 20, 100, 20);
	    jtfProdutos.setBounds(90, 50, 200, 20);
	    jbMostrar.setBounds(65, 90, 100, 20);
	    jbPesquisar.setBounds(200, 90, 110, 20);
	    jsbMostrarProdutos.setBounds(10, 120, 360, 200);
	    
	    
	}
	private void criarEventos() {
		jbMostrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrarProdutos.setText("======================Sorvetes======================");
				for (Produto produto : produtos) {
					jtaMostrarProdutos.append(produto.mostrarDados());
							
						}
					}
		});
		jbPesquisar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrarProdutos.setText("======================Sorvetes======================");
				for (Produto produto : produtos) {
					if (jtfProdutos.getText().equalsIgnoreCase(null)) {
						if (produtos instanceof Produto) {jtaMostrarProdutos.append(produto.mostrarDados());
							
						}
					}
					
					
				}
				
			}
		});
		
	}

}
