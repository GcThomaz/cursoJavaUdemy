package Section_5.DesafioModulo;

public class Pessoa {
    //ATRIBUTOS

    String nome;
    double peso;

    //CONSTRUTOR
    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida comida) {

        if (comida != null) {
            this.peso += comida.peso;
        }
    }
}
