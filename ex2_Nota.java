package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class ex2_Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdeNumeros = 0;
        int qualNumero = 0;
        int qtdeImpares = 0;
        int qtdePares = 0;
        int xCount = 0;

        System.out.println("Quantidade de número a serem analizados:");
        qtdeNumeros = scan.nextInt();

        do {

            System.out.println("Qual o número:");
            qualNumero = scan.nextInt();

            if (qualNumero % 2 == 0)
                qtdePares++;
            else
                qtdeImpares++;

        } while (++xCount < qtdeNumeros);

        System.out.println("Quantidade Par:" + qtdePares);
        System.out.println("Quantidade Impares:" + qtdeImpares);
        scan.close();

    }
}
