package Fundamentos.solved;

import Fundamentos.solved.classesTeste.ex036.Passagem;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex036 {
    // Desafio: Desenvolva um programa que pergunte a distância de uma viagem em Km. Calcule o preço da passagem,
    // cobrando R$0,50 por Km para viagens de até 200Km e R$0,45 para viagens mais longas

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        Passagem passagem = new Passagem();
        System.out.println("Quantos quilometros é a sua viagem?");
        passagem.setKm(scanner.nextDouble());
        System.out.println("Sua passagem é de R$" + df.format(passagem.calcularValorViagem()));
        scanner.close();
    }
}
