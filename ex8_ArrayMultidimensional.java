package br.com.dio.exercicios.loops;

import java.util.Random;
import java.util.Arrays;

public class ex8_ArrayMultidimensional {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(9);
            }
        }
        for (int[] linha : matriz)
            System.out.println(Arrays.toString(linha));
    }
}
