package core.basesyntax;

public class Main {
    public static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        ColorSupplier ColorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < ARRAY_SIZE/2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].setColor(ColorSupplier.getRandomColor());
            figures[i].print();
        }
        for (int i = ARRAY_SIZE/2; i < ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].print();
        }
    }
}