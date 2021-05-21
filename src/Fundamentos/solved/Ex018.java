package Fundamentos.solved;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex018 {
    //Desafio: crie um programa que receba os 3 ultimos salários do funcionário em String e converta para Double.
    //faça um calculo da média de salário do funcionário. O teclado deve receber tanto ponto como virgula no teclado e
    //ainda assim o programa deve exibir o resultado.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Informe o primeiro salário: ");
        String valor1 = scan.nextLine().replace(",", ".");
        System.out.println("Informe o segundo salário: ");
        String valor2 = scan.nextLine().replace(",", ".");
        System.out.println("Informe o terceiro salário: ");
        String valor3 = scan.nextLine().replace(",", ".");
        Double sal1 = Double.parseDouble(valor1);
        Double sal2 = Double.parseDouble(valor2);
        Double sal3 = Double.parseDouble(valor3);
        Double media = (sal1 + sal2 + sal3) / 3;
        System.out.println("A media salarial é de R$" + df.format(media));
        scan.close();
    }
}
