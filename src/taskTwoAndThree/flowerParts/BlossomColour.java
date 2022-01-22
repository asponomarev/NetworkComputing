package taskTwoAndThree.flowerParts;

import java.util.Locale;

public enum BlossomColour {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    CYAN,
    BLUE,
    MAGENTA,
    WHITE;

    public String getColourName() {
        return this.toString().toLowerCase(Locale.ROOT);
    }
}
