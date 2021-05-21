package Fundamentos.solved;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex008 {
    //Desafio: Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dólares ela pode comprar.

    //cotação dia 29/04/2021 5,37

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat decimal = new DecimalFormat("0.00");
        System.out.println("Quanto reais tem em sua carteira?");
        double real = scanner.nextDouble();
        double dolares = real / 5.37;

        System.out.println("Com R$"+decimal.format(real)+" você pode obter U$"+decimal.format(dolares));

        scanner.close();

    }
}
