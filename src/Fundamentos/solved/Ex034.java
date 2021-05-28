package Fundamentos.solved;

import Fundamentos.solved.classesTeste.ex034.Radar;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex034 {
    // Desafio: Escreva um programa que leia a velocidade de um carro. Se ele ultrapassar 80Km/h, mostre uma mensagem
    // dizendo que ele foi multado. A multa vai custar R$7,00 por cada Km acima do limite.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Qual é a velocidade do carro?");
        Radar radar = new Radar(scanner.nextDouble());
        System.out.println("------------------------------");
        System.out.println(radar.aplicarMulta());
    }

}
