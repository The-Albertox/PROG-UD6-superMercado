package app.salesianos.cliente;

import java.util.Stack;

import app.salesianos.utiles.RandomNames;

public class Client {
    private String name;
    private Stack<String> shoppingBag;

    public Client() {
        this.name = RandomNames.getRandomNames();
        this.shoppingBag = new Stack<>();
    }

    public String getName() {
        return name;
    }

    public void addProduct(String product) {
        shoppingBag.push(product);
    }

    public void showShoppingBag() {
        System.out.println("cesta de " + name + ":");
        for (String product : shoppingBag) {
            System.out.println(product);
        }
    }

    public void emptyShoppingBag() {
        shoppingBag.clear();
        System.out.println("La cesta de " + name + "ha sido vaciada");
    }

}
