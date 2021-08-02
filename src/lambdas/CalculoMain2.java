package lambdas;

public class CalculoMain2 {
	
	public static void main(String[] args) {
		
		
		// Cria uma variavel do tipo da Interface Calculo chamado calc
		// que recebe um metodo que faz a soma dos valores double
		// Java sabe exatamante quais valores vão ser passados e retornados
		// deve ser retornado 1 valor double pois a funcao da interface
		// so recebera dois valores do tipo double
		
		Calculo calc = (a, b) -> { return a + b; };
		// Esses valores vao ir para o metodo da interface 
		// Como se fosse isto abaixo
		// executar = (a, b) -> { return a + b; };
		
		System.out.println(calc.executar(5, 5));
		
		// A omissao das chaves faz que o Java
		// retorne automaticamente pois agora existe um return(invisivel)
		
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 5));
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
	}
}
