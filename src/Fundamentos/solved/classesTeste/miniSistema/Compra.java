package Fundamentos.solved.classesTeste.miniSistema;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> items = new ArrayList<>();

    public void adicionaItem(String description, double price, int quantity) {
        this.items.add(new Item(new Produto(description, price), quantity));
    }

    double getTotal() {
        double total = 0;

        for (Item item: items){
            total += item.quantity * item.produto.price;
        }

        return total;
    }
}
