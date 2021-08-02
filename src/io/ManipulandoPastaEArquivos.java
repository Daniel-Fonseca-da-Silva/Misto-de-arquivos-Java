package io;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastaEArquivos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o caminho da pasta");
		String caminho_salvo = sc.nextLine();// Armazena o caminho
		
		// Passando o caminho das pasta para o caminho tipo File
		File caminho = new File(caminho_salvo);
		
		
		// Cria um vetor pastas do tipo File
		File[] pastas = caminho.listFiles(File::isDirectory);
		System.out.println("Pastas atuais:");
		
		 for(File pasta : pastas)
		 {
			 System.out.println(pasta);
		 }
		 
		 // Cria um vetor arquivos do tipo File
		 File[] arquivos = caminho.listFiles(File::isFile);
		 System.out.println("Arquivos atuais:");
		 
		 for(File arquivo : arquivos)
		 {
			 System.out.println(arquivo);
		 }
		 
		 // Criando uma pasta no direitorio 
		 // Windows use \\
		 // Linux use //
		 boolean sucesso = new File(caminho + "//Pasta Criada").mkdir();
		 System.out.println("Diretorio criado com sucesso: " + sucesso);
		
		sc.close();
		
	}

}
