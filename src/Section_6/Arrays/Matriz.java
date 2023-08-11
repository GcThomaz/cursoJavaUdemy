package Section_6.Arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantidade de alunos: ");
        int quantidadeAlunos = in.nextInt();

        System.out.print("Quantas notas por aluno: ");
        int quantidadeNotas = in.nextInt();

        double [] [] notasDaTurma = new double [quantidadeAlunos][quantidadeNotas];
        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
                notasDaTurma [i] [j] =  in.nextDouble();
                total += notasDaTurma [i] [j];
            }
        }
        double media = total / (quantidadeAlunos * quantidadeNotas);
        System.out.println("Média da turma é: " + media);
        in.close();
    }
}
