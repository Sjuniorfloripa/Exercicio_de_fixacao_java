package Fundamentos.solved;

import java.util.Scanner;

public class Ex002 {
    //desafio: Crie um programa que leia dois números e mostre a soma entre eles.

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = scanner.nextInt();

        System.out.println("A soma entre " + num1 + " e " + num2 + " é: " + (num1 + num2) + ".");

        scanner.close();
    }
}
