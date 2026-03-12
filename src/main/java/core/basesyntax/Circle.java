package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return 3.14*radius*radius;
    }
}
