package Atividades.lista_10;

import java.util.Scanner;

public class atv_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int soma = 0;
        double media;

        System.out.println("Digite 10 números inteiros.");
        for (int i=0; i < nums.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            nums[i] = sc.nextInt();
            soma += nums[i];
        }
        media = (double)soma/ nums.length;
        System.out.printf("%nA soma dos números do vetor é %d e a média dos números é %.3f.%n",soma,media);
        sc.close();
    }
}
