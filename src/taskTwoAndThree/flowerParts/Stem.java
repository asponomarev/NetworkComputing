package taskTwoAndThree.flowerParts;

public class Stem {

    private static final double DEFAULT_HEIGHT = 10;
    private static final double DEFAULT_DIAMETER = 0.5;

    private double height;
    private double diameter;

    public Stem() {
        height = DEFAULT_HEIGHT;
        diameter = DEFAULT_DIAMETER;
    }

    public Stem(double height, double diameter) {
        this.height = (height > 0) ? height : DEFAULT_HEIGHT;
        this.diameter = (diameter > 0) ? diameter : DEFAULT_DIAMETER;
    }

    public double getHeight() {
        return height;
    }

    public boolean setHeight(double height) {
        if (height > 0) {
            this.height = height;
            return true;
        }
        return false;
    }

    public double getDiameter() {
        return diameter;
    }

    public boolean setDiameter(double diameter) {
        if (diameter > 0) {
            this.diameter = diameter;
            return true;
        }
        return false;
    }

}
