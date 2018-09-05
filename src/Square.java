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

    @Override
    public int compareTo(Shape obj) {
        if (a * a > obj.square()){
            return 1;
        }
        else if (a * a < obj.square()){
            return -1;
        }
        return 0;
    }
    @Override
    public String toString(){
        return String.format("%.2f", a * a) + " " + name;
    }
}
