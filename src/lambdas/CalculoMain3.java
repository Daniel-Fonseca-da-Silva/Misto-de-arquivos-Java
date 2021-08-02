package lambdas;

import java.util.function.BinaryOperator;

public class CalculoMain3 {
	
	public static void main(String[] args) {
		
//		Nao permite int -> Double
//		Double a = 1;
//		double -> Double
		
		
		BinaryOperator<Double> calc = (a, b) -> { return a + b; };
		System.out.println(calc.apply(2.0, 5.0));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 5.0));
		
		
		BinaryOperator<Integer> calc2 = (a, b) -> { return a + b; };
		System.out.println(calc2.apply(5, 5));
		
		calc = (x, y) -> x * y;
		System.out.println(calc2.apply(5, 5));
		
	}
}
