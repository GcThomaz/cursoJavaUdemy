package Section_7.ooHeranca.DesafioHeranca;

public class Carro {

    final int velocidadeMax;
    int velocidadeAtual;
    int delta = 5;

    Carro (int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    void acelerar() {
        if (velocidadeAtual + delta > velocidadeMax) {
            velocidadeAtual = velocidadeMax;
        } else {
            velocidadeAtual += delta;
        }
    }

    void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }
}
