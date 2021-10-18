package br.com.dio.exercicios.loops;

import java.util.Arrays;
import java.util.Scanner;

public class ex6_Consoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdeConsoantes = 0;

        System.out.println("Digite a letra: ");
        for (int i = 0; i < consoantes.length; i++) {
            consoantes[i] = scan.next();
            if (!(consoantes[i].equalsIgnoreCase("a") | consoantes[i].equalsIgnoreCase("e")
                    | consoantes[i].equalsIgnoreCase("i") | consoantes[i].equalsIgnoreCase("o")
                    | consoantes[i].equalsIgnoreCase("u"))) {
                        qtdeConsoantes++;
            }
        }

        System.out.println("\n\nLetras: " + Arrays.toString(consoantes));
        System.out.println("\nQuantidade de Consoantes: " + qtdeConsoantes + "\n\n");
        scan.close();
    }

}
