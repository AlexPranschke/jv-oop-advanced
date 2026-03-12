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
        double pi = 3.14;
        return pi*radius*radius;
    }
    @Override
    public void draw() {
        if(getColor() != null){
            System.out.println("Figure: " + this.getClass().getSimpleName()
                    + ", area: " + area() + " sq.units, color: " + getColor() + " radius: " + radius);
        } else {
            System.out.println("Color is null");
        }
    }
}
