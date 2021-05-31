package Fundamentos.solved;

import java.util.Scanner;

public class Ex037 {
    // Desafio: Faça um programa que leia três números e mostre qual é o maior e qual é o menor.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        int a = scanner.nextInt();
        System.out.println("Informe o segundo valor:");
        int b = scanner.nextInt();
        System.out.println("Informe o terceiro valor:");
        int c = scanner.nextInt();

        int menor = a;
        int maior = c;

        if (b < a && b < c) {
            menor = b;
        }
        if (c < a && c < b) {
            menor = c;
        }

        if (a > b && a > c) {
            maior = a;
        }
        if (b > a && b > c) {
            maior = b;
        }

        System.out.printf("O maior número digitado foi %d e o menor %d.", maior, menor);

        scanner.close();
    }
}
