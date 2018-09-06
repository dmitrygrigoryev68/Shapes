public abstract class Shape implements Comparable<Shape>{

    public abstract double square();
    public abstract String getName();

    public int compareTo(Shape obj) {
        if (square() > obj.square()){
            return 1;
        }
        else if (square() < obj.square()){
            return -1;
        }
        return 0;
    }
    public String toString(){
        return String.format("%.2f", square()) + " " + getName();
    }
}



