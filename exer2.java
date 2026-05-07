package Atividades.lista_10;

import java.util.Scanner;

public class atv_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[15];
        int maiorPos = 0, menorPos = 0;

        System.out.println("Digite 15 números reais. ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            nums[i] = sc.nextDouble();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maiorPos]) maiorPos = i;
            if (nums[i] < nums[menorPos]) menorPos = i;
        }

        System.out.println("\nO maior número é " + nums[maiorPos] + " que está na posição " + maiorPos + ".");
        System.out.println("O menor número é " + nums[menorPos] + " que está na posição " + menorPos + ".");
        sc.close;
    }
}
