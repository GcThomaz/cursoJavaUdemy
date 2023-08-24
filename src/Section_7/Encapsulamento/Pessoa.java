package Section_7.Encapsulamento;

public class Pessoa {

    private int idade;

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        if(novaIdade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;
        }
    }
}
