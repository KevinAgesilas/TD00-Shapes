package m1a.td00.exo2;

import java.util.Date;

/**
 * Created by keagesil on 20/09/2016.
 */
public class Alter extends EnseignantTemporaire {
    public Alter(String nom, String prenom, int numSecu, Date dateRecrutement, double salaire, Date finContrat)
    {
        super(nom, prenom, numSecu,dateRecrutement,salaire,finContrat);
    }

    @Override
    public String toString() {
        return "Alter{} " + super.toString();
    }
}
