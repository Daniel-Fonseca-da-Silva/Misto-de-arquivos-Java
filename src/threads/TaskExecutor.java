package threads;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskExecutor {

	public static void main(String[] args) {
		
		// Cria e nomeia cada executavel
		PrintTask task1 = new PrintTask("task1");
		PrintTask task2 = new PrintTask("task2");
		PrintTask task3 = new PrintTask("task3");
		
		System.out.println("Começando executor");
		
		// Cria ExecutorService para gerenciar threads
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		// Inicia as tres PrintTasks
		executorService.execute(task1); // Inicia a task1
		executorService.execute(task2); // Inicia a task2
		executorService.execute(task3); // Inicia a task3
		
		// Fecha ExecutorService -- ele decide quando fechar as treads
		executorService.shutdown();
		
		System.out.printf("Task começadas, main fim.%n%n");
	}// Fim da classe main

}// fim da classe TaskExecutor
