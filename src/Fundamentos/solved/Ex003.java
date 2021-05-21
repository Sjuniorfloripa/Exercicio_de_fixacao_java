package Fundamentos.solved;

import java.util.Scanner;

public class Ex003 {
    //Desafio: Faça um programa que leia um número Inteiro e mostre na tela o seu sucessor e seu antecessor.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int num1 = scanner.nextInt();
        System.out.println("O antecessor de " + num1 + " é " + (num1 - 1) + " e o sucessor é " + (num1 + 1) + ".");

        scanner.close();
    }
}
