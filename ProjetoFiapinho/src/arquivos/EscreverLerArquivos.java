package arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Cadastro;
import classes.Produto;

public class EscreverLerArquivos {
	//escrever
	public void escreverArquivo(List<Produto> produtos) {
		try {
			FileOutputStream saida = new FileOutputStream("Sorveteria.bin");
			ObjectOutputStream objeto = new ObjectOutputStream(saida);
			objeto.writeObject(produtos);
			objeto.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo n�o encontrado", "Sorvateria", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Arquivo corrompido", "Sorveteria", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
	}
	//ler
	public List<Produto> lerArquivo(){
		List<Produto> produtos = null;
		try {
			FileInputStream entrada = new FileInputStream("Sorveteria.bin");
			ObjectInputStream objeto = new ObjectInputStream(entrada);
			produtos = (List<Produto>) objeto.readObject();
			objeto.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo n�o encontrado", "Sorvateria", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Arquivo corrompido", "Sorvateria", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Classe n�o encontrada", "Sorvateria", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		return produtos;
			
	}
	//escrever o arquivo cadastro
		public void escreverArquivoCadastro(List<Cadastro> cadastros) {
			try {
				FileOutputStream saida = new FileOutputStream("Cadastro.bin");
				ObjectOutputStream objeto = new ObjectOutputStream(saida);
				objeto.writeObject(cadastros);
				objeto.close();
				JOptionPane.showMessageDialog(null, "Gravado com Sucesso!");
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, "Arquivo n�o encontrado", "Sorvateria", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Arquivo corrompido", "Sorvateria", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
			
		}
		// ler arquivo cadastro
				public List<Cadastro> lerArquivoCadastro(){
					List<Cadastro> cadastros = null;//variavel q vai receber o objeto do arquivo
					try {
						FileInputStream entrada = new FileInputStream("Cadastro.bin");
						ObjectInputStream objeto = new ObjectInputStream(entrada);
						cadastros = (List<Cadastro>) objeto.readObject();
						objeto.close();
					} catch (FileNotFoundException e) {
						JOptionPane.showMessageDialog(null, "Arquivo n�o encontrado", "Sorvateria", JOptionPane.ERROR_MESSAGE);
						e.printStackTrace();
					} catch (IOException e) {
						JOptionPane.showMessageDialog(null, "Arquivo corrompido", "Sorvateria", JOptionPane.ERROR_MESSAGE);
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						JOptionPane.showMessageDialog(null, "Classe n�o encontrada", "Sorvateria", JOptionPane.ERROR_MESSAGE);
						e.printStackTrace();
					}
					return cadastros;
				}

}
