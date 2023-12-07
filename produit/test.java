public class test {
    public static void main(String[] args) {
        Produit produit1 = new Produit(1021, "Lait et Delice", "Sicam", 1.200);
        Produit produit2 = new Produit(2510, "Yaourt et Vitalait", "Vitalait", 1.250);
        Produit produit3 = new Produit(3250, "Tomate", "Sicam", 1.200);


        if (produit1.getLibellé().equalsIgnoreCase("Lait")) {
            produit1.setPrix(0.70);
        }


        produit2.setPrix(0.75);
        produit3.setPrix(0.80);

        System.out.println("Produit 1 :");
        produit1.afficher();

        System.out.println("Produit 2 :");
        produit2.afficher();

        System.out.println("Produit 3 :");
        produit3.afficher();


        System.out.println("Produit 1 (toString) :");
        System.out.println(produit1.toString());

        System.out.println("Produit 2 (toString) :");
        System.out.println(produit2.toString());

        System.out.println("Produit 3 (toString) :");
        System.out.println(produit3.toString());
    }

    public String toString() {
        return "Identifiant : " + identifiant + "\n" +
                "Libellé : " + libellé + "\n" +
                "Marque : " + marque + "\n" +
                "Prix : " + prix;
    }
}
