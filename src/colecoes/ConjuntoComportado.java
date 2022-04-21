package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {

		Set<String> listaAprovados = new HashSet<>();
		listaAprovados.add("Marcílio");
		listaAprovados.add("Alessandra");
		listaAprovados.add("Isabela");
		listaAprovados.add("Lucilia");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
	}
}
