package domain;

public class ContaBancaria {
	private String titular;
	private double saldo;

	public ContaBancaria(String titular, double saldo) {
		if (saldo < 0) {
			this.saldo = 0;

		} else {
			this.saldo = saldo;
		}

		if (titular == null || titular.isEmpty()) {
			this.titular = "Desconhecido";

		} else {
			this.titular = titular;
		}
	}

	public boolean isAbaixoIgual0(double dinheiro) {
		if (dinheiro <= 0) {
			return false;
		}
		return true;
	}

	public void depositar(double valorDeposito) {
		boolean valorValido = isAbaixoIgual0(valorDeposito);
		if (valorValido) {
			this.saldo += valorDeposito;
			System.out.printf("R$%.2f depositado com sucesso. Olhe suas informações no método: informacoesConta.%n", valorDeposito);

		} else {
			System.out.println("ERRO! Valor de deposito inválido.");
		}
		System.out.println();
	}

	public void sacar(double valorSaque) {
		boolean valorValido = isAbaixoIgual0(valorSaque);
		if (!valorValido) {
			System.out.println("ERRO! Valor de saque inválido.");

		} else if (valorSaque > this.saldo) {
			System.out.println("Valor de saque não pode ser maior que o seu saldo atual.");

		} else {
			this.saldo -= valorSaque;
			System.out.printf("R$%.2f sacado com sucesso. Olhe suas informações no método: informacoesConta%n", valorSaque);
		}

		System.out.println();
	}

	public void transferir(ContaBancaria c, double valorTransferencia) {
		boolean valorValido = isAbaixoIgual0(valorTransferencia);

		if (!valorValido) {
			System.out.println("ERRO! Valor de transferencia inválido.");

		} else if (valorTransferencia > this.saldo) {
			System.out.println("Valor de transferencia não pode ser maior que o seu saldo atual.");

 		} else {
 			c.depositar(valorTransferencia);
			this.sacar(valorTransferencia);

			System.out.printf("R$%.2f transferido com sucesso para a conta de %s.%n", valorTransferencia, c.titular);
 		}
	}

	public void informacoesConta() {
		System.out.printf("Títular: %s%n", this.titular);
		System.out.printf("Saldo atual: R$%.2f%n%n", this.saldo);
	}
}
