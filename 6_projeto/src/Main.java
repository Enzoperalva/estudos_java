//import java.util.Scanner;
//import java.util.Locale;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Locale.setDefault(Locale.US);
//
//		int numFuncionario;
//		double horasTrabalhadas, salarioHora;
//
//		System.out.print("Número do funcionário: ");
//		numFuncionario = sc.nextInt();
//		System.out.print("Horas trabalhadas: ");
//		horasTrabalhadas = sc.nextDouble();
//		System.out.print("Sálario hora: ");
//		salarioHora = sc.nextDouble();
//
//		double total = horasTrabalhadas * salarioHora;
//		System.out.printf("NUMBER: %d%n", numFuncionario);
//		System.out.printf("SALARY: $ %.2f", total);
//
//		sc.close();
//	}
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class Personagem {

    protected String nome;
    protected int vida;
    protected int ataque;

    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void receberDano(int dano) {
        vida -= dano;

        if (vida < 0) {
            vida = 0;
        }
    }

    public abstract void atacar(Personagem alvo);

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }
}

class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 150, 25);
    }

    @Override
    public void atacar(Personagem alvo) {
        alvo.receberDano(ataque);
        System.out.printf(
                "%s golpeou %s causando %d de dano%n",
                nome,
                alvo.getNome(),
                ataque
        );
    }
}

class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 100, 40);
    }

    @Override
    public void atacar(Personagem alvo) {
        int danoMagico = ataque + 10;

        alvo.receberDano(danoMagico);

        System.out.printf(
                "%s lançou uma magia em %s causando %d de dano%n",
                nome,
                alvo.getNome(),
                danoMagico
        );
    }
}

class Arena {

    private final List<Personagem> participantes = new ArrayList<>();
    private final Random random = new Random();

    public void adicionar(Personagem personagem) {
        participantes.add(personagem);
    }

    public void iniciarBatalha() {

        int rodada = 1;

        while (quantidadeVivos() > 1) {

            System.out.println("\n===== RODADA " + rodada + " =====");

            for (Personagem atacante : participantes) {

                if (!atacante.estaVivo()) {
                    continue;
                }

                List<Personagem> alvos = participantes.stream()
                        .filter(p -> p != atacante)
                        .filter(Personagem::estaVivo)
                        .toList();

                if (alvos.isEmpty()) {
                    break;
                }

                Personagem alvo =
                        alvos.get(random.nextInt(alvos.size()));

                atacante.atacar(alvo);

                System.out.printf(
                        "%s agora possui %d HP%n",
                        alvo.getNome(),
                        alvo.getVida()
                );
            }

            rodada++;
        }

        declararVencedor();
    }

    private int quantidadeVivos() {
        return (int) participantes.stream()
                .filter(Personagem::estaVivo)
                .count();
    }

    private void declararVencedor() {

        participantes.stream()
                .filter(Personagem::estaVivo)
                .findFirst()
                .ifPresent(vencedor -> {
                    System.out.println("\n🏆 VENCEDOR");
                    System.out.println(vencedor.getNome());
                    System.out.println("Vida restante: " + vencedor.getVida());
                });
    }
}

public class Main {

    public static void main(String[] args) {

        Arena arena = new Arena();

        arena.adicionar(new Guerreiro("Thor"));
        arena.adicionar(new Guerreiro("Kratos"));
        arena.adicionar(new Mago("Merlin"));
        arena.adicionar(new Mago("Gandalf"));

        arena.iniciarBatalha();
    }
}