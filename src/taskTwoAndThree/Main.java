package taskTwoAndThree;

import taskTwoAndThree.flowerParts.BlossomColour;
import taskTwoAndThree.flowers.Flower;
import taskTwoAndThree.flowers.FlowerType;
import taskTwoAndThree.flowers.Lily;
import taskTwoAndThree.flowers.Rose;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // примеры создания объектов с использованием разных конструкторов
        Lily defaultLily = new Lily();
        Lily specificLily = new Lily(40, 1.5, 7,
                                     BlossomColour.MAGENTA, 5);

        Rose defaultRose = new Rose();
        Rose specificRose = new Rose(50, 1.7, 13,
                                     BlossomColour.WHITE, 13, 13);

        // создание коллекции и добавление объектов
        ArrayList<Flower> flowers = new ArrayList<>();
        // при добавлении происходит восходящее преобразование типов
        flowers.add(defaultLily); // Lily -> Flower
        flowers.add(defaultRose); // Rose -> Flower
        flowers.add(specificLily); // Lily -> Flower
        flowers.add(specificRose); // Rose -> Flower

        for (Flower flower : flowers) { // цикл по содержимому коллекции
            FlowerType flowerType = flower.getFlowerType(); // пример полиморфизма
            if (flowerType == FlowerType.LILY) {
                System.out.println("This is lily");
            } else if (flowerType == FlowerType.ROSE) {
                System.out.println("This is rose");
            }

            // использование метода из интерфейса
            System.out.println(flower.getDescription());

            if (flower instanceof Rose) { // пример определения типа
                // пример нисходящего преобразования типов Flower -> Rose
                System.out.println(((Rose)flower).warn());
            }

            System.out.println();
        }
    }

}
