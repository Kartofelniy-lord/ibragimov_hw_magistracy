package lr2;

class Rectangle {
    Rectangle(int wight, int length){
        length_ = length;
        wight_ = wight;
    }

    public int calculateSquare() {
        return wight_ * length_;
    }

    public int calculatePerimeter() {
        return (wight_ + length_) * 2;
    }

    public int getLength() {
        return length_;
    }

    public void setLength(int length) {
        this.length_ = length;
    }

    public int getWight() {
        return wight_;
    }

    public void setWight(int wight) {
        this.wight_ = wight;
    }

    private int wight_ = 0;
    private int length_ = 0;

}

public class Task5 {
}
