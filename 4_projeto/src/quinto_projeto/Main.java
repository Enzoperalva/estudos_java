package quinto_projeto;
import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double r;
		double pi = 3.14159;
		
		System.out.print("Raio: ");
		r = sc.nextDouble();
		double areaTotal = pi * (Math.pow(r, 2));
		System.out.printf("Área total: %.4f", areaTotal);
		
		sc.close();
	}
}
