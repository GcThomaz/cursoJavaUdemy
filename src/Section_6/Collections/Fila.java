package Section_6.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //Diferença é o comportamento quando a fila esta cheia!
        fila.add("Gustavo"); //Lança uma exceçao
        fila.offer("Ludmila"); // Retorna falso
        fila.offer("Eliane");
        fila.offer("Pedro");
        fila.offer("Arthur");
        fila.offer("Marcos");

        //Pegando um elemento da fila:
        // peek() e element() -> obter o proximo elemento da fila (SEM REMOVER O ELEMENTO)
        //Diferença é o comportamento quando a fila esta vazia!
        System.out.println(fila.peek()); // Se a fila estiver vazia vai retornar NULL
        System.out.println(fila.element()); //Se a fila estiver vazia vai gerar um erro

        //TAMANHO DA FILA
        fila.size();

        //LIMPAR A FILA
        //fila.clear();

        // VERIFICAR SE A FILA ESTA VAZIA
        fila.isEmpty();

        // Pegando um elemento da fila:
        // pool() e remove() -> A diferença é que esses métodos vao OBTER o proximo elemento e REMOVER esse elemento da
        // fila
        //Diferença é o comportamento quando a fila esta vazia!
        System.out.println(fila.poll()); // Se a fila estiver vazia vai retornar NULL
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); //Lança uma exceçao

        // Verificar se o elemento esta contido na lista
        fila.contains("Arthur");
    }
}
