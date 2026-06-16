import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numFuncionario;
		double horasTrabalhadas, salarioHora;

		System.out.print("Número do funcionário: ");
		numFuncionario = sc.nextInt();
		System.out.print("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();
		System.out.print("Sálario hora: ");
		salarioHora = sc.nextDouble();

		double total = horasTrabalhadas * salarioHora;
		System.out.printf("NUMBER: %d%n", numFuncionario);
		System.out.printf("SALARY: $ %.2f", total);

		sc.close();
	}
}
