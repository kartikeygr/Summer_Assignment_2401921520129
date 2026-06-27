public class Point {

    private int x;
    private int y;

    // default constructor
    public Point() {
        x = 0;
        y = 0;
    }

    // parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("x = " + x + " y = " + y);
    }
    public static void main(String[] args) {
        Point p = new Point(5, 10);
        p.display();
        p.setXY(20, 30);
        p.display();
    }
}
