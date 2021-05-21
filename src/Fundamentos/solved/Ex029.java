package Fundamentos.solved;

import java.util.Locale;
import java.util.Scanner;

public class Ex029 {
    //Desafio: Crie um programa que leia o nome completo de uma pessoa e mostre:
    //- O nome com todas as letras maiúsculas e minúsculas.
    //- Quantas letras ao total (sem considerar espaços).
    //- Quantas letras tem o primeiro nome.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nome = scanner.nextLine();
        String nomeSemEspacos = nome.replaceAll(" ", "");
        String [] separadorNome = nome.split(" ");

        System.out.printf("Seu nome em maiúsculo é: %s.\n", nome.toUpperCase(Locale.ROOT));
        System.out.printf("Seu nome em minúsculo é: %s.\n",nome.toLowerCase(Locale.ROOT));
        System.out.printf("Seu nome completo tem um total de %s letras.\n",nomeSemEspacos.length());
        System.out.printf("Seu primeiro nome tem %s letras.",separadorNome[0].length());

        scanner.close();
    }
}
