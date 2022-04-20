package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos alunos?");
		int quantidadeDeAlunos = entrada.nextInt();
		System.out.println("Qunatas notas por aluno?");
		int quantidadeDeNotas = entrada.nextInt();
		double[][] notasDaTurma = new double[quantidadeDeAlunos][quantidadeDeNotas];
		int contadorAluno = 1;
		int contadorNota = 1;
		double total = 0;

		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma.length; n++) {

				System.out.printf("Aluno %d nota %d: ", (a + 1), (n + 1));
				String nt = entrada.next().replace(",", ".");
				double notas = Double.parseDouble(nt);
				notasDaTurma[a][n] = notas;
				total += notasDaTurma[a][n];
			}
		}
		for (double[] ds : notasDaTurma) {
			for (int i = 0; i < notasDaTurma.length; i++) {// foreach para percorrer o arrays
				System.out.println("Nota: " + ds[i]);
			}
		}

		for (double[] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));// Para percorrer um arrays dentro da matriz
		}

		double media = total / (quantidadeDeAlunos * quantidadeDeNotas);
		System.out.printf("Média da turma: %.2f", media);

		entrada.close();
	}
}
