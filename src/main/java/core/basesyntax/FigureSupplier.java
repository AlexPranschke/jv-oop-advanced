package core.basesyntax;

import java.util.Random;
public class FigureSupplier {
    enum Figures {
        CIRCLE, SQUARE, RECTANGLE, RIGHT_TRIANGLE, ISOSCELES_TRAPEZOID
    }

    private final Random random = new Random();

    public Figure getRandomFigure() {
        int MAX_SIZE = 100;
        String RandomFigure = Figures.values()[random.nextInt(Figures.values().length)].name();
        return switch (RandomFigure) {
            case "CIRCLE" -> new Circle(random.nextInt(MAX_SIZE));
            case "SQUARE" -> new Square(random.nextInt(MAX_SIZE));
            case "RECTANGLE" -> new Rectangle(random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
            case "RIGHT_TRIANGLE" -> new RightTriangle(random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
            case "ISOSCELES_TRAPEZOID" ->
                    new IsoscelesTrapezoid(random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
            default -> getDefaultFigure();
        };
    }
    public Figure getDefaultFigure() {
        int DEFAULT_SIZE = 10;
        Figure defaultFigure = new Circle(DEFAULT_SIZE);
        defaultFigure.setColor(ColorSupplier.Color.WHITE.name());
        return defaultFigure;
    }
}
