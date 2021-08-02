package criaArquivoTexto;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
	
	private static Formatter saida; // envia uma saída de texto para um arquivo
	private static Scanner entrada;
	
	// abre o arquivo clients.txt
	public static void openFile()
	{
		try
		{
			saida = new Formatter("clientes.txt"); // abre o arquivo
		}
		catch (SecurityException securityException)
		{
			System.err.println("Permissão de escrita negada. Terminando.");
			System.exit(1); // termina o programa
		}
		catch (FileNotFoundException fileNotFoundException)
		{
			System.err.println("Erro ao abrir o arquivo. Terminando.");
			System.exit(1); // termina o programa
		}
	}

	// adiciona registros ao arquivo
	public static void addRecords()
	{
		entrada = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n? ",
				"Entre com numero da conta, nome, sobrenome e balanço.",
				"Insira o indicador de fim de arquivo para finalizar a entrada.");
		while (entrada.hasNext()) // faz um loop até o indicador de fim de arquivo
		{
			try
			{
				// gera saída do novo registro para o arquivo; supõe entrada válida
				saida.format("%d %s %s %.2f%n", entrada.nextInt(), entrada.next(), entrada.next(), entrada.nextDouble());
				
			}
			catch (FormatterClosedException formatterClosedException)
			{
				System.err.println("Erro escrever arquivo. Terminando.");
				break;
			}
			catch (NoSuchElementException elementException)
			{
				System.err.println("Entrada invalida. Tente novamente.");
				entrada.nextLine(); // descarta entrada para o usuário tentar de novo
			}
			System.out.print("? ");
		} // fim do while
	} // fim do método addRecords
		// fecha o arquivo

	public static void closeFile()
	{
		if (saida != null)
			saida.close();
	}
} // fim da classe CreateTextFile
