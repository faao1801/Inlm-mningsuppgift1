/*
 * Java Utveckling 18
 */

package inlämningsuppgift1;


public class Foder {
  //instans variabler
    private String foderTyp;
    private double totalVikt;
    //default konstruktor
    Foder(){};
    //konstruktor för att sätta vikt
    Foder(String foderTyp,double totalvikt){
        this.foderTyp=foderTyp;
        this.totalVikt=totalvikt;
    }
    //instansmetoder
    public double getWeight(){
        return totalVikt;
    }
    public String getFoderTyp(){
        return foderTyp;
    }
    public void setVikt(double nyVikt){
        totalVikt=nyVikt;
    }
    //instansmetod för att beställa fler foder
    public void beställFoder(double foderVikt){
        totalVikt+=foderVikt;
    }
   
}
