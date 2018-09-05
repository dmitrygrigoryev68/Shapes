public class Circle extends Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getSquare() {
        return Math.PI* r * r;
    }
}
