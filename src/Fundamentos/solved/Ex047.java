package Fundamentos.solved;

import java.util.Scanner;

public class Ex047 {

    //DESAFIO: Desenvolva uma lógica que leia o peso e a altura de uma pessoa, calcule seu Índice de Massa
    // Corporal (IMC) e mostre seu status, de acordo com a tabela abaixo:
    //- IMC abaixo de 18,5: Abaixo do Peso
    //- Entre 18,5 e 25: Peso Ideal
    //- 25 até 30: Sobrepeso
    //- 30 até 40: Obesidade
    //- Acima de 40: Obesidade Mórbida

    public static void main(String[] args) {
        Ex047 imc = new Ex047();
        imc.retornaResultadoIMC();
    }

    private double altura;
    private double peso;
    Scanner scanner = new Scanner(System.in);

    public Ex047() {
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void retornaResultadoIMC() {

        System.out.println("Qual é a sua altura?");
        setAltura(scanner.nextDouble());
        System.out.println("Qual é o seu peso?");
        setPeso(scanner.nextDouble());

        double imc = getPeso() / (getAltura() * getAltura());
        System.out.printf("Seu IMC é de %.1f\n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        }
        if (imc >= 18.5 && imc <= 25) {
            System.out.println("Peso ideal.");
        }
        if (imc > 25 && imc <= 30) {
            System.out.println("Sobrepeso.");
        }
        if (imc > 30 && imc <= 40) {
            System.out.println("Obesidade.");
        }
        if (imc > 40) {
            System.out.println("Obesidade mórbida");
        }
    }

}
