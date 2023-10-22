public class chercheur {
        static int nbc=0;
        public String nom;
        public String poste;
        public int nmac;
        public chercheur() {
            nbc++;
        }
            public String tostring() {
                return "Nom: " + nom + " Poste: " + poste + " Nmac: " + nmac;
            public chercheur(String nom, String poste, int nmac){
                    this.nom = nom;
                    this.poste = poste;
                    this.nmac = nmac;
                    nbc++;
                }
                public void afficher () {
                    System.out printLn ("Nom" + nom + " poste: " + poste + " Nmac: " + nmac);
                }
                public Boolean comparer (chercheur c)
                {
                    if (this.nmac -= c.nmac) {
                        if (this.nom == c.nom) {
                            if (this.poste == c.paste) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                public void modifier ( int c){
                    nmac = c;
                    public void ajouter (String nom, String poste,int nmac){
                        this.nom = nom;
                        this.poste = poste;
                        this.nmac = nmac;
                    }
                }
            }
}
