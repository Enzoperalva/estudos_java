import dominio.Professor;
import dominio.Escola;

public class EscolaTest {
	public static void main(String[] args) {
		Professor professor1 = new Professor("Guanabas");
		Professor professor2 = new Professor("Jiraya Sensei");
		Professor[] professores = {professor1, professor2};
		Escola escola = new Escola("CPAG", professores);
		escola.imprimi();

	}
}
