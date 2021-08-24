package Fundamentos.solved.classesTeste.ex045;

import java.time.LocalDateTime;
import java.util.Scanner;

public class CalculoNatacao {

    public Integer anoUsuario;
    public Integer anoAtual = LocalDateTime.now().getYear();
    Scanner scanner = new Scanner(System.in);

    public CalculoNatacao() {
    }

    public Integer getAnoUsuario() {
        return anoUsuario;
    }

    public void setAnoUsuario(Integer anoUsuario) {
        this.anoUsuario = anoUsuario;
    }

    public void informarIdade(){
        System.out.println("Informe o ano de nascimento");
        setAnoUsuario(scanner.nextInt());
    }

    public Integer calculoIdadeUsuario(){
        return anoAtual - getAnoUsuario();
    }

    public void analisadorCategoria(){
        if (calculoIdadeUsuario() <= 9)
            System.out.println("Sua categoria é a MIRIM.");
        if (calculoIdadeUsuario() > 9 && calculoIdadeUsuario() <= 14)
        System.out.println("Sua categoria é a INFANTIL.");
        if (calculoIdadeUsuario() > 14 && calculoIdadeUsuario() <= 19)
            System.out.println("Sua categoria é a JÚNIOR.");
        if (calculoIdadeUsuario() > 19 && calculoIdadeUsuario() <= 25)
        System.out.println("Sua categoria é SÊNIOR.");
        if (calculoIdadeUsuario() > 25)
            System.out.println("Sua categoria é MASTER.");
    }
}
