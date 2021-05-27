package Fundamentos.solved.classesTeste.heranca;

public class Ferrari extends Carro{

    Ferrari(int velocidadeMaxima) {
        super(300);
    }

    @Override
    void acelerar() {
        velocidade += 15;
    }
}
