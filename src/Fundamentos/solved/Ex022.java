package Fundamentos.solved;

import java.util.Scanner;

public class Ex022 {
    //Desafio: Criar um programa que receba um número e diga se ele é um número primo.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("infome um numero: ");
        int numero = scanner.nextInt();
        int contadorDeDivisores = 0;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contadorDeDivisores++;
            }
        }
        if (contadorDeDivisores == 0) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        scanner.close();
    }
}
