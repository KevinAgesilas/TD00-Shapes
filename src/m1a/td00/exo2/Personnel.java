package m1a.td00.exo2;

/**
 * Created by keagesil on 20/09/2016.
 */
public abstract class Personnel {
    private String nom;
    private String prenom;
    private int numSecu;

    public Personnel(String nom, String prenom, int numSecu)
    {

    }

    @Override
    public String toString() {
        return "Personnel{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numSecu=" + numSecu +
                '}';
    }
}
