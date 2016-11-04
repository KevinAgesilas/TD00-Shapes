package m1a.td00.exo1;

/**
 * Created by keagesil on 20/09/2016.
 */
public class Sphere extends Shape3D {
    private double radius;

    public Sphere(Point3D refPoint, double radius)
    {
        super(refPoint);
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4*(3.14d*Math.pow(radius,3));
    }
}
