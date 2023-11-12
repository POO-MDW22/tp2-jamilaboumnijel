public class produit {
    private int identifiant;
    private String libellé;
    private String marque;
    private double prix;

    public Produit() {}

    public Produit(int identifiant, String libellé, String marque, double prix) {
        this.identifiant = identifiant;
        this.libellé = libellé;
        this.marque = marque;
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("Identifiant : " + identifiant);
        System.out.println("Libellé : " + libellé);
        System.out.println("Marque : " + marque);
        System.out.println("Prix : " + prix);
    }

    public void setPrix(double nouveauPrix) {
        this.prix = nouveauPrix;
    }

    public String getLibellé() {
        return libellé;
    }


}
