package painel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Teste extends JPanel {
	private JLabel jlDeletat, jlIndice;
	private JTextField jtfIndice;
	private JButton jbDeletar;
	

	public Teste() {
		super();
	
		setSize(400, 400);//largura,altura
		setLayout(null);		
		setBackground(Color.lightGray);
		iniciarComponentes();
		criarEventos();
	}

	private void iniciarComponentes() {
		// criando componentes
		jlDeletat = new JLabel("DELETAR");
		jlDeletat.setForeground(Color.red);
		jlIndice = new JLabel("Índice");
		jlIndice.setForeground(Color.white);
		jtfIndice = new JTextField();
		jbDeletar = new JButton("DELETAR");
		//adicionando
		add(jlDeletat);
		add(jlIndice);
		add(jtfIndice);
		add(jbDeletar);
		//dimencionando
		jlDeletat.setBounds(165, 10, 80, 20);
		jlIndice.setBounds(175, 60, 100, 40);
		jtfIndice.setBounds(150, 100, 80, 20);
		jbDeletar.setBounds(140, 160, 100, 20);
		
		
	}

	private void criarEventos() {
		
		
	}
	
}
