//lab task 5
class Time {
    int hr, min, sec;
    Time() {
        hr = 0;
        min = 0;
        sec = 0;
    }
    Time(int h, int m, int s) {
        if (h >= 0 && h <= 23)
            hr = h;
        else
            hr = 0;

        if (m >= 0 && m <= 59)
            min = m;
        else
            min = 0;

        if (s >= 0 && s <= 59)
            sec = s;
        else
            sec = 0;
    }
    void display() {
        System.out.println(hr + ":" + min + ":" + sec);
    }
}
public class tim{
    public static void main(String[] args) {
        Time t = new Time(10, 20, 30);
        t.display();
    }
}
