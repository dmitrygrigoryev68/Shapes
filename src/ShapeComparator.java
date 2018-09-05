import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {

    @Override
        public int compare(Shape obj1, Shape obj2) {
            return obj1.getName().compareTo(obj2.getName());
        }
    }
