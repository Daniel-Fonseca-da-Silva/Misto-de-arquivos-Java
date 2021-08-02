package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		Supplier<List<String>> umLista = 
		() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");	
		Supplier<List<Integer>> numeros = () -> Arrays.asList(1, 2, 3, 4, 5);
		Supplier<Double> randomizado = () -> Math.random();
		Supplier<Character> letra = () -> 'M';
		
		System.out.println(umLista.get());
		System.out.println(numeros.get());
		System.out.println(randomizado.get());
		System.out.println(letra.get());
		
	}

}
