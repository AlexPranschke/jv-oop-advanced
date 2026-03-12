package core.basesyntax;

import java.util.Random;
public class FigureSupplier {
    enum Figures {
        CIRCLE, SQUARE, RECTANGLE, RIGHT_TRIANGLE, ISOSCELES_TRAPEZOID
    }

    private final Random random = new Random();

    public Figure getRandomFigure() {
        String RandomFigure = Figures.values()[random.nextInt(Figures.values().length)].name();
        return switch (RandomFigure) {
            case "CIRCLE" -> new Circle(random.nextInt(100));
            case "SQUARE" -> new Square(random.nextInt(100));
            case "RECTANGLE" -> new Rectrangle(random.nextInt(100), random.nextInt(100));
            case "RIGHT_TRIANGLE" -> new RightTriangle(random.nextInt(100), random.nextInt(100));
            case "ISOSCELES_TRAPEZOID" ->
                    new IsoscelesTrapezoid(random.nextInt(100), random.nextInt(100), random.nextInt(100));
            default -> null;
        };
    }
    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(10);
        defaultFigure.setColor(ColorSupplier.Color.WHITE.name());
        return defaultFigure;
    }
}
