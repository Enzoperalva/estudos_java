import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B, C, areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		double pi = 3.14159;

		System.out.print("Valor A: ");
		A = sc.nextDouble();
		System.out.print("Valor B: ");
		B = sc.nextDouble();
		System.out.print("Valor C: ");
		C = sc.nextDouble();

		areaTrianguloRetangulo = A * C / 2;
		areaCirculo = C * C * pi;
		areaTrapezio = (A + B) * C / 2;
		areaQuadrado = B * B;
		areaRetangulo = A * B;

		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

		sc.close();
	}
}
