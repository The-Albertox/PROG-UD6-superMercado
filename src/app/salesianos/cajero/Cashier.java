package app.salesianos.cajero;

import java.util.List;
import java.util.Queue;

import app.salesianos.cliente.Client;

public class Cashier {
    private String name;
    public static Queue<Client> customersQueue;
    private int cashierNumber;
    private int clientNumber;
    private List<String> customersList;

    public Cashier(String name, Queue<Client> customQueue, int cashierNumber, int clientNumber,
            List<String> customersList) {
        this.name = name;
        this.customersQueue = customersQueue;
        this.cashierNumber = cashierNumber;
        this.clientNumber = clientNumber;
        this.customersList = customersList;
    }

    public String getName() {
        return name;
    }

    public void addClient(Client client) {
        customersQueue.offer(client);
        System.out.println(client.getName() + "ha entrado a fila para ser atendido por " + name + ".");
    }

    public void attendClient() {
        if (!customersQueue.isEmpty()) {
            Client client = customersQueue.poll();
            System.out.println(name + "ha atendido a" + client.getName() + ".");
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
        System.out.println("la fila de " + name + "ha sido vaciada");
    }
}
