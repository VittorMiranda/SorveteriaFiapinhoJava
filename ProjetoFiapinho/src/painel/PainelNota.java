package painel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import arquivo.EscreverLerArquivo;
import classes.Cliente;
import classes.Pedido;
import classes.Produto;

public class PainelNota extends JPanel {
private JLabel jlnota;
private JTextField jtfNota;
private JButton jbpesquisar;
private JTextArea jtanota;
private JScrollPane jspnota;
private List<Pedido> pedidos;
private EscreverLerArquivo arquivo = new EscreverLerArquivo();


//CONSTRUTOR 

public PainelNota(List<Pedido> pedidos) {
	super();
	this.pedidos = pedidos;
	setSize(400, 400);
	setLayout(null);
	setBackground(Color.lightGray);
	iniciarComponentes();
	criarEventos();
	
	
}

private void escreverLerArquivo() {
	
	
}


private void iniciarComponentes() {
	
	//OBJETO
	
	jlnota = new JLabel("Nota");
	jbpesquisar = new JButton("Pesquisar");
	jtanota = new JTextArea();
	jtfNota = new JTextField();
	jspnota = new JScrollPane(jtanota);
	
	//ADICIONAR
	
	add(jlnota);
	add(jbpesquisar);
	add(jspnota);
	add(jtfNota);
	
	//DIMENSIONAMENTO
	
	jlnota.setBounds(165, 20, 100, 20);
	jtfNota.setBounds(90, 50, 200, 20);
	jbpesquisar.setBounds(135, 90, 110, 20);
	jspnota.setBounds(10, 150, 360, 200);
	
}

private void criarEventos() {
	
	jbpesquisar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			jtanota.setText("======================Nota======================");
			boolean achou = false;
			 String cpf = jtfNota.getText();
			for (Pedido pedido : pedidos) {
			if (cpf.equals(pedido.getCpf())) {
				jtanota.append((pedidos.indexOf(pedido)+1)+pedido.mostrarDadosPedido());
				achou = true;
				break;
			}
			}
			if (!achou) {
				JOptionPane.showMessageDialog(null, "Pedido não encontrado!", "Sorveteria", JOptionPane.ERROR_MESSAGE);
			}
			jtfNota.setText("");
			
		
		}});
	
}}


