package taskTwoAndThree.flowers;

import taskTwoAndThree.actions.Describable;
import taskTwoAndThree.actions.Growable;
import taskTwoAndThree.flowerParts.Blossom;
import taskTwoAndThree.flowerParts.BlossomColour;
import taskTwoAndThree.flowerParts.Stem;

public abstract class Flower implements Describable, Growable {

    protected static final int DEFAULT_GROW_RATE = 2; // статическая константа

    protected Stem stem; // поле для хранения стебля - пример агрегации
    protected Blossom blossom; // поле для хранения бутона - пример агрегации
    protected int leavesAmount; // поле для хранения количества листьев

    public Flower() { // конструктор по умолчанию
        stem = new Stem();
        blossom = new Blossom();
    }

    // пример перегрузки конструктора
    public Flower(double stemHeight, double stemDiameter, int blossomPetalsAmount, BlossomColour blossomColour)
    {
        stem = new Stem(stemHeight, stemDiameter);
        blossom = new Blossom(blossomPetalsAmount, blossomColour);
    }

    // пример виртуального метода (реализуется в наследниках)
    public abstract FlowerType getFlowerType();

    public Stem getStem() { // функция получения стебля
        return stem;
    }

    public void setStem(Stem stem) { // функция установки стебля
        this.stem = stem;
    }

    public Blossom getBlossom() { // функция получения цветка
        return blossom;
    }

    public void setBlossom(Blossom blossom) { // функция установки цветка
        this.blossom = blossom;
    }

    public int getLeavesAmount() { // функция получения количества листьев
        return leavesAmount;
    }

    // функция установки количества листьев с проверкой переданного аргумента
    public boolean setLeavesAmount(int leavesAmount) {
        if (leavesAmount > 0) {
            this.leavesAmount = leavesAmount;
            return true;
        }
        return false;
    }

    @Override // переопределение функции роста
    public void grow() {
        grow(DEFAULT_GROW_RATE);
    }

    @Override // переопределение второго варианта функции роста - пример перегрузки методов
    public void grow(int growRate) {
        int oldBlossomPetalsAmount = blossom.getPetalsAmount();
        blossom.setPetalsAmount(oldBlossomPetalsAmount * growRate);

        double oldStemHeight = stem.getHeight();
        stem.setHeight(oldStemHeight * growRate);

        double oldStemDiameter = stem.getDiameter();
        stem.setDiameter(oldStemDiameter * growRate);
    }

}
