import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float taxa=(float) 0.3, salarioCliente, valorParcela;
		int idade;
		boolean nomeLimpo, tempoDeBanco;

		System.out.print("Salario: ");
		salarioCliente = input.nextFloat();
		System.out.print("Parcela: ");
		valorParcela = input.nextFloat();
		System.out.print("idade: ");
		idade = input.nextInt();
		System.out.print("Nome limpo: ");
		nomeLimpo = input.nextBoolean();
		System.out.print("2 anos ou mais de banco: ");
		tempoDeBanco = input.nextBoolean();

		if (tempoDeBanco) {
			taxa = (float) 0.4;
		}
		if (idade >= 18 && nomeLimpo && valorParcela <= salarioCliente * taxa) {
			System.out.println("Empréstimo APROVADO!");
		} else {
			System.out.println("Empréstimo REPROVADO!");
		}

		input.close();
	}
}
