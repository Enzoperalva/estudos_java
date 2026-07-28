
public class Anime {

	private String nome;
	private static int[] episodios;

	static {
		System.out.println("Dentro do bloco de inicialização");
		episodios = new int[100];
		for (int i = 0; i < episodios.length; i++) {
			episodios[i] += i;
		}
	}

	public Anime(String nome){
		this.nome = nome;
	}

	public Anime() {
		for (int episodio: Anime.episodios) {
			System.out.print(episodio + " ");
		}
		System.out.println();
	}

	public String getNome() {
		return this.nome;
	}

	public int[] getEpisodios() {
		return Anime.episodios;
	}
}
