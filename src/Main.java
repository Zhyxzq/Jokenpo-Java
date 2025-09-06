
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        Game jogo = new Game("Jogador");

        System.out.println("=== JOKENPO ===");
        System.out.println("Escolha: PEDRA ou PAPEL ou TESOURA");
        System.out.print("> ");

        try {
            Jogada escolhe = Jogada.valueOf(scanner.nextLine().toUpperCase());
            jogo.setJogadaJogador(escolhe);
            jogo.jogadaComputador();
            System.out.println(jogo.resultado());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Opção inválida!");
        }

    }
}