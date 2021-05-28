package Fundamentos.solved;

import Fundamentos.solved.classesTeste.ex031.Cidade;

import java.util.Scanner;

public class Ex031 {
    //Desafio: Crie um programa que leia o nome de uma cidade diga se ela começa ou não com o nome "SANTO".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome da cidade.");
        Cidade cidade = new Cidade(scanner.nextLine());
        System.out.println(cidade.verificarString());

        scanner.close();
    }
}
