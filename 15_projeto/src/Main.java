import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valorInicial, valorFinal;
		boolean temMultiplo7 = false;

		System.out.print("Valor inicial: ");
		valorInicial = input.nextInt();
		System.out.print("Valor final: ");
		valorFinal = input.nextInt();

		for(int i = valorInicial;i==valorFinal;i++) {
			System.out.println(i);
			if(i % 7 == 0) {
				System.out.printf("O primeiro multiplo de 7 é: %d%n", i);
				temMultiplo7 = true;
				break;
			}
		}
		if (!temMultiplo7) {
			System.out.println("Nenhum múltiplo de 7 encontrado.");
		}


		input.close();
	}
}
