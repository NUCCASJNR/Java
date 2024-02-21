public class Rectangle {
    public Rectangle(int w, int h) {
        int area = w * h; // Local variable area declared inside constructor
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 6);
    }
}
