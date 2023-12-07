public class test {
    public static void main(String[] args){
        adresse adr1=new adresse();
        adr1.setmodifiercodeposte(1016);
        adr1.setmodifiervile("tunis");
        adr1.afficher();
        adresse adr2=new adresse("ariana","tunis","7016");
        adr2.setmodifiervile("bizerte");
        adr2.afficher();
        chercheur chercheur1=new chercheur();
        chercheur1.affichage();
        chercheur chercheur2=new chercheur("ariana","principal","1234");
        chercheur2.affichage();
        chercheur2.getNombrechercheur();
        chercheur2.comparer(chercheur1);
        chercheur2.setmodifiernumeroord(432);
        chercheur chercheur3=new chercheur("jamila","elalia","154");
        chercheur[] ch1={chercheur1,chercheur2,chercheur3};
        chercheur[] ch2={chercheur1,chercheur2,chercheur3};

        bureau bureau1=new bureau("345","islem",ch1);
        bureau bureau2=new bureau("67","rania",ch2);




    }
}
