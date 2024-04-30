package app.salesianos;

import java.util.Scanner;

import app.salesianos.cajero.Cashier;
import app.salesianos.cliente.Client;
import app.salesianos.utiles.Menu;

public class App {
    static final Scanner KEYBOARD = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean openCashier = false;
        boolean exist = false;
        String option = KEYBOARD.next();

        Cashier cashier = new Cashier(null, null, 0, 0, null);
        Menu menu = new Menu();
        while (exist) {
            option = menu.requestMenuOption();
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
                        System.out.println("la cja esta cerrada");
                    } else {
                        Client newClient = getRandomNames();
                        System.out.println("se ha añiadido el cliente la cola");
                        System.out.println(newClient);
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
                case "5":

                    break;

                default:
                    break;
            }
        }

    }

    private static Client getRandomNames() {
        return null;
    }
}
