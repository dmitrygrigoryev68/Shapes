import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Shape s1 = new Circle   (4,       "Circle 0");
        Shape s2 = new Rectangle(6, 5, "Rectangle 0");
        Shape s3 = new Square   (4,       "Square 0");
        Shape s4 = new Triangle (4, 5,  "Triangle 0");
        Shape s5 = new Circle   (5,        "Circle 1");
        Shape s6 = new Rectangle(6, 4,  "Rectangle 1");
        Shape s7 = new Square   (7,        "Square 1");
        Shape s8 = new Triangle (5, 5,   "Triangle 1");

        Shape[] shapes = {s1, s2, s3, s4, s5, s6, s7, s8};



        for (Shape s : shapes) {
            System.out.println(s.square());
        }

        Arrays.sort(shapes);

        System.out.println("\nAfter Comparable:  \n");

        for (Shape s : shapes) {
            System.out.println(s.square());
        }

        System.out.println("\nAfter ShapeComparator:  \n");

        Arrays.sort(shapes, new ShapeComparator());

        for(Shape s : shapes){
            System.out.println(s);
        }
    }
}