package m1a.td00.exo2;

import java.util.Date;

/**
 * Created by keagesil on 20/09/2016.
 */
public class MaitreConferences extends EnseignantPermanent {

    public MaitreConferences(String nom, String prenom, int numSecu, Date dateRecrutement, double salaire, String domaine)
    {
        super(nom, prenom,numSecu,dateRecrutement,salaire,domaine);
    }

    @Override
    public String toString() {
        return "MaitreConferences{} " + super.toString();
    }
}
