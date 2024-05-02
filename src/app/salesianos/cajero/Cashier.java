package app.salesianos.cajero;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import app.salesianos.cliente.Client;
import app.salesianos.utiles.RandomNames;

public class Cashier {
    private String name;
    public static Queue<Client> customersQueue;
    private int cashierNumber;
    private int clientNumber;
    private List<String> customersList;

    public Cashier(String name, Queue<Client> customQueue, int cashierNumber, int clientNumber,
            List<String> customersList) {
        this.name = RandomNames.getRandomNames();
        this.customersQueue = new LinkedList<>();
        this.cashierNumber = cashierNumber;
        this.clientNumber = clientNumber;
        this.customersList = customersList;
    }

    public String getName() {
        return name;
    }

    public void addClient(Client client) {
        customersQueue.add(client);
        System.out.println(client.getName() + " ha entrado a fila para ser atendido por " + name + ".");
    }

    public void attendClient() {
        if (!customersQueue.isEmpty()) {
            Client client = customersQueue.poll();
            System.out.println(name + " ha atendido a " + client.getName() + ".");
        } else {
            System.out.println("no hay clientes en la fila de" + name + ".");
        }
    }

    public void showQueue() {
        System.out.println("fila de " + name + ":");
        for (Client client : customersQueue) {
            System.out.println(client.getName());
        }
    }

    public void emptyQueue() {
        customersQueue.clear();
        System.out.println("la fila de " + name + " ha sido vaciada");
    }

    @Override
    public String toString() {
        Stack<String> stack = new Stack<>();
        stack.push("================================");
        stack.push("*Clientes en la fila:");
        for (String client : this.customersList) {
            stack.push(client);
        }
        stack.push("* Total de clientes:" + this.clientNumber);
        stack.push("* Numero de caja:" + this.cashierNumber + ":");
        stack.push("cajero");
        return toString();
    }
}
