package taskTwoAndThree.flowers;

import taskTwoAndThree.actions.Describable;
import taskTwoAndThree.actions.Growable;
import taskTwoAndThree.flowerParts.Blossom;
import taskTwoAndThree.flowerParts.BlossomColour;
import taskTwoAndThree.flowerParts.Stem;

public abstract class Flower implements Describable, Growable {

    protected static final int DEFAULT_GROW_RATE = 2;

    protected Stem stem;
    protected Blossom blossom;
    protected int leavesAmount;

    public Flower() {
        stem = new Stem();
        blossom = new Blossom();
    }

    public Flower(double stemHeight, double stemDiameter, int blossomPetalsAmount, BlossomColour blossomColour)
    {
        stem = new Stem(stemHeight, stemDiameter);
        blossom = new Blossom(blossomPetalsAmount, blossomColour);
    }

    public abstract FlowerType getFlowerType();

    public Stem getStem() {
        return stem;
    }

    public void setStem(Stem stem) {
        this.stem = stem;
    }

    public Blossom getBlossom() {
        return blossom;
    }

    public void setBlossom(Blossom blossom) {
        this.blossom = blossom;
    }

    public int getLeavesAmount() {
        return leavesAmount;
    }

    public boolean setLeavesAmount(int leavesAmount) {
        if (leavesAmount > 0) {
            this.leavesAmount = leavesAmount;
            return true;
        }
        return false;
    }

    @Override
    public void grow() {
        grow(DEFAULT_GROW_RATE);
    }

    @Override
    public void grow(int growRate) {
        int oldBlossomPetalsAmount = blossom.getPetalsAmount();
        blossom.setPetalsAmount(oldBlossomPetalsAmount * growRate);

        double oldStemHeight = stem.getHeight();
        stem.setHeight(oldStemHeight * growRate);

        double oldStemDiameter = stem.getDiameter();
        stem.setDiameter(oldStemDiameter * growRate);
    }

}
