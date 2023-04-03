package lr2;

class Animal{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;
};

class Dog extends Animal {
    private String species;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}

class Cat extends Animal {
    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    private String foodType;
}

class Bird extends Animal {
    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    private boolean canFly;
}

class Shape {
    public int calculateSquare() {
        return 0;
    }

    public int calculatePerimeter() {
        return 0;
    }
}

class Square8 extends Shape {
    Square8(int length) {
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

    public int getLength_() {
        return length_;
    }

    public void setLength_(int length_) {
        this.length_ = length_;
    }

    private int length_ = 0;

}

class Circle8 extends Shape {
    Circle8(int radius) {
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

    public int getRadius_() {
        return radius_;
    }

    public void setRadius_(int radius_) {
        this.radius_ = radius_;
    }

    private int radius_ = 0;
}

class Triangle8 extends Shape {
    public Triangle8(int a, int b, int c) {
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

    public int getA_() {
        return a_;
    }

    public void setA_(int a_) {
        this.a_ = a_;
    }

    public int getB_() {
        return b_;
    }

    public void setB_(int b_) {
        this.b_ = b_;
    }

    public int getC_() {
        return c_;
    }

    public void setC_(int c_) {
        this.c_ = c_;
    }

    private int a_ = 0;
    private int b_ = 0;
    private int c_ = 0;
}

public class Task8 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();

        cat.getName();
        cat.getFoodType();
        dog.getName();
        dog.getSpecies();
        bird.getName();
        bird.isCanFly();

        Square8 square8 = new Square8(1);
        Circle8 circle8 = new Circle8(1);
        Triangle8 triangle8 = new Triangle8(1,1,1);

        square8.calculatePerimeter();
        square8.getLength_();
        circle8.calculatePerimeter();
        circle8.getRadius_();
        triangle8.calculatePerimeter();
        triangle8.getA_();
    }
}
