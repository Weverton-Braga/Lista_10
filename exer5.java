package Atividades.lista_10;

import java.util.Scanner;

public class atv_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean check = false;

        System.out.print("Digite um número para chegar se ele está no vetor: ");
        int n = sc.nextInt();

        for (int i = 0; i < nums.length; i++) {
            if (n == nums[i]) {
                System.out.println("O número " + n + " está no vetor na posição " + i + ".");
                check = true;
            }
        }
        if (!check) System.out.println("O número " + n + " não está no vetor.");
        sc.close;
    }
}
