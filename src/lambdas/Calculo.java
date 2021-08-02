package lambdas;

// @FunctionalInterface notacao Interface funcional
// Forca a ter 1 unico metodo

@FunctionalInterface
public interface Calculo {
	
	public abstract double executar(double a, double b);
	// nao funciona double test();
	
	default String legal()
	{
		return "Legal";
	}
	
	static String  muitoLegal()
	{
		return "Muito Legal";
	}
}
