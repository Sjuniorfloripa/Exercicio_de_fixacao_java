package Fundamentos.solved;

import java.util.Scanner;

public class Ex030 {
    //Desafio: Faça um programa que leia um número de 0 a 9999 e mostre na tela cada um dos dígitos separados.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número de 0 a 9999.");
        int numero = scanner.nextInt();

        int unidade = numero / 1 % 10;
        int dezena = numero / 10 % 10;
        int centena = numero / 100 % 10;
        int milhar = numero / 1000 % 10;

        System.out.println("Analisando o número " + numero);
        System.out.printf("Unidade: %d.\n", unidade);
        System.out.printf("Dezena: %d.\n", dezena);
        System.out.printf("Centena: %d.\n", centena);
        System.out.printf("Milhares: %d.\n", milhar);


        scanner.close();
    }
}
