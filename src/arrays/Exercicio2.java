package arrays;

public class Exercicio2 {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
			
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		for(double i:notasAlunoA)
		{
			System.out.println(i);
		}

		final double notaArmazenada = 5.5;
		
		double[] notasAlunoB = {9.5, 7.1, notaArmazenada, 9.1, 10};
		
		for(double valor: notasAlunoB)
		{
			System.err.println(valor);
		}
	
	}

}
