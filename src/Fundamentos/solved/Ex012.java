package Fundamentos.solved;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex012 {
    //Desafio: Escreva um programa que converta uma temperatura digitando em graus Celsius e converta para graus Fahrenheit.

    public static void main(String[] args) {
        //(0 °C × 9/5) + 32 = 32 °F

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Informe a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("ºC " + df.format(celsius) + " é equvalente a ºF " + df.format(fahrenheit));
    }
}
