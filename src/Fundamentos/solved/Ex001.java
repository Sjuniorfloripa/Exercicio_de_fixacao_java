package Fundamentos.solved;

import java.util.Scanner;

public class Ex001 {

    //desafio: Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Seja muito bem vindo " + nome + "!");
        scanner.close();
    }
}
