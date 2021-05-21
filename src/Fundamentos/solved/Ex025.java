package Fundamentos.solved;

import java.util.Scanner;

public class Ex025 {
    /* Desafio: Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos
    números inseridos, caso receba um número negativo, encerre o programa. tente utilizar a estrutura while.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eu amo somar! Me dê números para eu somar! Odeio subtrações!");
        int numero = 0;
        int somador = 0;
        while (numero >= 0) {
            System.out.println("ME DÊ UM NUMERO PARA SOMAR AGORA!!!! HAHAHAHAHA!!");
            numero = scanner.nextInt();
            System.out.println("--------------------------------------------------");
            if (numero >= 0) {
                System.out.println("ISSO!! CONTINUE ME DANDO NÚMEROS HAHAHAHA!!!");
                somador += numero;
                System.out.println("O total de números somados é: " + somador);
                System.out.println("--------------------------------------------------");
            }
        }

        System.out.println("ARGH!! Você me deu uma subtração!? Magoei. Vou embora...");
    }
}
