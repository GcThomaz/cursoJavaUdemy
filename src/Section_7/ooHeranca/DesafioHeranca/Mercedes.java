package Section_7.ooHeranca.DesafioHeranca;

public class Mercedes extends Carro implements Esportivo{

    public Mercedes() {
        this(212);
    }

    public Mercedes(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 15;
    }

    @Override
    public void ligarTurbo() {
        delta = 35;
    }

    @Override
    public void desligarTurbo() {
        delta = 15;
    }
}
