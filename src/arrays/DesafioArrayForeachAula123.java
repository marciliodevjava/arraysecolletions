package arrays;

import javax.swing.JOptionPane;

public class DesafioArrayForeachAula123 {

	public static void main(String[] args) {

		String a = JOptionPane.showInputDialog("Quantas notas voc? quer informar?");
		int aa = Integer.parseInt(a);
		double[] nota = new double[aa];
		double media = 0;
		
		for (int i = 0; i < nota.length; i++) {
			String notas = JOptionPane.showInputDialog("Digite a nota " + (i + 1) + " :").replace(",", ".");
			double numero = Double.parseDouble(notas);
			nota[i] = numero;
			media += nota[i];
		}

		for (double d : nota) {
			System.out.println("Nota: " + d);
		}

		System.out.printf("M?dia de notas: %.2f", (media / nota.length));
	}
}
