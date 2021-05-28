package Fundamentos.solved;

import Fundamentos.solved.classesTeste.ex033.Computer;

import java.util.Random;
import java.util.Scanner;

public class Ex033 {
    // Desafio: Escreva um programa que faça o computador "pensar" em um número inteiro entre 0 e 5 e peça para o
    // usuário tentar descobrir qual foi o número escolhido pelo computador. O programa deverá escrever na tela se o
    // usuário venceu ou perdeu.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Computer computer = new Computer(random.nextInt(5));

        System.out.println("Quero ver você acertar!\nQue número eu estou pensando? [entre 0 e 5]" );
        int playerChoice = scanner.nextInt();
        if (playerChoice == computer.getComputerChoice()){
            System.out.println("PARABENS!!! VOCÊ ACERTOU!!!");
        }else {
            System.out.println("que pena não foi dessa vez... eu pensei no "+ computer.getComputerChoice());
        }
    }
}
