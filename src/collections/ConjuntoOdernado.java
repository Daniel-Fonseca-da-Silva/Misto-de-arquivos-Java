package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoOdernado {

	public static void main(String[] args) {
		
		// <> obriga somente a lista aceita tipos String
		Set<String> listaAprovados = new HashSet<>();
		//SortedSet<String> listaAprovados = new TreeSet<>(); // Respeita a ordem de insercao
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Piere");
		
		for(String valor: listaAprovados)
		{
			System.out.println(valor);
		}
		
		Set<Integer> nums = new HashSet<>(); 
			
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums)
			System.out.println(n);

	}

}
