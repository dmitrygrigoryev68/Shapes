public class Circle extends Shape {

    private double r;
    private String name;


    public Circle(double r, String name) {
        this.r = r;
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public double square() { return Math.PI* r * r; }

    @Override
    public String toString(){
        return String.format("%.2f", Math.PI* r * r) + " " + name;
    }
}

