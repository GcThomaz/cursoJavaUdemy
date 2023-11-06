package Section_7.ooExercicios.Intermediario.Ex02;

import java.util.ArrayList;

public class Carrinho {
    private static ArrayList<Produtos> listaProdutos = new ArrayList<>();
    static Produtos produto = new Produtos();

    static public String adicionarCarrinho(Produtos arroz) {
        listaProdutos.add(produto);
        return "Produto adicionado com sucesso!";
    }
}
