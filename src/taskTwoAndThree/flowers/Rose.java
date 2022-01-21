package taskTwoAndThree.flowers;

import taskTwoAndThree.flowerParts.BlossomColour;

public class Rose extends Flower{

    private static final int DEFAULT_ROSE_LEAVES_AMOUNT = 32;
    private static final int DEFAULT_ROSE_THORNS_AMOUNT = 10;

    private int thornsAmount;

    public Rose() {
        super();
        leavesAmount = DEFAULT_ROSE_LEAVES_AMOUNT;
        thornsAmount = DEFAULT_ROSE_THORNS_AMOUNT;
    }

    public Rose(double stemHeight,
                double stemDiameter,
                int blossomPetalsAmount,
                BlossomColour blossomColour,
                int leavesAmount,
                int thornsAmount)
    {
        super(stemHeight, stemDiameter, blossomPetalsAmount, blossomColour);
        this.leavesAmount = leavesAmount;
        this.thornsAmount = thornsAmount;
    }

    public int getThornsAmount() {
        return thornsAmount;
    }

    public void setThornsAmount(int thornsAmount) {
        this.thornsAmount = Math.max(thornsAmount, 0);
    }

    @Override
    public FlowerType getFlowerType() {
        return FlowerType.ROSE;
    }

    @Override
    public String getDescription() {
        return "Rose" + blossom.getDescription();
    }

    @Override
    public void grow(int growRate) {
        super.grow(growRate);
        thornsAmount *= growRate;
    }

    public String warn() {
        if (thornsAmount > 0) {
            return "Be careful because this rose has thorns!";
        } else {
            return "";
        }
    }

    public void cutThorns() {
        setThornsAmount(thornsAmount - 1);
    }

    public void cutThorns(int thornsToCut) {
        setThornsAmount(thornsAmount - thornsToCut);
    }

}
