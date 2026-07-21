package test;

import dominio.Pessoa;

public class PessoaTest {
	public static void main(String[] args) {
		Pessoa pessoa01 = new Pessoa();
		pessoa01.setNome("Enzo");
		pessoa01.setIdade(18);

		pessoa01.pessoaImprimi();
	}
}
