package Fundamentos.solved.classesTeste;

public class Produto {

    private String descricao;
    private double preco;
    private double desconto;
    private double frete;
    private double impostoMunicipal;

    public Produto(String descricao, double preco, double desconto, double frete, double impostoMunicipal) {
        this.descricao = descricao;
        this.preco = preco;
        this.desconto = desconto;
        this.frete = frete;
        this.impostoMunicipal = impostoMunicipal;
    }

    public Produto() {
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getImpostoMunicipal() { return impostoMunicipal; }

    public void setImpostoMunicipal(double impostoMunicipal) { this.impostoMunicipal = impostoMunicipal; }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double precoComDesconto() {
        return this.preco - (preco * desconto) / 100;
    }

    public double calcularFrete(){
        if (precoComDesconto() >= 3000){
            return this.frete = 100;
        }else {
            return this.frete = 50;
        }
    }

    public double calcularImposto(){
        if (this.getPreco() >= 2500){
            return (preco * 8.5) / 100;
        }else {
            return this.getPreco();
        }
    }
    public double precoFinal(Produto produto){
        produto.setPreco(produto.precoComDesconto() + produto.calcularImposto());
        return produto.preco;
    }
}
