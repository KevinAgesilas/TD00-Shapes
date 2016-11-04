package m1a.td00.exo1;

/**
 * Created by keagesil on 20/09/2016.
 */
public class Cone extends Shape3D {
    private double height;
    private double radius;

    public Cone(Point3D refPoint, double height, double radius)
    {
        super(refPoint);
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 3.14d*(radius*radius)*(height/3);
    }

    @Override
    public double surface() {
        return 3.14d * radius * Math.sqrt((radius*radius)+(height*height));
    }
}
