import java.util.Objects;

public class Point2 implements Comparable, Inverse{
    double x;
    double y;

    Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2 point2 = (Point2) o;
        return Double.compare(point2.x, x) == 0 &&
                Double.compare(point2.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(this.x < ((Point2)o).x)
            return -1;
        if(this.x > ((Point2)o).x)
            return 1;
        return 0;
    }

    @Override
    public Point2 Inversion() {
        this.x = -x;
        this.y = -y;
        return this;
    }

    @Override
    public Point2 XtoYtoX() {
        double tmp = this.x;
        this.x = this.y;
        this.y = tmp;
        return this;
    }
}