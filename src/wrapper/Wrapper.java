package wrapper;


public class Wrapper {

	public static void main(String[] args) {
		
		
		// byte
		Byte b = 1;
		Short s = 1000;
		
		// Integer.parseInt(entrada.nextLine());
		
		Integer i = 10000; ;//int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 12534.623;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); // Converte String para Boolean
		System.out.println(bo);
		
		System.out.println(bo.toString().toUpperCase()); // Converte Boolean para string
		
		Character c = 'D';
		System.out.println(c.toString().toLowerCase());
	}

}
