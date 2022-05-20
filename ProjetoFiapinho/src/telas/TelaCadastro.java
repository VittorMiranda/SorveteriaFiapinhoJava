package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import classes.Cadastro;

public class TelaCadastro extends JFrame {
	private JTextField jtfLogin;    //declara��o de componenetes visuais 
	private JLabel jlSenha;        //utilizados na aplica��o 
	private JLabel jlLogin;        //e cada exemplo podera ser utilizado 
   
	private JButton jbCadastrar;     
	private JPasswordField jpfSenha; 
	private List<Cadastro> cadastros;
	
	

	public TelaCadastro(List<Cadastro> cadastros){ 
		this.cadastros = cadastros;
		setTitle("Transportadora");    
		setSize(250, 250);     
		setLayout (null);
		setLocationRelativeTo(getContentPane());
		inicializarComponentes();
		definirEventos(); 
		

	} 

	
		
	

	/************Metodo para inicializar componentes ****************/ 

	private void inicializarComponentes() { 



		jtfLogin = new JTextField();      // cria��o de objetos e o num define o comprim das caixas de texto  

		jpfSenha = new JPasswordField();//determina o numero de caracter que dever� ter a senha  

		jlSenha = new JLabel("Senha: ");  //cria objetos de labels e botoes c/ seus titulos 

		jlLogin = new JLabel("Login: "); 

		
		jbCadastrar = new JButton("Cadastrar");
		jbCadastrar.setForeground(Color.BLUE);



		/*********Define tamanho e posicionamento dos elementos *****************************/ 



		jtfLogin.setBounds(100, 30, 120, 25);     

		jlLogin.setBounds(30, 30, 80, 25); 

		jlSenha.setBounds(30, 75, 80, 25); 

		jpfSenha.setBounds(100, 75, 120, 25); 

		
		jbCadastrar.setBounds(75, 160, 100, 25);



		/*******************Adiciona elementos � frame   *************************************/	 

		add(jtfLogin);     //os componentes graficos s�o adicionados ao frame como um quebra cabe�as  

		add(jlSenha);     //estes s�o adicionados ao que foi definido anteriormente  

		add(jlLogin); 

		

		add(jpfSenha); 
		add(jbCadastrar);

	} 

	/*******************M�todo que define os eventos ex.: acionar bot�es ******************/	 

	private void definirEventos(){     //defini��o de um m�todo "filho" do anterior que define os eventos  

		
		//evento do bot�o cadastrar
		jbCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			String loguin = jtfLogin.getText();
			String senha = String.valueOf(jpfSenha.getPassword());
			cadastros.add(new Cadastro(loguin, senha));
			
				
				
			}
		});

	} 

}
