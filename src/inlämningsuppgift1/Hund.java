/*
 * Java Utveckling 18
 */

package inlämningsuppgift1;


public class Hund extends Djur implements IBeräkning {
  
    
    //default konstruktor
    Hund(){};
    //konstruktor
    Hund(String namn,double vikt){
        super(namn,vikt);
    }
     //implementera abstrakta metoden räkna. Överskugga metoden(polymorfism)
    
    @Override
     public double räkna(Foder fD){
       double r=this.getVikt()/100;
       fD.setVikt(fD.getWeight()-r);
       return r;
     }
}
