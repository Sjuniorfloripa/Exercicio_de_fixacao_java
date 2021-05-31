package Fundamentos.solved.classesTeste.ex036;

public class Passagem {

    private double preco;
    private double km;

    public Passagem(){
    }

    public double getKm() {
        return km;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setKm(double km) {
        this.km = km;
    }
    public double calcularValorViagem(){
        if (getKm() <= 200){
            setPreco(0.5);
        }else{
            setPreco(0.45);
        }

        return preco * km;
    }
}
