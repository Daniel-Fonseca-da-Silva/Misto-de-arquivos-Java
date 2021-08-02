package nulo;

public class Nulo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		String s2 = null;
		
		if(s2 != null)
			System.out.println(s2.concat("!!!!"));

	}

}
