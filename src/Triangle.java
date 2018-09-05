public class Triangle extends Shape {

    private double a, b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSquare() {
        return (a + b) / 2;
    }
}
