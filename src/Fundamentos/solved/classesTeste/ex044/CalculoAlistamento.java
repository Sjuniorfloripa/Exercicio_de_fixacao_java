package Fundamentos.solved.classesTeste.ex044;

import java.time.LocalDateTime;

public class CalculoAlistamento {

    private int anoUsuario;
    private int anoAtual = LocalDateTime.now().getYear();


    public void setAnoUsuario(int anoUsuario) {
        this.anoUsuario = anoUsuario;
    }

    public int getAnoUsuario() {
        return anoUsuario;
    }

    public int calcularIdadeUsuario() {
        return anoAtual - getAnoUsuario();
    }

    public int tempoRestante() {
        return 18 - calcularIdadeUsuario();
    }

    public void respostaSistema() {
        if (calcularIdadeUsuario() == 18) {
            System.out.println("Está na hora de se alistar, apresente-se o quanto antes no quartel.");
        } else if (calcularIdadeUsuario() < 18) {
            System.out.println("Não está na hora, ainda resta " + tempoRestante() + " ano(s) para você se apresentar.");
        } else {
            System.out.println("Já passou do tempo de alistamento.");
        }
    }
}
