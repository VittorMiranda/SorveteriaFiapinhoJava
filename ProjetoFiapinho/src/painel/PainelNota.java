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
import classes.Pedido;
import classes.Produto;

public class PainelNota extends JPanel {
private JLabel jlnota;
private JTextField jtfNota;
private JButton jbpesquisar;
private JTextArea jtanota;
private JScrollPane jspnota;
private List<Pedido> pedidos;


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
	add(jtanota);
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
			for (Pedido pedido : pedidos) {
				if (jtfNota.getText().equalsIgnoreCase(null)) {
					if (pedidos instanceof Pedido) {jtanota.append(pedido.mostrarDadosNota());
						
					}
				}
			}
			}
			
		
	});
	
}

}
