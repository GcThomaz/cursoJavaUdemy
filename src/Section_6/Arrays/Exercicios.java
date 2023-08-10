package Section_6.Arrays;

import java.util.Arrays;

public class Exercicios {
    public static void main(String[] args) {

        double [] notasAlunoA = new double[3]; //Criaçao de um Array
        notasAlunoA [0] = 9.5;
        notasAlunoA [1] = 8.5;
        notasAlunoA [2] = 7.5;

        System.out.println(Arrays.toString(notasAlunoA));

        //Fazendo a media do aluno

        double total = 0;
        for(int i = 0; i < 3; i++) {
            total += notasAlunoA[i];
        }
        /*for (int i = 0; i < notasAlunoA.length; i++){ -->Ao inves de definir um valor bruto para o array, pode
        colocar que o laço o percorra pelo tamanho dele.
            total += notasAlunoA[i];
        }*/
        System.out.println(total / 3);
    }

}
