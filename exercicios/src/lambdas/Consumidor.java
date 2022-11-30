package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = produto -> System.out.println(produto.nome);

		Produto produto = new Produto("Caneta", 12.34, 0.9);
		Produto produto2 = new Produto("Notebook", 12.34, 0.9);
		Produto produto3 = new Produto("Borracha", 12.34, 0.9);
		Produto produto4 = new Produto("Lapis", 12.34, 0.9);
		Produto produto5 = new Produto("Caderno", 12.34, 0.9);

		imprimir.accept(produto);
		
		List<Produto> produtos = Arrays.asList(produto, produto2, produto3, produto4, produto5);
		
		produtos.forEach(System.out::println);
	}
}
