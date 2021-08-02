package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
			
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;

		System.out.println(Arrays.toString(notasAlunoA));
		
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length -1]);
		
		// Percorrendo array
		// metódo length captura o tamanho do array
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++)
		{
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		
		// Iniciando um array com valores literais
		
		final double notaArmazenada = 2.0;
		
		double[] notasAlunoB = {9.5, 7.1, notaArmazenada, 9.1, 10};
		
		double totalAlunoB = 0;
		
		for (int i = 0; i < notasAlunoB.length; i++) 
		{
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}

}
