package teste;

import dominio.Funcionario;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario01 = new Funcionario();
		funcionario01.setNome("Enzo");
		funcionario01.setIdade(19);
		funcionario01.setSalarios(1200.88, 987.32, 2000.23);

		funcionario01.imprimir();

	}

}
