package m1a.td00.exo2;

import java.util.Date;

/**
 * Created by keagesil on 20/09/2016.
 */
public class Secretaire extends Biatoss {
    public Secretaire(String nom, String prenom, int numSecu, Date debutContrat, Date finContrat, double salaire) {
        super(nom, prenom, numSecu, debutContrat, finContrat, salaire);
    }

    @Override
    public String toString() {
        return "Secretaire{} " + super.toString();
    }
}
