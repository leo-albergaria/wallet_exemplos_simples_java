package br.com.dio.exercicios.loops;

public class ex9_AlgunsTestes {
    public static void main(String[] args) {

        int num = 5, count = 1;
        while (count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);

        num = 5;
        for (int i = 0; i < 3; i++) {
            num += i;
            System.out.print(i);
        }

        int[][] numeros = { { 4, 9, 8, 5 }, { 3, 0, 1, 5 }, { 1, 2, 7, 4 } };
        System.out.print(numeros[2][2]);

        num = 5;
        count = 1;
        do {
            num += count;
            System.out.println(num);
        } while (num <= 13); //Retire o NUM e coloca o COUNT para demonstrar loop infinito.
    }

}
