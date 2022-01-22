package taskTwoAndThree.flowers;

import taskTwoAndThree.flowerParts.BlossomColour;

public class Rose extends Flower{

    // статические константы
    private static final int DEFAULT_ROSE_LEAVES_AMOUNT = 32;
    private static final int DEFAULT_ROSE_THORNS_AMOUNT = 10;

    private int thornsAmount; // поле для хранения количества колючек

    public Rose() { // конструктор по умолчанию
        super(); // вызов родительского конструктора по умолчанию
        leavesAmount = DEFAULT_ROSE_LEAVES_AMOUNT;
        thornsAmount = DEFAULT_ROSE_THORNS_AMOUNT;
    }

    // пример перегрузки конструктора
    public Rose(double stemHeight,
                double stemDiameter,
                int blossomPetalsAmount,
                BlossomColour blossomColour,
                int leavesAmount,
                int thornsAmount)
    {
        // вызов родительского конструктора
        super(stemHeight, stemDiameter, blossomPetalsAmount, blossomColour);
        this.leavesAmount = leavesAmount;
        this.thornsAmount = thornsAmount;
    }

    public int getThornsAmount() { // функция получения количества колючек
        return thornsAmount;
    }

    public void setThornsAmount(int thornsAmount) { // функция установки количества колючек
        this.thornsAmount = Math.max(thornsAmount, 0); // пример использования функции из пакета Math
    }

    @Override // реализация виртуального метода
    public FlowerType getFlowerType() {
        return FlowerType.ROSE;
    }

    @Override // реализация метода из интерфейса
    public String getDescription() {
        return "Rose" + blossom.getDescription();
    }

    @Override // переопределение метода из интерфейса
    public void grow(int growRate) {
        super.grow(growRate); // вызов реализации этого метода в родительском классе
        thornsAmount *= growRate;
    }

    public String warn() {
        if (thornsAmount > 0) {
            return "Be careful because this rose has thorns!";
        } else {
            return "";
        }
    }

    public void cutThorns() { // пример перегрузки метода
        setThornsAmount(thornsAmount - 1);
    }

    public void cutThorns(int thornsToCut) { // пример перегрузки метода
        setThornsAmount(thornsAmount - thornsToCut);
    }

}
