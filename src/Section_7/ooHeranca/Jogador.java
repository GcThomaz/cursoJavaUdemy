package Section_7.ooHeranca;

public class Jogador {
    int x;
    int y;
    int vida = 100;

    Jogador (int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean atacar(Jogador oponente) {

        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }
    }

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