package Fundamentos.solved;

import java.util.Scanner;

public class Ex004 {
    //Desafio: Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        System.out.println("O dobro de " + num + " é " + (num * 2) + ".");
        System.out.println("O triplo de " + num + " é " + (num * 3) + ".");
        System.out.println("A raiz quadrada de " + num + " é " + (Math.sqrt(num)) + ".");

        scanner.close();
    }
}
