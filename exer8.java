package Atividades.lista_10;

import java.util.Scanner;

public class atv_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[12];

        System.out.println("Digite 12 números inteiro para preencher o vetor: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            int temp = nums[i];
            nums[i] = nums[i + 6];
            nums[i + 6] = temp;
        }
        System.out.println("O vetor final ficou: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close;
    }
}
