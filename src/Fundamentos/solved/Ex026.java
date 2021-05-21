package Fundamentos.solved;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex026 {
    //Desafio: Calcular a média do aluno, entrentanto o usuário quem deve informar a quantidade total de notas que
    // devem ser armazenadas em um array. Use um laço FOR para a aramzenar as notas e use um laço FOR EACH para somar
    // as notas. No final, apresente a média final do aluno.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o total de notas do aluno(a).");
        DecimalFormat df = new DecimalFormat("0.0");
        Integer totalNotas = scanner.nextInt();
        double[] notas = new double[totalNotas];
        double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a %dª nota do aluno(a).\n", i + 1);
            notas[i] = scanner.nextDouble();
        }
        for (double nota : notas) {
            somaNotas += nota;
        }
        double media = somaNotas / notas.length;
        System.out.println("A média final do aluno é: " + df.format(media));
        scanner.close();
    }
}
