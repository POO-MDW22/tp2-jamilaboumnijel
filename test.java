public class test {
    public static void main (String args[]){
        adresse A1=new adresse();
        A1.gouvernorat="tunis";
        A1.ville="ariana";
        A1.codepostal=2091;
        A1.affiche();
        System.out.println(A1);
        System.out.println(A1.ToString());
        A1.codepostal=2074;
        A1.affiche();
        adresse A2=new adresse("tunis"+"sidibouzid"+9100);
        chercheur c1=new chercheur();
        c1.Set nom("jamila");
        c1.set poste("D.V.W");
        c1.set numero(55);
        c1.affiche();
        System.out.println(c1.ToString());
        System.out.println(c1);
        System.out.println(c1.nb);

    }
}
