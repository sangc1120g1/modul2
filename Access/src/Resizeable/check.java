package Resizeable;

public class check {
    public static void main(String[] args) {
        ShaPe[] shaPes = new ShaPe[3];
        shaPes[0] = new Circle(5);
        shaPes[1] = new Rectangle(3,5);
        shaPes[2] = new Square(4,4);
        for (ShaPe shape:shaPes
        ) {
            System.out.println(shape);
        }

        for (ShaPe shape:shaPes
             ) {
            shape.resize(2);
            System.out.println(shape);
        }
    }
}
