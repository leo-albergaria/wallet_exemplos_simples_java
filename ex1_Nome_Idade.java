package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class ex1_Nome_Idade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "";
        int idade = 0;

        while (true) {
            System.out.println("Nome:");
            nome = scan.next();

            if (nome.equals("0"))
                break;

            System.out.println("Idade:");
            idade = scan.nextInt();
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("\n\nFinal da Rotina\n\n");
        scan.close();
    }

}
