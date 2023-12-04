import java.time.LocalDate;

public abstract class ustensile {
    protected int an_fab;

    public ustensile(int an_fab) {
    }

    public void setAn_fab(int an_fab) {
        this.an_fab = an_fab;
    }

    public int getAn_fab() {
        return this.an_fab;
    }
   public String ToString(){
        return "l'annee de fabrication"+this.an_fab;
   }
    public double calculValeur() {
        int age = LocalDate.now().getYear() - getAn_fab();
        double valeur = 0;
        if (age > 50) {
            valeur = age - 50;
        }
        return valeur;
    }
}

