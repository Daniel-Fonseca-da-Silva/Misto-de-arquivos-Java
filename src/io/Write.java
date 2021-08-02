package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		
		// Escreve no arquivo estes textos
		String[] lines = new String[] {"Quantidade, ", "Produto, ", "Preco."};
		
		// Caminho para criar o arquivo e sua extensao
		String path = "/media/atharnan/6CB6EF182E4E9853/Java-SE/Java World/JavaCode/Produtos.txt";
		
		// True somente ler, sem true sobrescreve ou cria arquivo
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)))
		{
			for(String line: lines)
				bw.write(line); // Escreve line no arquivo
				bw.newLine(); // Finaliza o arquivo
				bw.write('A'); // Adiciona 1 caracter
				bw.append("dicionado texto");
		}
		// Tratamento de erro
		catch(IOException e)
		{
			
			System.err.println("Erro: " + e.getMessage());
		}
		
	}

}
