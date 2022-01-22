package taskTwoAndThree.flowers;

import taskTwoAndThree.flowerParts.BlossomColour;

public class Lily extends Flower {

    private static final int DEFAULT_LILY_LEAVES_AMOUNT = 6; // статическая константа

    public Lily() { // конструктор по умолчанию
        super(); // вызов родительского конструктора по умолчанию
        leavesAmount = DEFAULT_LILY_LEAVES_AMOUNT;
    }

    // пример перегрузки конструктора
    public Lily(double stemHeight,
                double stemDiameter,
                int blossomPetalsAmount,
                BlossomColour blossomColour,
                int leavesAmount)
    {
        // вызов родительского коструктора
        super(stemHeight, stemDiameter, blossomPetalsAmount, blossomColour);
        this.leavesAmount = leavesAmount;
    }

    @Override // реализация виртуального метода
    public FlowerType getFlowerType() {
        return FlowerType.LILY;
    }

    @Override // реализация метода из интерфейса
    public String getDescription() {
        return "Lily" + blossom.getDescription();
    }

}
