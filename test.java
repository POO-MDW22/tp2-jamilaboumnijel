public class test {
    public static void main(String[] args) {
        Produit p1 = new Produit(1021, "Lait et Delice", "Sicam", 1.200);
        Produit p2 = new Produit(2510, "Yaourt et Vitalait", "Vitalait", 1.250);
        Produit p3 = new Produit(3250, "Tomate", "Sicam", 1.200);

        if (p1.getLibellé()="Lait") {
            p1.setPrix(0.70);
        }
        p2.setPrix(0.70);
        p3.setPrix(0.70);

        System.out.println("Produit 1 :");
        p1.afficher();

        System.out.println("Produit 2 :");
        p2.afficher();

        System.out.println("Produit 3 :");
        p3.afficher();

    public String toString() {
        return "Identifiant : " +this.identifiant + "Libellé : " + this.libellé + "Marque : " + this.marque  + "Prix : " + this.prix;
    }
        System.out.println("Produit 1 (toString) :");
        System.out.println(p1.toString());

        System.out.println("Produit 2 (toString) :");
        System.out.println(p2.toString());

        System.out.println("Produit 3 (toString) :");
        System.out.println(p3.toString());
}

