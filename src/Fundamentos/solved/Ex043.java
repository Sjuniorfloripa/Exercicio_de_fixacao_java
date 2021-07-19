package Fundamentos.solved;

import java.util.Scanner;

public class Ex043 {
// Desafio: Escreva um programa que leia dois números inteiros e compare-os. mostrando na tela uma mensagem:
//  - O primeiro valor é maior
//  - O segundo valor é maior
//  - Não existe valor maior, os dois são iguais

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Informe o primeiro numero: ");
    int primeiro = scan.nextInt();
    System.out.println("Informe o segundo numero: ");
    int segundo = scan.nextInt();

    if (primeiro > segundo){
        System.out.println("O primeiro valor é o maior.");
    }
    if (segundo > primeiro){
        System.out.println("O segundo valor é o maior.");
    }
    if (primeiro == segundo){
        System.out.println("Não existe valor maior, os dois são iguais.");
    }
}
}
