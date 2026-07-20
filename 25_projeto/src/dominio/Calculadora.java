package dominio;

public class Calculadora {
	public void somaArray(int[]nums) {
		int soma = 0;
		for(int num:nums) {
			soma += num;
		}
		System.out.println("Soma dos números: "+soma);
	}

	public void somaVarArgs() {

	}
}
