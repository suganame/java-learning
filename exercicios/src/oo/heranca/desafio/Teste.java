package oo.heranca.desafio;

public class Teste {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari(30);
		ferrari.velocidadeAtual = 0;
		
		Civic civic = new Civic();
		civic.velocidadeAtual = 0;
		
		ferrari.frear();		
		civic.frear();
		
		System.out.println("Velocidade da Ferrari: " + ferrari.velocidadeAtual);
		System.out.println("Velocidade do Civic: " + civic.velocidadeAtual);
		
		ferrari.acelerar();		
		civic.acelerar();
		
		System.out.println("Velocidade da Ferrari: " + ferrari.velocidadeAtual);
		System.out.println("Velocidade do Civic: " + civic.velocidadeAtual);
		
		ferrari.acelerar();		
		civic.acelerar();
		
		System.out.println("Velocidade da Ferrari: " + ferrari.velocidadeAtual);
		System.out.println("Velocidade do Civic: " + civic.velocidadeAtual);
		
		ferrari.acelerar();		
		civic.acelerar();
		
		System.out.println("Velocidade da Ferrari: " + ferrari.velocidadeAtual);
		System.out.println("Velocidade do Civic: " + civic.velocidadeAtual);
		
		ferrari.frear();		
		civic.frear();
		
		System.out.println("Velocidade da Ferrari: " + ferrari.velocidadeAtual);
		System.out.println("Velocidade do Civic: " + civic.velocidadeAtual);
		
	}
}
