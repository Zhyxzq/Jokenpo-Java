import java.util.Random;

public class Game {
    
    private Player jogador;
    private Player computador;

    //CONSTRUTOR
    public Game(String nomejogador) {
        this.jogador = new Player(nomejogador);
        this.computador = new Player("computador");
    }

    //METODO
    public void setJogadaJogador(Jogada jogada) {
        jogador.escolherJogada(jogada);
    }

    public void jogadaComputador() {
        Jogada[] valores = Jogada.values();
        Jogada jogadaRandom = valores[new Random().nextInt(valores.length)];
        computador.escolherJogada(jogadaRandom);
    }

    public String resultado() {
        
        Jogada jogadaUsuario = jogador.getJogada();
        Jogada jogadaPC = computador.getJogada();

        if(jogadaUsuario == jogadaPC) {
            return "Empate";
        } else if (jogadaUsuario.venceDe(jogadaPC)) {
            return jogador.getNome() + " venceu!!";
        } else {
            return computador.getNome() + " venceu!!";
        }

    }

}
