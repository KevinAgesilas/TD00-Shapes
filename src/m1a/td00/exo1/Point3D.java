package m1a.td00.exo1;

/**
 * Created by keagesil on 20/09/2016.
 */
public class Point3D extends Point2D {

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    private double z;
    public Point3D(double x, double y, double z)
    {
        super(x,y);
        this.z = z;
    }

    @Override
    public void translate(double ax, double ay)
    {
        super.setX(this.getX()+ax);
        super.setY(this.getY()+ay);
    }

    @Override
    public boolean isOrigin()
    {
        if(this.getZ() == 0 && super.getX() == 0 && super.getY() == 0)
        {
            return true;
        }
        return false;
    }

    @Override
    public double distance(Point2D other) {
        return super.distance(other);
    }
}
