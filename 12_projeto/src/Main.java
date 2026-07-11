import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, num3;
		int numDoMeio;

		System.out.print("Número 1: ");
		num1 = input.nextInt();
		System.out.print("Número 2: ");
		num2 = input.nextInt();
		System.out.print("Número 3: ");
		num3 = input.nextInt();

		if (num1 < num2 && num1 > num3 || num1 > num2 && num1 < num3) {
			numDoMeio = num1;
			System.out.printf("Número do meio: %d", numDoMeio);
		} else if (num2 < num1 && num2 > num3 || num2 > num1 && num2 < num3) {
			numDoMeio = num2;
			System.out.printf("Número do meio: %d", numDoMeio);
		} else if (num3 < num1 && num3 > num2 || num3 > num1 && num3 < num2) {
			numDoMeio = num3;
			System.out.printf("Número do meio: %d", numDoMeio);
		}

		input.close();
	}
}
