import models.Carros;

public class Main {
	public static void main(String[] args) {
		Carros carro1 = new Carros();
		carro1.nome = "fusca";
		carro1.modelo = "mercedes";
		carro1.ano = 2030;

		System.out.println(carro1.nome + carro1.ano + carro1.modelo);
	}

}
