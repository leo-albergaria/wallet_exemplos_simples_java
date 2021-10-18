package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class ex3_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada = 0;

        System.out.println("Qual tabuada: ");
        tabuada = scan.nextInt();

        for (int xCount = 1; xCount <= 10; xCount++) {
            System.out.printf("(%02d x %02d) = (%3d)\n", xCount, tabuada, xCount * tabuada);
        }
        scan.close();
    }

}
