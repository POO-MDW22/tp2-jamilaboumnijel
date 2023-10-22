public class bureau {
    public int code;
    public String nom;
    public Chercheur C[];

    public Bureau() {
    }

    public Bureau(int code, string nom, chercheur c[]) {
        this.nom = nom;
        this.code = code;
        this.c = new chercheur[5];
        this.c = c;
    }

    public void afficher() {
        System.out.println("code: " + code + "nom: " + nom);
        int i;
        int n = this.c.length;
        for (i = 0; i < n; i++) {
            this.c[i].afficher();
            System.out.println(this.C[i].ToString());
        }
    }

    public string tostring() {
        String result = "code:" + code + " Noms:" + nom;
        int i;
        int n = this.c.length;
        for (i = 0; i < n; i++) {
            result = this.c[i].tostring();
            return result;
        }
    }
}
