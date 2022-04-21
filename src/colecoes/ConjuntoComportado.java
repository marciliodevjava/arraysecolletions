package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		Set<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Marcílio");
		listaAprovados.add("Alessandra");
		listaAprovados.add("Isabela");
		listaAprovados.add("Lucilia");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
	}
}
