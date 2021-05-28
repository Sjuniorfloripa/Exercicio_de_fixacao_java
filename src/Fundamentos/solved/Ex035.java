package Fundamentos.solved;

import Fundamentos.solved.classesTeste.ex035.ParOuImpar;

import java.util.Scanner;

public class Ex035 {
    // Desafio:  Crie um programa que leia um número inteiro e mostre na tela se ele é PAR ou ÍMPAR.
    // Use classe separadas
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me informe um número.");
        ParOuImpar parOuImpar = new ParOuImpar(scanner.nextInt());
        System.out.println(parOuImpar.isPar());
    }
}
