package taskTwoAndThree.flowerParts;

public class Stem {

    private static final double DEFAULT_HEIGHT = 10; // статическая константа
    private static final double DEFAULT_DIAMETER = 0.5; // статическая константа

    private double height; // поле для хранения высоты стебля
    private double diameter; // поле для хранения диаметра стебля

    public Stem() { // конструктор по умолчанию
        height = DEFAULT_HEIGHT;
        diameter = DEFAULT_DIAMETER;
    }

    public Stem(double height, double diameter) { // пример перегрузки конструктора
        this.height = (height > 0) ? height : DEFAULT_HEIGHT;
        this.diameter = (diameter > 0) ? diameter : DEFAULT_DIAMETER;
    }

    public double getHeight() { // функция получения высоты стебля
        return height;
    }

    public boolean setHeight(double height) { // функция установки высоты стебля с проверкой переданного значения
        if (height > 0) {
            this.height = height;
            return true;
        }
        return false;
    }

    public double getDiameter() { // функция получения диаметра стебля
        return diameter;
    }

    public boolean setDiameter(double diameter) { // функция установки диаметра стебля с проверкой переданного значения
        if (diameter > 0) {
            this.diameter = diameter;
            return true;
        }
        return false;
    }

}
