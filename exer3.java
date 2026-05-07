package Atividades.lista_10;

import java.util.Random;
import java.util.Scanner;

public class atv_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[20];
        int[] numsPar = new int[20];
        Random ramdom = new Random();
        int cont = 0;

        System.out.println("Vetores aleatórios originais: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ramdom.nextInt(101);
            System.out.print(nums[i] + " ");

            if (nums[i] % 2 == 0) {
                numsPar[cont] = nums[i];
                cont++;
            }
        }

        System.out.println("\nVetores par: ");
        for (int i = 0; i < cont; i++) {
            System.out.print(numsPar[i] + " ");
        }
        sc.close;
    }
}
