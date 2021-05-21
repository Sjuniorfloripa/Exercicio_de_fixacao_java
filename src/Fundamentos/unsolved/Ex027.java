package Fundamentos.unsolved;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex027 {
    //Desafio: O mesmo professor do desafio Ex017 quer sortear a ordem de apresentação de trabalhos dos alunos.
    // Faça um programa que leia o nome dos quatro alunos e mostre a ordem sorteada.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alunos = new String[4];
        int contador = 0;

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Informe o nome do %sº aluno(a)", i + 1);
            alunos[contador] = scanner.nextLine();
            contador++;
        }

        List<String> alunosList = Arrays.asList(alunos);
        Collections.shuffle(alunosList);
        alunosList.toArray(alunos);
        String formatado = Arrays.toString(alunos);

        System.out.println("A ordem de aprensentação será:");
        System.out.println(formatado);

        scanner.close();
    }


}
