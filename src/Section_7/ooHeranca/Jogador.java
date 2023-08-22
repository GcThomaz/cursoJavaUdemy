package Section_7.ooHeranca;

public class Jogador {
    int x;
    int y;

/*    boolean andar(String direcao) {
        if ("norte".equalsIgnoreCase(direcao)) {
            y++;
        }
        return true;
    }*/
    /*boolean andar(Direcao direcao) {
        if (direcao == Direcao.NORTE) {
            y++;
        }
        return true;
    }*/
    boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y--;
                break;
            case SUL:
                y++;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }

}