package Section_7.ooComposicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "Gustavo";
        c1.adicionarItem(new Item("Caneta", 20, 7.45));
        c1.adicionarItem(new Item("Borracha", 12, 3.89));
        c1.adicionarItem(new Item("Caderno", 2, 17.79));

        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());

        // So para mostrar a relaçao bidirecional
        double total = c1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
        System.out.println(total);

    }
}
