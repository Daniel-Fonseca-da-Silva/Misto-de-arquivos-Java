package arrays;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		
		// For normal
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		System.out.println(); // Quebra linha
		/* 
		foreach usado para começar do primeiro elemento até o último,
		para cada valor de notas é acrescentado o valor para variável nota.
		Em Java foreach é escrito como um for, mas, não é um.
		exemplo -> for(tipo variável de escolha : array)
		*/
		for(double nota: notas)
		{
			System.out.println(nota);
		}

	}

}
