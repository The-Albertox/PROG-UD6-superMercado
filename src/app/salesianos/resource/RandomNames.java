package app.salesianos.resource;

import java.util.Random;

public class RandomNames {
    private static final String[] NAMES = {"Juan", "María", "Pedro", "Anaisa", "Luison", "Vladimir", "Jorge Jorge in the jungle", "Enmanuel", "Carlos", "Lucy", "Diana", "Alberto", "Miguel", "Isabel", "Pablo", "Elena", "Rafael", "Clara", "Antonio", "Marta"};

    public static String getRandomNames(){
        Random random = new Random();
        return NAMES[random.nextInt(NAMES.length)];
    }
}
