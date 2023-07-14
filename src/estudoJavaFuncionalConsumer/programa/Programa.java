package estudoJavaFuncionalConsumer.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import estudoJavaFuncionalConsumer.entidade.Produto;
import estudoJavaFuncionalConsumer.util.AtualizaPreco;

public class Programa {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<>();

		lista.add(new Produto(1, "TV", 900.00));
		lista.add(new Produto(2, "PC", 50.00));
		lista.add(new Produto(3, "CELULAR", 350.00));
		lista.add(new Produto(4, "NOTBOOK", 3000.00));
		lista.add(new Produto(5, "CARREGADOR", 80.00));

		// Primeira Forma
		lista.forEach(new AtualizaPreco());

		lista.forEach(System.out::println);

		System.out.println();

		// Segunda Forma
		lista.forEach(Produto::staticAtualizaPreco);

		lista.forEach(System.out::println);

		System.out.println();

		// Terceira Forma
		lista.forEach(Produto::naoStaticAtualizaPreco);

		lista.forEach(System.out::println);

		System.out.println();

		// Quarta Forma
		Consumer<Produto> cons = p -> p.setPreco(p.getPreco() * 1.1);
		lista.forEach(cons);

		lista.forEach(System.out::println);

		System.out.println();

		// Quinta Forma
		lista.forEach(p -> p.setPreco(p.getPreco() * 1.1));

		lista.forEach(System.out::println);

		System.out.println();
	}

}
