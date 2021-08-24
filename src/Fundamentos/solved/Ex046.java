package Fundamentos.solved;

import java.util.Scanner;

public class Ex046 {

    // Desafio: Refaça o DESAFIO 039 dos triângulos, acrescentando o recurso de mostrar que tipo de
    // triângulo será formado:
    //- EQUILÁTERO: todos os lados iguais
    //- ISÓSCELES: dois lados iguais, um diferente
    //- ESCALENO: todos os lados diferentes

    public static void main(String[] args) {
        Ex046 triangulo = new Ex046();
        triangulo.validaTriangulos();
    }

    private double ladoA;
    private double ladoB;
    private double ladoC;

    Scanner scanner = new Scanner(System.in);

    public Ex046() {
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public void validaTriangulos(){
        System.out.println("Informe o valor do lado A");
        setLadoA(scanner.nextDouble());
        System.out.println("Informe o valor do lado B");
        setLadoB(scanner.nextDouble());
        System.out.println("Informe o valor do lado C");
        setLadoC(scanner.nextDouble());

        if (getLadoA() == getLadoB() && getLadoA() == getLadoC()){
            System.out.println("EQUILÁTERO");
        }
        if (getLadoA() == getLadoB() && getLadoA() != getLadoC()
        || getLadoA() == getLadoC() && getLadoA() != getLadoB()
        || getLadoB() == getLadoC() && getLadoB() != getLadoA()){
            System.out.println("ISÓSCELES");
        }if (getLadoA() != getLadoB() && getLadoA() != getLadoC()
        && getLadoB() != getLadoC()){
            System.out.println("ESCALENO");
        }

    }
}
