package Section_7.ooHeranca.DesafioHeranca;

public class TesteDesafioCarro {
    public static void main(String[] args) {

        Carro c1 = new Porsche();
        Mercedes c2 = new Mercedes();

        System.out.println("Velocidade inicial porsche: " + c1.velocidadeAtual);
        c1.acelerar();
        c1.acelerar();
        c1.frear();
        System.out.println("Velocidade final porsche: " + c1.velocidadeAtual);

        System.out.println("Velocidade inicial Mercedes: " + c2.velocidadeAtual);
        c2.acelerar();
        c2.acelerar();
        c2.ligarTurbo(); // Implementando método da interface
        c2.frear();
        c2.desligarTurbo();
        System.out.println("Velocidade final Mercedes: " + c2.velocidadeAtual);

    }
}
