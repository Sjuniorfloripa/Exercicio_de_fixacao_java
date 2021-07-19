package Fundamentos.solved;

import Fundamentos.solved.classesTeste.ex044.CalculoAlistamento;

import java.util.Scanner;

public class Ex044 {
// Desafio: Faça um programa que leia o ano de nascimento de um jovem e informe, de acordo com a sua idade,
// se ele ainda vai se alistar ao serviço militar, se é a hora exata de se alistar ou se já passou do
// tempo do alistamento. Seu programa também deverá mostrar o tempo que falta ou que passou do prazo.

    public static void main(String[] args) {

        CalculoAlistamento calculoAlistamento = new CalculoAlistamento();
        System.out.println("Em qual ano você nasceu?");
        Scanner scanner = new Scanner(System.in);
        calculoAlistamento.setAnoUsuario(scanner.nextInt());
        calculoAlistamento.respostaSistema();
        scanner.close();
    }
}
