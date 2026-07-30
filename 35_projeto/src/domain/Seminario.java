package domain;

public class Seminario {
	private String titulo;
	private Aluno[] alunos;
	private Local local;

	public Seminario(String titulo) {
		this.titulo = titulo;
	}

	public Seminario(Local local, Aluno[] alunos) {
		this.local = local;
		this.alunos = alunos;
	}
}
