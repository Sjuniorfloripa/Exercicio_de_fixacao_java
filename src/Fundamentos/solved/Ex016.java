package Fundamentos.solved;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex016 {
    //Desafio: Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno e tangente
    // desse ângulo.
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o angulo que você deseja?");
        double angle = Math.toRadians(scan.nextDouble());
        double seno = Math.sin(angle);
        double coseno = Math.cos(angle);
        double tangente = Math.tan(angle);
        System.out.println("O ângulo de " + df.format(angle) + " tem o SENO de "+df.format(seno));
        System.out.println("O ângulo de " + df.format(angle) + " tem o COSENO de "+df.format(coseno));
        System.out.println("O ângulo de " + df.format(angle) + " tem a TANGENTE de "+df.format(tangente));
        scan.close();
    }
}
