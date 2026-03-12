package core.basesyntax;

public class Square extends Figure {
    private double side;

    Square(double side) {
        this.side = side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double area() {
        return side*side;
    }
    public void draw() {
        if(getColor() != null){
            System.out.println("Figure: " + this.getClass().getSimpleName()
                    + ", area: " + area() + " sq.units, color: " + getColor() + " side: " + side);
        } else {
            System.out.println("Color is null");
        }
    }
}
