package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila

		// Difrença é o comportamento quando a fila está cheia!
		fila.add("Ana");// Retorna False
		fila.offer("Bia");// Lança uma exception
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");

		// Peek e Element -> retornam o primeiro elemento da fila

		// Diferença é que o peek ser não tiver vazia na fila retorna "null" e o
		// elemente
		// retorna uma exception.

		System.out.println(fila.peek());// Retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());// Lança uma exception
		System.out.println(fila.element());

		// fila.size() mostra o tamanho
		// fila.clear() remove o elemento
		// fila.isEmpty() verifica se a fila está cheia
		// fila.pool() mostra o primeiro elemento e remove em seguida
		// fila.remove() remove da lista
		// fila.contens("Ana") verifica se existe o elemento na fila
		// Pool e remove -> obter o próximo elemento
		// da fila e remove

		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove());// Lança uma exception
		System.out.println(fila.poll());
	}
}
