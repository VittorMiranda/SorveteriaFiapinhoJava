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

public class PainelNota extends JPanel {
private JLabel jlnota;
private JButton jbpesquisar;
private JTextArea jtanota;
private JScrollPane jspnota;

//CONSTRUTOR 

public PainelNota() {
	super();
	setSize(400, 400);
	setLayout(null);
	setBackground(Color.pink);
	iniciarComponentes();
	criarEventos();
}

private void iniciarComponentes() {
	
	//OBJETO
	
	jlnota = new JLabel("Nota");
	jbpesquisar = new JButton("Pesquisar");
	jtanota = new JTextArea();
	jspnota = new JScrollPane(jtanota);
	
	//ADICIONAR
	
	add(jlnota);
	add(jbpesquisar);
	add(jtanota);
	add(jspnota);
	
	//DIMENSIONAMENTO
	
	jlnota.setBounds(150, 10, 50, 20);
	jbpesquisar.setBounds(150, 30, 100, 20);
	jspnota.setBounds(10, 200, 200, 50);
	
}

private void criarEventos() {
	
	jbpesquisar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			jtanota.setText("**********Nota**********");
			
			
		}
	});
	
}

}
