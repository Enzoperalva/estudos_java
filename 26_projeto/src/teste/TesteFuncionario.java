package teste;

import dominio.Funcionario;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario01 = new Funcionario();
		funcionario01.nome = "Enzo";
		funcionario01.idade = 19;
		funcionario01.salarios = new double[]{1200, 987.32, 2000};

		funcionario01.imprimir();

	}

}
