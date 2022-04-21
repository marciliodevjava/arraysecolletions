package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila
		// Difren�a � o comportamento quando a fila est� cheia!
		fila.add("Ana");
		fila.offer("Bia");// metodo que tenha tamanho, retornando true ou false
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
	}
}
