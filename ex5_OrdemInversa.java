package br.com.dio.exercicios.loops;

public class ex5_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {10, -5, 15, 50, 8, 4};

        for (int i = vetor.length-1; i >= 0; i--)
            System.out.println("Posição " + i + " Número: " + vetor[i]);
    }

}
