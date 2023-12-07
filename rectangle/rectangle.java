public class rectangle  {
    float longueur=200;
    float largeur=100;
    public Rectangle(float longueur,float largeur){
        this.longueur=longueur;
        this.largeur=largeur;

    }
    public float Perimetre() {
        return 2 * (largeur + Longueur);
    }
    public double Diagonale(){
        return largeur+ Longueur;}

    public void Doubler () {
        Largeur *=2;
        Longueur *=2;}
    public void Afficher () {
        System.out.println ("Longueur :"+ longueur);
        System. out.println ("Largeur :" + largeur);
        System.out.println("Perintre:"+Perimetre());
        System.out.println ("Diagonale:" + Diagonale());
    }


}
