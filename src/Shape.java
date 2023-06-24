import org.w3c.dom.css.Rect;

abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("drawing circle");
    }
}
class Test{
    public static void main(String[] args) {
        Shape s = new Rectangle();
        Shape s1 = new Circle();
        s.draw();
        s1.draw();
    }
}