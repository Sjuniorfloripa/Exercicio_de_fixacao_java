package Fundamentos.solved.classesTeste.ex034;

public class Radar {

    private double velocidade;

    public Radar(double velocidade) {
        this.velocidade = velocidade;
    }

    public String aplicarMulta() {
        if (velocidade > 80.0) {
            double multa = (velocidade - 80) * 7;
            return String.format("Você ultrapassou o limite de velocidade! MULTA R$%.2f", multa);
        }
        return "PARABENS! Continue andando em segurança.";
    }
}
