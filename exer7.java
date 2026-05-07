package Atividades.lista_10;

import java.util.Scanner;

public class atv_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] gabarito = {'A', 'B', 'C', 'A', 'A', 'A', 'C', 'D', 'D', 'B'};
        char[] resp = new char[10];
        int cont = 0;

        System.out.println("Digite as letras das suas respostas aqui. ");
        for (int i = 0; i < resp.length; i++) {
            System.out.print("Resposta da questão " + (i + 1) + " (A, B, C ou D): ");
            resp[i] = sc.next().toUpperCase().charAt(0);
            while (resp[i] != 'A' && resp[i] != 'B' && resp[i] != 'C' && resp[i] != 'D') {
                System.out.println("Resposta invalida.");
                System.out.print("Digite uma opção valida (A, B, C ou D): ");
                resp[i] = sc.next().toUpperCase().charAt(0);
            }
            if (resp[i] == gabarito[i]) cont++;
        }
        System.out.println("Você acertou " + cont + " questões.");
        sc.close;
    }
}
