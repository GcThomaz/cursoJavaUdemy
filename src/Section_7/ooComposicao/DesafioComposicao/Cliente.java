package Section_7.ooComposicao.DesafioComposicao;

import java.util.ArrayList;

public class Cliente {

    final String nome;

    final ArrayList<Compra> listaCompras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    double obterValorTotal() {
        double total = 0;
        for(Compra compra:
        listaCompras) {
            total += compra.obterValorTotal();
        }
        return total;
    }

    void adicionarCompra(Compra compra) {
        this.listaCompras.add(compra);
    }
}
