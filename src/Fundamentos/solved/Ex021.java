package Fundamentos.solved;

import java.util.Scanner;

public class Ex021 {
    //Desafio: Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno dor maior
    // ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console
    //"Recuperação", caso contrário imprime no console "Reprovado".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota do aluno: ");
        String valor1 = scanner.nextLine().replace(",", ".");
        System.out.println("Informe a segunda nota do aluno: ");
        String valor2 = scanner.nextLine().replace(",", ".");

        double nota1 = Double.parseDouble(valor1);
        double nota2 = Double.parseDouble(valor2);
        double media = (nota1 + nota2) / 2;
        System.out.println("A média do aluno foi: " + media);

        if (media <= 10.0 && media >= 7.0) {
            System.out.println("Aprovado! parabens!");
        } else if (media < 7.0 && media >= 4.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
