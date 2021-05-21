package Fundamentos.solved;

import java.util.Random;
import java.util.Scanner;

public class Ex024 {
    //Desafio: Jogo da adivinhação: Tentar adivinhar um número entre 0 e 100. Armazene um número aleatório em uma
    // variável. O jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a
    // quantidade de tentativas restantes, e imprima o número inserido é maior ou menor do que o número armazenado.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int tentativas = 0;
        int numeroSorteado = random.nextInt(101);
        System.out.println("Escolha um número e veja se consegue me derrotar você tem 10 chances para acertar o número.");
        while (tentativas != 10) {
            tentativas++;
            System.out.printf("tentativa %dº. ", tentativas);
            System.out.println("Qual é o seu número?");
            int numeroEscolhido = scanner.nextInt();
            if (numeroEscolhido > numeroSorteado) {
                System.out.println("O seu número é maior do que eu escolhi.");
            } else if (numeroEscolhido < numeroSorteado) {
                System.out.println("O seu número é menor do que eu escolhi.");
            } else {
                System.out.println("Você acertou!!! Parabens!!!");
                break;
            }
            System.out.println("-----------------------------------------------------");
        }

        System.out.println("parece que eu ganhei dessa vez. Mais sorte da próxima vez.");
        scanner.close();
    }
}
