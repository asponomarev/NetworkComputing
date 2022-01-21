package taskTwoAndThree.flowers;

import taskTwoAndThree.flowerParts.BlossomColour;

public class Lily extends Flower {

    private static final int DEFAULT_LILY_LEAVES_AMOUNT = 6;

    public Lily() {
        super();
        leavesAmount = DEFAULT_LILY_LEAVES_AMOUNT;
    }

    public Lily(double stemHeight,
                double stemDiameter,
                int blossomPetalsAmount,
                BlossomColour blossomColour,
                int leavesAmount)
    {
        super(stemHeight, stemDiameter, blossomPetalsAmount, blossomColour);
        this.leavesAmount = leavesAmount;
    }

    @Override
    public FlowerType getFlowerType() {
        return FlowerType.LILY;
    }

    @Override
    public String getDescription() {
        return "Lily" + blossom.getDescription();
    }

}
