package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		// Estrutura de chave -> Integer, valor -> String

		@SuppressWarnings({ "rawtypes", "unchecked" })
		Map<Integer, String> usuarios = new HashMap();
		usuarios.put(1, "Roberto"); // metodo para adicionar
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");

		System.out.println(usuarios.size());// mostra o tamanho
		System.out.println(usuarios.isEmpty());// verifica se a fila está cheia
		System.out.println(usuarios.keySet());// conjunto de chave
		System.out.println(usuarios.values());// retorna valor
		System.out.println(usuarios.entrySet());// retorna chave e valor
		System.out.println(usuarios.containsKey(20));// verica se contens por chave
		System.out.println(usuarios.containsValue("REbeca"));// verifica se contens por valor
		System.out.println(usuarios.get(4));// pega a partir da chave retornando null

		// lista por chave utilizando Foreach
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}

		// lista por valor utilizando Foreach
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}

		// lista por chave e valor utilizando Foreach
		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
	}
}
