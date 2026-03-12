package core.basesyntax;

public class Rectrangle extends Figure {
    private double width;
    private double height;

    Rectrangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double area() {
        return width*height;
    }

}
