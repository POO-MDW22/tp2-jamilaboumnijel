public class adresse {
    private String gouvernorat;
    private String ville;
    private int codeposte;
    public adresse(){}
    public adresse(String gouvernorat,String ville,int codeposte){
        this.ville=ville;
        this.gouvernorat=gouvernorat;
        this.codeposte=codeposte;
    }
    public void afficher(){
        System.out.println("gouvernorat :"+this.gouvernorat+"ville"+this.ville+"code postal :"+this.codeposte);

    }
    public void setmodifiercodeposte( int nouveaucodpost){

        this.codeposte=nouveaucodpost;
    }
    public void setmodifiervile(String nouveauville){
        this.ville=nouveauville;
    }

}
