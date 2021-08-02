package criaArquivoTexto;

public class Principal {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		
		CreateTextFile criaArquivoTexto = new CreateTextFile();

				criaArquivoTexto.openFile();		
				criaArquivoTexto.addRecords();		
				criaArquivoTexto.closeFile();
			
	}
}
