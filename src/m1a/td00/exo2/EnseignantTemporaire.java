package m1a.td00.exo2;
import java.util.Date;

/**
 * Created by keagesil on 20/09/2016.
 */
public abstract class EnseignantTemporaire extends Enseignant {
    private Date finContrat;

    public EnseignantTemporaire(String nom, String prenom, int numSecu, Date dateRecrutement, double salaire, Date finContrat)
    {
        super(nom, prenom, numSecu,dateRecrutement,salaire);
        this.finContrat = finContrat;
    }

    @Override
    public String toString() {
        return "EnseignantTemporaire{" +
                "finContrat=" + finContrat +
                "} " + super.toString();
    }
}
