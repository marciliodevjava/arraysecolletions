package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		// Estrutura de chave -> Integer, valor -> String

		@SuppressWarnings({ "rawtypes", "unchecked" })
		Map<Integer, String> usuarios = new HashMap();
		usuarios.put(1, "Roberto"); // metodo para adicionar
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");

		System.out.println(usuarios.size());
	}
}
