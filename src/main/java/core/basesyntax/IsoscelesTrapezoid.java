package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    IsoscelesTrapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }
    public void setBase1(double base1) {
        this.base1 = base1;
    }
    public void setBase2(double base2) {
        this.base2 = base2;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double area() {
        int formulaHelper = 2;
        return (base1 + base2) * height / formulaHelper;
    }
    public void draw() {
        if(getColor() != null){
            System.out.println("Figure: " + this.getClass().getSimpleName()
                    + ", area: " + area() + " sq.units, color: " + getColor() + " base1: " + base1 + " base2: " + base2 + " height: " + height);
        } else {
            System.out.println("Color is null");
        }
    }
}
