package dominio;

public class Carro {

		private String nome;
		private double velocidadeMaxima;
		private double velocidadeLimite = 250;

		public Carro (String nome, double velocidadeMaxima) {
			this.nome = nome;
			this.velocidadeMaxima = velocidadeMaxima;

		}

		public String getNome() {
			return this.nome;
		}

		public double getVelocidadeMaxima() {
			return this.velocidadeMaxima;
		}

		public double getVelocidadeLimite() {
			return this.velocidadeLimite;
		}

		public void imprimi() {
			System.out.println(this.nome);
			System.out.println(this.velocidadeMaxima);
			System.out.println(this.velocidadeLimite);
		}

}

