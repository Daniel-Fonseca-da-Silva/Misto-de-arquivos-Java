package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// Collection não aceita tipos primitivos
		
		HashSet conjunto = new HashSet();
		
		// "add" -> adiciona objetos a uma colecao
		
		conjunto.add(1.2); // converte para Double etc
		conjunto.add(true); 
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho: " + conjunto.size());
		
		conjunto.add("Teste"); // Não aceita repeticao
		conjunto.add('x'); // Não aceita repeticao
		System.out.println("Tamanho: " + conjunto.size());
		
		/* 
		"remove" -> Remove objetos do conjunto.
		Retorna true se existir objeto para remocao,
		e false se não existe objeto para remocao.
		*/
		System.out.println(conjunto.remove("Teste"));	
		
		// "size" -> informa o tamanho do conjunto 
		System.out.println("Tamanho atual: " + conjunto.size());
		
		
		
		// "contains" -> verifica se a colecao contem o objeto informado, retornando true ou false
		System.out.println(conjunto.contains('x'));// true ainda não removido
		System.out.println(conjunto.contains("Teste"));// falso já removido
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.add(nums); // uniao -> entre 2 conjuntos fora de ordem
		conjunto.retainAll(nums); // intersecao -> pega somente valores que estao em 2 conjuntos 
		System.out.println(conjunto);
		
		conjunto.clear(); // Limpa os valores do conjunto
		System.out.println(conjunto);
	}
	

}
