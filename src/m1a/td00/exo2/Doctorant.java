package m1a.td00.exo2;

/**
 * Created by keagesil on 20/09/2016.
 */
public class Doctorant extends Etudiant {
    public Doctorant(String nom, String prenom, int numSecu, double bourse)
    {
        super(nom, prenom, numSecu, bourse);
    }

    @Override
    public String toString() {
        return "Doctorant{} " + super.toString();
    }
}
