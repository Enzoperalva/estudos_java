import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valorInicial, valorFinal, acc=0;

		System.out.print("Número inicial: ");
		valorInicial = input.nextInt();
		System.out.print("Número final: ");
		valorFinal = input.nextInt();

		if(valorInicial > valorFinal) {
			System.out.println("ERRO! O número inicial não pode ser maior que número final.");
		} else {
			for(int i=valorInicial; i <= valorFinal; i++) {
				if(i % 2 == 1) {
					acc+=i;
				}
			}
			System.out.printf("Soma dos números ímpares: %d%n", acc);
		}

		input.close();
	}
}
