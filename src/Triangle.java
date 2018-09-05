public class Triangle extends Shape {

    private double a, b;
    private String name;

    public Triangle(double a, double b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public double square() {
        return a*b/2;
    }

    @Override
    public int compareTo(Shape obj) {
        if (a*b/2 > obj.square()){
            return 1;
        }
        else if (a*b/2 <obj.square()){
            return -1;
        }
        return 0;
    }
    @Override
    public String toString(){
        return String.format("%.2f", a*b/2) + " " + name;
    }
}
