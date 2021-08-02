package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!");
		
		Produto  p1 = new Produto("Caneta", 5.95, 0.9);
		imprimirNome.accept(p1);
		
		Produto  p2 = new Produto("Livro", 15.95, 0.11);
		Produto  p3 = new Produto("Apontador", 3.45, 0.2);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
