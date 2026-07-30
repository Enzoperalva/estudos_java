package dominio;

public class Jogador {
	 private String nome;
	 private Time time;

	 public Jogador(String nome, Time time) {
		 this.nome =nome;
		 this.time = time;
	 }

	 public String getNome() {
		return nome;
	 }

	 public void setNome(String nome) {
		this.nome = nome;
	 }

}
