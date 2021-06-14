package Fundamentos.solved;

import java.util.Scanner;

public class Ex041 {
    // Desafio: Escreva um programa que leia um número inteiro qualquer e peça para o usuário
    // escolher qual será a base de conversão: 1 para binário, 2 para octal e 3 para hexadecimal.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = scan.nextInt();
        System.out.println("1 - Escolha 1 para convessão binária" +
                "\n2 - Escolha 2 para converssão octal" +
                "\n3 - Escolha 3 para converssão hexadecimal");
        int choice = scan.nextInt();

        while (choice != -1) {
            if (choice == 1) {
                System.out.println(numero + " Para binário: " + Integer.toBinaryString(numero));
            }
            if (choice == 2) {
                System.out.println(numero + " Para octal: " + Integer.toOctalString(numero));
            }
            if (choice == 3){
                System.out.println(numero + " Para hexadecimal: " + Integer.toHexString(numero));
            }if (choice != 1 && choice != 2 && choice != 3){
                System.out.println("Faça uma escolha válida.");
                choice = -1;
            }
            System.out.println("Muito obrigado e até a próxima.");
            choice = -1;
        }
        scan.close();
    }
}
