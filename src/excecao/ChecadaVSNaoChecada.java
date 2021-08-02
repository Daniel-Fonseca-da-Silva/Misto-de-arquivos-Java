package excecao;

public class ChecadaVSNaoChecada {

	public static void main(String[] args) {
		
		try 
		{
			geraErro1();
		} 
		catch (RuntimeException e) 
		{
			System.out.println(e.getMessage());
		}
		try 
		{
			geraErro2();
		} 
		catch (Throwable e) 
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim...");
		
	}
	
	// Excecao NAO checada ou NAO verificada
	public static void geraErro1()
	{
		// throw lanca o error RuntimeException
		throw new RuntimeException("Ocorreu um erro bem legal! #01");
	}
	
	// Excecao checada ou verificada
	public static void geraErro2() throws Exception
	{
		throw new Exception("Ocorreu um erro bem legal! #02");
	}
	

}
