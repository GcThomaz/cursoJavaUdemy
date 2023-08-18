package Section_6.Collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Gustavo"); //Pode criar um usuario e adiciona-lo na lista

        lista.add(u1);
        lista.add(new Usuario("Ludmila")); //Pode criar um usuario adicionando diretamento na lista
        lista.add(new Usuario("Eliane"));
        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("Arthur"));
        lista.add(new Usuario("Marcos"));
        lista.add(new Usuario("Izadora"));

        System.out.println(lista.get(3).nome); //Acessar pelo indice

        for (Usuario
        u : lista) {
            System.out.println(u); // Vai retornar -> Meu nome é: [nome] ; O método foi chamado de forma implicita
        }
        for (Usuario
        u : lista) {
            System.out.println(u.toString()); // Vai retornar -> Meu nome é: [nome]; O método foi chamado de forma
            // explicita
        }
        for (Usuario
        u : lista) {
            System.out.println(u.nome); // Vai retornar -> [nome] ;
        }

        //REMOVENDO um item da lista pelo indice:

        lista.remove(6);

        //REMOVENDO um item da lista pelo Equals e HashCode:

        System.out.println(lista.remove(new Usuario("Gustavo")));

        //Verificando se a lista contem um elemento:

        System.out.println(lista.contains(new Usuario("Ludmila")));
    }
}
