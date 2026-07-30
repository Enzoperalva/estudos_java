import dominio.Jogador;
import dominio.Time;

public class Main {
	public static void main(String[] args) {
		Time time = new Time("Seleção brasileira");
		 Jogador jogador1 = new Jogador("Pelé", time);
		 Jogador jogador2 = new Jogador("Romário", time);
		 Jogador jogador3 = new Jogador("Cafu", time  );

		 Jogador[] jogadores = {jogador1, jogador2, jogador3};

	}
}
