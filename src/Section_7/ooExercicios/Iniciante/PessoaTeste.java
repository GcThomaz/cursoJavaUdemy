package Section_7.ooExercicios.Iniciante;

public class PessoaTeste {

    public static void main(String[] args) {

        // Instanciar uma pessoa

        Pessoa pessoa = new Pessoa("Gustavo", 24, "Masculino");

        //Métodos para acessar os atributos do objeto Pessoa
        System.out.println("Valores dos atributos definidos quando o objeto pessoa foi instanciado:");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getGenero());
        System.out.println();

        // Métodos para modificar os atributos do objeto Pessoa
        pessoa.setNome("Gustavinho");
        pessoa.setIdade(23);
        pessoa.setGenero("Feminino");

        // Métodos para obter todas as informaçoes do objeto Pessoa
        System.out.println("Valores alterados e definidos quando chamamos os métodos modificadores:");
        System.out.println(pessoa.descricao());
    }
}
