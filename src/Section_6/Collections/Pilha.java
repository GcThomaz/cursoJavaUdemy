package Section_6.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno principe");
        livros.push("Don QUixote");
        livros.push("O hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.poll());
        System.out.println(livros.remove());
        System.out.println(livros.pop());

        //livros.size();
        //livros.contains();
        //livros.clear();
    }
}
