package app.salesianos;

import java.util.LinkedList;
import java.util.Scanner;

import app.salesianos.cajero.Cashier;
import app.salesianos.cliente.Client;
import app.salesianos.utiles.Menu;


public class App {
    static final Scanner KEYBOARD = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean openCashier = false;
        boolean exit = true;

        Cashier cashier = new Cashier(null, new LinkedList<>(), 0, 0, null);
        Menu menu = new Menu();

        while (exit) {
            System.out.println(menu.getMenu());
            String option = KEYBOARD.nextLine();

            switch (option) {
                case "1":
                    if (openCashier) {
                        System.out.println("la caja ya estaba abierta");
                    } else {
                        openCashier = true;
                        System.out.println("la cja a sido abierta");
                    }
                    break;

                case "2":
                    if (!openCashier) {
                        System.out.println("la caja esta cerrada");
                    } else {
                        Client newClient = new Client();
                        System.out.println("se ha añiadido el cliente la cola");
                        System.out.println(newClient.getName());
                        cashier.addClient(newClient);

                    }
                    break;

                case "3":
                    if (Cashier.customersQueue.isEmpty()) {
                        System.out.println("no hya clientes pendientes de ser atendidos");
                    } else {
                        cashier.attendClient();
                    }
                    break;

                case "4":
                    System.out.println("Clientes pendientes en la cola de " + cashier.getName() + " :");
                    if (Cashier.customersQueue.isEmpty()) {
                        System.out.println("no hay clientes pendientes");
                    } else {
                        for (Client client : Cashier.customersQueue) {
                            System.out.println(client);
                        }
                    }
                    break;

                case "5":
                    if (openCashier) {
                        openCashier = false;
                        System.out.println("la caja ha sido cerrada. ");
                        cashier.emptyQueue();
                    } else {
                        System.out.println("la caja ya estaba cerrada.");
                    }
                    exit = false;
                    break;

                default:
                    System.out.println("opcion invalida");
                    break;
            }
        }
        KEYBOARD.close();
    }

}
