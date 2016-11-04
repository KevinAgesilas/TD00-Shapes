package m1a.td00.exo2;
import java.util.Date;
/**
 * Created by keagesil on 20/09/2016.
 */
public abstract class EnseignantPermanent extends Enseignant {
    private String domaine;

    public EnseignantPermanent(String nom, String prenom, int numSecu, Date dateRecrutement, double salaire, String domaine)
    {
        super(nom,prenom,numSecu,dateRecrutement,salaire);
        this.domaine = domaine;
    }

    @Override
    public String toString() {
        return "EnseignantPermanent{" +
                "domaine='" + domaine + '\'' +
                "} " + super.toString();
    }
}
