package lesson5;

import java.util.Random;

public class Thing {
    private int weight;
    private int cost;
    private Random rnd;

    public Thing() {
        rnd = new Random();
        weight = rnd.nextInt(8) + 1;
        cost = rnd.nextInt(8) + 1;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }
}
