package Fundamentos.solved.classesTeste.miniSistema;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String name;
    List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.name = nome;
    }

    void adicionaCompra(Compra compra){
        this.compras.add(compra);
    }

    double totalCompras() {
        double total = 0;

        for (Compra compra : compras) {
            total += compra.getTotal();
        }

        return total;
    }

    @Override
    public String toString() {
        return "" + name;
    }
}
