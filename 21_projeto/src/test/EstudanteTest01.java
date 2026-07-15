package test;

import models.Estudante;


public class EstudanteTest01 {
	public static void main(String[] args) {
		Estudante estudante01 = new Estudante();
		estudante01.nome = "Enzo";
		estudante01.idade = 18;
		estudante01.sexo = 'M';

		System.out.println(estudante01.nome);
	}
}
