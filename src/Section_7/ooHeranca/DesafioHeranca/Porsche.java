package Section_7.ooHeranca.DesafioHeranca;

public class Porsche extends Carro{

    Porsche() {
        super(315);
        delta = 15;
    }

    void acelerar() {
        velocidadeAtual += delta;
    }
}
