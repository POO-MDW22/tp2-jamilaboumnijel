package com.mycompany.helloword1;

public class Livre {
    private String titre;
    String id;
    float prix;
    String auteur;
    static int count;
    public Livre(String titre,String id,String auteur,float prix)
    {
        this.id=id;
        this.auteur=auteur;
        this.titre=titre;
        this.prix=prix;
        count++;
    }
    public void affiche(){
        System.out.println("id :"+this.id+" auteur :"+this.auteur+" titre :"+this.titre+"prix :"+this.prix);
    }
}
