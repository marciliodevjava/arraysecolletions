package arrays;

public class ExercicosForeach {

	public static void main(String[] args) {

		double[] i = new double[4];
		i[0] = 7.8;
		i[1] = 6.7;
		i[2] = 9.8;
		i[3] = 10;

		for (double d : i) {
			System.out.println("Nota: " + d);
		}
	}
}
