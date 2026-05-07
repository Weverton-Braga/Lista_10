package Atividades.lista_10;

import java.util.Scanner;

public class atv_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetV = new int[10];
        int[] vetS = new int[10];
        int sum = 0;

        System.out.println("Digite 10 números para o vetor V");
        for (int i = 0; i < vetV.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            vetV[i] = sc.nextInt();

            sum += vetV[i];

            vetS[i] = sum;
        }
        System.out.print("\n Vetor S: ");
        for (int i = 0; i < vetS.length; i++) System.out.println(vetS[i] + " ");

        sc.close();
    }
}
