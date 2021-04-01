package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super("rectangle", color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getName() + ", area: "
                + getArea() + " sq. units,  length: "
                + getLength() + " sq. units, width: "
                + getWidth() + " units, color: "
                + getColor());
    }
}
