package arrays;

public class Numero {
	int num1;
	int num2;
	int total;

	int soma(int param1, int param2) {
		this.num1 = param1;
		this.num2 = param2;
		this.total = this.num1 + this.num2;
		return this.total;
	}

	public static void main(String[] args) {

		Numero a = new Numero();
		System.out.println(a.soma(1, 2));

	}
}
