import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Produit p1 =new Produit();
        Produit p2 =new Produit(1021,"Lait","delice");
        Produit p3 = new Produit(2510,"yaourt ","vitalait");
        Produit p4 = new Produit(3250,"Tomate ","sicame",1.2f);

/*
    p1.afficher();
        System.out.println("***************");
    p2.afficher();
        System.out.println("***************");

        p3.afficher();
        System.out.println("***************");

        p4.afficher();
        p2.prix=0.7f;
        p2.afficher();
*/
        //p4.afficher();

         Produit p5 = new Produit(1234,"exp","esprit",10000f,new Date());
        Magazin aziza = new Magazin(1,"ariana",5);
        aziza.addProduct(p4);
        aziza.addProduct(p5);
        aziza.addProduct(p5);
        aziza.addProduct(p5);
        aziza.addProduct(p5);
        System.out.println(aziza);
        System.out.println(Produit.nbrproduit);



    }


}