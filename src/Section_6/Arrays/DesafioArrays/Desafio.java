package Section_6.Arrays.DesafioArrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int quantidadeNotas;

        System.out.println("Informe a quantidade de notas: ");
        quantidadeNotas = in.nextInt();

        double [] notas = new double [quantidadeNotas];
        for (int i = 0; i  < quantidadeNotas; i++) {
            System.out.println("Digite a nota " +(i + 1) + ": ");
            notas[i] = in.nextDouble();
        }
        System.out.printf("Foram cadastradas %d notas. ", quantidadeNotas);
        System.out.println("As notas foram: ");

        for (double nota : notas) {
            System.out.println(nota);
        }

        double total = 0;
        for (double nota : notas) {
            total += nota;
        }
        double media = total / quantidadeNotas;
        System.out.println("A media final é: " + media + ".");
        in.close();
    }
}
