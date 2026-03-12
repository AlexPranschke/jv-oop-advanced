package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double area() {
        return 0.5*base*height;
    }
}
