package io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileExemplo {

	public static void main(String[] args) {
		
		File file = new File("/media/atharnan/6CB6EF182E4E9853/Java-SE/Java World/JavaCode/clientes.txt");
		Scanner sc = null;
		
//		System.out.println(file.canExecute()); // True ou false pode ou nao execurta o caminho
//		System.out.println(file.canRead()); // True ou false pode ou nao ler o caminho
//		System.out.println(file.canWrite()); // True ou false pode ou nao gravar o caminho
//		System.out.println(file.getAbsolutePath()); // Retorna o caminho do arquivo
//		System.out.println(file.getName()); // Retorna o nome do arquivo
//		System.out.println(file.getFreeSpace()); // Retorna o espaco livre
//		System.out.println(file.getParentFile()); // Retorna o pai do objeto a pasta acima dele
		try
		{
			sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		
		finally // Boa pratica fechar o scanner
		{
			if(sc != null)
			sc.close();
		}
		
	}

}
