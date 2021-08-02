package nulo;

import ooComposicao.Carro;

public class CarroTeste {

	public static void main(String[] args) {
		Carro landau = new Carro();
		System.out.println(landau.estadoLigado());
		
		landau.ligar();
		System.out.println(landau.estadoLigado());
		
		System.out.println(landau.motor.giros());
		
		
		landau.acelerar();
		landau.acelerar();
		landau.acelerar();
		landau.acelerar();
		
		System.out.println(landau.motor.giros());
		
		
		landau.frear();
		landau.frear();
		landau.frear();
		landau.frear();
		landau.frear();
		landau.frear();
		
		System.out.println(landau.motor.giros());

	}

}
