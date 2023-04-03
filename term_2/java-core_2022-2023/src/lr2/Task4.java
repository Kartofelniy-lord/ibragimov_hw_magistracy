package lr2;

class Person {
    Person(String name, int age, sex sex) {
        this.name_ = name;
        this.age_ = age;
        this.sex_ = sex;
    }

    public String getName() {
        return name_;
    }

    public void setName(String name) {
        this.name_ = name;
    }

    public int getAge() {
        return age_;
    }

    public void setAge(int age) {
        this.age_ = age;
    }

    public sex getSex() {
        return sex_;
    }

    public void setSex(sex sex) {
        this.sex_ = sex;
    }

    public enum sex {
        FEMALE,
        MALE
    }

    private String name_ = "";
    private int age_ = 0;
    private sex sex_;
}

public class Task4 {
    public static void main(String[] args) {
    }
}
