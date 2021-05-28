package Fundamentos.solved;

import Fundamentos.solved.classesTeste.ex032.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Ex032 {
    //Desafio: Crie um programa que leia o nome de uma pessoa e diga se ela tem "SILVA" no nome.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo:");
        Pessoa pessoa = new Pessoa(scanner.nextLine().trim().toLowerCase(Locale.ROOT));
        System.out.println("Possui Silva no nome? R: "+ pessoa.verificarSilva());

        scanner.close();
    }
}
