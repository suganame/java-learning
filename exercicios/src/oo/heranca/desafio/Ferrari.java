package oo.heranca.desafio;

public class Ferrari extends Carro {
	Ferrari() {
		this(140);
	}

	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
}
