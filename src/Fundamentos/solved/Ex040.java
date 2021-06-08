package Fundamentos.solved;

import Fundamentos.solved.classesTeste.ex040.Financiamento;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex040 {
    // Desafio: Escreva um programa para aprovar o empréstimo bancário para a compra de uma casa.
    // Pergunte o valor da casa, o salário do comprador e em quantos anos ele vai pagar.
    // A prestação mensal não pode exceder 30% do salário ou então o empréstimo será negado.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        Financiamento financiamento = new Financiamento();
        System.out.println("Informe o valor do imóvel: ");
        financiamento.setPrecoCasa(scanner.nextDouble());
        System.out.println("Informe o salário do comprador: ");
        financiamento.setSalarioComprador(scanner.nextDouble());
        System.out.println("Quantos anos de financiamento?");
        financiamento.setAnosFinanciamento(scanner.nextInt());
        System.out.print("Para pagar uma casa de R$" + df.format(financiamento.getPrecoCasa()));
        System.out.println(" em " + financiamento.getAnosFinanciamento() + " anos.");
        System.out.println("A prestação será de R$" + df.format(financiamento.valorParcelas()));
        System.out.println("\n" + financiamento.financiamentoAprovacao());
        scanner.close();
    }
}
