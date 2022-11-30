package oo.encapsulamento;

public class Pessoa {
	private int idade;
	private String nome;
	
	public Pessoa(String nome, int idade) {
		setIdade(idade);
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;			
		}
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String toString() {
		return "Sou " + this.nome + " e tenho " + this.idade + " anos.";
	}
}
