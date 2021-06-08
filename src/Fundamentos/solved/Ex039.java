package Fundamentos.solved;

import Fundamentos.solved.classesTeste.ex039.Segmento;

import java.util.Scanner;

public class Ex039 {

    // Desafio: Desenvolva um programa que leia o comprimento de três retas e diga ao usuário se elas
    // podem ou não formar um triângulo.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Segmento segmento = new Segmento();
        System.out.println("Informe o valor do primeiro segmento: ");
        segmento.setSegmento1(scanner.nextDouble());
        System.out.println("Informe o valor do segundo segmeto: ");
        segmento.setSegmento2(scanner.nextDouble());
        System.out.println("Informe o valor do terceiro segmento: ");
        segmento.setSegmento3(scanner.nextDouble());

        System.out.println(segmento.analizarTriangulo());
        scanner.close();
    }
}
