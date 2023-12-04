
public class Collection {
    public static void main(String[] args) {
        ustensile[] us = new ustensile[5];
        us[0] = new assietteCarree(1943, 30);
        us[1] = new assietteRonde(1943, 20);
        us[2] = new assietteCarree(1943, 40);
        us[3] = new cuillere(1943, 54);
        us[4] = new cuillere(1943, 17);

    afficherCui(us);
    affichersurAS(us);
    affichervalTotale(us);
    }
    public static void afficherCui(ustensile[]  us ) {
        int nombreCui = 0;
        for(int i=0;i<us.length;i++){
            if(us[i]instanceof cuillere){
                nombreCui++;
            }
        }
        System.out.println("il y a "+ nombreCui +" cuilleres.");

        }
      static void affichersurAS (ustensile[] us){
        double somme=0;
          for(int i=0;i<us.length;i++) {
            if(us[i] instanceof assiette){
                somme=somme+((assiette) us[i]).calculSurface();
            }
          }
          System.out.println("surface totale des assiettes :"+somme);
          }
          static void affichervalTotale (ustensile[] us){
        double somme=0;
              for(int i=0;i<us.length;i++) {
                  somme=somme+us[i].calculValeur();
              }
              System.out.println("valeur totale de la collection:"+somme);
          }
      }



