package arrays;

import java.util.Arrays;

public class Exercicios {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[3];// Arrays pode ser feito dessa forma
		double[] notasAlunoAa = new double[3];// Arrays pode ser feito dessa forma
		double notasAlunoAaa[] = new double[3];// Arrays pode ser feito dessa forma

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		notasAlunoAa[0] = 5.9;
		notasAlunoAa[1] = 4.0;
		notasAlunoAa[2] = 9.7;
		notasAlunoAaa[0] = 8.9;
		notasAlunoAaa[1] = 9.0;
		notasAlunoAaa[2] = 9.7;

		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(Arrays.toString(notasAlunoAa));
		System.out.println(Arrays.toString(notasAlunoAaa));

		int total = 0;
		for (int i = 0; i < 3; i++) {
			total += notasAlunoA[i];
			System.out.println(total);

		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Nota " + (i + 1) + " : " + notasAlunoA[i]);
		}
		System.out.println("Média dos Alunos: " + total / 3);
	}
}
