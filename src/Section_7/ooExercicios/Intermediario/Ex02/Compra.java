package Section_7.ooExercicios.Intermediario.Ex02;

public class Compra {

    public static void main(String[] args) {
        Produtos arroz = new Produtos("Arroz", 10.5);

        System.out.println(Carrinho.adicionarCarrinho(arroz));
    }
}
