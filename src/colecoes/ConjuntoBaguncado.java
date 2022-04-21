package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2);// double --> Double (wrapper)
		conjunto.add(true);// boolean --> Boolean (wrapper)
		conjunto.add("Teste");// String
		conjunto.add(1);// int --> Integer (wrapper)
		conjunto.add('x');// char --> Caracterer (wrapper)

		System.out.println("Tamanho é " + conjunto.size());

		conjunto.add("teste");
		System.out.println(conjunto.size());

		conjunto.remove("Teste");
		System.out.println("Tamanho" + conjunto.size());

		System.out.println(conjunto.contains(1.2));

		Set nums = new HashSet();// Conceito valido
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);// listando
		System.out.println(conjunto);// listando

		// conjunto.addAll(nums);// Uni porem excluie paramentros repetidos
		System.out.println(conjunto);
		conjunto.retainAll(nums);// mostra somente os parametros iguais dos dois conjuntos.
		System.out.println(conjunto);

		conjunto.clear();
		System.out.println("Limpando " + conjunto);

	}
}
