package m1a.td00.exo2;

import java.util.Date;

/**
 * Created by keagesil on 20/09/2016.
 */
public class Vacataire extends EnseignantTemporaire {

    public Vacataire(String nom, String prenom, int numSecu, Date dateRecrutement, double salaire, Date finContrat)
    {
        super(nom, prenom, numSecu,dateRecrutement,salaire,finContrat);
    }

    @Override
    public String toString() {
        return "Vacataire{} " + super.toString();
    }
}
