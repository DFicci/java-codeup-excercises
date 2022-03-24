package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(double side) {
        setLength(side);
    }


    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double length) {
        this.length = this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = this.width = width;
    }
}
