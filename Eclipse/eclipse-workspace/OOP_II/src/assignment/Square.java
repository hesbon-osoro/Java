package assignment;
public class Square extends DrawableShape {
    private int length;

    @Override
    void draw() {
        System.out.println("Draw Square");
    }

    public double getArea() {
        return length * length;
    }

    public double getPerimeter() {
        return length * 4;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

