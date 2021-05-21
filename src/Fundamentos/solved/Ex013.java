package Fundamentos.solved;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex013 {
    //Desafio: Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de
    // dias pelos quais ele foi alugado.
    // Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e R$0,15 por Km rodado.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Você alugou o carro por quantos dias?");
        int dias = scanner.nextInt();
        System.out.println("Percoreu quantos quilometros?");
        double km = scanner.nextDouble();
        double total = (dias * 60) + (km * 0.15);
        System.out.println("O valor total a pagar é R$" + df.format(total));

        scanner.close();
    }
}
