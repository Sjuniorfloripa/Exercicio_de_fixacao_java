package Fundamentos.solved;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex017 {
    //Desafio: Um professor quer sortear um dos seus quatro alunos para apagar o quadro.
    // Faça um programa que ajude ele, lendo o nome dos alunos e escrevendo na tela o nome do escolhido.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = new String[4];
        int contador = 0;
        Random rand = new Random();

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Informe o nome do %dº aluno(a).\n", i + 1);
            alunos[contador] = scanner.nextLine();
            contador++;
        }
        String sorteio = Arrays.toString(new String[]{alunos[rand.nextInt(alunos.length)]});

        System.out.println("O aluno(a) escolhido foi: " + sorteio);
        scanner.close();
    }
}
