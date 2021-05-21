package Fundamentos.solved;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex011 {
    //Desafio: Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário, com 15% de aumento.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("informe o salário atual: ");
        double salario = scanner.nextDouble();
        double reajuste = salario * 1.15;
        System.out.println("Seu antigo salário de R$" + df.format(salario) + " com reajuste é R$" + df.format(reajuste) + ".");

        scanner.close();
    }
}
