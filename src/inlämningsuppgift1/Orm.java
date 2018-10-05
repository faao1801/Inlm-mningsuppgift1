/*
 * Java Utveckling 18
 */

package inlämningsuppgift1;


public class Orm extends Djur implements IBeräkning{
    
    
    //default konstruktor
    Orm(){};
    //konstruktor
    Orm(String namn,double vikt){
        super(namn,vikt);
    }
     //implementera abstrakta metoden räkna. Överskugga metoden(polymorfism)
    
    @Override
     public double räkna(Foder fD){
       double r=20;
       fD.setVikt(fD.getWeight()-r);
       return r;
     }

}
