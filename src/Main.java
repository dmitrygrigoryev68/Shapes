import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Shape s1 = new Circle(1);
        Shape s2 = new Rectangle(2, 2);
        Shape s3 = new Square(3);
        Shape s4 = new Triangle(4, 5);
        Shape[] shapes = {s1, s2, s3, s4};

        for (Shape s : shapes) {
            System.out.println(s.getSquare());
        }
    }
}