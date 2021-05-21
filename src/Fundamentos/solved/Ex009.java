package Fundamentos.solved;

import java.util.Scanner;

public class Ex009 {
    //Desafio: Faça um programa que leia a largura e a altura de uma parede em metros, calcule a sua área e a
    // quantidade de tinta necessária para pintá-la, sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("informe a altura da parede: ");
        double altura = scanner.nextDouble();
        System.out.println("informe a largura da parede: ");
        double largura = scanner.nextDouble();
        double area = altura * largura;
        double tinta = area / 2;

        System.out.println("Será necessária " + tinta + "L de tinta para uma parede de " + area + "m².");

        scanner.close();
    }
}
