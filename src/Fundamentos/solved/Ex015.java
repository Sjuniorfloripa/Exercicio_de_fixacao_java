package Fundamentos.solved;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex015 {
    //Desafio: Faça um programa que leia o comprimento do cateto oposto e do cateto adjacente de um triângulo retângulo.
    // Calcule e mostre o comprimento da hipotenusa.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Informe o valor do cateto oposto");
        double oposto = scan.nextDouble();
        System.out.println("Informe o valor do cateto adjacente");
        double adjacente = scan.nextDouble();
        double hipotenusa = Math.hypot(oposto, adjacente);
        System.out.println("O valor da hipotenusa é "+df.format(hipotenusa));
        scan.close();
    }
}
