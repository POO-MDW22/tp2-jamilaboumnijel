import java.util.Scanner;
public class tes {
    public static void main(String[] args) {
        produit p1=new produit(1021,"Lait","Delice",800);
        produit p2=new produit(2510,"Yaourt","Vitalait",500);
        produit p3=new produit(3250,"Tomate","Sicam",1200);
        magasin MG1=new magasin(5000,"Bouzid",9);
        MG1.ajouter(p1);
        MG1.ajouter(p2);
        MG1.ajouter(p3);
        MG1.affmagasin();
        System.out.println("le nombre  du magasin est"+MG1.num);
       System.out.println(p1.comparer1(p2));
      System.out.println( p1.comparer2(p2,p3));
        magasin carrefour=new magasin(5001,"centre ville",20);
        magasin monoprix=new magasin(5100,"menzah 6",11);
        vendeur v1=new vendeur(6,"sabrine","sidibouzid",28);
        responsable r1=new responsable("islem",2,"tunis",52,100);
        responsable r2=new responsable("jamila",24,"bizerte",41,400);
        caissier c1=new caissier("isra",5,"tunis",4,23);
    }
}

