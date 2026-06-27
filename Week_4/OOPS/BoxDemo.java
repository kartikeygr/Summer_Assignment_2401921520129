class Box {

    double length;
    double breadth;
    double height;

    Box(double l, double b, double h) {

        length = l;
        breadth = b;
        height = h;
    }

    double area() {
        return 2 * (length * breadth + breadth * height + height * length);
    }
}

class Box3D extends Box {
    Box3D(double l, double b, double h) {
        super(l, b, h);
    }

    double volume() {
        return length * breadth * height;
    }
}

public class BoxDemo {

    public static void main(String[] args) {
        Box3D b = new Box3D(2, 3, 4);
        System.out.println("Area = " + b.area());
        System.out.println("Volume = " + b.volume());
    }
}
