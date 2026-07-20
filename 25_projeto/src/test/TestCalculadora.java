package test;

import dominio.Calculadora;

public class TestCalculadora {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int[]nums = {1, 2, 3, 4};
		calculadora.somaArray(nums);
	}

}
