public class chercheur {
    private String nom;
    private String poste;
    private String numeroOrdinateur;
    private static int nombrechercheur=0;
    public chercheur(){nombrechercheur++;}
    public chercheur(String nom,String poste,String numeroOrdinateur){
        this.poste=poste;
        this.nom=nom;
        this.numeroOrdinateur=numeroOrdinateur;
        nombrechercheur++;
    }
    public void affichage(){
        System.out.println("la poste :"+this.poste+"le nom :"+this.nom+"numero de l'ordinateur :"+this.numeroOrdinateur);
    }
    public int getNombrechercheur(){
        return nombrechercheur;
    }
    public void comparer(chercheur ch){
        if(this.nom.equals(ch.nom)&&this.poste.equals(ch.poste)&&this.numeroOrdinateur.equals(ch.numeroOrdinateur)){
            System.out.println("egalite");
        }
        else{
            System.out.println("non");
        }
    }
    public void setmodifiernumeroord(String nouveaunumero){
        this.numeroOrdinateur=nouveaunumero;
    }

}
