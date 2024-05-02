package app.salesianos.client;

import java.util.Stack;

import app.salesianos.resource.RandomNames;
import app.salesianos.resource.RandomProducts;

public class Client {
    private String name;
    private String products;
    private Stack<String> shoppingBag;

    public Client() {
        this.name = RandomNames.getRandomNames();
        this.products = RandomProducts.getRandomProdutcs();
        this.shoppingBag = new Stack<>();
    }

    public String getName() {
        return name;
    }

    public void addProduct() {
        shoppingBag.push(products);
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

    @Override
    public String toString() {
        Stack<String> pile = new Stack<>();
        pile.push("===================================\n");
        pile.push("la lista de artucloa de la cesta : \n");
        for (String product : shoppingBag) {
            pile.push(product + "\n");
        }
        pile.push("*Nombre:" + this.name + "\n");
        pile.push("*articulos:" + this.products + "\n");
        return pile.toString();
    }
}
