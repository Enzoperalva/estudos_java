package dominio;

public class Pessoa {
	private String nome;
	private int idade;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			System.out.println("Idade inválida!");
			return;
		}

		this.idade = idade;
	}

	public String getNome() {
		return this.nome;
	}

	public int setIdade() {
		return this.idade;
	}

	public void pessoaImprimi() {
		System.out.println(this.nome);
		System.out.println(this.idade);
	}
}
