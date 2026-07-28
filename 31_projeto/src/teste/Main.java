package teste;

import domain.Produto;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double preco = 0.0;
		int quantidadeEstoque=0, opcMenu=0, quantidadeAdicionar=0, quantidadeRemover=0;
		String nome="";
		Produto produto = null;

		while (true){
			System.out.println("[ 1 ] - Adicionar produto");
			System.out.println("[ 2 ] - Adicionar ao estoque");
			System.out.println("[ 3 ] - Remover do estoque");
			System.out.println("[ 4 ] - Exibir informações");
			System.out.println("[ 5 ] - Sair");
			System.out.println();

			do {
				System.out.print("Opção: ");
				opcMenu = input.nextInt();

			} while(opcMenu != 1 && opcMenu != 2 && opcMenu != 3 && opcMenu != 4 && opcMenu != 5);

			if (opcMenu == 1) {
				System.out.print("Nome do produto: ");
				nome = input.next();

				System.out.print("Preço: ");
				preco = input.nextDouble();

				System.out.print("Quantidade: ");
				quantidadeEstoque = input.nextInt();

				produto = new Produto(nome, preco, quantidadeEstoque);

			} else if (opcMenu == 2) {
				if(produto == null) {
					System.out.println("Adicione um produto primeiro!");
					continue;
				}
				System.out.print("Quantidade para adicionar: ");
				quantidadeAdicionar = input.nextInt();

				produto.adicionarEstoque(quantidadeAdicionar);

			} else if (opcMenu == 3) {
				if (produto == null) {
					System.out.println("Adicione um produto primeiro!");
					continue;
				}
				System.out.print("Quantidade para remover: ");
				quantidadeRemover = input.nextInt();

				produto.removerEstoque(quantidadeRemover);
			} else if (opcMenu == 4){
				if (produto == null) {
					System.out.println("Adicione um produto primeiro!");
					continue;
				}
				produto.informacoesProduto();;

			} else {
				break;
			}

		}
		input.close();
	}
}
