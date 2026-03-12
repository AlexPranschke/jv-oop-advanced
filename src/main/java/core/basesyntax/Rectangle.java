package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    Rectangle(double width, double height) {
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
    public void draw() {
        if(getColor() != null){
            System.out.println("Figure: " + this.getClass().getSimpleName()
                    + ", area: " + area() + " sq.units, color: " + getColor() + " width: " + width + " height: " + height);
        } else {
            System.out.println("Color is null");
        }
    }

}
