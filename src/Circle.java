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
    public int compareTo(Shape obj) {
            if (Math.PI* r * r > obj.square()){
                return 1;
            }
            else if (Math.PI* r * r < obj.square()){
                return -1;
            }
            return 0;
        }
    @Override
    public String toString(){
        return String.format("%.2f", Math.PI* r * r) + " " + name;
    }
}

