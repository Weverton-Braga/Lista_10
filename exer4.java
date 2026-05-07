package Atividades.lista_10;

import java.util.Scanner;

public class atv_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = new String[10];

        System.out.println("Digite a lista de nome dos alunos.");
        for (int i = 0; i < list.length; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º aluno: ");
            list[i] = sc.nextLine();
        }

        System.out.println("Lista na ordem inversa: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println(list[i]);
        }
        sc.close;
    }
}
