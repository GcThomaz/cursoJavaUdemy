package Section_7.ooExercicios.Iniciante;

public class Pessoa {

    //Atributos

    String nome;
    int idade;
    String genero;

    //Construtor

    public Pessoa(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    // Métodos Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String descricao() {

        return "Essa pessoa se chama: " + nome + ". Tem " + idade + " e o seu genero é: " + genero + ".";
    }
}
