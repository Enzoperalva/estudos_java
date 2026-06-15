package sexto_projeto;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int A, B, C, D;
		Scanner sc = new Scanner(System.in);
		System.out.print("A: ");
		A = sc.nextInt();
		System.out.print("B: ");
		B = sc.nextInt();
		System.out.print("C: ");
		C = sc.nextInt();
		System.out.print("D: ");
		D = sc.nextInt();
		int resultado = A * B - C * D;
		
		System.out.printf("A * B - C * D = %d", resultado);
		
		sc.close();
	}
}
