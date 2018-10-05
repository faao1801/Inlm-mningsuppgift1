/*
 * Java Utveckling 18
 */

package inlämningsuppgift1;


public class Katt extends Djur implements IBeräkning{
    
    
    //default konstruktor
    Katt(){};
    //konstruktor
    Katt(String namn,double vikt){
        super(namn,vikt);
    }
    //implementera abstrakta metoden räkna. Överskugga metoden(polymorfism)
    
    @Override
      public double räkna(Foder fD){
       double r=this.getVikt()/150;
       fD.setVikt(fD.getWeight()-r);
       return r;
     }

}
