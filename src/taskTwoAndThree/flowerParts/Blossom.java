package taskTwoAndThree.flowerParts;

import taskTwoAndThree.actions.Describable;

public class Blossom implements Describable {

    // статические константы
    private static final int DEFAULT_PETALS_AMOUNT = 10;
    private static final BlossomColour DEFAULT_BLOSSOM_COLOUR = BlossomColour.RED;

    private int petalsAmount; // поле для хранения количества лепестков
    private BlossomColour blossomColour; // поле для хранения цвета

    public Blossom() { // конструктор по умолчанию
        petalsAmount = DEFAULT_PETALS_AMOUNT;
        blossomColour = DEFAULT_BLOSSOM_COLOUR;
    }

    public Blossom(int petalsAmount, BlossomColour blossomColour) { // пример перегрузки конструктора
        this.petalsAmount = (petalsAmount > 0) ? petalsAmount : DEFAULT_PETALS_AMOUNT;
        this.blossomColour = blossomColour;
    }

    public int getPetalsAmount() { // функция получения количества лепестков
        return petalsAmount;
    }

    // функция установки количества лепестков с проверкой передаваемого значения
    public boolean setPetalsAmount(int petalsAmount) {
        if (petalsAmount > 0) {
            this.petalsAmount = petalsAmount;
            return true;
        }
        return false;
    }

    public BlossomColour getBlossomColour() { // функция получения цвета
        return blossomColour;
    }

    public void setBlossomColourColour(BlossomColour blossomColour) { // функция установки цвета
        this.blossomColour = blossomColour;
    }

    @Override // реализация функции получения описания из интерфейса
    public String getDescription() {
        return " blossom has " + petalsAmount + " " + blossomColour.getColourName() + " petal(s)";
    }

}
