package taskTwoAndThree.flowerParts;

import taskTwoAndThree.actions.Describable;

public class Blossom implements Describable {

    private static final int DEFAULT_PETALS_AMOUNT = 10;
    private static final BlossomColour DEFAULT_BLOSSOM_COLOUR = BlossomColour.RED;

    private int petalsAmount;
    private BlossomColour blossomColour;

    public Blossom() {
        petalsAmount = DEFAULT_PETALS_AMOUNT;
        blossomColour = DEFAULT_BLOSSOM_COLOUR;
    }

    public Blossom(int petalsAmount, BlossomColour blossomColour) {
        this.petalsAmount = (petalsAmount > 0) ? petalsAmount : DEFAULT_PETALS_AMOUNT;
        this.blossomColour = blossomColour;
    }

    public int getPetalsAmount() {
        return petalsAmount;
    }

    public boolean setPetalsAmount(int petalsAmount) {
        if (petalsAmount > 0) {
            this.petalsAmount = petalsAmount;
            return true;
        }
        return false;
    }

    public BlossomColour getBlossomColour() {
        return blossomColour;
    }

    public void setBlossomColourColour(BlossomColour blossomColour) {
        this.blossomColour = blossomColour;
    }

    @Override
    public String getDescription() {
        return " blossom has " + petalsAmount + " " + blossomColour + " petal(s)";
    }

}
