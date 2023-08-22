package Section_7.ooHeranca;

public class Jogo {
    public static void main(String[] args) {

        Jogador j1 = new Jogador(10, 10);

        Jogador j2 = new Heroi(10, 10);

        System.out.println(j1.vida);
        System.out.println(j2.vida);

        j1.atacar(j2);
        j2.atacar(j1);

        System.out.println(j1.vida);
        System.out.println(j2.vida);

    }
}
