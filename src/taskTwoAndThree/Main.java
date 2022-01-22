package taskTwoAndThree;

import taskTwoAndThree.flowerParts.BlossomColour;
import taskTwoAndThree.flowers.Flower;
import taskTwoAndThree.flowers.Lily;
import taskTwoAndThree.flowers.Rose;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Lily defaultLily = new Lily();
        Lily specificLily = new Lily(40, 1.5, 7,
                                     BlossomColour.MAGENTA, 5);

        Rose defaultRose = new Rose();
        Rose specificRose = new Rose(50, 1.7, 13,
                                     BlossomColour.WHITE, 13, 13);

        ArrayList<Flower> flowers = new ArrayList<>();
        flowers.add(defaultLily);
        flowers.add(defaultRose);
        flowers.add(specificLily);
        flowers.add(specificRose);

        for (Flower flower : flowers) {
            System.out.println(flower.getDescription());
            if (flower instanceof Rose) {
                System.out.println(((Rose)flower).warn());
            }
            System.out.println();
        }
    }

}
