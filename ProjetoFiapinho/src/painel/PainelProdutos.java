package painel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import classes.Produto;

public class PainelProdutos extends JPanel {
	private JLabel jlProdutos;
	private JTextField jtfProdutos;
	private JButton jbMostrar, jbPesquisar;
	private JCheckBox jckSorvetes, jckOutros;
	private JTextArea jtaMostrarProdutos;
	private JScrollPane jsbMostrarProdutos;
	private List<Produto> produtos;
	private Produto produto;
	//construtor
	public PainelProdutos(List<Produto> produtos) {
		super();
		this.produtos = produtos;
		setSize(400, 600);
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
	    jckSorvetes = new JCheckBox("Sorvetes");
	    jckSorvetes.setOpaque(false);
	    jckOutros = new JCheckBox("Outros");
	    jckOutros.setOpaque(false);
	    //adicionando
	    add(jlProdutos);
	    add(jtfProdutos);
	    add(jbMostrar);
	    add(jbPesquisar);
	    add(jsbMostrarProdutos);
	    add(jckSorvetes);
	    add(jckOutros);
	    //dimencionando
	    jlProdutos.setBounds(165, 20, 100, 20);
	    jtfProdutos.setBounds(90, 50, 200, 20);
	    jbMostrar.setBounds(140, 150, 100, 20);
	    jbPesquisar.setBounds(135, 90, 110, 20);
	    jsbMostrarProdutos.setBounds(10, 180, 360, 200);
	    jckSorvetes.setBounds(90, 120, 100, 20);
	    jckOutros.setBounds(200, 120, 100, 20);
	    
	}
	private void criarEventos() {
		jbMostrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrarProdutos.setText("======================Sorvetes======================");
				for (Produto produto : produtos) {
					if (jckSorvetes.isSelected() ) {		
					if (produto.getTipoproduto().equalsIgnoreCase(jckSorvetes.getText())) {
						jtaMostrarProdutos.append(produto.mostrarDados());
						
					}
													
						}
					if (jckOutros.isSelected() ) {		
						if (produto.getTipoproduto().equalsIgnoreCase(jckOutros.getText())) {
							jtaMostrarProdutos.append(produto.mostrarDados());
							
						}		
					}
					}
					}
				
		});
		jbPesquisar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 boolean achou = false;
				 String nome = jtfProdutos.getText();
				jtaMostrarProdutos.setText("======================Sorvetes======================");
				for (Produto produto : produtos) {
					if (nome.equalsIgnoreCase(produto.getNome())) {
						jtaMostrarProdutos.append((produtos.indexOf(produto)+1)+produto.mostrarDados());
						achou = true;
						break;
						}
					}
				if (!achou) {
					JOptionPane.showMessageDialog(null, "Produto não encontrado!", "Sorveteria", JOptionPane.ERROR_MESSAGE);
				}
				jtfProdutos.setText("");
			
					
				}
				
			
		});
		
	}

}
