package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Alessandra");
		listaAprovados.add("Isabela");
		listaAprovados.add("Lucilia");
		listaAprovados.add("Marcílio");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
	}
}
