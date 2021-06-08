package Fundamentos.solved.classesTeste.ex040;

public class Financiamento {

    private double precoCasa;
    private double salarioComprador;
    private int anosFinanciamento;

    public Financiamento() {
    }

    public double getPrecoCasa() {
        return precoCasa;
    }

    public void setPrecoCasa(double precoCasa) {
        this.precoCasa = precoCasa;
    }

    public double getSalarioComprador() {
        return salarioComprador;
    }

    public void setSalarioComprador(double salarioComprador) {
        this.salarioComprador = salarioComprador;
    }

    public int getAnosFinanciamento() {
        return anosFinanciamento;
    }

    public void setAnosFinanciamento(int anosFinanciamento) {
        this.anosFinanciamento = anosFinanciamento;
    }

    public double valorParcelas(){
        return this.precoCasa / (this.anosFinanciamento * 12);
    }

    public double pagamentoMinimo(){
        return (this.getSalarioComprador() * 30) / 100;
    }

    public String financiamentoAprovacao(){
        if (this.valorParcelas() <= this.pagamentoMinimo()){
            return "Empréstimo concedido.";
        }
        return "Empréstimo negado.";
    }
}
