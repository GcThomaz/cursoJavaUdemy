package Section_7.ooComposicao.DesafioComposicao;

import java.util.ArrayList;

public class Compra {

    final ArrayList<Item> listaItens = new ArrayList<>();

    void adicionarItem(Produto produto, int quantidade) {
        this.listaItens.add(new Item(produto, quantidade));
    }
    void adicionarItem(String nome, double preco, int quantidade) {
        this.listaItens.add(new Item(new Produto(nome, preco), quantidade));
    }

    double obterValorTotal() {
        double total = 0;

        for(Item item:
        listaItens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
