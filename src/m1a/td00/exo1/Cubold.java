package m1a.td00.exo1;

/**
 * Created by keagesil on 20/09/2016.
 */
public class Cubold extends Shape3D {
    private double length;
    private double width;
    private double height;

    public Cubold(Point3D refPoint, double length, double width, double height)
    {
        super(refPoint);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double volume() {
        return length*width*height;
    }

    @Override
    public double surface() {
        return 2*((length*width)+(width*height)+(height*length));
    }
}
