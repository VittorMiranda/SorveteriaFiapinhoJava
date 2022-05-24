package telas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import arquivos.EscreverLerArquivos;
import classes.Cadastro;

public class TelaLoguin extends JFrame {
	
	private JTextField jtfLogin;    //declaração de componenetes visuais 
	private JLabel jlSenha;        //utilizados na aplicação 
	private JLabel jlLogin;        //e cada exemplo podera ser utilizado 
	private JButton jbLogar;       //um componente diferente 
	private JButton jbCancelar,jbCadastrar;
	private EscreverLerArquivos arquivo = new EscreverLerArquivos();
	private JPasswordField jpfSenha; 
	private static TelaLoguin frame;     
	private List<Cadastro> cadastros = new ArrayList<>();	

	public TelaLoguin(){        
		setTitle("Sorveteria");    
		setSize(250, 250);     
		setLayout (null); 
		inicializarComponentes();
		definirEventos();
		abrirArquivo();

	} 

	
		
	

	private void abrirArquivo() {
		if (arquivo.lerArquivoCadastro() != null) {
			cadastros = arquivo.lerArquivoCadastro();
			
			
		}
		
	}





	/************Metodo para inicializar componentes ****************/ 

	private void inicializarComponentes() { 



		jtfLogin = new JTextField(5);      // criação de objetos e o num define o comprim das caixas de texto  

		jpfSenha = new JPasswordField(5);//determina o numero de caracter que deverá ter a senha  

		jlSenha = new JLabel("Senha: ");  //cria objetos de labels e botoes c/ seus titulos 

		jlLogin = new JLabel("Login: "); 

		jbLogar = new JButton("Logar"); 

		jbCancelar = new JButton("Cancelar"); 
		jbCadastrar = new JButton("Cadastrar");
		jbCadastrar.setForeground(Color.BLUE);



		/*********Define tamanho e posicionamento dos elementos *****************************/ 



		jtfLogin.setBounds(100, 30, 120, 25);     

		jlLogin.setBounds(30, 30, 80, 25); 

		jlSenha.setBounds(30, 75, 80, 25); 

		jpfSenha.setBounds(100, 75, 120, 25); 

		jbLogar.setBounds(20, 120, 100, 25); 

		jbCancelar.setBounds(125, 120, 100, 25); 
		jbCadastrar.setBounds(75, 160, 100, 25);



		/*******************Adiciona elementos à frame   *************************************/	 

		add(jtfLogin);     //os componentes graficos são adicionados ao frame como um quebra cabeças  

		add(jlSenha);     //estes são adicionados ao que foi definido anteriormente  

		add(jlLogin); 

		add(jbLogar); 

		add(jbCancelar); 

		add(jpfSenha); 
		add(jbCadastrar);

	} 

	/*******************Método que define os eventos ex.: acionar botões ******************/	 

	private void definirEventos(){     //definição de um método "filho" do anterior que define os eventos  

		jbLogar.addActionListener(new ActionListener() { 



			@Override 

			public void actionPerformed(ActionEvent arg0) { 
				boolean achou = false;
				String loguin = jtfLogin.getText();
				String senha = String.valueOf(jpfSenha.getPassword());
				for (Cadastro cadastro : cadastros) {
					if (loguin.equals(cadastro.getLoguin()) && senha.equals(cadastro.getSenha()) ) {
						achou = true;
						TelaSorveteria tela = new TelaSorveteria("Sorveteria Fiapinho");
						tela.setVisible(true);
						setVisible(false);
						break;
					}
				}
				if (!achou) {
					JOptionPane.showMessageDialog(null, "Usuario ou senha incorreta!", "Transportadora", JOptionPane.ERROR_MESSAGE);
					
				}
		}
				
		}); 



		jbCancelar.addActionListener(new ActionListener() { 

			public void actionPerformed(ActionEvent arg0) { 



				System.exit(0);                             // sai do programa  

			} 

		}); 
		//evento do botão cadastrar
		jbCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			TelaCadastro cadastro = new TelaCadastro(cadastros);
			cadastro.setVisible(true);
				
				
			}
		});

	} 

	//metodo principal  

	public static void main(String[] args) { 

		SwingUtilities.invokeLater(new Runnable() { 

			public void run() { 

				frame = new TelaLoguin(); 

				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra aplicação qd a janela é fechada  

				Dimension tela = Toolkit.getDefaultToolkit().getScreenSize(); // metodos que manipulam dimensão da tela do ambiente gráfico 

				frame.setLocation((tela.width - (frame).getSize().width)/2,           

						(tela.height - frame.getSize().height)/2);		   // centraliza janela coluna e a janela linha  

				frame.setVisible(true); 

			} 

		}); 

	} 

}
