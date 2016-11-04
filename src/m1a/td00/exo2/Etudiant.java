package m1a.td00.exo2;

/**
 * Created by keagesil on 20/09/2016.
 */
public class Etudiant extends Personnel {
    private double bourse;
    public Etudiant(String nom, String prenom, int numSecu, double bourse)
    {
        super(nom, prenom, numSecu);
        this.bourse = bourse;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "bourse=" + bourse +
                "} " + super.toString();
    }
}
