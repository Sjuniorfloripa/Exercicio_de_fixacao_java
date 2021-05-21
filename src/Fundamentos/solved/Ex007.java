package Fundamentos.solved;

import java.util.Scanner;

public class Ex007 {
    //Desafio: Faça um programa que leia um número Inteiro qualquer e mostre na tela a sua tabuada.
    //SEM USAR MÉTODOS DE REPETIÇÃO!

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o núero para saber a sua tabuada.");
        int num = scanner.nextInt();

        System.out.println("TABUADA DE " + num);
        System.out.println(num + " X 1 = " + num * 1);
        System.out.println(num + " X 2 = " + num * 2);
        System.out.println(num + " X 3 = " + num * 3);
        System.out.println(num + " X 4 = " + num * 4);
        System.out.println(num + " X 5 = " + num * 5);
        System.out.println(num + " X 6 = " + num * 6);
        System.out.println(num + " X 7 = " + num * 7);
        System.out.println(num + " X 8 = " + num * 8);
        System.out.println(num + " X 9 = " + num * 9);
        System.out.println(num + " X 10 = " + num * 10);

        scanner.close();

    }
}
