package domain;

public class ContaBancaria {
	private String titular;
	private double saldo;

	public ContaBancaria(String titular, double saldo) {
		this.saldo = saldo;
		this.titular = titular;
	}

	public boolean isValido(double dinheiro) {
		if (dinheiro <= 0) {
			return false;
		}
		return true;
	}

	public void depositar(double valorDeposito) {
		boolean valorValido = isValido(valorDeposito);
		if (valorValido) {
			this.saldo += valorDeposito;
			System.out.printf("R$%.2f depositado com sucesso. Olhe suas informações no método: informacoesConta.%n", valorDeposito);

		} else {
			System.out.println("ERRO! Valor de deposito inválido.");
		}
		System.out.println();
	}

	public void sacar(double valorSaque) {
		boolean valorValido = isValido(valorSaque);
		if (valorSaque > this.saldo) {
			System.out.println("Valor de saque não pode ser maior que o seu saldo atual.");

		} else if (valorValido) {
			this.saldo -= valorSaque;
			System.out.printf("R$%.2f sacado com sucesso. Olhe suas informações no método: informacoesConta%n", valorSaque);

		} else {
			System.out.println("ERRO! Valor de saque inválido.");

		}
		System.out.println();
	}

	public void transferir(ContaBancaria c, double valorTransferencia) {
		boolean valorValido = isValido(valorTransferencia);

		if (valorTransferencia > this.saldo) {
			System.out.println("Valor de transferencia não pode ser maior que o seu saldo atual.");

		} else if (valorValido) {
			c.saldo += valorTransferencia;
			this.saldo -= valorTransferencia;

			System.out.printf("R$%.2f transferido com sucesso para a conta de %s.%n", valorTransferencia, c.titular);

		} else {
			System.out.println("ERRO! Valor de transferencia inválido.");
		}
	}

	public void informacoesConta() {
		System.out.printf("Títular: %s%n", this.titular);
		System.out.printf("Saldo atual: R$%.2f%n%n", this.saldo);
	}
}
