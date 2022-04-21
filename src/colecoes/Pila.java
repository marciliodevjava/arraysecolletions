package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pila {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();

		livros.add("O Pequeno Pr�ncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");

		System.out.println(livros.peek());
		System.out.println(livros.element());

		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());

		// livros.size();
		// livros.clear();
		// livros.contains("O Hobbit");
		// livros.isEmpty();
	}
}