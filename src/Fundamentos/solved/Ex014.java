package Fundamentos.solved;

import java.util.Scanner;

public class Ex014 {
    //Desafio: Crie um programa que leia um número Real qualquer pelo teclado e mostre na tela a sua porção Inteira.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número real: ");
        double real = scan.nextDouble();
        int inteiro = (int)Math.floor(real);
        System.out.println("A porção inteira de "+real+" é "+inteiro);
        scan.close();
    }
}
