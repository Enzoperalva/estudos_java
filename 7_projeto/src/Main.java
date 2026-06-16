import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		if (x == 1) {
			System.out.print("Olocooo, acertou");
		} else if (x == 2) {
			System.out.print("ERROUUUU");
		}else {
			System.out.print("Seu merda");
		}
		sc.close();
	}
}
