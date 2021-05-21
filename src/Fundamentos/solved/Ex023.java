package Fundamentos.solved;

import java.util.Scanner;

public class Ex023 {
    //Desafio: refatorar o exercício Ex022, Usando Switch case.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();
        int contador = 0;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }

        switch (contador) {
            case 0:
                System.out.println("o número " + numero + " é primo.");
                break;

            default:
                System.out.println("O número " + numero + " não é primo.");
        }
    }
}
