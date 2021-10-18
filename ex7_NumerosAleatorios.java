package br.com.dio.exercicios.loops;

import java.util.Arrays;
import java.util.Random;

public class ex7_NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numAleatorios = new int[20];

        for (int i = 0; i < numAleatorios.length; i++) {
           numAleatorios[i] = random.nextInt(100);
        }
        
        System.out.println("\nNúmeros aleatórios");
        System.out.println(Arrays.toString(numAleatorios));
        
        System.out.println("\nAcrescido + 1");
        for (int i : numAleatorios) {
            System.out.print( (i+1) + " ");
        }
    }

}
