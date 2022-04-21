package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila
		// Difren�a � o comportamento quando a fila est� cheia!
		fila.add("Ana");// Retorna False
		fila.offer("Bia");// Lan�a uma exception
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");

		// Peek e Element -> retornam o primeiro elemento da fila
		// Diferen�a � que o peek ser n�o tiver nada na fila retorna "null" e o elemente
		// retorna uma exception.

		System.out.println(fila.peek());// Retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());// Lan�a uma exception
	}
}
