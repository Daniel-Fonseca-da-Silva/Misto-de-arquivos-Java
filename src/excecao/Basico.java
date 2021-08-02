package excecao;

public class Basico {

	public static void main(String[] args) {
		
		// Se um trecho de codigo pode gera algum erro
		// Entao envolva ele com blocos de try e catch(tente senao)
		
		try 
		{
			// Divisao pode gerar um erro
			System.out.println(7 / 0);
		} 
		catch (ArithmeticException e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		
		System.out.println("Fim...");
		
	}
	
	

}
