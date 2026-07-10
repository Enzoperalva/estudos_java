import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float valorCompraOriginal, valorCompraDesconto;
		byte idadeCliente, desconto=0;
		boolean isVip;

		System.out.print("Valor da compra: ");
		valorCompraOriginal = input.nextFloat();

		System.out.print("Idade: ");
		idadeCliente = input.nextByte();

		System.out.print("VIP:");
		isVip = input.nextBoolean();

		valorCompraDesconto = valorCompraOriginal;

		if (isVip && valorCompraOriginal >= 200) {
			desconto = 20;
			valorCompraDesconto *= 0.8;
		} else if (valorCompraOriginal >= 200 || idadeCliente >= 60) {
			desconto = 10;
			valorCompraDesconto *= 0.9;
		}

		System.out.printf("Desconto: %d%n", desconto);
		System.out.printf("Valor final: R$%.2f%n", valorCompraDesconto);

		input.close();
	}
}
