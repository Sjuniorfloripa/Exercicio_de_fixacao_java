package Fundamentos.solved.classesTeste;

public class Produto {

    public String nome;
    public double preco;
    public static final double desconto = 0.25;

    public Produto() {
    }

    public Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    public double precoComDesconto() {
        return preco * (1 - desconto);
    }
}
