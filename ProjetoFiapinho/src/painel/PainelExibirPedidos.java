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

import classes.Cliente;
import classes.Produto;

public class PainelExibirPedidos extends JPanel {
	private JLabel jlPedidos;
	private JTextField jtfPedidos;
	private JButton  jbPesquisar;
	private JTextArea jtaMostrarPedidos;
	private JScrollPane jsbMostrarPedidos;
	private Cliente cliente;

	//construtor
	public PainelExibirPedidos() {
		super();
		
		setSize(400, 400);
		setLayout(null);
		setBackground(Color.gray); 
		iniciarComponentes();
		criarEventos();
	}
	private void iniciarComponentes() {
		//criando objetos
		jlPedidos = new JLabel("Pedidos");
		jtfPedidos = new JTextField();
	    jbPesquisar = new JButton("PESQUISAR");
	    jtaMostrarPedidos = new JTextArea();
	    jtaMostrarPedidos.setEditable(false);
	    jsbMostrarPedidos = new JScrollPane(jtaMostrarPedidos);
	    
	    //adicionando
	    add(jlPedidos);
	    add(jtfPedidos);
	    add(jbPesquisar);
	    add(jsbMostrarPedidos);
	    
	    //dimencionando
	    jlPedidos.setBounds(165, 20, 100, 20);
	    jtfPedidos.setBounds(90, 50, 200, 20);
	    jbPesquisar.setBounds(145, 90, 110, 20);
	    jsbMostrarPedidos.setBounds(10, 120, 360, 200);
	    
	    
	}
	private void criarEventos() {
		
		jbPesquisar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrarPedidos.setText("======================Sorvetes======================");
			
				
			}
		});
		
	}

}
