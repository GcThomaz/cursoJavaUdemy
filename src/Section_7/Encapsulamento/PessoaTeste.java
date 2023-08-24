package Section_7.Encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(-30);

        System.out.println(p1.getIdade()); // Chamando o método de acesso da variavel idade.

        p1.setIdade(50); // Alterando o valor da variavel idade.
        System.out.println(p1.getIdade());
    }
}
