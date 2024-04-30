package app.salesianos;

import java.util.Scanner;

import app.salesianos.cajero.Cashier;
import app.salesianos.utiles.Menu;

public class App {
    static final Scanner KEYBOARD = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        
        boolean exist = false;
        String option = KEYBOARD.next();

        Cashier cashier = new Cashier(null, null, 0, 0, null);
        Menu menu = new Menu();
        while (exist) {
            option = menu.requestMenuOption();

        }
    }
}
