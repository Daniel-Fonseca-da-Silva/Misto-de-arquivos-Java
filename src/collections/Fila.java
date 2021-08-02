package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

			Queue<String> fila = new LinkedList<>();
			
			// offer e add -> adicionam elementos na fila
			// A diferenca é o comportamento quando a fila esta cheia
			
			fila.add("Ana"); // retorna false
			fila.offer("Bia"); // Lança uma excecao
			fila.offer("Carlos");
			fila.offer("Daniel");
			fila.offer("Rafaela");
			fila.offer("Gui");
			
			// Peek e element -> obtem o proximo elemento sem remover
			
			System.out.println(fila.peek()); // retorna false
			System.out.println(fila.element()); // Lança uma excecao
			
			// fila.size();
			// fila.clear();
			// fila.isEmpty(); 
			// fila.contains(...)
			
			// pool e remove -. obtem o proximo elemento da fila e remove
			
			System.out.println(fila.poll()); // retorna o primeiro elemento da fila removendo
			System.out.println(fila.remove());	// Lança uma excecao
			System.out.println(fila.poll());  // retorna false
			System.out.println(fila.remove());
	}

}
