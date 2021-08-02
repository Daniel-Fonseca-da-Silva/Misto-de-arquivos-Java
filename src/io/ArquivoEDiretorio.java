package io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArquivoEDiretorio {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com arquivo ou nome do diretorio");
		
		// Cria o objeto Path com base na entrada de usuário
		Path path = Paths.get(input.nextLine());
		
		// Se o caminho existe, gera uma saída das informações sobre ele
		if(Files.exists(path))
		{
			// Exibe informações sobre o arquivo (ou diretório)
			System.out.printf("%n%s existe %n", path.getFileName());
			System.out.printf("%s um diretorio %n",
			Files.isDirectory(path) ? "É" : "Não é");
			
			System.out.printf("%s um path absoluto ",
			path.isAbsolute()? "É" : "Não é");
			
			System.out.printf("Ultima modificacao: %s %n",
			Files.getLastModifiedTime(path));
			
			System.out.printf("Tamanho: %s%n", Files.size(path));
			System.out.printf("Path: %s%n", path);
			System.out.printf("Absoluto path: %s%n", path.toAbsolutePath());
			
			// Listagem de diretório de saída
			if(Files.isDirectory(path))
			{
				System.out.printf("%nDiretorio contem: %n");
				
				// Objeto para iteracao pelo conteudo de um diretorio
				DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
				
				for(Path p : directoryStream)
					System.out.println(p);
			}
			// Se não for arquivo ou diretorio, gera saida de erro
			else
			{
				System.out.printf("O %s arquivo não existe %n", path);
			}
			

		}

	}

}
