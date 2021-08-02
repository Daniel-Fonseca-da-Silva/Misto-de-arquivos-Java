package ooComposicao;

public class CompraTest {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Carla Alvarez Garcia";
		
		compra1.itens.add(new Item("Cardeno Book Smooth", 5, 12.99));
		compra1.itens.add(new Item("Corretivo White Clean", 1, 1.99));
		compra1.itens.add(new Item("Gravite Gray", 5, 7.99));
		compra1.itens.add(new Item("Mochila Big", 1, 56.85));
		
		
		System.out.println(compra1.itens.size());
		System.out.println("valor total: " + compra1.getValorTotal());
	}

}
