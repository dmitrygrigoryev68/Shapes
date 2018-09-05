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

    @Override
    public int compareTo(Shape obj) {
        if (a * b > obj.square()){
            return 1;
        }
        else if (a * b <obj.square()){
            return -1;
        }
        return 0;
    }
    @Override
    public String toString(){
        return String.format("%.2f", a * b) + " " + name;
    }
}


