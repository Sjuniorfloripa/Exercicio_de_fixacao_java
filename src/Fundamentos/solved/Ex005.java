package Fundamentos.solved;

import java.util.Scanner;

public class Ex005 {
    //Desafio:  Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("A média final do aluno é: " + media);

        scanner.close();

        //ps: use "," ao inserir a nota ao invés de "."
    }
}
