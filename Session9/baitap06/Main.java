package Session9.baitap06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Circle(3));

        double totalArea = 0;

        for (Shape s : shapes) {
            totalArea += s.area(); // OVERRIDING → runtime
        }
        System.out.printf("Tổng diện tích: %f" , totalArea);
    }
}
