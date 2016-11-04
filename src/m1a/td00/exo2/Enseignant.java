package m1a.td00.exo2;
import java.util.Date;

/**
 * Created by keagesil on 20/09/2016.
 */
public abstract class Enseignant extends Personnel {
    private Date dateRecrutement;
    private double salaire;

    public Enseignant(String nom, String prenom, int numSecu, Date dateRecrutement, double salaire)
    {
        super(nom, prenom, numSecu);
        this.dateRecrutement = dateRecrutement;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "dateRecrutement=" + dateRecrutement +
                ", salaire=" + salaire +
                "} " + super.toString();
    }
}
