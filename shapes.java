class Shape {
    void area() {
        System.out.println("Area of Shape");
    }
    void area(int side) {
        System.out.println("Area of Square = " + (side * side));
    }
    void area(int length, int width) {
        System.out.println("Area of Rectangle = " +
            (length * width));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle");
    }
}
public class shapes {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println("Area of square:");
        s.area(9);
        s.area(10, 6);
        Rectangle r = new Rectangle();
        System.out.println("Area of Rectangle:");
        r.area(5);
        r.area(5, 10);
    }
}
