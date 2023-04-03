package lr2;

interface Calculatable {
    public int calculateSquare();

    public int calculatePerimeter();
}

class Square implements Calculatable {
    Square(int length) {
        length_ = length;
    }

    @Override
    public int calculateSquare() {
        return length_ * length_;
    }

    @Override
    public int calculatePerimeter() {
        return length_ * 4;
    }

    private int length_ = 0;

}

class Circle implements Calculatable {
    Circle(int radius) {
        radius_ = radius;
    }

    @Override
    public int calculateSquare() {
        return (int) (Math.PI * radius_ * radius_);
    }

    @Override
    public int calculatePerimeter() {
        return (int) (2 * Math.PI * radius_);
    }

    private int radius_ = 0;
}

class Triangle implements Calculatable {
    public Triangle(int a, int b, int c) {
        this.a_ = a;
        this.b_ = b;
        this.c_ = c;
    }

    @Override
    public int calculateSquare() {
        int p = (a_ + b_ + c_) / 2;
        return (int) (Math.sqrt(p * (p - a_) * (p - b_) * (p - c_)));
    }

    @Override
    public int calculatePerimeter() {
        return a_ + b_ + c_;
    }

    private int a_ = 0;
    private int b_ = 0;
    private int c_ = 0;
}

public class Task6 {
    public static void main(String[] args) {
        Square8 square = new Square8(3);
        Circle8 circle = new Circle8(3);
        Triangle8 triangle = new Triangle8(10,20,20);
        System.out.println("Квадрат со стороной 3 - Площадь: " + square.calculateSquare() + " - Периметр: " + square.calculatePerimeter());
        System.out.println("Круг с радиусом 3 - Площадь: " + circle.calculateSquare() + " - Периметр: " + circle.calculatePerimeter());
        System.out.println("Треугольник со сторонами 1, 2, 3 - Площадь: " + circle.calculateSquare() + " - Периметр: " + circle.calculatePerimeter());
        System.out.println("Треугольник со сторонами 10, 20, 20 - Площадь: " + triangle.calculateSquare() + " - Периметр: " + triangle.calculatePerimeter());
    }
}
