package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila
		// Difrença é o comportamento quando a fila está cheia!
		fila.add("Ana");
		fila.offer("Bia");// metodo que tenha tamanho, retornando true ou false
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");

		// Peek e Element -> retornam o primeiro elemento da fila
		// Diferença é que o peek ser não tiver retorna "null" e o elemente retorna uma
		// exception.
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
	}
}
