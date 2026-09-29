//lab task 3
class Distance {
    int feet;
    int inches;

    Distance() {
        feet = 0;
        inches = 0;
    }

    Distance(int f, int i) {
        feet = f;
        inches = i;
    }

    void display() {
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}
public class dis {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        d1.display();
        System.out.println();
        Distance d2 = new Distance(5, 8);
        d2.display();
    }
}

