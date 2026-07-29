import domain.Livro;

public class Main {
	public static void main(String[] args) {
		Livro l1 = new Livro("A megera domada", "William Shakespear");
		l1.setQuantExemplares(20);
		l1.emprestarLivro();
		l1.emprestarLivro();
		l1.exibirInformacoes();
	}
}
