package Fundamentos.unsolved;

import java.util.Scanner;

public class Ex020 {
    //Desafio: Criar um programa que informa se o ano informado é bissexto.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um ano");
        int ano = scanner.nextInt();
        if (ano % 4 == 0){
            System.out.println("O ano é bissexto");
        }else {
            System.out.println("O ano não é bissexto.");
        }

        scanner.close();
    }
}
