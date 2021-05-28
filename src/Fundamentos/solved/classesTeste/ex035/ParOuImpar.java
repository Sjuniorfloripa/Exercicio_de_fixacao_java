package Fundamentos.solved.classesTeste.ex035;

public class ParOuImpar {

    private int numero;

    public ParOuImpar(int numero) {
        this.numero = numero;
    }

    public String isPar() {
        if (numero % 2 == 0) {
            return String.format("O número %s é par.", numero);
        }
        return String.format("O número %s é ímpar.", numero);
    }
}
