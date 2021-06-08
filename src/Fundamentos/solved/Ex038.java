package Fundamentos.solved;

import Fundamentos.solved.classesTeste.Produto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex038 {
    // Desafio: Use o Binary Operator ->
    /*
     *1. A partir do produto calcular o preco real (com desconto)
     *2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
     * 4. Arrendondar: Deixar duas casas decimais
     * 5. FOrmatar: R41234,56
     * */

    public static void main(String[] args) {

//        Function<Produto, Double> precoFinal = p -> p.preco * (1 - p.desconto);
//        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
//        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
//        UnaryOperator<Double> arrendondar = preco -> Double.parseDouble(String.format("%.2f", preco));
//        Function<Double, String> formatar = preco -> ("RS" + preco).replace(".", ",");

        Produto produto = new Produto();

//        String preco = precoFinal
//                .andThen(impostoMunicipal)
//                .andThen(frete)
//                .andThen(arrendondar)
//                .andThen(formatar)
//                .apply(produto);

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe o nome do produto:");
        produto.setDescricao(scanner.nextLine());
        System.out.println("Informe o preço do produto");
        produto.setPreco(scanner.nextDouble());
        System.out.println("Informe o desconto: (Se não houver digite 0)");
        produto.setDesconto(scanner.nextDouble());

//        System.out.println("O preco final é R$ " + preco);


        System.out.println("Produto: " + produto.getDescricao());
        System.out.println("Valor: R$" + df.format(produto.getPreco()));
        System.out.println("Desconto: " + produto.getDesconto() + "%");
        System.out.println("impostos: R$" + df.format(produto.calcularImposto()));
        System.out.println("O valor total da compra é R$" + df.format(produto.precoFinal(produto)));
        scanner.close();

    }

}
