package Section_6.Collections;

import java.util.HashSet;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double(class)
        conjunto.add(true); // boolean -> Boolean(class)
        conjunto.add("Teste"); // String
        conjunto.add(2); // int -> Integer
        conjunto.add('G'); // char -> Character

        System.out.println("Tamanho do conjunto é: " + conjunto.size());

        conjunto.add("teste"); // String teste com t minusculo (Nao houve repetiçao)
        System.out.println("Tamanho do conjunto é: " + conjunto.size());

        /*Removendo um elemento do conjunto: ( .remove() -> Se houver um elemento dentro do conjunto o método vai
          retornar TRUE, caso nao exista o elemento ele retorna FALSE)*/

        System.out.println(conjunto.remove("Teste")); // Resultado: TRUE

        /*Para saber se o conjunto contem um elemento: ( .contains() -> Se houver o elemento o método retornara
        TRUE, caso nao exista retornara FALSE)*/

        System.out.println(conjunto.contains('x')); // Resultado: FALSE

        HashSet nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println(nums);

       conjunto.addAll(nums); //Uniao entre dois conjuntos
       System.out.println(conjunto);

        conjunto.retainAll(nums); //Intersecao entre dois conjuntos
        System.out.println(conjunto);

        conjunto.clear(); //Método para limpar o conjunto
        System.out.println(conjunto);
    }
}
