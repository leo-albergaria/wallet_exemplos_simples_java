package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class ex4_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial = 0;
        int calculo = 1;

        System.out.println("Digite o número para fatorial: ");
        fatorial = scan.nextInt();

        for (int xCount = fatorial; xCount > 1; xCount--) {
            calculo = calculo * xCount;
        }

        System.out.println("\n\nValor Fatorial do número: " + fatorial + " é " + calculo + "\n\n");
        scan.close();

    }
}
