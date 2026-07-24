
public class Anime {
	private String tipo;
	private int episodios;
	private String nome;
	private String genero;

	public void imprimi() {
		System.out.println(this.tipo);
		System.out.println(this.episodios);
		System.out.println(this.nome);
		System.out.println(this.genero);
	}

	public void init(String nome, String tipo, int episodios, String genero) {
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
		this.genero = genero;
	}

	public String getTipo() {
		return this.tipo;
	}

	public int getEpisodios() {
		return this.episodios;
	}

	public String getNome() {
		return this.nome;
	}

	public String getGenero() {
		return this.genero;
	}
}
