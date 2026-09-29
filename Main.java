// lab task 1
class Circle {
    double radius;
    Circle() {
        radius = 1;
    }
    Circle(double r,double x) {
        radius = r;
    }
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5, 10);
        System.out.print("Circumference of c1: "+ c1.calculateCircumference());
        System.out.print("Circumference of c2: "+ c2.calculateCircumference());
    }
}