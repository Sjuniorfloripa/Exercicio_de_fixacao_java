package Fundamentos.solved;

import java.util.Scanner;

public class Ex019 {
    //Desafio: Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um numero inteiro.");
        int choice = scanner.nextInt();
        if (choice >= 0 && choice <= 10) {
            System.out.println("O numero está entre 0 e 10");
            if (choice % 2 == 0) {
                System.out.println("O numero escolhido é par.");
            }
        }else{
            System.out.println("O número não está entre 0 e 10.");
        }

        scanner.close();
    }
}
