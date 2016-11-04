package m1a.td00.exo2;
import java.util.Date;

/**
 * Created by keagesil on 20/09/2016.
 */
public class Biatoss extends Personnel {

    private Date debutContrat;
    private Date finContrat;
    private double salaire;

    public Biatoss(String nom, String prenom, int numSecu, Date debutContrat, Date finContrat, double salaire)
    {
        super(nom, prenom, numSecu);
        this.debutContrat = debutContrat;
        this.finContrat = finContrat;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Biatoss{" +
                "debutContrat=" + debutContrat +
                ", finContrat=" + finContrat +
                ", salaire=" + salaire +
                "} " + super.toString();
    }
}
