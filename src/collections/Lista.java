package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		// Get permite acesso atraves do indice em uma Lista
		System.out.println(lista.get(3).nome);// Acesso atraves do indice
		
		System.out.println(">>>> " + lista.remove(1));
		//lista.remove(1); // Carlos removido
		System.out.println(lista.remove(new Usuario("Manu"))); // Manu removido retorna true ou false
		System.out.println(lista.remove(new Usuario("Manu"))); // Manu removido retorna true ou false
		System.out.println(lista.remove(new Usuario("Manu"))); // Manu removido retorna true ou false
		
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia"))); // Tem Lia na Lista
		
		for(Usuario u: lista)
		{
			System.out.println(u);
		}
		
		
	}

}
