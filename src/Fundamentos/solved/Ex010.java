package Fundamentos.solved;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex010 {
    //Desafio: Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Informe o preço do produto: R$");
        double preco = scanner.nextDouble();
        double desconto = (preco * 5) / 100;
        double novoPreco = preco - desconto;
        System.out.println("Esse item que custava " + (df.format(preco)) + " com 5% de desconto ficará R$" + (df.format(novoPreco)));
        scanner.close();
    }
}
