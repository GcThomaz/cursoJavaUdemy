package Section_7.ooExercicios.Intermediario.Ex01;

public class Teste01 {
    public static void main(String[] args) {

        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        System.out.println("Velocidade inicial: " + carro.getVelocidade());
        System.out.println(carro.frear());
        System.out.println("Velocidade atual: " + carro.getVelocidade());
    }
}
