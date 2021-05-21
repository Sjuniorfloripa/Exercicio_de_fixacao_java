package Fundamentos.solved;

import java.util.Scanner;

public class Ex006 {
    //Desafio: Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor em metros: ");
        double metros = scanner.nextDouble();
        double cm = metros * 100;
        double mm = metros * 1000;

        System.out.println("O valor de " + metros + "m em centímetros é " + cm + "cm.");
        System.out.println("O valor de " + metros + "m em milímetros é " + mm + "mm.");

        scanner.close();

        //ps: use "," ao inserir a nota ao invés de "."
    }
}
