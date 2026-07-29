import domain.ContaBancaria;

public class Main {
	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria("Enzo", 700);
		ContaBancaria c2 = new ContaBancaria("Jp", 1000);

		c1.informacoesConta();
		c2.informacoesConta();

		c2.transferir(c1, 300);
		c1.depositar(100);
		c1.sacar(2000);

		c1.informacoesConta();
		c2.informacoesConta();
	}
}
