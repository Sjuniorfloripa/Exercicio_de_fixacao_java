package Fundamentos.solved.classesTeste.heranca;

public class Carro {

    int velocidade;
    final int VELOCIDADE_MAX;
    int delta = 5;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAX = velocidadeMaxima;
    }

    void acelerar() {
        if (velocidade + delta > VELOCIDADE_MAX){
            velocidade = VELOCIDADE_MAX;
        }else {
            velocidade += delta;
        }
    }

    void frear() {
        if (velocidade >= delta) {
            velocidade -= delta;
        } else {
            velocidade = 0;
        }
    }

    @Override
    public String toString() {
        return "velocidade atual de " + velocidade + "km/h.";
    }
}
