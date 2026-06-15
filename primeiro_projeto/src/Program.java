import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		int valor = 20;		
		System.out.printf("Olá mundo!");
		valor += 80 ;		
		valor++;
		
		int valor2 = 190;
		double valor4 = 12.2142;
		System.out.print(valor);
		System.out.println(valor2);
		System.out.printf("%.2f%n", valor4);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n", valor4);
		System.out.printf("%.5f\n", valor4);
	}
}

