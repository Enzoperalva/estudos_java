import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valorInicial, valorFinal, accPar=0, accImpar=0, contPar=0, contImpar=0, maiorMultiplo5=0;
		boolean temMultiplo5=false;

		System.out.print("Valor inicial: ");
		valorInicial = input.nextInt();
		System.out.print("Valor final: ");
		valorFinal = input.nextInt();

		if(valorInicial < 0 || valorFinal < 0) {
			System.out.println("ERRO! Digite apenas número positivos.");
		}else if(valorInicial > valorFinal) {
			System.out.println("ERRO! Valor inicial não pode ser maior que o valor final.");
		} else {
			for(int i = valorInicial; i <= valorFinal ; i++) {
				if(i % 2 == 0) {
					accPar += i;
					contPar++;
				}else {
					accImpar += i;
					contImpar++;
				}
				if(i % 5 == 0) {
					temMultiplo5 = true;
					maiorMultiplo5 = i;
				}
			}

			System.out.printf("Quantidade de números pares: %d%n", contPar);
			System.out.printf("Quantidade de números ímpares: %d%n", contImpar);
			System.out.printf("Soma números pares: %d%n", accPar);
			System.out.printf("Soma números ímpares: %d%n", accImpar);
			if(!temMultiplo5) {
				System.out.println("Nenhum múltiplo de 5 encontrado.");
			}else {
				System.out.printf("Maior múltiplo de 5: %d%n", maiorMultiplo5);
			}
		}

		input.close();
	}
}
