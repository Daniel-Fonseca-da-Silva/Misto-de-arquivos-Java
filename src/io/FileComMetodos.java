package io;

import java.io.File;
import java.util.Scanner;

public class FileComMetodos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o caminho da pasta");
		String caminho_str = sc.nextLine();
		
		File caminho = new File(caminho_str);
		
		System.out.println("Diretorio atual: " + caminho.getPath()); 
		System.out.println("Pasta Atual: " + caminho.getName());
		System.out.println("Pasta anterior: " + caminho.getParent());
		sc.close();
	}

}
