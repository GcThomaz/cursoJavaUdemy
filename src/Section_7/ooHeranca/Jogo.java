package Section_7.ooHeranca;

public class Jogo {
    public static void main(String[] args) {

        Jogador j1 = new Jogador();
        j1.x = 10;
        j1.y = 10;
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);

        System.out.println(j1.y);
    }
}
