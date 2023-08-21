package Section_7.ooComposicao.DesafioComposicao;

public class ClienteTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        compra1.adicionarItem("Caneta", 9.67, 100);
        compra1.adicionarItem(new Produto("Notebook", 1897), 2);

        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem(new Produto("Impressora", 900), 1);

        Cliente cliente1 = new Cliente("Gustavo");

        cliente1.adicionarCompra(compra1);
        cliente1.listaCompras.add(compra2);

        System.out.println(cliente1.obterValorTotal());
    }
}
