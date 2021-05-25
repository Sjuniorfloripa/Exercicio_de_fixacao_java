package Fundamentos.solved.classesTeste.miniSistema;

import java.text.DecimalFormat;

public class Sistema {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Silvano");
        System.out.printf("Bem vindo %s!\n", cliente);

        DecimalFormat df = new DecimalFormat("0.00");
        Compra compra1 = new Compra();
        compra1.adicionaItem("NoteBook", 1999.9, 1);
        compra1.adicionaItem("Mouse", 69.9, 1);
        compra1.adicionaItem("Travesseiro", 39.9, 2);

        Compra compra2 = new Compra();
        compra2.adicionaItem("Carro popular", 10000,1);

        cliente.adicionaCompra(compra1);
        cliente.adicionaCompra(compra2);

        System.out.println("O total de sua compra foi R$"+df.format(cliente.totalCompras()));
    }
}
