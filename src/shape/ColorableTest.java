package shape;

import resizableShape.Colorable;

import java.util.Scanner;

public class ColorableTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle cir1 = new Circle(3, "red", true);
        Rectangle rec1 = new Rectangle(2, 5);
        Square squ1 = new Square(6, "blue", false);
        Shape[] arr = new Shape[]{cir1, rec1, squ1};

        for (Shape shape: arr){
            System.out.println(shape);
            if (shape instanceof Colorable) {
                ((Colorable)shape).howToColor();
            }
        }

    }
}
