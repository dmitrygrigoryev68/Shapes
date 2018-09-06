public class Square extends Shape {

    private double a;
    private String name;


    public Square(double a, String name) {
        this.a = a;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public double square() {
        return a * a;
    }
}
