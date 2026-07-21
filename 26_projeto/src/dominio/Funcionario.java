package dominio;

public class Funcionario {
	private int idade;
	private String nome;
	private double[] salarios;
	private float media;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getSalarios() {
		return salarios;
	}

	public void setSalarios(double... salarios) {
		this.salarios = salarios;
	}

	public float getMedia() {
		return media;
	}


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
		for(double nums: this.salarios) {
			this.media += nums;
		}
		media /= salarios.length;
		System.out.printf("Média dos salários: %.2f", media);
	}
}
