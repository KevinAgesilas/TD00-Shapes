package m1a.td00.exo1;

/**
 * Created by keagesil on 20/09/2016.
 */
public abstract class Shape3D extends Shape implements  Translatable3D{
    private Point3D refPoint;

    public abstract double volume();
    public abstract double surface();
    public Shape3D(Point3D refPoint)
    {
        this.refPoint = refPoint;
    }

    public Point3D getRefPoint() {
        return refPoint;
    }
}
