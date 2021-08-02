package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		
		System.out.println(resultado1);
		
		// Compose e ao contrario de andThen
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		UnaryOperator<Double> numero = n -> n + Math.random();
		UnaryOperator<Double> fixado = n -> n + 15.82;
		UnaryOperator<Double> desconto = n -> n - (n * 0.51); 
		
		Double valorTotal = numero.andThen(fixado).andThen(desconto).apply((double) resultado1);
		System.out.println(valorTotal);
		
	}

}
