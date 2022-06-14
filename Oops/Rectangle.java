package Oops;

public class Rectangle {
    double width;
    double height;
    public Rectangle(double height){
        this.height = height;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return  "height = " + height;
    }

    public static void main(String[] args) {
        Rectangle rg = new Rectangle(5);
        rg.display();
        System.out.println(rg.display());
    }
}
