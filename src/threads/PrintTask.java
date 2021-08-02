package threads;

import java.security.SecureRandom;

public class PrintTask implements Runnable{
	
	private static final SecureRandom generator = new SecureRandom();
	private final int sleepTime; // Tempo de adormecimento aleatorio para a a tread
	private final String taskName;
	
	// Construtor
	public PrintTask(String taskName)
	{
		this.taskName = taskName;
		// Seleciona tempo de adormecimento aleatorio entre 0 e 5 segundos
		sleepTime = generator.nextInt(5000); // Milissegundos
	}
	
	// Metodo run contem o codigo que uma tread executara
	public void run() {
		
		try // Coloca a tread para dormi pela quantidade de tempo sleepTime
		{
			System.out.printf("%s esta indo dormi por %d millesegundos.%n",
			taskName, sleepTime);
			Thread.sleep(sleepTime); // Coloca a thread para dormir
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			Thread.currentThread().interrupt(); // Reinterrompe a thread
		}
		
		// Imprime o nome da tarefa
		System.out.printf("%s terminou de dormi%n", taskName);
	}// Fim do metodo run

}// fim da classe PrintTask
