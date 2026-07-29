package domain;

public class Livro {
	private String titulo;
	private String autor;
	private int quantExemplares;

	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public void setQuantExemplares(int quantExemplares) {
		this.quantExemplares = quantExemplares;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getQuantExemplares() {
		return quantExemplares;
	}

	public void emprestarLivro() {
		if (this.quantExemplares == 0) {
			System.out.printf("Não temos exemplares no momento!%n%n");
			} else {
			this.quantExemplares--;
			System.out.printf("Livro: %s foi emprestado!%n%n", this.titulo);
			}
	}

	public void devolverLivro() {
		this.quantExemplares++;
		System.out.println("Obrigado por devolver o livro.");
	}

	public void exibirInformacoes() {
		System.out.println("Título: "+this.titulo);
		System.out.println("Autor: "+this.autor);
		System.out.println("Quantidade de exemplares: "+this.quantExemplares);
	}

}
