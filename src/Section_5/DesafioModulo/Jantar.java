package Section_5.DesafioModulo;

public class Jantar {
    public static void main(String[] args) {

        Comida arroz = new Comida("Arroz", 20.5);
        Comida feijao = new Comida("Feijao", 50.5);

        Pessoa p1 = new Pessoa("Gustavo", 74);
        Pessoa p2 = new Pessoa("Ludmila", 50);

        System.out.println(p1.nome);
        System.out.println(p1.peso);
        System.out.println(p2.nome);
        System.out.println(p2.peso);
        p1.comer(arroz);
        p2.comer(feijao);
        System.out.println(p1.peso);
        System.out.println(p2.peso);
    }
}
