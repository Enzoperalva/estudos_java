package dominio;

public class Funcionario {
	public int idade;
	public String nome;
	public double[] salarios;

	public void imprimir() {
		if(this.idade != 0 && !this.nome.isEmpty() && this.salarios != null) {
			System.out.println("DADOS: ");
			System.out.printf("Idade: %d%n", this.idade);
			System.out.printf("Nome: %s%n", this.nome);
			System.out.print("Salários: ");
			for(double num: this.salarios) {
				System.out.print(num + " ");
			}
			mediaSalario();
		} else {
			System.out.println("Informações incompletas ou inválidas.");
		}
	}

	public void mediaSalario() {
		float soma = 0;
		for(double nums: this.salarios) {
			soma += nums;
		}
		float media = soma / salarios.length;
		System.out.printf("Média dos salários: %.2f", media);
	}
}
