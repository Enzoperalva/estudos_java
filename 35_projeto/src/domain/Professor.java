package domain;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;

	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public Professor(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}

	public void imprimir() {
		System.out.println(this.nome);
		System.out.println(this.especialidade);

		if (this.seminarios == null) {
			return;
		}
		for (Seminario seminario : seminarios) {
			if (seminario.getAlunos() == null) {
				return;
			}
			System.out.println(seminario.getAlunos(.nome));
		}
		System.out.println();
	}

	public String getNome() {
		return this.nome;
	}

	public String getEspecialidade() {
		return this.especialidade;
	}
	public Seminario[] getSeminario() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
}
