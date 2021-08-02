package ooComposicao;

public class Motor {
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	public int giros()
	{
		if (!ligado)
		{
			return 0;
		}
		else
		{	
		return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
