package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro", 30);
		p1.setIdade(27);
		System.out.println(p1.toString());
	}
}
