package m1a.td00.exo2;

import java.util.Date;

/**
 * Created by keagesil on 20/09/2016.
 */
public class Bibliothecaire extends Biatoss {

    public Bibliothecaire(String nom, String prenom, int numSecu, Date debutContrat, Date finContrat, double salaire) {
        super(nom, prenom, numSecu, debutContrat, finContrat, salaire);
    }

    @Override
    public String toString() {
        return "Bibliothecaire{} " + super.toString();
    }
}
