package app.salesianos.utiles;

import java.util.Random;

public class RandomProducts{
    private static final String[] products ={
        "platano canario",
        "Camiseta",
        "Pantalón",
        "Zapatos",
        "Play station 69",
        "Gorra de algun anime para otakus",
        "Bufanda",
        "rtx 69.420 ti  ",
        "Perfume",
        "BFG or Big Freeking Goose",
        "Maquillaje",
        "Crema hidratante",
        "Almuhada de chica de anime",
    };

    public static String getRandomProdutcs(){
        Random random = new Random();
        int randomIndex = random.nextInt(products.length);
        return products[randomIndex];
    }
}