package teste;

import dominio.Carro;


public class CarroTeste {
	public static void main(String[] args) {
		Carro carro01 = new Carro("BMW", 280);
		Carro carro02 = new Carro("Mercedes", 275);
		Carro carro03 = new Carro("Fuska", 300);

		carro01.imprimi();
		carro02.imprimi();
		carro03.imprimi();
	}

}
