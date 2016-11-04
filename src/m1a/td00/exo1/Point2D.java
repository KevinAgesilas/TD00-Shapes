package m1a.td00.exo1;

/**
 * Modélise les points en deux dimensions.
 */
public class Point2D {
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void translate(double ax, double ay)
    {
        double tmp;
        tmp = ax;
        ax = ay;
        ay = tmp;
    }

    public boolean isOrigin()
    {
        if(this.getX() == 0 && this.getY() == 0)
        {
            return true;
        }
        return false;
    }

    public double distance(Point2D other)
    {
        return 0.0d;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
