package ooComposicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	// Relacao 1 Pra n Compra tem muitos itens
	ArrayList<Item> itens = new ArrayList<>();
	
	double getValorTotal()
	{
		double total = 0;
		
		for(Item item: itens)
		{
			total += item.qtd * item.preco;
		}
		
		return total;
	}
	
}
