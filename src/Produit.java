import java.util.Date;

public class Produit {

    int id ;
    String libelle,marque ;
    float prix ;

    Date dateExp;
    static  int nbrproduit ;
    Produit(){
nbrproduit++;
    }
    Produit(int id ,String libelle,String marque ){
    this.id=id;
    this.libelle=libelle;
    this.marque=marque;
        nbrproduit++;
    }

    Produit(int id ,String libelle,String marque,float prix ){
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;
        this.prix=prix;
        nbrproduit++;
    }
    Produit(int id ,String libelle,String marque,float prix,Date date ){
        this.id=id;
        this.libelle=libelle;
        this.marque=marque;
        this.prix=prix;
        this.dateExp=date;
        nbrproduit++;
    }
    void afficher(){
        System.out.println("l'id :"+id);
        System.out.println("le libelle :"+libelle);
        System.out.println("la marque  :"+this.marque);
        System.out.println("le prix :"+this.prix);
    }

    public boolean comparer(Produit p) {
        /*if (this.id == p.id && this.prix == p.prix && this.libelle.equals(p.libelle)) {
            return true;
        }
        return false;*/
        return this.id == p.id && this.prix == p.prix && this.libelle.equals(p.libelle);
    }
    public static boolean comparer(Produit p1,Produit p2){
        return p1.id == p2.id && p1.prix == p2.prix && p1.libelle.equals(p2.libelle);
    }
    @Override
    public String toString(){
        return "l'id :"+id+"\nle libelle :"+libelle+"\nla marque  :"+this.marque+"\nle prix :"+this.prix+"\n date "+this.dateExp;
    }

}
