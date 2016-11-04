package m1a.td00.exo1;

/**
 * Classe racine des Shapes en 2 dimensions.
 */
public abstract class Shape2D extends Shape implements Translatable2D{

    private final Point2D refPoint;

    protected Shape2D(Point2D refPoint) {
        this.refPoint = refPoint;
    }

    public Point2D getRefPoint() {
        return refPoint;
    }

    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape2D{" +
                "refPoint=" + refPoint +
                '}';
    }
}
