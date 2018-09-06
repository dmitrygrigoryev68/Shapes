public class Rectangle extends Shape {

    private double a, b;
    private String name;


    public Rectangle(double a, double b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public double square() { return a * b; }
}



