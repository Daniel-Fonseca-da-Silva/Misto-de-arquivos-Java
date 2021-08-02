package lambdas;

/**
 * Soma dois valores
 * @param A valor flutuante.
 * @param B valor flutuante.
 * @return retorna soma de A e B.
 */
public class Somar implements Calculo{
	
	public double executar(double a, double b) {
		
		return a + b;
	}

}
