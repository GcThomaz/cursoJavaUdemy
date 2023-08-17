package Section_6.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set<String> lista = new HashSet<>();
        SortedSet<String> lista = new TreeSet<>(); //Ordena os elementos do conjunto

        /*Quando coloca os sinais de menor e maior voce precisa identificar qual o tipo dos elementos que voce vai
        adicionar ao seu cojunto. Exemplo: HashSet<Integer>lista -> O conjunto so vai receber elementos do tipo
        inteiro.
        Se voce nao especificar o tipo de elemento que o conjunto vai receber, voce podera adicionar obejetos de
        diferentes tipos. Exemplo: HashSet lista*/

        lista.add("Gustavo");
        lista.add("Ludmila");
        lista.add("Eliane");
        lista.add("Pedro");
        lista.add("Arthur");
        lista.add("Isadora");

        for (String nomes :
                lista) {
            System.out.println(nomes);
        }

        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        for (Integer numeros :
                nums) {
            System.out.println(numeros);
        }
    }
}
