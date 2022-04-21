package colecoes;

import java.util.HashSet;
import java.util.Set;
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

		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);

		//nums.get(); não é possivel acessar pelo indice.
		
		for (Integer n : nums) {
			System.out.println(n);
		}
	}
}
