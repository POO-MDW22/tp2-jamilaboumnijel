public class adresse {
    public String gouvernorat;
    public String ville;
    public int codepostal;
    public adresse(){}
    public adresse(String G,String V,int C){
        this.gouvernorat=G;
        this.ville=V;
        this.codepostal=C;
    }
    public void affiche() {
        System.out.println("le gouvernorat" + this.gouvernorat);
        System.out.println("ville" + this.ville + "CP :" + this.codepostal);
    }
    public String ToString() {
        return "gouvernorat" + this.gouvernorat + "ville" + this.ville + "CP" + this.codepostal;
    }
    class test{
        public static void main(String[] args)
    }
    }
}
