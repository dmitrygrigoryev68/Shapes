public class Square extends Shape {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getSquare() {
        return a*a;
    }
}
