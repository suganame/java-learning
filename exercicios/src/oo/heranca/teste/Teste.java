package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Teste {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari(30);
		
		Civic civic = new Civic();
		
		ferrari.frear();		
		civic.frear();
		
		System.out.println(ferrari);
		System.out.println(civic);
		
		ferrari.acelerar();		
		civic.acelerar();
		
		System.out.println(ferrari);
		System.out.println(civic);
		
		ferrari.acelerar();		
		civic.acelerar();
		
		System.out.println(ferrari);
		System.out.println(civic);
		
		ferrari.acelerar();		
		civic.acelerar();
		
		System.out.println(ferrari);
		System.out.println(civic);
		
		ferrari.frear();		
		civic.frear();
		
		System.out.println(ferrari);
		System.out.println(civic);
		
	}
}
