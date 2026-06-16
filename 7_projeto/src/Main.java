import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double codigoPeca1, codigoPeca2, quantPeca1, quantPeca2, valorPeca1, valorPeca2, valorPrecoTotal;

		System.out.print("Codigo peça 1: ");
		codigoPeca1 = sc.nextDouble();
		System.out.print("Quantidade peça 1: ");
		quantPeca1 = sc.nextDouble();
		System.out.print("Valor peça 1: ");
		valorPeca1 = sc.nextDouble();

		System.out.print("Codigo peça 2: ");
		codigoPeca2 = sc.nextDouble();
		System.out.print("Quantidade peça 2: ");
		quantPeca2 = sc.nextDouble();
		System.out.print("Valor peça 2: ");
		valorPeca2 = sc.nextDouble();

		valorPrecoTotal = valorPeca1 * quantPeca1 + valorPeca2 * quantPeca2;
		System.out.printf("VALOR A PAGAR: %.2f %n", valorPrecoTotal);

		sc.close();
	}
}
