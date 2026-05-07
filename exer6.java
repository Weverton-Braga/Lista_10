package Atividades.lista_10;

import java.util.Scanner;

public class atv_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.println("Digite 10 números inteiros pra o vetor. ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetorA[i] = sc.nextInt();
        }

        System.out.print("Digite um número inteiro pra multiplicar os números do vetor criado para criar um segundo vetor: ");
        int n = sc.nextInt();

        System.out.println("Os números do novo vetor criado são:");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * n;
            System.out.println(vetorB[i]);
        }
        sc.close;
    }
}
