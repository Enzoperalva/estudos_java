package domain;

public class Produto {
	private String nome;
	private double preco;
	private int quantidadeProduto;


	public Produto(String nome, double preco) {
		this.nome = nome;
		if (preco < 0) {
			System.out.println("O preço não pode ser negativo!");

		}else {
			this.preco = preco;
		}

	}

	public Produto(String nome, double preco, int quantidadeProduto) {
		this(nome, preco);

		if (quantidadeProduto < 0) {
			System.out.println("A quantidade de produtos não podem ser negativas.");

		} else {
			this.quantidadeProduto = quantidadeProduto;

		}
	}

	public String getNome() {
		return this.nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public int getQuantidadeProdutos() {
		return this.quantidadeProduto;
	}

	public void adicionarEstoque(int quantidade) {
		if (quantidade < 0) {
			System.out.println("Quantidade não pode ser negativa.");
		} else {
			this.quantidadeProduto += quantidade;
		}
	}

	public void removerEstoque(int quantidade) {
		if (quantidade > this.quantidadeProduto) {
			System.out.println("Quantidade para remover ultrapassa quantidade do estoque.");

		} else {
			this.quantidadeProduto -= quantidade;
		}

	}

	public double valorTotalEstoque() {
		double valorTotal = this.preco * this.quantidadeProduto;
		return valorTotal;
	}

	public void informacoesProduto() {
		double valorTotal = valorTotalEstoque();

		System.out.println("Nome: "+this.nome);
		System.out.println("Preço: "+this.preco);
		System.out.println("Quantidade: "+this.quantidadeProduto);
		System.out.println("Valor total: "+valorTotal);
		System.out.println();
	}

}
