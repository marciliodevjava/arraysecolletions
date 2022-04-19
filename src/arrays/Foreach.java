package arrays;

public class Foreach {// utiliza para pecorrer um Array

	public static void main(String[] args) {

		double[] notas = { 9.9, 8.7, 7.2, 9.4 };

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

		for (double nota : notas) {// Foreach para percorrer um array
			System.out.println(nota);
		}
	}
}
