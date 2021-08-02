package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto"); // Adiciona
		usuarios.put(20, "Ricardo"); // altera
		usuarios.put(3, "Rafaela"); // altera
		usuarios.put(4, "Rebeca"); // altera
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // Conjunto das chaves
		System.out.println(usuarios.values()); // Captura os valores
		System.out.println(usuarios.entrySet()); // captura chaves e valores
		System.out.println(usuarios.containsKey(20)); // true
		System.out.println(usuarios.containsValue("Rebeca")); // true
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		
		// Pecorrendo pelas chaves
		for(int chave: usuarios.keySet())
		{
			System.out.println("Chave atual: " + chave);
		}
		
		// Peccorendo pelos valores
		for(String valor: usuarios.values())
		{
			System.out.println("Valor atual: " + valor);
		}
		
		// Pecorrendo pelas chaves e valores ao mesmo tempo
		for(Entry<Integer, String> registro: usuarios.entrySet())
		{
			System.out.println("Registro atual: " + registro);
			System.out.println();
			System.out.print(registro.getKey() + " -> ");
			System.out.print(registro.getValue());
		}
		
	}

}
