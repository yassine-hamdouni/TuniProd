public class Magazin {
    int id ;
    String adresse ;
    int capacity;
    Produit[] produits ;
    final int MAX_CAPA = 50;

    Magazin(){
        this.produits= new Produit[MAX_CAPA];
      }
    Magazin(int id,String adresse,int capacity){
        this.id=id;
        this.adresse=adresse;
        this.capacity=capacity;
        this.produits= new Produit[MAX_CAPA];

    }

    boolean addProduct (Produit p ) {
        for (int i = 0; i < this.capacity; i++) {
            if (!p.comparer(produits[i])) {
                if (this.produits[i] == null) {
                    this.produits[i] = p;
                    //nbrproduit++
                    return true;
                }
            }

        }
        return false;
    }
    public boolean chercherProduit(Produit p){
        for (int i=0;i<capacity;i++){
            if( p.comparer(this.produits[i]))
           return true;
        }
        return false;
    }
    public boolean delete(Produit p){
    int pos=-1;
        for(int i=0;i<capacity;i++){
            if(chercherProduit(p)){
                pos=i;
                break;
            }
        }
        if (pos != -1){


            for (int i = pos ;i<capacity;i++){

                if (i == MAX_CAPA-1){
                    this.produits[i]=null;
                    return true;
                }else {
                    this.produits[i]=produits[i+1];
                }
            }

        }
        return false;
    }
    public Magazin comparer(Magazin m){
     int m1 =0;
     int m2 =0;
        for(int i=0;i<this.capacity;i++){
            if (this.produits[i]!= null)
                m1++;

        }
        for(int i=0;i<m.capacity;i++){
            if (m.produits[i]!= null)
                m2++;

        }
        if(m1>m2){
            return m;
        }
        return this;
    }
    @Override
    public String toString (){
        String str ="";

for (int i = 0 ;i<this.capacity;i++ ){
if (this.produits[i]!=null){
    str +="\n nom "+this.produits[i].libelle+"\nPrix "+this.produits[i].prix;
}
}
        return "id :"+this.id+"\n adresse "+this.adresse+"\n capacite"+this.capacity+str;

}

}
