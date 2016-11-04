package m1a.td00.exo1;

import m1a.td00.exo2.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Personnel p1 = new Etudiant("AGESILAS", "Kevin", 5684,153468);
        Etudiant e1 = new Doctorant("HERAULT", "Bryan",4654,4657987);
        EnseignantPermanent ep1 = new Professeur("HILLAH", "Lom",42, new Date(10/03/1987),3000, "Informatique");
        EnseignantPermanent ep2 = new MaitreConferences("KASSES", "Marc-Henri",1654, new Date(10/03/1958),4500,"Chant");

    }
}
